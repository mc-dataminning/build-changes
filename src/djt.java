import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djt extends dke implements drl {
   public static final dyh a = dyg.I;
   private static final fcr b = dke.b(16.0, 0.0, 2.0);
   private static final fcr c = dke.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(dgz $$0, ji $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dxq $$0) {
      return $$0.a(awp.P) && $$0.b() instanceof djt;
   }

   protected djt(boolean $$0, dxp.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djt> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dxq a(dxq $$0, dgz $$1, ji $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dyu $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ji $$0, dgz $$1, dyu $$2) {
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

   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3) {
   }

   protected dxq a(dgz $$0, ji $$1, dxq $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dyu $$4 = $$2.c(this.c());
         return new dqj($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
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
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      dxq $$3 = super.m();
      jn $$4 = $$0.g();
      boolean $$5 = $$4 == jn.f || $$4 == jn.e;
      return $$3.b(this.c(), $$5 ? dyu.b : dyu.a).b(a, Boolean.valueOf($$2));
   }

   public abstract dyt<dyu> c();

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(a) ? etx.c.a(false) : super.b_($$0);
   }
}
