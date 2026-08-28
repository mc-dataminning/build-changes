import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exq extends exc {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dcx.c, ezv.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, exq::new)
   );
   private final Map<jr<dcx>, ezu> b;
   private final boolean c;

   exq(List<eyy> $$0, Map<jr<dcx>, ezu> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exe<exq> b() {
      return exf.i;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if ($$0.a(cwr.rw)) {
         $$0 = $$0.a((dgf)cwr.vv);
      }

      dcz.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dcx>)$$2, ayy.a($$1x.a((jr<dcx>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dcx>)$$2, ayy.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends exc.a<exq.a> {
      private final Builder<jr<dcx>, ezu> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected exq.a a() {
         return this;
      }

      public exq.a a(jr<dcx> $$0, ezu $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exd b() {
         return new exq(this.g(), this.a.build(), this.b);
      }
   }
}
