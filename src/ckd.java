import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckd extends btc implements cjt {
   public static final float b = 7.448451F;
   public static final int c = ayn.f(24.166098F);
   private static final ajv<Integer> d = ajz.a(ckd.class, ajx.b);
   eww e = eww.b;
   jd bZ = jd.c;
   ckd.a ca = ckd.a.a;

   public ckd(bsw<? extends ckd> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new ckd.g(this);
      this.bQ = new ckd.f(this);
   }

   @Override
   public boolean aW() {
      return (this.t() + this.ai) % c == 0;
   }

   @Override
   protected bzi E() {
      return new ckd.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new ckd.c());
      this.bU.a(2, new ckd.i());
      this.bU.a(3, new ckd.e());
      this.bV.a(1, new ckd.b());
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayn.a($$0, 0, 64));
   }

   private void x() {
      this.i_();
      this.f(buu.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajv<?> $$0) {
      if (d.equals($$0)) {
         this.x();
      }

      super.a($$0);
   }

   public int t() {
      return this.an() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         float $$0 = ayn.b((float)(this.t() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayn.b((float)(this.t() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avo.tx, this.df(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dk() * 1.48F;
         float $$3 = ayn.b(this.dG() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayn.a(this.dG() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dl() * 2.5F;
         this.dQ().a(lm.Z, this.dv() + (double)$$3, this.dx() + (double)$$5, this.dB() + (double)$$4, 0.0, 0.0, 0.0);
         this.dQ().a(lm.Z, this.dv() - (double)$$3, this.dx() + (double)$$5, this.dB() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void m_() {
      if (this.bE() && this.gg()) {
         this.d(8.0F);
      }

      super.m_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.bZ = this.dq().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bZ = new jd($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AX", this.bZ.u());
      $$0.a("AY", this.bZ.v());
      $$0.a("AZ", this.bZ.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected avn v() {
      return avo.tu;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.ty;
   }

   @Override
   protected avn n_() {
      return avo.tw;
   }

   @Override
   protected float fb() {
      return 1.0F;
   }

   @Override
   public boolean a(bsw<?> $$0) {
      return true;
   }

   @Override
   public bst e(bty $$0) {
      int $$1 = this.s();
      bst $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cak {
      private final ced b = ced.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmv> $$0 = ckd.this.dQ().a(this.b, ckd.this, ckd.this.cL().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsq::dx).reversed());

               for (cmv $$1 : $$0) {
                  if (ckd.this.a($$1, ced.a)) {
                     ckd.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         btl $$0 = ckd.this.p();
         return $$0 != null ? ckd.this.a($$0, ced.a) : false;
      }
   }

   class c extends cak {
      private int b;

      @Override
      public boolean b() {
         btl $$0 = ckd.this.p();
         return $$0 != null ? ckd.this.a($$0, ced.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         ckd.this.ca = ckd.a.a;
         this.h();
      }

      @Override
      public void e() {
         ckd.this.bZ = ckd.this.dQ().a(dyv.a.e, ckd.this.bZ).b(10 + ckd.this.ah.a(20));
      }

      @Override
      public void a() {
         if (ckd.this.ca == ckd.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckd.this.ca = ckd.a.b;
               this.h();
               this.b = this.a((8 + ckd.this.ah.a(4)) * 20);
               ckd.this.a(avo.tz, 10.0F, 0.95F + ckd.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckd.this.bZ = ckd.this.p().dq().b(20 + ckd.this.ah.a(20));
         if (ckd.this.bZ.v() < ckd.this.dQ().z_()) {
            ckd.this.bZ = new jd(ckd.this.bZ.u(), ckd.this.dQ().z_() + 1, ckd.this.bZ.w());
         }
      }
   }

   class d extends bzi {
      public d(final btn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckd.this.ba = ckd.this.aY;
         ckd.this.aY = ckd.this.dG();
      }
   }

   class e extends ckd.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return ckd.this.p() == null || ckd.this.ca == ckd.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + ckd.this.ah.i() * 10.0F;
         this.e = -4.0F + ckd.this.ah.i() * 9.0F;
         this.f = ckd.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (ckd.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + ckd.this.ah.i() * 9.0F;
         }

         if (ckd.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ckd.this.ah.a(this.a(450)) == 0) {
            this.c = ckd.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ckd.this.e.d < ckd.this.dx() && !ckd.this.dQ().u(ckd.this.dq().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckd.this.e.d > ckd.this.dx() && !ckd.this.dQ().u(ckd.this.dq().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jd.c.equals(ckd.this.bZ)) {
            ckd.this.bZ = ckd.this.dq();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckd.this.e = eww.a(ckd.this.bZ).b((double)(this.d * ayn.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayn.a(this.c)));
      }
   }

   class f extends bzm {
      public f(final btn $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzn {
      private float m = 0.1F;

      public g(final btn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckd.this.Q) {
            ckd.this.s(ckd.this.dG() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckd.this.e.c - ckd.this.dv();
         double $$1 = ckd.this.e.d - ckd.this.dx();
         double $$2 = ckd.this.e.e - ckd.this.dB();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckd.this.dG();
            float $$7 = (float)ayn.d($$2, $$0);
            float $$8 = ayn.g(ckd.this.dG() + 90.0F);
            float $$9 = ayn.g($$7 * (180.0F / (float)Math.PI));
            ckd.this.s(ayn.e($$8, $$9, 4.0F) - 90.0F);
            ckd.this.aY = ckd.this.dG();
            if (ayn.d($$6, ckd.this.dG()) < 3.0F) {
               this.m = ayn.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayn.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayn.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckd.this.t($$10);
            float $$11 = ckd.this.dG() + 90.0F;
            double $$12 = (double)(this.m * ayn.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayn.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayn.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eww $$15 = ckd.this.dt();
            ckd.this.i($$15.e(new eww($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cak {
      public h() {
         this.a(EnumSet.of(cak.a.a));
      }

      protected boolean h() {
         return ckd.this.e.c(ckd.this.dv(), ckd.this.dx(), ckd.this.dB()) < 4.0;
      }
   }

   class i extends ckd.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return ckd.this.p() != null && ckd.this.ca == ckd.a.b;
      }

      @Override
      public boolean c() {
         btl $$0 = ckd.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bE()) {
            return false;
         } else {
            if ($$0 instanceof cmv $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (ckd.this.ai > this.e) {
                  this.e = ckd.this.ai + 20;
                  List<cff> $$2 = ckd.this.dQ().a(cff.class, ckd.this.cL().g(16.0), bsv.a);

                  for (cff $$3 : $$2) {
                     $$3.gA();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         ckd.this.h(null);
         ckd.this.ca = ckd.a.a;
      }

      @Override
      public void a() {
         btl $$0 = ckd.this.p();
         if ($$0 != null) {
            ckd.this.e = new eww($$0.dv(), $$0.e(0.5), $$0.dB());
            if (ckd.this.cL().g(0.2F).c($$0.cL())) {
               ckd.this.D($$0);
               ckd.this.ca = ckd.a.a;
               if (!ckd.this.aX()) {
                  ckd.this.dQ().c(1039, ckd.this.dq(), 0);
               }
            } else if (ckd.this.Q || ckd.this.aO > 0) {
               ckd.this.ca = ckd.a.a;
            }
         }
      }
   }
}
