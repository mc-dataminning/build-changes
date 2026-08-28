import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cff extends cer {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cd = 1.33;
   private static final ajp<Boolean> ce = ajt.a(cff.class, ajr.k);
   @Nullable
   private cff.a<cmk> cf;
   @Nullable
   private cff.b cg;

   public cff(bsm<? extends cff> $$0, dcf $$1) {
      super($$0, $$1);
      this.u();
   }

   boolean y() {
      return this.ao.a(ce);
   }

   private void w(boolean $$0) {
      this.ao.a(ce, $$0);
      this.u();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
   }

   @Override
   protected void z() {
      this.cg = new cff.b(this, 0.6, $$0 -> $$0.a(awf.ap), true);
      this.bU.a(1, new bzt(this));
      this.bU.a(3, this.cg);
      this.bU.a(7, new caf(this, 0.3F));
      this.bU.a(8, new cap(this));
      this.bU.a(9, new bzl(this, 0.8));
      this.bU.a(10, new cbm(this, 0.8, 1.0000001E-5F));
      this.bU.a(11, new cah(this, cmk.class, 10.0F));
      this.bV.a(1, new cbs<>(this, cew.class, false));
      this.bV.a(1, new cbs<>(this, cfs.class, 10, false, false, cfs.ca));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btn.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btn.a);
            this.h(true);
         } else {
            this.b(btn.a);
            this.h(false);
         }
      } else {
         this.b(btn.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 10.0).a(buj.v, 0.3F).a(buj.c, 3.0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.sp;
   }

   @Override
   public int P() {
      return 900;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.so;
   }

   @Override
   protected avg o_() {
      return avh.sq;
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ((this.cg == null || this.cg.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dQ().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dQ().a(this, (byte)41);
            } else {
               this.x(false);
               this.dQ().a(this, (byte)40);
            }
         }

         return bqg.a(this.dQ().B);
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
         this.dQ().a($$1, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.cf == null) {
         this.cf = new cff.a<>(this, cmk.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cf);
      if (!this.y()) {
         this.bU.a(4, this.cf);
      }
   }

   @Nullable
   public cff b(aqm $$0, bsa $$1) {
      return bsm.au.a((dcf)$$0);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ap);
   }

   public static boolean c(bsm<cff> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dci $$0) {
      if ($$0.f(this) && !$$0.d(this.cL())) {
         ja $$1 = this.dq();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dsk $$2 = $$0.a_($$1.d());
         if ($$2.a(dfj.i) || $$2.a(avw.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$3 == null) {
         $$3 = new bsa.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.4F));
   }

   @Override
   public boolean bX() {
      return this.cb() || super.bX();
   }

   static class a<T extends btb> extends bzg<T> {
      private final cff i;

      public a(cff $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsl.e::test);
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

   static class b extends cbh {
      private final cff c;

      public b(cff $$0, double $$1, Predicate<cuc> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
