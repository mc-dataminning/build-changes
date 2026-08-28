import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class evi extends euu {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dbk.c, exp.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, evi::new)
   );
   private final Map<jn<dbk>, exo> b;
   private final boolean c;

   evi(List<ews> $$0, Map<jn<dbk>, exo> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public euw<evi> b() {
      return eux.i;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.a(cvt.qQ)) {
         $$0 = $$0.a((def)cvt.uy);
         $$0.b(kr.D, $$0.c(kr.k));
      }

      dbm.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jn<dbk>)$$2, azd.a($$1x.a((jn<dbk>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jn<dbk>)$$2, azd.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends euu.a<evi.a> {
      private final Builder<jn<dbk>, exo> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected evi.a a() {
         return this;
      }

      public evi.a a(jn<dbk> $$0, exo $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public euv b() {
         return new evi(this.g(), this.a.build(), this.b);
      }
   }
}
