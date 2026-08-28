import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class evm extends euy {
   public static final MapCodec<evm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dbn.c, ext.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, evm::new)
   );
   private final Map<jo<dbn>, exs> b;
   private final boolean c;

   evm(List<eww> $$0, Map<jo<dbn>, exs> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eva<evm> b() {
      return evb.i;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if ($$0.a(cvw.qQ)) {
         $$0 = $$0.a((dei)cvw.uy);
         $$0.b(ks.D, $$0.c(ks.k));
      }

      dbp.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jo<dbn>)$$2, azf.a($$1x.a((jo<dbn>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jo<dbn>)$$2, azf.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends euy.a<evm.a> {
      private final Builder<jo<dbn>, exs> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected evm.a a() {
         return this;
      }

      public evm.a a(jo<dbn> $$0, exs $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public euz b() {
         return new evm(this.g(), this.a.build(), this.b);
      }
   }
}
