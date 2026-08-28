import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dja extends djl implements dqr {
   protected static final fbt a = djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fbt b = djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dxn c = dxm.J;
   private final boolean d;

   public static boolean a(dgh $$0, ji $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dww $$0) {
      return $$0.a(awp.P) && $$0.b() instanceof dja;
   }

   protected dja(boolean $$0, dwv.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dja> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      dxz $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dww a(dww $$0, dgh $$1, ji $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dxz $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ji $$0, dgh $$1, dxz $$2) {
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

   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3) {
   }

   protected dww a(dgh $$0, ji $$1, dww $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dxz $$4 = $$2.c(this.c());
         return new dpq($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
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
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esz.c;
      dww $$3 = super.m();
      jn $$4 = $$0.g();
      boolean $$5 = $$4 == jn.f || $$4 == jn.e;
      return $$3.b(this.c(), $$5 ? dxz.b : dxz.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dxy<dxz> c();

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }
}
