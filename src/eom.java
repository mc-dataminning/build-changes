import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eom extends gew {
   private static final Logger a = LogUtils.getLogger();
   private static final aeu b = new aeu("minecraft", "textures/gui/options_background.png");
   private static final ti c = ti.c("mco.question");
   static final ti y = ti.c("mco.configure.world.invites.normal.tooltip");
   static final ti z = ti.c("mco.configure.world.invites.ops.tooltip");
   static final ti A = ti.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final eoa C;
   final emr D;
   eom.b E;
   int F;
   int G;
   private esl H;
   private esl I;
   int J = -1;
   private boolean K;

   public eom(eoa $$0, emr $$1) {
      super(ti.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aD_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eom.b();
      this.E.f(this.F);
      this.e(this.E);

      for (emn $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(esl.a(ti.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eof(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(esl.a(ti.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(esl.a(ti.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(esl.a(th.k, $$0x -> this.D()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
      this.C();
   }

   @Override
   void C() {
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
         this.D();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void D() {
      if (this.K) {
         this.f.a(this.C.f());
      } else {
         this.f.a(this.C);
      }
   }

   void j(int $$0) {
      ema $$1 = ema.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (enn var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void k(int $$0) {
      ema $$1 = ema.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (enn var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(emj $$0) {
      for (emn $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         emn $$1 = this.D.h.get($$0);
         eob $$2 = new eob($$1x -> {
            if ($$1x) {
               ema $$2x = ema.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (enn var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.C();
            }

            this.K = true;
            this.f.a(this);
         }, c, ti.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, ti.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends eth.a<eom.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final etx f = new etx(new aeu("player_list/remove_player"), new aeu("player_list/remove_player_highlighted"));
      private static final etx g = new etx(new aeu("player_list/make_operator"), new aeu("player_list/make_operator_highlighted"));
      private static final etx h = new etx(new aeu("player_list/remove_operator"), new aeu("player_list/remove_operator_highlighted"));
      private final emn i;
      private final List<esj> j = new ArrayList<>();
      private final esx k;
      private final esx l;
      private final esx m;

      public a(emn $$0) {
         this.i = $$0;
         int $$1 = eom.this.D.h.indexOf(this.i);
         int $$2 = eom.this.E.p() - 16 - 9;
         int $$3 = eom.this.E.h($$1) + 1;
         this.k = new esx($$2, $$3, 8, 7, f, $$1x -> eom.this.l($$1), th.a);
         this.k.a(etv.a(eom.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new esx($$2, $$3, 8, 7, g, $$1x -> eom.this.j($$1), th.a);
         this.l.a(etv.a(eom.y));
         this.j.add(this.l);
         this.m = new esx($$2, $$3, 8, 7, h, $$1x -> eom.this.k($$1), th.a);
         this.m.a(etv.a(eom.z));
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
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         eph.a($$0, eom.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eom.this.i, this.i.a(), eom.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public ti a() {
         return ti.a("narrator.select", this.i.a());
      }
   }

   class b extends gev<eom.a> {
      public b() {
         super(eom.this.G + 10, eom.h(12) + 20, eom.h(1), eom.h(12) + 20, 13);
      }

      public void d() {
         if (eom.this.J != -1) {
            this.d(eom.this.J).b();
         }
      }

      public void a(emn $$0) {
         this.a((eom.a)(eom.this.new a($$0)));
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
         eom.this.J = $$0;
         eom.this.C();
      }

      public void a(@Nullable eom.a $$0) {
         super.a($$0);
         eom.this.J = this.i().indexOf($$0);
         eom.this.C();
      }

      @Override
      public int c() {
         return eom.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}
