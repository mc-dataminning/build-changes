import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dsr extends dih {
   public static final MapCodec<dsr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqs.a.b.fieldOf("kind").forGetter(dih::b), t()).apply($$0, dsr::new));
   public static final dxt<jn> d = dnj.aF;
   private static final Map<jn, fbt> b = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djl.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jn.d,
         djl.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jn.f,
         djl.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jn.e,
         djl.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dsr> a() {
      return c;
   }

   protected dsr(dqs.a $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jn.c));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = super.a($$0);
      dfm $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
