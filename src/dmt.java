import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmt extends dhy implements doz {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dvu b = dvt.C;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dvd $$0, dvd $$1, jl $$2) {
      return $$1.a(dia.ac) && $$2.o() == jl.a.b;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erf.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(b) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
