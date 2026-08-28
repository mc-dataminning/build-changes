import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eyj extends exv {
   public static final MapCodec<eyj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(ddq.c, fao.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eyj::new)
   );
   private final Map<jq<ddq>, fan> b;
   private final boolean c;

   eyj(List<ezr> $$0, Map<jq<ddq>, fan> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exx<eyj> b() {
      return exy.i;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.a(cxk.rw)) {
         $$0 = $$0.a((dgy)cxk.vv);
      }

      dds.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddq>)$$2, azu.a($$1x.a((jq<ddq>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddq>)$$2, azu.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends exv.a<eyj.a> {
      private final Builder<jq<ddq>, fan> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eyj.a a() {
         return this;
      }

      public eyj.a a(jq<ddq> $$0, fan $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exw b() {
         return new eyj(this.g(), this.a.build(), this.b);
      }
   }
}
