import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtp extends djh {
   public static final MapCodec<dtp> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drq.a.b.fieldOf("kind").forGetter(djh::b), t()).apply($$0, dtp::new));
   public static final dyr<jm> d = doj.aF;
   private static final Map<jm, fcr> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkl.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         dkl.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         dkl.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         dkl.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dtp> a() {
      return c;
   }

   protected dtp(drq.a $$0, dxt.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = super.a($$0);
      dgm $$2 = $$0.q();
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
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
