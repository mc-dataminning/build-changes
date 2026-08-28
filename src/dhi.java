import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhi extends dhy implements doz {
   public static final dvu d = dvt.C;
   private static final fab a = dhy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dhi(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dhi> a();

   protected void a(dvd $$0, dew $$1, jg $$2) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean d(dvd $$0, dea $$1, jg $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jl $$3 : jl.values()) {
            if ($$1.b_($$2.a($$3)).a(axf.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(axf.a) && $$1.e() == 8));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return a;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1 == jl.a && !this.a($$0, (dey)$$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jl.b);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }
}
