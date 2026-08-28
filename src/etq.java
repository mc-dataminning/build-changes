import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class etq extends etc {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dac.c, evx.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, etq::new)
   );
   private final Map<jm<dac>, evw> b;
   private final boolean c;

   etq(List<eva> $$0, Map<jm<dac>, evw> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ete<etq> b() {
      return etf.i;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
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

   public static class a extends etc.a<etq.a> {
      private final Builder<jm<dac>, evw> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected etq.a a() {
         return this;
      }

      public etq.a a(jm<dac> $$0, evw $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etd b() {
         return new etq(this.g(), this.a.build(), this.b);
      }
   }
}
