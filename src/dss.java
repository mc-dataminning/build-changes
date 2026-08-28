import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dss extends dii {
   public static final MapCodec<dss> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqt.a.b.fieldOf("kind").forGetter(dii::b), t()).apply($$0, dss::new));
   public static final dxu<jn> d = dnk.aF;
   private static final Map<jn, fbu> b = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djm.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jn.d,
         djm.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jn.f,
         djm.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jn.e,
         djm.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dss> a() {
      return c;
   }

   protected dss(dqt.a $$0, dww.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jn.c));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = super.a($$0);
      dfn $$2 = $$0.q();
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
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
