import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfg extends ces {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cd = 1.33;
   private static final ajp<Boolean> ce = ajt.a(cfg.class, ajr.k);
   @Nullable
   private cfg.a<cml> cf;
   @Nullable
   private cfg.b cg;

   public cfg(bsn<? extends cfg> $$0, dcg $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.ao.a(ce);
   }

   private void w(boolean $$0) {
      this.ao.a(ce, $$0);
      this.t();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
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
      this.cg = new cfg.b(this, 0.6, $$0 -> $$0.a(awf.ap), true);
      this.bU.a(1, new bzu(this));
      this.bU.a(3, this.cg);
      this.bU.a(7, new cag(this, 0.3F));
      this.bU.a(8, new caq(this));
      this.bU.a(9, new bzm(this, 0.8));
      this.bU.a(10, new cbn(this, 0.8, 1.0000001E-5F));
      this.bU.a(11, new cai(this, cml.class, 10.0F));
      this.bV.a(1, new cbt<>(this, cex.class, false));
      this.bV.a(1, new cbt<>(this, cft.class, 10, false, false, cft.ca));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bto.f);
            this.i(false);
         } else if ($$0 == 1.33) {
            this.b(bto.a);
            this.i(true);
         } else {
            this.b(bto.a);
            this.i(false);
         }
      } else {
         this.b(bto.a);
         this.i(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.ai > 2400;
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 10.0).a(buk.v, 0.3F).a(buk.c, 3.0);
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
   protected avg d(bra $$0) {
      return avh.so;
   }

   @Override
   protected avg n_() {
      return avh.sq;
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ((this.cg == null || this.cg.i()) && !this.x() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dR().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dR().a(this, (byte)41);
            } else {
               this.x(false);
               this.dR().a(this, (byte)40);
            }
         }

         return bqh.a(this.dR().B);
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
         this.dR().a($$1, this.d(1.0), this.dz() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cf == null) {
         this.cf = new cfg.a<>(this, cml.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cf);
      if (!this.x()) {
         this.bU.a(4, this.cf);
      }
   }

   @Nullable
   public cfg b(aqm $$0, bsb $$1) {
      return bsn.au.a((dcg)$$0);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ap);
   }

   public static boolean c(bsn<cfg> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dcj $$0) {
      if ($$0.f(this) && !$$0.d(this.cM())) {
         ja $$1 = this.dr();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dsl $$2 = $$0.a_($$1.d());
         if ($$2.a(dfk.i) || $$2.a(avw.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$3 == null) {
         $$3 = new bsb.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.5F * this.cN()), (double)(this.dl() * 0.4F));
   }

   @Override
   public boolean bY() {
      return this.cc() || super.bY();
   }

   static class a<T extends btc> extends bzh<T> {
      private final cfg i;

      public a(cfg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsm.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.x() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }
   }

   static class b extends cbi {
      private final cfg c;

      public b(cfg $$0, double $$1, Predicate<cud> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
