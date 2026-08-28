import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dhj extends dhg {
   public static final MapCodec<dhj> b = b(dhj::new);
   public static final dvx c = dlt.aF;
   private static final Map<jl, fab> e = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         dhy.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jl.d,
         dhy.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jl.e,
         dhy.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jl.f,
         dhy.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dhj> a() {
      return b;
   }

   protected dhj(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jl.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dia.a.m() : $$0;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = $$0.c(c);
      jg $$4 = $$2.a($$3.g());
      dvd $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = super.a($$0);
      dey $$2 = $$0.q();
      jg $$3 = $$0.a();
      jl[] $$4 = $$0.f();

      for (jl $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
