import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ets extends ete {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dac.c, evz.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ets::new)
   );
   private final Map<jm<dac>, evy> b;
   private final boolean c;

   ets(List<evc> $$0, Map<jm<dac>, evy> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public etg<ets> b() {
      return eth.i;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$0.a(cut.qP)) {
         $$0 = $$0.a((dcv)cut.uw);
         $$0.b(kq.y, $$0.c(kq.k));
      }

      dae.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jm<dac>)$$2, ayo.a($$1x.a((jm<dac>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jm<dac>)$$2, ayo.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends ete.a<ets.a> {
      private final Builder<jm<dac>, evy> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ets.a a() {
         return this;
      }

      public ets.a a(jm<dac> $$0, evy $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etf b() {
         return new ets(this.g(), this.a.build(), this.b);
      }
   }
}
