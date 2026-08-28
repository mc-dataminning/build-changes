import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ewh extends evt {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dbw.c, eyo.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ewh::new)
   );
   private final Map<jq<dbw>, eyn> b;
   private final boolean c;

   ewh(List<exr> $$0, Map<jq<dbw>, eyn> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public evv<ewh> b() {
      return evw.i;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.a(cwj.qQ)) {
         $$0 = $$0.a((dfe)cwj.uO);
      }

      dby.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<dbw>)$$2, azn.a($$1x.a((jq<dbw>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<dbw>)$$2, azn.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends evt.a<ewh.a> {
      private final Builder<jq<dbw>, eyn> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ewh.a a() {
         return this;
      }

      public ewh.a a(jq<dbw> $$0, eyn $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public evu b() {
         return new ewh(this.g(), this.a.build(), this.b);
      }
   }
}
