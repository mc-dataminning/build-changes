import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfc extends ceo {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cd = 1.33;
   private static final ajp<Boolean> ce = ajt.a(cfc.class, ajr.k);
   @Nullable
   private cfc.a<cmh> cf;
   @Nullable
   private cfc.b cg;

   public cfc(bsj<? extends cfc> $$0, dcd $$1) {
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
      this.cg = new cfc.b(this, 0.6, $$0 -> $$0.a(awd.ap), true);
      this.bU.a(1, new bzq(this));
      this.bU.a(3, this.cg);
      this.bU.a(7, new cac(this, 0.3F));
      this.bU.a(8, new cam(this));
      this.bU.a(9, new bzi(this, 0.8));
      this.bU.a(10, new cbj(this, 0.8, 1.0000001E-5F));
      this.bU.a(11, new cae(this, cmh.class, 10.0F));
      this.bV.a(1, new cbp<>(this, cet.class, false));
      this.bV.a(1, new cbp<>(this, cfp.class, 10, false, false, cfp.ca));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btk.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btk.a);
            this.h(true);
         } else {
            this.b(btk.a);
            this.h(false);
         }
      } else {
         this.b(btk.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 10.0).a(bug.v, 0.3F).a(bug.c, 3.0);
   }

   @Nullable
   @Override
   protected ave v() {
      return avf.sp;
   }

   @Override
   public int P() {
      return 900;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.so;
   }

   @Override
   protected ave o_() {
      return avf.sq;
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ((this.cg == null || this.cg.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
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

         return bqd.a(this.dP().B);
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
      if (this.cf == null) {
         this.cf = new cfc.a<>(this, cmh.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cf);
      if (!this.y()) {
         this.bU.a(4, this.cf);
      }
   }

   @Nullable
   public cfc b(aqk $$0, brx $$1) {
      return bsj.au.a((dcd)$$0);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ap);
   }

   public static boolean c(bsj<cfc> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dcg $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         ja $$1 = this.dp();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dsh $$2 = $$0.a_($$1.d());
         if ($$2.a(dfh.i) || $$2.a(avu.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$3 == null) {
         $$3 = new brx.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends bsy> extends bzd<T> {
      private final cfc i;

      public a(cfc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsi.e::test);
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

   static class b extends cbe {
      private final cfc c;

      public b(cfc $$0, double $$1, Predicate<cua> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
