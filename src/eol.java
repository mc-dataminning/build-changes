import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eol extends gex {
   private static final Logger a = LogUtils.getLogger();
   private static final aez b = new aez("minecraft", "textures/gui/options_background.png");
   private static final tl c = tl.c("mco.question");
   static final tl y = tl.c("mco.configure.world.invites.normal.tooltip");
   static final tl z = tl.c("mco.configure.world.invites.ops.tooltip");
   static final tl A = tl.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final enz C;
   final emq D;
   eol.b E;
   int F;
   int G;
   private esk H;
   private esk I;
   int J = -1;
   private boolean K;

   public eol(enz $$0, emq $$1) {
      super(tl.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aH_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eol.b();
      this.E.f(this.F);
      this.e(this.E);

      for (emm $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(esk.a(tl.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eoe(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(esk.a(tl.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(esk.a(tl.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(esk.a(tk.k, $$0x -> this.E()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
      this.D();
   }

   @Override
   void D() {
      this.H.j = this.i(this.J);
      this.I.j = this.i(this.J);
      this.E.d();
   }

   private boolean i(int $$0) {
      return $$0 != -1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.K) {
         this.f.a(this.C.f());
      } else {
         this.f.a(this.C);
      }
   }

   void j(int $$0) {
      elz $$1 = elz.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (enm var5) {
         a.error("Couldn't op the user", var5);
      }

      this.D();
   }

   void k(int $$0) {
      elz $$1 = elz.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (enm var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.D();
   }

   private void a(emi $$0) {
      for (emm $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.D();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         emm $$1 = this.D.h.get($$0);
         eoa $$2 = new eoa($$1x -> {
            if ($$1x) {
               elz $$2x = elz.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (enm var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.D();
            }

            this.K = true;
            this.f.a(this);
         }, c, tl.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, tl.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends etg.a<eol.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final etx f = new etx(new aez("player_list/remove_player"), new aez("player_list/remove_player_highlighted"));
      private static final etx g = new etx(new aez("player_list/make_operator"), new aez("player_list/make_operator_highlighted"));
      private static final etx h = new etx(new aez("player_list/remove_operator"), new aez("player_list/remove_operator_highlighted"));
      private final emm i;
      private final List<esi> j = new ArrayList<>();
      private final esw k;
      private final esw l;
      private final esw m;

      public a(emm $$0) {
         this.i = $$0;
         int $$1 = eol.this.D.h.indexOf(this.i);
         int $$2 = eol.this.E.p() - 16 - 9;
         int $$3 = eol.this.E.h($$1) + 1;
         this.k = new esw($$2, $$3, 8, 7, f, $$1x -> eol.this.l($$1), tk.a);
         this.k.a(etv.a(eol.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new esw($$2, $$3, 8, 7, g, $$1x -> eol.this.j($$1), tk.a);
         this.l.a(etv.a(eol.y));
         this.j.add(this.l);
         this.m = new esw($$2, $$3, 8, 7, h, $$1x -> eol.this.k($$1), tk.a);
         this.m.a(etv.a(eol.z));
         this.j.add(this.m);
         this.b();
      }

      public void b() {
         this.l.j = !this.i.c();
         this.m.j = !this.l.j;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.l.a($$0, $$1, $$2)) {
            this.m.a($$0, $$1, $$2);
         }

         this.k.a($$0, $$1, $$2);
         return true;
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         epg.a($$0, eol.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eol.this.i, this.i.a(), eol.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public tl a() {
         return tl.a("narrator.select", this.i.a());
      }
   }

   class b extends gew<eol.a> {
      public b() {
         super(eol.this.G + 10, eol.h(12) + 20, eol.h(1), eol.h(12) + 20, 13);
      }

      public void d() {
         if (eol.this.J != -1) {
            this.d(eol.this.J).b();
         }
      }

      public void a(emm $$0) {
         this.a((eol.a)(eol.this.new a($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.e * 1.0);
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         eol.this.J = $$0;
         eol.this.D();
      }

      public void a(@Nullable eol.a $$0) {
         super.a($$0);
         eol.this.J = this.i().indexOf($$0);
         eol.this.D();
      }

      @Override
      public int c() {
         return eol.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}
