import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfo extends cfa {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final akg<Boolean> cc = akk.a(cfo.class, aki.k);
   @Nullable
   private cfo.a<cms> cd;
   @Nullable
   private cfo.b ce;

   public cfo(bsv<? extends cfo> $$0, dbt $$1) {
      super($$0, $$1);
      this.u();
   }

   boolean y() {
      return this.ao.a(cc);
   }

   private void w(boolean $$0) {
      this.ao.a(cc, $$0);
      this.u();
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new cfo.b(this, 0.6, $$0 -> $$0.a(awu.ap), true);
      this.bS.a(1, new cac(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cao(this, 0.3F));
      this.bS.a(8, new cay(this));
      this.bS.a(9, new bzu(this, 0.8));
      this.bS.a(10, new cbv(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new caq(this, cms.class, 10.0F));
      this.bT.a(1, new ccb<>(this, cff.class, false));
      this.bT.a(1, new ccb<>(this, cgb.class, 10, false, false, cgb.bY));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btw.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btw.a);
            this.h(true);
         } else {
            this.b(btw.a);
            this.h(false);
         }
      } else {
         this.b(btw.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 10.0).a(bus.r, 0.3F).a(bus.c, 3.0);
   }

   @Nullable
   @Override
   protected avv v() {
      return avw.sm;
   }

   @Override
   public int P() {
      return 900;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.sl;
   }

   @Override
   protected avv o_() {
      return avw.sn;
   }

   private float gq() {
      return (float)this.g(bus.c);
   }

   @Override
   public boolean C(bsp $$0) {
      return $$0.a(this.dQ().b((btk)this), this.gq());
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dP().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dP().a(this, (byte)41);
            } else {
               this.x(false);
               this.dP().a(this, (byte)40);
            }
         }

         return bqp.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      lh $$1 = lj.Q;
      if (!$$0) {
         $$1 = lj.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.cd == null) {
         this.cd = new cfo.a<>(this, cms.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public cfo b(arb $$0, bsj $$1) {
      return bsv.au.a((dbt)$$0);
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ap);
   }

   public static boolean c(bsv<cfo> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dbw $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         iz $$1 = this.dp();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         drx $$2 = $$0.a_($$1.d());
         if ($$2.a(dew.i) || $$2.a(awl.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      if ($$3 == null) {
         $$3 = new bsj.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends btk> extends bzp<T> {
      private final cfo i;

      public a(cfo $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsu.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.y() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }
   }

   static class b extends cbq {
      private final cfo c;

      public b(cfo $$0, double $$1, Predicate<cuk> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
