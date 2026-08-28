import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqz extends dgu {
   public static final MapCodec<dqz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpa.a.b.fieldOf("kind").forGetter(dgu::b), t()).apply($$0, dqz::new));
   public static final dvx d = dlt.aF;
   private static final Map<jl, fab> b = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         dhy.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jl.d,
         dhy.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jl.f,
         dhy.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jl.e,
         dhy.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dqz> a() {
      return c;
   }

   protected dqz(dpa.a $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jl.c));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = super.a($$0);
      dea $$2 = $$0.q();
      jg $$3 = $$0.a();
      jl[] $$4 = $$0.f();

      for (jl $$5 : $$4) {
         if ($$5.o().d()) {
            jl $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
