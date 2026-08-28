import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eyi extends exu {
   public static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(ddr.c, fap.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eyi::new)
   );
   private final Map<jq<ddr>, fao> b;
   private final boolean c;

   eyi(List<ezs> $$0, Map<jq<ddr>, fao> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exw<eyi> b() {
      return exx.i;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.a(cxo.rn)) {
         $$0 = $$0.a((dgz)cxo.vm);
      }

      ddt.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddr>)$$2, bae.a($$1x.a((jq<ddr>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddr>)$$2, bae.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends exu.a<eyi.a> {
      private final Builder<jq<ddr>, fao> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eyi.a a() {
         return this;
      }

      public eyi.a a(jq<ddr> $$0, fao $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exv b() {
         return new eyi(this.g(), this.a.build(), this.b);
      }
   }
}
