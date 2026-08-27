import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eot extends gfd {
   private static final Logger a = LogUtils.getLogger();
   private static final aey b = new aey("minecraft", "textures/gui/options_background.png");
   private static final tn c = tn.c("mco.question");
   static final tn y = tn.c("mco.configure.world.invites.normal.tooltip");
   static final tn z = tn.c("mco.configure.world.invites.ops.tooltip");
   static final tn A = tn.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final eoh C;
   final emy D;
   eot.b E;
   int F;
   int G;
   private ess H;
   private ess I;
   int J = -1;
   private boolean K;

   public eot(eoh $$0, emy $$1) {
      super(tn.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aH_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eot.b();
      this.E.f(this.F);
      this.e(this.E);

      for (emu $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(ess.a(tn.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eom(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(ess.a(tn.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(ess.a(tn.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(ess.a(tm.k, $$0x -> this.E()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
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
      emh $$1 = emh.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (enu var5) {
         a.error("Couldn't op the user", var5);
      }

      this.D();
   }

   void k(int $$0) {
      emh $$1 = emh.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (enu var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.D();
   }

   private void a(emq $$0) {
      for (emu $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.D();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         emu $$1 = this.D.h.get($$0);
         eoi $$2 = new eoi($$1x -> {
            if ($$1x) {
               emh $$2x = emh.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (enu var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.D();
            }

            this.K = true;
            this.f.a(this);
         }, c, tn.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, tn.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends eto.a<eot.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final eue f = new eue(new aey("player_list/remove_player"), new aey("player_list/remove_player_highlighted"));
      private static final eue g = new eue(new aey("player_list/make_operator"), new aey("player_list/make_operator_highlighted"));
      private static final eue h = new eue(new aey("player_list/remove_operator"), new aey("player_list/remove_operator_highlighted"));
      private final emu i;
      private final List<esq> j = new ArrayList<>();
      private final ete k;
      private final ete l;
      private final ete m;

      public a(emu $$0) {
         this.i = $$0;
         int $$1 = eot.this.D.h.indexOf(this.i);
         int $$2 = eot.this.E.p() - 16 - 9;
         int $$3 = eot.this.E.h($$1) + 1;
         this.k = new ete($$2, $$3, 8, 7, f, $$1x -> eot.this.l($$1), tm.a);
         this.k.a(euc.a(eot.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new ete($$2, $$3, 8, 7, g, $$1x -> eot.this.j($$1), tm.a);
         this.l.a(euc.a(eot.y));
         this.j.add(this.l);
         this.m = new ete($$2, $$3, 8, 7, h, $$1x -> eot.this.k($$1), tm.a);
         this.m.a(euc.a(eot.z));
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
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         epo.a($$0, eot.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eot.this.i, this.i.a(), eot.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public tn a() {
         return tn.a("narrator.select", this.i.a());
      }
   }

   class b extends gfc<eot.a> {
      public b() {
         super(eot.this.G + 10, eot.h(12) + 20, eot.h(1), eot.h(12) + 20, 13);
      }

      public void d() {
         if (eot.this.J != -1) {
            this.d(eot.this.J).b();
         }
      }

      public void a(emu $$0) {
         this.a((eot.a)(eot.this.new a($$0)));
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
         eot.this.J = $$0;
         eot.this.D();
      }

      public void a(@Nullable eot.a $$0) {
         super.a($$0);
         eot.this.J = this.i().indexOf($$0);
         eot.this.D();
      }

      @Override
      public int c() {
         return eot.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}
