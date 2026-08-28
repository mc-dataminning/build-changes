import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ext extends exf {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dda.c, ezy.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ext::new)
   );
   private final Map<jr<dda>, ezx> b;
   private final boolean c;

   ext(List<ezb> $$0, Map<jr<dda>, ezx> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exh<ext> b() {
      return exi.i;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.a(cwu.rw)) {
         $$0 = $$0.a((dgi)cwu.vv);
      }

      ddc.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dda>)$$2, ayz.a($$1x.a((jr<dda>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dda>)$$2, ayz.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends exf.a<ext.a> {
      private final Builder<jr<dda>, ezx> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ext.a a() {
         return this;
      }

      public ext.a a(jr<dda> $$0, ezx $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exg b() {
         return new ext(this.g(), this.a.build(), this.b);
      }
   }
}
