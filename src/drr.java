import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class drr extends dhm {
   public static final MapCodec<drr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dps.a.b.fieldOf("kind").forGetter(dhm::b), t()).apply($$0, drr::new));
   public static final dws<jm> d = dml.aF;
   private static final Map<jm, fas> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         diq.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         diq.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         diq.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         diq.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends drr> a() {
      return c;
   }

   protected drr(dps.a $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = super.a($$0);
      der $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
