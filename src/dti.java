import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dti extends dja {
   public static final MapCodec<dti> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drj.a.b.fieldOf("kind").forGetter(dja::b), t()).apply($$0, dti::new));
   public static final dyk<jm> d = doc.aF;
   private static final Map<jm, fcm> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dke.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         dke.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         dke.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         dke.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dti> a() {
      return c;
   }

   protected dti(drj.a $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = super.a($$0);
      dgf $$2 = $$0.q();
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
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
