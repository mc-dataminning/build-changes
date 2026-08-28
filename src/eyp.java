import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eyp extends eyb {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(ddy.c, fau.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eyp::new)
   );
   private final Map<jq<ddy>, fat> b;
   private final boolean c;

   eyp(List<ezx> $$0, Map<jq<ddy>, fat> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eyd<eyp> b() {
      return eye.i;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      if ($$0.a(cxs.rn)) {
         $$0 = $$0.a((dhg)cxs.vm);
      }

      dea.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddy>)$$2, bae.a($$1x.a((jq<ddy>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddy>)$$2, bae.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends eyb.a<eyp.a> {
      private final Builder<jq<ddy>, fat> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eyp.a a() {
         return this;
      }

      public eyp.a a(jq<ddy> $$0, fat $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eyc b() {
         return new eyp(this.g(), this.a.build(), this.b);
      }
   }
}
