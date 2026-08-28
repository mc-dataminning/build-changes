import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhn extends dhy implements doz {
   protected static final fab a = dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dvu c = dvt.C;
   private final boolean d;

   public static boolean a(dev $$0, jg $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dvd $$0) {
      return $$0.a(awz.O) && $$0.b() instanceof dhn;
   }

   protected dhn(boolean $$0, dvc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dhn> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      dwh $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dvd a(dvd $$0, dev $$1, jg $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dwh $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jg $$0, dev $$1, dwh $$2) {
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

   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3) {
   }

   protected dvd a(dev $$0, jg $$1, dvd $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dwh $$4 = $$2.c(this.c());
         return new dny($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
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
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erf.c;
      dvd $$3 = super.m();
      jl $$4 = $$0.g();
      boolean $$5 = $$4 == jl.f || $$4 == jl.e;
      return $$3.b(this.c(), $$5 ? dwh.b : dwh.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dwg<dwh> c();

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }
}
