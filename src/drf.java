import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class drf extends dha {
   public static final MapCodec<drf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpg.a.b.fieldOf("kind").forGetter(dha::b), t()).apply($$0, drf::new));
   public static final dwd d = dlz.aF;
   private static final Map<jm, fah> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         die.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         die.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         die.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         die.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends drf> a() {
      return c;
   }

   protected drf(dpg.a $$0, dvi.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = super.a($$0);
      deg $$2 = $$0.q();
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
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
