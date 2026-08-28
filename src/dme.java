import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dhy implements doz {
   public static final MapCodec<dme> a = b(dme::new);
   public static final dvu b = dvt.j;
   public static final dvu c = dvt.C;
   protected static final fab d = ezy.a(dhy.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dhy.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fab e = ezy.a(dhy.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dhy.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());

      for (jl $$2 : $$0.f()) {
         if ($$2.o() == jl.a.b) {
            dvd $$3 = this.m().b(b, Boolean.valueOf($$2 == jl.b));
            if ($$3.a((dey)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == erf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = o($$0).g();
      return dhy.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jl o(dvd $$0) {
      return $$0.c(b) ? jl.a : jl.b;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return o($$0).g() == $$1 && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
