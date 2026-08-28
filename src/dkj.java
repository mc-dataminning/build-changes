import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkj extends dku implements dsb {
   public static final dzd a = dzc.I;
   private static final fdo b = dku.b(16.0, 0.0, 2.0);
   private static final fdo c = dku.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(dhp $$0, jj $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dym $$0) {
      return $$0.a(awz.P) && $$0.b() instanceof dkj;
   }

   protected dkj(boolean $$0, dyl.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dkj> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dym a(dym $$0, dhp $$1, jj $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dzq $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jj $$0, dhp $$1, dzq $$2) {
      if (!c($$1, $$0.e())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.i());
            case d:
               return !c($$1, $$0.h());
            case e:
               return !c($$1, $$0.f());
            case f:
               return !c($$1, $$0.g());
            default:
               return false;
         }
      }
   }

   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3) {
   }

   protected dym a(dhp $$0, jj $$1, dym $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dzq $$4 = $$2.c(this.c());
         return new dqz($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3) {
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.d(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.e(), this);
         }
      }
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == euu.c;
      dym $$3 = super.m();
      jo $$4 = $$0.g();
      boolean $$5 = $$4 == jo.f || $$4 == jo.e;
      return $$3.b(this.c(), $$5 ? dzq.b : dzq.a).b(a, Boolean.valueOf($$2));
   }

   public abstract dzp<dzq> c();

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(a) ? euu.c.a(false) : super.b_($$0);
   }
}
