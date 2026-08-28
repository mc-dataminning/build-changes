import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtq extends dji {
   public static final MapCodec<dtq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drr.a.b.fieldOf("kind").forGetter(dji::b), t()).apply($$0, dtq::new));
   public static final dys<jm> d = dok.aF;
   private static final Map<jm, fcs> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkm.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         dkm.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         dkm.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         dkm.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dtq> a() {
      return c;
   }

   protected dtq(drr.a $$0, dxu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = super.a($$0);
      dgn $$2 = $$0.q();
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
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
