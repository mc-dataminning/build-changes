import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlo extends dhy implements doz {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final dvu c = dvt.C;
   protected static final fab b = dhy.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = super.a($$0);
      if ($$1 != null) {
         ere $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == erf.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.d();
      dvd $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jl.a);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.b && !this.a($$0, $$3, $$4)) {
         return dia.a.m();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
