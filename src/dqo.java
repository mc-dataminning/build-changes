import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqo extends dgi {
   public static final MapCodec<dqo> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dop.a.b.fieldOf("kind").forGetter(dgi::b), t()).apply($$0, dqo::new));
   public static final dvm d = dli.aF;
   private static final Map<jk, ezq> b = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         dhm.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jk.d,
         dhm.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jk.f,
         dhm.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jk.e,
         dhm.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dqo> a() {
      return c;
   }

   protected dqo(dop.a $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.n().b(d, jk.c));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = super.a($$0);
      ddo $$2 = $$0.q();
      jf $$3 = $$0.a();
      jk[] $$4 = $$0.f();

      for (jk $$5 : $$4) {
         if ($$5.o().d()) {
            jk $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
