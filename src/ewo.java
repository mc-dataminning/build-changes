import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ewo extends ewa {
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dcd.c, eyv.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ewo::new)
   );
   private final Map<jq<dcd>, eyu> b;
   private final boolean c;

   ewo(List<exy> $$0, Map<jq<dcd>, eyu> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ewc<ewo> b() {
      return ewd.i;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.a(cwq.qQ)) {
         $$0 = $$0.a((dfl)cwq.uO);
      }

      dcf.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<dcd>)$$2, azm.a($$1x.a((jq<dcd>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<dcd>)$$2, azm.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends ewa.a<ewo.a> {
      private final Builder<jq<dcd>, eyu> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ewo.a a() {
         return this;
      }

      public ewo.a a(jq<dcd> $$0, eyu $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ewb b() {
         return new ewo(this.g(), this.a.build(), this.b);
      }
   }
}
