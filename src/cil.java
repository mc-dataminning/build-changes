import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cil extends chx {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.33;
   private static final alc<Boolean> cd = alg.a(cil.class, ale.k);
   @Nullable
   private cil.a<cpx> ce;
   @Nullable
   private cil.b cf;

   public cil(bvr<? extends cil> $$0, dhi $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(cd);
   }

   private void x(boolean $$0) {
      this.al.a(cd, $$0);
      this.t();
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   protected void B() {
      this.cf = new cil.b(this, 0.6, $$0 -> $$0.a(ayd.au), true);
      this.bT.a(1, new ccy(this));
      this.bT.a(3, this.cf);
      this.bT.a(7, new cdk(this, 0.3F));
      this.bT.a(8, new cdu(this));
      this.bT.a(9, new ccq(this, 0.8));
      this.bT.a(10, new cer(this, 0.8, 1.0000001E-5F));
      this.bT.a(11, new cdm(this, cpx.class, 10.0F));
      this.bU.a(1, new cex<>(this, cic.class, false));
      this.bU.a(1, new cex<>(this, ciy.class, 10, false, false, ciy.bZ));
   }

   @Override
   public void a(ash $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bws.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bws.a);
            this.h(true);
         } else {
            this.b(bws.a);
            this.h(false);
         }
      } else {
         this.b(bws.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bxn.a p() {
      return chx.gt().a(bxo.s, 10.0).a(bxo.v, 0.3F).a(bxo.c, 3.0);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.sH;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.sG;
   }

   @Override
   protected axe o_() {
      return axf.sI;
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ((this.cf == null || this.cf.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dW().C) {
            if (this.ae.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dW().a(this, (byte)41);
            } else {
               this.y(false);
               this.dW().a(this, (byte)40);
            }
         }

         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.y(true);
      } else if ($$0 == 40) {
         this.y(false);
      } else {
         super.b($$0);
      }
   }

   private void y(boolean $$0) {
      lq $$1 = ls.Q;
      if (!$$0) {
         $$1 = ls.af;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dW().a($$1, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.ce == null) {
         this.ce = new cil.a<>(this, cpx.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.ce);
      if (!this.x()) {
         this.bT.a(4, this.ce);
      }
   }

   @Nullable
   public cil b(ash $$0, bvb $$1) {
      return bvr.aJ.a($$0, bvq.e);
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.au);
   }

   public static boolean c(bvr<cil> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dhl $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         jh $$1 = this.dw();
         if ($$1.v() < $$0.O()) {
            return false;
         }

         dxv $$2 = $$0.a_($$1.e());
         if ($$2.a(dko.i) || $$2.a(axu.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if ($$3 == null) {
         $$3 = new bvb.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwg> extends ccl<T> {
      private final cil i;

      public a(cil $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvp.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.x() && super.c();
      }
   }

   static class b extends cem {
      private final cil c;

      public b(cil $$0, double $$1, Predicate<cxp> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
