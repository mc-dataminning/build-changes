import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chk extends cgw {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final ajx<Boolean> cc = akb.a(chk.class, ajz.k);
   @Nullable
   private chk.a<cov> cd;
   @Nullable
   private chk.b ce;

   public chk(buq<? extends chk> $$0, dgg $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(cc);
   }

   private void x(boolean $$0) {
      this.al.a(cc, $$0);
      this.t();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void B() {
      this.ce = new chk.b(this, 0.6, $$0 -> $$0.a(awx.as), true);
      this.bS.a(1, new cbx(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new ccj(this, 0.3F));
      this.bS.a(8, new cct(this));
      this.bS.a(9, new cbp(this, 0.8));
      this.bS.a(10, new cdq(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new ccl(this, cov.class, 10.0F));
      this.bT.a(1, new cdw<>(this, chb.class, false));
      this.bT.a(1, new cdw<>(this, chx.class, 10, false, false, chx.bY));
   }

   @Override
   public void a(arc $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bvr.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvr.a);
            this.h(true);
         } else {
            this.b(bvr.a);
            this.h(false);
         }
      } else {
         this.b(bvr.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 10.0).a(bwn.v, 0.3F).a(bwn.c, 3.0);
   }

   @Nullable
   @Override
   protected avy u() {
      return avz.sN;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.sM;
   }

   @Override
   protected avy o_() {
      return avz.sO;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
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

         return bsi.a;
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
      lr $$1 = lt.R;
      if (!$$0) {
         $$1 = lt.ag;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dW().a($$1, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new chk.a<>(this, cov.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.x()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public chk b(arc $$0, bua $$1) {
      return buq.aI.a($$0, bup.e);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.as);
   }

   public static boolean c(buq<chk> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dgj $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         ji $$1 = this.dw();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dwv $$2 = $$0.a_($$1.e());
         if ($$2.a(djm.i) || $$2.a(awo.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$3 == null) {
         $$3 = new bua.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvf> extends cbk<T> {
      private final chk i;

      public a(chk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buo.e::test);
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

   static class b extends cdl {
      private final chk c;

      public b(chk $$0, double $$1, Predicate<cwn> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
