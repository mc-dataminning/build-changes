import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmu extends bvs implements cmk {
   public static final float a = 7.448451F;
   public static final int b = bae.f(24.166098F);
   private static final alc<Integer> c = alg.a(cmu.class, ale.b);
   fbs d = fbs.c;
   jh bY = jh.c;
   cmu.a bZ = cmu.a.a;

   public cmu(bvm<? extends cmu> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new cmu.g(this);
      this.bP = new cmu.f(this);
   }

   @Override
   public boolean ba() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected cbx G() {
      return new cmu.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cmu.c());
      this.bT.a(2, new cmu.i());
      this.bT.a(3, new cmu.e());
      this.bU.a(1, new cmu.b());
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, bae.a($$0, 0, 64));
   }

   private void t() {
      this.m_();
      this.g(bxj.c).a((double)(6 + this.m()));
   }

   public int m() {
      return this.al.a(c);
   }

   @Override
   public void a(alc<?> $$0) {
      if (c.equals($$0)) {
         this.t();
      }

      super.a($$0);
   }

   public int p() {
      return this.ar() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         float $$0 = bae.b((float)(this.p() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = bae.b((float)(this.p() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), axf.tQ, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = bae.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = bae.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(ls.aa, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(ls.aa, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bL() && this.ge()) {
         this.d(8.0F);
      }

      super.d_();
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.bY = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bY = new jh($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("AX", this.bY.u());
      $$0.a("AY", this.bY.v());
      $$0.a("AZ", this.bY.w());
      $$0.a("Size", this.m());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return axf.tN;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.tR;
   }

   @Override
   protected axe o_() {
      return axf.tP;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bvm<?> $$0) {
      return true;
   }

   @Override
   public bvi e(bwn $$0) {
      int $$1 = this.m();
      bvi $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(ash $$0, bwb $$1, cgs $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ccz {
      private final cgs b = cgs.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            ash $$0 = a(cmu.this.dV());
            List<cps> $$1 = $$0.a(this.b, cmu.this, cmu.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bvf::dC).reversed());

               for (cps $$2 : $$1) {
                  if (cmu.this.a($$0, $$2, cgs.a)) {
                     cmu.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bwb $$0 = cmu.this.O_();
         return $$0 != null ? cmu.this.a(a(cmu.this.dV()), $$0, cgs.a) : false;
      }
   }

   class c extends ccz {
      private int b;

      @Override
      public boolean b() {
         bwb $$0 = cmu.this.O_();
         return $$0 != null ? cmu.this.a(a(cmu.this.dV()), $$0, cgs.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cmu.this.bZ = cmu.a.a;
         this.h();
      }

      @Override
      public void e() {
         cmu.this.bY = cmu.this.dV().a(edi.a.e, cmu.this.bY).b(10 + cmu.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cmu.this.bZ == cmu.a.a) {
            this.b--;
            if (this.b <= 0) {
               cmu.this.bZ = cmu.a.b;
               this.h();
               this.b = this.a((8 + cmu.this.ae.a(4)) * 20);
               cmu.this.a(axf.tS, 10.0F, 0.95F + cmu.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cmu.this.bY = cmu.this.O_().dv().b(20 + cmu.this.ae.a(20));
         if (cmu.this.bY.v() < cmu.this.dV().O()) {
            cmu.this.bY = new jh(cmu.this.bY.u(), cmu.this.dV().O() + 1, cmu.this.bY.w());
         }
      }
   }

   class d extends cbx {
      public d(final bwd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cmu.this.aZ = cmu.this.aX;
         cmu.this.aX = cmu.this.dL();
      }
   }

   class e extends cmu.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cmu.this.O_() == null || cmu.this.bZ == cmu.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cmu.this.ae.i() * 10.0F;
         this.e = -4.0F + cmu.this.ae.i() * 9.0F;
         this.f = cmu.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cmu.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cmu.this.ae.i() * 9.0F;
         }

         if (cmu.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cmu.this.ae.a(this.a(450)) == 0) {
            this.c = cmu.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cmu.this.d.e < cmu.this.dC() && !cmu.this.dV().u(cmu.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cmu.this.d.e > cmu.this.dC() && !cmu.this.dV().u(cmu.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jh.c.equals(cmu.this.bY)) {
            cmu.this.bY = cmu.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cmu.this.d = fbs.a(cmu.this.bY).b((double)(this.d * bae.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * bae.a(this.c)));
      }
   }

   class f extends ccb {
      public f(final bwd $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends ccc {
      private float m = 0.1F;

      public g(final bwd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cmu.this.P) {
            cmu.this.v(cmu.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cmu.this.d.d - cmu.this.dA();
         double $$1 = cmu.this.d.e - cmu.this.dC();
         double $$2 = cmu.this.d.f - cmu.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cmu.this.dL();
            float $$7 = (float)bae.d($$2, $$0);
            float $$8 = bae.h(cmu.this.dL() + 90.0F);
            float $$9 = bae.h($$7 * (180.0F / (float)Math.PI));
            cmu.this.v(bae.e($$8, $$9, 4.0F) - 90.0F);
            cmu.this.aX = cmu.this.dL();
            if (bae.d($$6, cmu.this.dL()) < 3.0F) {
               this.m = bae.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = bae.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(bae.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cmu.this.w($$10);
            float $$11 = cmu.this.dL() + 90.0F;
            double $$12 = (double)(this.m * bae.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * bae.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * bae.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fbs $$15 = cmu.this.dy();
            cmu.this.h($$15.e(new fbs($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ccz {
      public h() {
         this.a(EnumSet.of(ccz.a.a));
      }

      protected boolean h() {
         return cmu.this.d.c(cmu.this.dA(), cmu.this.dC(), cmu.this.dG()) < 4.0;
      }
   }

   class i extends cmu.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cmu.this.O_() != null && cmu.this.bZ == cmu.a.b;
      }

      @Override
      public boolean c() {
         bwb $$0 = cmu.this.O_();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bL()) {
            return false;
         } else {
            if ($$0 instanceof cps $$1 && ($$0.aa_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cmu.this.af > this.e) {
                  this.e = cmu.this.af + 20;
                  List<chv> $$2 = cmu.this.dV().a(chv.class, cmu.this.cR().g(16.0), bvk.a);

                  for (chv $$3 : $$2) {
                     $$3.gB();
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
         cmu.this.h(null);
         cmu.this.bZ = cmu.a.a;
      }

      @Override
      public void a() {
         bwb $$0 = cmu.this.O_();
         if ($$0 != null) {
            cmu.this.d = new fbs($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cmu.this.cR().g(0.2F).c($$0.cR())) {
               cmu.this.c(a(cmu.this.dV()), $$0);
               cmu.this.bZ = cmu.a.a;
               if (!cmu.this.bb()) {
                  cmu.this.dV().c(1039, cmu.this.dv(), 0);
               }
            } else if (cmu.this.P || cmu.this.aN > 0) {
               cmu.this.bZ = cmu.a.a;
            }
         }
      }
   }
}
