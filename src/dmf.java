import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmf extends dca {
   public static final MapCodec<dmf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkg.a.b.fieldOf("kind").forGetter(dca::b), u()).apply($$0, dmf::new));
   public static final drb d = dha.aE;
   private static final Map<is, eui> b = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         dde.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         is.d,
         dde.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         is.f,
         dde.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         is.e,
         dde.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dmf> a() {
      return c;
   }

   protected dmf(dkg.a $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, is.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = super.a($$0);
      czj $$2 = $$0.q();
      in $$3 = $$0.a();
      is[] $$4 = $$0.f();

      for (is $$5 : $$4) {
         if ($$5.o().d()) {
            is $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
