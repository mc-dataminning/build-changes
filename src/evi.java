import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evi extends evt {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(evi.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, evi::new)
   );
   private final evi.a b;

   private evi(List<exr> $$0, evi.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<evi> b() {
      return evw.s;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$1.c(this.b.g) instanceof bsk $$3) {
         $$0.b(ku.g, $$3.ao());
      }

      return $$0;
   }

   public static evt.a<?> a(evi.a $$0) {
      return a($$1 -> new evi($$1, $$0));
   }

   public static enum a implements baj {
      a("this", exc.a),
      b("attacking_entity", exc.d),
      c("last_damage_player", exc.b),
      d("block_entity", exc.h);

      public static final Codec<evi.a> e = baj.a(evi.a::values);
      private final String f;
      final ewz<?> g;

      private a(final String $$0, final ewz<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
