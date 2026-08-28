import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chl extends cgx {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final ajx<Boolean> cc = akb.a(chl.class, ajz.k);
   @Nullable
   private chl.a<cox> cd;
   @Nullable
   private chl.b ce;

   public chl(bur<? extends chl> $$0, dgi $$1) {
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
      this.ce = new chl.b(this, 0.6, $$0 -> $$0.a(awy.as), true);
      this.bS.a(1, new cby(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cck(this, 0.3F));
      this.bS.a(8, new ccu(this));
      this.bS.a(9, new cbq(this, 0.8));
      this.bS.a(10, new cdr(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new ccm(this, cox.class, 10.0F));
      this.bT.a(1, new cdx<>(this, chc.class, false));
      this.bT.a(1, new cdx<>(this, chy.class, 10, false, false, chy.bY));
   }

   @Override
   public void a(arc $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bvs.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvs.a);
            this.h(true);
         } else {
            this.b(bvs.a);
            this.h(false);
         }
      } else {
         this.b(bvs.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bwn.a p() {
      return cgx.gu().a(bwo.s, 10.0).a(bwo.v, 0.3F).a(bwo.c, 3.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.sN;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.sM;
   }

   @Override
   protected avz o_() {
      return awa.sO;
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
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

         return bsj.a;
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
         this.cd = new chl.a<>(this, cox.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.x()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public chl b(arc $$0, bub $$1) {
      return bur.aJ.a($$0, buq.e);
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.as);
   }

   public static boolean c(bur<chl> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dgl $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         ji $$1 = this.dw();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dwx $$2 = $$0.a_($$1.e());
         if ($$2.a(djo.i) || $$2.a(awp.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      if ($$3 == null) {
         $$3 = new bub.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvg> extends cbl<T> {
      private final chl i;

      public a(chl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bup.e::test);
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

   static class b extends cdm {
      private final chl c;

      public b(chl $$0, double $$1, Predicate<cwp> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
