import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmq extends bvo implements cmg {
   public static final float a = 7.448451F;
   public static final int b = azu.f(24.166098F);
   private static final aks<Integer> c = akw.a(cmq.class, aku.b);
   fbr d = fbr.c;
   jh bY = jh.c;
   cmq.a bZ = cmq.a.a;

   public cmq(bvi<? extends cmq> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new cmq.g(this);
      this.bP = new cmq.f(this);
   }

   @Override
   public boolean ba() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected cbt G() {
      return new cmq.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cmq.c());
      this.bT.a(2, new cmq.i());
      this.bT.a(3, new cmq.e());
      this.bU.a(1, new cmq.b());
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azu.a($$0, 0, 64));
   }

   private void t() {
      this.m_();
      this.g(bxf.c).a((double)(6 + this.m()));
   }

   public int m() {
      return this.al.a(c);
   }

   @Override
   public void a(aks<?> $$0) {
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
         float $$0 = azu.b((float)(this.p() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azu.b((float)(this.p() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.tX, this.dn(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dr() * 1.48F;
         float $$3 = azu.b(this.dM() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azu.a(this.dM() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.ds() * 2.5F;
         this.dW().a(ls.ab, this.dB() + (double)$$3, this.dD() + (double)$$5, this.dH() + (double)$$4, 0.0, 0.0, 0.0);
         this.dW().a(ls.ab, this.dB() - (double)$$3, this.dD() + (double)$$5, this.dH() - (double)$$4, 0.0, 0.0, 0.0);
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
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.bY = this.dw().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bY = new jh($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(um $$0) {
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
   public aww dn() {
      return aww.f;
   }

   @Override
   protected awu u() {
      return awv.tU;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.tY;
   }

   @Override
   protected awu o_() {
      return awv.tW;
   }

   @Override
   protected float fg() {
      return 1.0F;
   }

   @Override
   public boolean a(bvi<?> $$0) {
      return true;
   }

   @Override
   public bve e(bwj $$0) {
      int $$1 = this.m();
      bve $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arx $$0, bvx $$1, cgo $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ccv {
      private final cgo b = cgo.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arx $$0 = a(cmq.this.dW());
            List<cpo> $$1 = $$0.a(this.b, cmq.this, cmq.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bvb::dD).reversed());

               for (cpo $$2 : $$1) {
                  if (cmq.this.a($$0, $$2, cgo.a)) {
                     cmq.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bvx $$0 = cmq.this.O_();
         return $$0 != null ? cmq.this.a(a(cmq.this.dW()), $$0, cgo.a) : false;
      }
   }

   class c extends ccv {
      private int b;

      @Override
      public boolean b() {
         bvx $$0 = cmq.this.O_();
         return $$0 != null ? cmq.this.a(a(cmq.this.dW()), $$0, cgo.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cmq.this.bZ = cmq.a.a;
         this.h();
      }

      @Override
      public void e() {
         cmq.this.bY = cmq.this.dW().a(edj.a.e, cmq.this.bY).b(10 + cmq.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cmq.this.bZ == cmq.a.a) {
            this.b--;
            if (this.b <= 0) {
               cmq.this.bZ = cmq.a.b;
               this.h();
               this.b = this.a((8 + cmq.this.ae.a(4)) * 20);
               cmq.this.a(awv.tZ, 10.0F, 0.95F + cmq.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cmq.this.bY = cmq.this.O_().dw().b(20 + cmq.this.ae.a(20));
         if (cmq.this.bY.v() < cmq.this.dW().P()) {
            cmq.this.bY = new jh(cmq.this.bY.u(), cmq.this.dW().P() + 1, cmq.this.bY.w());
         }
      }
   }

   class d extends cbt {
      public d(final bvz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cmq.this.aZ = cmq.this.aX;
         cmq.this.aX = cmq.this.dM();
      }
   }

   class e extends cmq.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cmq.this.O_() == null || cmq.this.bZ == cmq.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cmq.this.ae.i() * 10.0F;
         this.e = -4.0F + cmq.this.ae.i() * 9.0F;
         this.f = cmq.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cmq.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cmq.this.ae.i() * 9.0F;
         }

         if (cmq.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cmq.this.ae.a(this.a(450)) == 0) {
            this.c = cmq.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cmq.this.d.e < cmq.this.dD() && !cmq.this.dW().u(cmq.this.dw().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cmq.this.d.e > cmq.this.dD() && !cmq.this.dW().u(cmq.this.dw().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jh.c.equals(cmq.this.bY)) {
            cmq.this.bY = cmq.this.dw();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cmq.this.d = fbr.a(cmq.this.bY).b((double)(this.d * azu.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azu.a(this.c)));
      }
   }

   class f extends cbx {
      public f(final bvz $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cby {
      private float m = 0.1F;

      public g(final bvz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cmq.this.P) {
            cmq.this.v(cmq.this.dM() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cmq.this.d.d - cmq.this.dB();
         double $$1 = cmq.this.d.e - cmq.this.dD();
         double $$2 = cmq.this.d.f - cmq.this.dH();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cmq.this.dM();
            float $$7 = (float)azu.d($$2, $$0);
            float $$8 = azu.h(cmq.this.dM() + 90.0F);
            float $$9 = azu.h($$7 * (180.0F / (float)Math.PI));
            cmq.this.v(azu.e($$8, $$9, 4.0F) - 90.0F);
            cmq.this.aX = cmq.this.dM();
            if (azu.d($$6, cmq.this.dM()) < 3.0F) {
               this.m = azu.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azu.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azu.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cmq.this.w($$10);
            float $$11 = cmq.this.dM() + 90.0F;
            double $$12 = (double)(this.m * azu.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azu.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azu.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fbr $$15 = cmq.this.dz();
            cmq.this.h($$15.e(new fbr($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ccv {
      public h() {
         this.a(EnumSet.of(ccv.a.a));
      }

      protected boolean h() {
         return cmq.this.d.c(cmq.this.dB(), cmq.this.dD(), cmq.this.dH()) < 4.0;
      }
   }

   class i extends cmq.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cmq.this.O_() != null && cmq.this.bZ == cmq.a.b;
      }

      @Override
      public boolean c() {
         bvx $$0 = cmq.this.O_();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bL()) {
            return false;
         } else {
            if ($$0 instanceof cpo $$1 && ($$0.aa_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cmq.this.af > this.e) {
                  this.e = cmq.this.af + 20;
                  List<chr> $$2 = cmq.this.dW().a(chr.class, cmq.this.cR().g(16.0), bvg.a);

                  for (chr $$3 : $$2) {
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
         cmq.this.h(null);
         cmq.this.bZ = cmq.a.a;
      }

      @Override
      public void a() {
         bvx $$0 = cmq.this.O_();
         if ($$0 != null) {
            cmq.this.d = new fbr($$0.dB(), $$0.e(0.5), $$0.dH());
            if (cmq.this.cR().g(0.2F).c($$0.cR())) {
               cmq.this.c(a(cmq.this.dW()), $$0);
               cmq.this.bZ = cmq.a.a;
               if (!cmq.this.bb()) {
                  cmq.this.dW().c(1039, cmq.this.dw(), 0);
               }
            } else if (cmq.this.P || cmq.this.aN > 0) {
               cmq.this.bZ = cmq.a.a;
            }
         }
      }
   }
}
