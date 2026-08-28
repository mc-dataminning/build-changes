import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fbp extends fbb {
   public static final MapCodec<fbp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dfx.c, fdu.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fbp::new)
   );
   private final Map<jf<dfx>, fdt> b;
   private final boolean c;

   fbp(List<fcx> $$0, Map<jf<dfx>, fdt> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fbd<fbp> b() {
      return fbe.i;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.a(czo.rF)) {
         $$0 = $$0.a((djg)czo.vG);
      }

      dfz.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jf<dfx>)$$2, azm.a($$1x.a((jf<dfx>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jf<dfx>)$$2, azm.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fbb.a<fbp.a> {
      private final Builder<jf<dfx>, fdt> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fbp.a a() {
         return this;
      }

      public fbp.a a(jf<dfx> $$0, fdt $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fbc b() {
         return new fbp(this.g(), this.a.build(), this.b);
      }
   }
}
