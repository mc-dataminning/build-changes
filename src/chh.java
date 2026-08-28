import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chh extends cgy {
   private static final ajy<ji> cb = akc.a(chh.class, aka.o);
   private static final ajy<Boolean> cc = akc.a(chh.class, aka.k);
   private static final ajy<Integer> cd = akc.a(chh.class, aka.b);
   static final cfz ce = cfz.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<cld> bZ = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float ca = 0.65F;

   public chh(but<? extends chh> $$0, dgj $$1) {
      super($$0, $$1);
      this.bP = new cbl(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbk(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bwb $$4 = Objects.requireNonNullElseGet($$3, () -> new bud.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public chh b(ard $$0, bud $$1) {
      return but.H.a($$0, bus.e);
   }

   @Override
   public float ei() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(ji $$0) {
      this.al.a(cb, $$0);
   }

   public ji p() {
      return this.al.a(cb);
   }

   public boolean t() {
      return this.al.a(cc);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   public int x() {
      return this.al.a(cd);
   }

   public void s(int $$0) {
      this.al.a(cd, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cb, ji.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tq $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new ji($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void E() {
      this.bS.a(0, new cbr(this));
      this.bS.a(0, new cdq(this));
      this.bS.a(1, new chh.a(this));
      this.bS.a(2, new chh.b(this, 4.0));
      this.bS.a(4, new cde(this, 1.0, 10));
      this.bS.a(4, new cdb(this));
      this.bS.a(5, new cco(this, coy.class, 6.0F));
      this.bS.a(5, new cbw(this, 10));
      this.bS.a(6, new ccq(this, 1.2F, true));
      this.bS.a(8, new chh.c());
      this.bS.a(8, new ccb(this));
      this.bS.a(9, new cbn<>(this, clv.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdy(this, clv.class).a());
   }

   public static bwp.a gs() {
      return bvk.F().a(bwq.s, 10.0).a(bwq.v, 1.2F).a(bwq.c, 3.0);
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cew(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awa.hs, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bvi $$0) {
      return !this.e_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   protected boolean o(bum $$0) {
      return true;
   }

   @Override
   protected boolean f(buu $$0) {
      return $$0 == buu.a && this.fN();
   }

   @Override
   protected void a(ard $$0, cld $$1) {
      if (this.a(buu.a).f()) {
         cwq $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(buu.a, $$2);
            this.g(buu.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gf()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aJ()) {
               this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bj() && this.dy().h() > 0.03) {
            fbb $$0 = this.g(0.0F);
            float $$1 = ayz.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayz.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(lt.au, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(lt.au, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lt.P);
      } else {
         super.b($$0);
      }
   }

   private void a(lr $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(awy.aT)) {
         if (!this.dV().C) {
            this.a(awa.hu, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bsl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz e(btc $$0) {
      return awa.hv;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.ht;
   }

   @Nullable
   @Override
   protected avz u() {
      return this.bj() ? awa.hr : awa.hq;
   }

   @Override
   protected avz aW() {
      return awa.hy;
   }

   @Override
   protected avz aV() {
      return awa.hz;
   }

   protected boolean gt() {
      ji $$0 = this.P().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(fbb $$0) {
      if (this.dh() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvm.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.O_() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends ccg {
      private final chh a;
      private boolean b;

      a(chh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         ji $$0 = this.a.p();
         return !ji.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof ard) {
            ard $$0 = (ard)this.a.dV();
            this.b = false;
            this.a.P().m();
            ji $$1 = this.a.dv();
            ji $$2 = $$0.a(axb.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         ji $$0 = this.a.p();
         if (ji.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dgj $$0 = this.a.dV();
         if (this.a.gt() || this.a.P().k()) {
            fbb $$1 = fbb.b(this.a.p());
            fbb $$2 = cgd.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cgd.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ji $$3 = ji.a((kb)$$2);
               if (!$$0.b_($$3).a(awv.a) || !$$0.a_($$3).a(etp.b)) {
                  $$2 = cgd.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.L().a($$2.d, $$2.e, $$2.f, (float)(this.a.af() + 20), (float)this.a.ad());
            this.a.P().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends ccg {
      private final chh a;
      private final double b;
      @Nullable
      private coy c;

      b(chh $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(chh.ce, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new btr(btt.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.P().m();
      }

      @Override
      public void a() {
         this.a.L().a(this.c, (float)(this.a.af() + 20), (float)this.a.ad());
         if (this.a.g(this.c) < 6.25) {
            this.a.P().m();
         } else {
            this.a.P().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dV().A.a(6) == 0) {
            this.c.b(new btr(btt.D, 100), this.a);
         }
      }
   }

   class c extends ccg {
      private int b;

      @Override
      public boolean b() {
         if (this.b > chh.this.af) {
            return false;
         } else {
            List<cld> $$0 = chh.this.dV().a(cld.class, chh.this.cR().c(8.0, 8.0, 8.0), chh.bZ);
            return !$$0.isEmpty() || !chh.this.a(buu.a).f();
         }
      }

      @Override
      public void d() {
         List<cld> $$0 = chh.this.dV().a(cld.class, chh.this.cR().c(8.0, 8.0, 8.0), chh.bZ);
         if (!$$0.isEmpty()) {
            chh.this.P().a($$0.get(0), 1.2F);
            chh.this.a(awa.hx, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwq $$0 = chh.this.a(buu.a);
         if (!$$0.f()) {
            this.a($$0);
            chh.this.a(buu.a, cwq.j);
            this.b = chh.this.af + chh.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cld> $$0 = chh.this.dV().a(cld.class, chh.this.cR().c(8.0, 8.0, 8.0), chh.bZ);
         cwq $$1 = chh.this.a(buu.a);
         if (!$$1.f()) {
            this.a($$1);
            chh.this.a(buu.a, cwq.j);
         } else if (!$$0.isEmpty()) {
            chh.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cwq $$0) {
         if (!$$0.f()) {
            double $$1 = chh.this.dE() - 0.3F;
            cld $$2 = new cld(chh.this.dV(), chh.this.dA(), $$1, chh.this.dG(), $$0);
            $$2.b(40);
            $$2.b(chh.this);
            float $$3 = 0.3F;
            float $$4 = chh.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * chh.this.ae.i();
            $$2.n(
               (double)(0.3F * -ayz.a(chh.this.dL() * (float) (Math.PI / 180.0)) * ayz.b(chh.this.dN() * (float) (Math.PI / 180.0)) + ayz.b($$4) * $$5),
               (double)(0.3F * ayz.a(chh.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayz.b(chh.this.dL() * (float) (Math.PI / 180.0)) * ayz.b(chh.this.dN() * (float) (Math.PI / 180.0)) + ayz.a($$4) * $$5)
            );
            chh.this.dV().b($$2);
         }
      }
   }
}
