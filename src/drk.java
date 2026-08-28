import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class drk extends dhf {
   public static final MapCodec<drk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpl.a.b.fieldOf("kind").forGetter(dhf::b), t()).apply($$0, drk::new));
   public static final dwl<jm> d = dme.aF;
   private static final Map<jm, fal> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dij.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         dij.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         dij.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         dij.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends drk> a() {
      return c;
   }

   protected drk(dpl.a $$0, dvn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = super.a($$0);
      dek $$2 = $$0.q();
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
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
