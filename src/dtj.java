import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtj extends diz {
   public static final MapCodec<dtj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drk.a.b.fieldOf("kind").forGetter(diz::b), t()).apply($$0, dtj::new));
   public static final dyl<jm> d = dob.aF;
   private static final Map<jm, fcl> b = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkd.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jm.d,
         dkd.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jm.f,
         dkd.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jm.e,
         dkd.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dtj> a() {
      return c;
   }

   protected dtj(drk.a $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jm.c));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = super.a($$0);
      dge $$2 = $$0.q();
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
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
