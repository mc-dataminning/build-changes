import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmy extends bvw implements cmo {
   public static final float a = 7.448451F;
   public static final int b = bae.f(24.166098F);
   private static final alc<Integer> c = alg.a(cmy.class, ale.b);
   fbx d = fbx.c;
   jh bY = jh.c;
   cmy.a bZ = cmy.a.a;

   public cmy(bvq<? extends cmy> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new cmy.g(this);
      this.bP = new cmy.f(this);
   }

   @Override
   public boolean ba() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected ccb G() {
      return new cmy.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cmy.c());
      this.bT.a(2, new cmy.i());
      this.bT.a(3, new cmy.e());
      this.bU.a(1, new cmy.b());
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
      this.g(bxn.c).a((double)(6 + this.m()));
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
            this.dV().a(this.dA(), this.dC(), this.dG(), axf.tR, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
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
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
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
      return axf.tO;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.tS;
   }

   @Override
   protected axe o_() {
      return axf.tQ;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bvq<?> $$0) {
      return true;
   }

   @Override
   public bvm e(bwr $$0) {
      int $$1 = this.m();
      bvm $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(ash $$0, bwf $$1, cgw $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cdd {
      private final cgw b = cgw.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            ash $$0 = a(cmy.this.dV());
            List<cpw> $$1 = $$0.a(this.b, cmy.this, cmy.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bvj::dC).reversed());

               for (cpw $$2 : $$1) {
                  if (cmy.this.a($$0, $$2, cgw.a)) {
                     cmy.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bwf $$0 = cmy.this.O_();
         return $$0 != null ? cmy.this.a(a(cmy.this.dV()), $$0, cgw.a) : false;
      }
   }

   class c extends cdd {
      private int b;

      @Override
      public boolean b() {
         bwf $$0 = cmy.this.O_();
         return $$0 != null ? cmy.this.a(a(cmy.this.dV()), $$0, cgw.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cmy.this.bZ = cmy.a.a;
         this.h();
      }

      @Override
      public void e() {
         cmy.this.bY = cmy.this.dV().a(edp.a.e, cmy.this.bY).b(10 + cmy.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cmy.this.bZ == cmy.a.a) {
            this.b--;
            if (this.b <= 0) {
               cmy.this.bZ = cmy.a.b;
               this.h();
               this.b = this.a((8 + cmy.this.ae.a(4)) * 20);
               cmy.this.a(axf.tT, 10.0F, 0.95F + cmy.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cmy.this.bY = cmy.this.O_().dv().b(20 + cmy.this.ae.a(20));
         if (cmy.this.bY.v() < cmy.this.dV().O()) {
            cmy.this.bY = new jh(cmy.this.bY.u(), cmy.this.dV().O() + 1, cmy.this.bY.w());
         }
      }
   }

   class d extends ccb {
      public d(final bwh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cmy.this.aZ = cmy.this.aX;
         cmy.this.aX = cmy.this.dL();
      }
   }

   class e extends cmy.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cmy.this.O_() == null || cmy.this.bZ == cmy.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cmy.this.ae.i() * 10.0F;
         this.e = -4.0F + cmy.this.ae.i() * 9.0F;
         this.f = cmy.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cmy.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cmy.this.ae.i() * 9.0F;
         }

         if (cmy.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cmy.this.ae.a(this.a(450)) == 0) {
            this.c = cmy.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cmy.this.d.e < cmy.this.dC() && !cmy.this.dV().u(cmy.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cmy.this.d.e > cmy.this.dC() && !cmy.this.dV().u(cmy.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jh.c.equals(cmy.this.bY)) {
            cmy.this.bY = cmy.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cmy.this.d = fbx.a(cmy.this.bY).b((double)(this.d * bae.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * bae.a(this.c)));
      }
   }

   class f extends ccf {
      public f(final bwh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends ccg {
      private float m = 0.1F;

      public g(final bwh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cmy.this.P) {
            cmy.this.v(cmy.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cmy.this.d.d - cmy.this.dA();
         double $$1 = cmy.this.d.e - cmy.this.dC();
         double $$2 = cmy.this.d.f - cmy.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cmy.this.dL();
            float $$7 = (float)bae.d($$2, $$0);
            float $$8 = bae.h(cmy.this.dL() + 90.0F);
            float $$9 = bae.h($$7 * (180.0F / (float)Math.PI));
            cmy.this.v(bae.e($$8, $$9, 4.0F) - 90.0F);
            cmy.this.aX = cmy.this.dL();
            if (bae.d($$6, cmy.this.dL()) < 3.0F) {
               this.m = bae.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = bae.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(bae.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cmy.this.w($$10);
            float $$11 = cmy.this.dL() + 90.0F;
            double $$12 = (double)(this.m * bae.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * bae.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * bae.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fbx $$15 = cmy.this.dy();
            cmy.this.h($$15.e(new fbx($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cdd {
      public h() {
         this.a(EnumSet.of(cdd.a.a));
      }

      protected boolean h() {
         return cmy.this.d.c(cmy.this.dA(), cmy.this.dC(), cmy.this.dG()) < 4.0;
      }
   }

   class i extends cmy.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cmy.this.O_() != null && cmy.this.bZ == cmy.a.b;
      }

      @Override
      public boolean c() {
         bwf $$0 = cmy.this.O_();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bL()) {
            return false;
         } else {
            if ($$0 instanceof cpw $$1 && ($$0.aa_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cmy.this.af > this.e) {
                  this.e = cmy.this.af + 20;
                  List<chz> $$2 = cmy.this.dV().a(chz.class, cmy.this.cR().g(16.0), bvo.a);

                  for (chz $$3 : $$2) {
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
         cmy.this.h(null);
         cmy.this.bZ = cmy.a.a;
      }

      @Override
      public void a() {
         bwf $$0 = cmy.this.O_();
         if ($$0 != null) {
            cmy.this.d = new fbx($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cmy.this.cR().g(0.2F).c($$0.cR())) {
               cmy.this.c(a(cmy.this.dV()), $$0);
               cmy.this.bZ = cmy.a.a;
               if (!cmy.this.bb()) {
                  cmy.this.dV().c(1039, cmy.this.dv(), 0);
               }
            } else if (cmy.this.P || cmy.this.aN > 0) {
               cmy.this.bZ = cmy.a.a;
            }
         }
      }
   }
}
