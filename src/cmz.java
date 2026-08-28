import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmz extends bvx implements cmp {
   public static final float a = 7.448451F;
   public static final int b = bae.f(24.166098F);
   private static final alc<Integer> c = alg.a(cmz.class, ale.b);
   fby d = fby.c;
   jh bY = jh.c;
   cmz.a bZ = cmz.a.a;

   public cmz(bvr<? extends cmz> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new cmz.g(this);
      this.bP = new cmz.f(this);
   }

   @Override
   public boolean ba() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected ccc G() {
      return new cmz.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cmz.c());
      this.bT.a(2, new cmz.i());
      this.bT.a(3, new cmz.e());
      this.bU.a(1, new cmz.b());
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
      this.g(bxo.c).a((double)(6 + this.m()));
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
      if (this.dW().C) {
         float $$0 = bae.b((float)(this.p() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = bae.b((float)(this.p() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dW().a(this.dB(), this.dD(), this.dH(), axf.tR, this.dn(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dr() * 1.48F;
         float $$3 = bae.b(this.dM() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = bae.a(this.dM() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.ds() * 2.5F;
         this.dW().a(ls.aa, this.dB() + (double)$$3, this.dD() + (double)$$5, this.dH() + (double)$$4, 0.0, 0.0, 0.0);
         this.dW().a(ls.aa, this.dB() - (double)$$3, this.dD() + (double)$$5, this.dH() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bL() && this.gg()) {
         this.d(8.0F);
      }

      super.d_();
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      this.bY = this.dw().b(5);
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
   public axg dn() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return axf.tO;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.tS;
   }

   @Override
   protected axe o_() {
      return axf.tQ;
   }

   @Override
   protected float fg() {
      return 1.0F;
   }

   @Override
   public boolean a(bvr<?> $$0) {
      return true;
   }

   @Override
   public bvn e(bws $$0) {
      int $$1 = this.m();
      bvn $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(ash $$0, bwg $$1, cgx $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cde {
      private final cgx b = cgx.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            ash $$0 = a(cmz.this.dW());
            List<cpx> $$1 = $$0.a(this.b, cmz.this, cmz.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bvk::dD).reversed());

               for (cpx $$2 : $$1) {
                  if (cmz.this.a($$0, $$2, cgx.a)) {
                     cmz.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bwg $$0 = cmz.this.O_();
         return $$0 != null ? cmz.this.a(a(cmz.this.dW()), $$0, cgx.a) : false;
      }
   }

   class c extends cde {
      private int b;

      @Override
      public boolean b() {
         bwg $$0 = cmz.this.O_();
         return $$0 != null ? cmz.this.a(a(cmz.this.dW()), $$0, cgx.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cmz.this.bZ = cmz.a.a;
         this.h();
      }

      @Override
      public void e() {
         cmz.this.bY = cmz.this.dW().a(edq.a.e, cmz.this.bY).b(10 + cmz.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cmz.this.bZ == cmz.a.a) {
            this.b--;
            if (this.b <= 0) {
               cmz.this.bZ = cmz.a.b;
               this.h();
               this.b = this.a((8 + cmz.this.ae.a(4)) * 20);
               cmz.this.a(axf.tT, 10.0F, 0.95F + cmz.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cmz.this.bY = cmz.this.O_().dw().b(20 + cmz.this.ae.a(20));
         if (cmz.this.bY.v() < cmz.this.dW().O()) {
            cmz.this.bY = new jh(cmz.this.bY.u(), cmz.this.dW().O() + 1, cmz.this.bY.w());
         }
      }
   }

   class d extends ccc {
      public d(final bwi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cmz.this.aZ = cmz.this.aX;
         cmz.this.aX = cmz.this.dM();
      }
   }

   class e extends cmz.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cmz.this.O_() == null || cmz.this.bZ == cmz.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cmz.this.ae.i() * 10.0F;
         this.e = -4.0F + cmz.this.ae.i() * 9.0F;
         this.f = cmz.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cmz.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cmz.this.ae.i() * 9.0F;
         }

         if (cmz.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cmz.this.ae.a(this.a(450)) == 0) {
            this.c = cmz.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cmz.this.d.e < cmz.this.dD() && !cmz.this.dW().u(cmz.this.dw().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cmz.this.d.e > cmz.this.dD() && !cmz.this.dW().u(cmz.this.dw().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jh.c.equals(cmz.this.bY)) {
            cmz.this.bY = cmz.this.dw();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cmz.this.d = fby.a(cmz.this.bY).b((double)(this.d * bae.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * bae.a(this.c)));
      }
   }

   class f extends ccg {
      public f(final bwi $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cch {
      private float m = 0.1F;

      public g(final bwi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cmz.this.P) {
            cmz.this.v(cmz.this.dM() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cmz.this.d.d - cmz.this.dB();
         double $$1 = cmz.this.d.e - cmz.this.dD();
         double $$2 = cmz.this.d.f - cmz.this.dH();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cmz.this.dM();
            float $$7 = (float)bae.d($$2, $$0);
            float $$8 = bae.h(cmz.this.dM() + 90.0F);
            float $$9 = bae.h($$7 * (180.0F / (float)Math.PI));
            cmz.this.v(bae.e($$8, $$9, 4.0F) - 90.0F);
            cmz.this.aX = cmz.this.dM();
            if (bae.d($$6, cmz.this.dM()) < 3.0F) {
               this.m = bae.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = bae.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(bae.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cmz.this.w($$10);
            float $$11 = cmz.this.dM() + 90.0F;
            double $$12 = (double)(this.m * bae.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * bae.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * bae.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fby $$15 = cmz.this.dz();
            cmz.this.h($$15.e(new fby($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cde {
      public h() {
         this.a(EnumSet.of(cde.a.a));
      }

      protected boolean h() {
         return cmz.this.d.c(cmz.this.dB(), cmz.this.dD(), cmz.this.dH()) < 4.0;
      }
   }

   class i extends cmz.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cmz.this.O_() != null && cmz.this.bZ == cmz.a.b;
      }

      @Override
      public boolean c() {
         bwg $$0 = cmz.this.O_();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bL()) {
            return false;
         } else {
            if ($$0 instanceof cpx $$1 && ($$0.aa_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cmz.this.af > this.e) {
                  this.e = cmz.this.af + 20;
                  List<cia> $$2 = cmz.this.dW().a(cia.class, cmz.this.cR().g(16.0), bvp.a);

                  for (cia $$3 : $$2) {
                     $$3.gD();
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
         cmz.this.h(null);
         cmz.this.bZ = cmz.a.a;
      }

      @Override
      public void a() {
         bwg $$0 = cmz.this.O_();
         if ($$0 != null) {
            cmz.this.d = new fby($$0.dB(), $$0.e(0.5), $$0.dH());
            if (cmz.this.cR().g(0.2F).c($$0.cR())) {
               cmz.this.c(a(cmz.this.dW()), $$0);
               cmz.this.bZ = cmz.a.a;
               if (!cmz.this.bb()) {
                  cmz.this.dW().c(1039, cmz.this.dw(), 0);
               }
            } else if (cmz.this.P || cmz.this.aN > 0) {
               cmz.this.bZ = cmz.a.a;
            }
         }
      }
   }
}
