import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqy extends doy {
   public static final MapCodec<dqy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwq.a.fieldOf("wood_type").forGetter(doy::d), t()).apply($$0, dqy::new));
   public static final dvx b = dlt.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jl, fab> i = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         dhy.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jl.d,
         dhy.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jl.f,
         dhy.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jl.e,
         dhy.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   public dqy(dwq $$0, dvc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jl.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m();
      ere $$2 = $$0.q().b_($$0.a());
      dey $$3 = $$0.q();
      jg $$4 = $$0.a();
      jl[] $$5 = $$0.f();

      for (jl $$6 : $$5) {
         if ($$6.o().d()) {
            jl $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvd $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ezh o(dvd $$0) {
      fab $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, f);
   }
}
