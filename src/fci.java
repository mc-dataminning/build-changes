import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fci extends fbu {
   public static final MapCodec<fci> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dgl.c, fen.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fci::new)
   );
   private final Map<jf<dgl>, fem> b;
   private final boolean c;

   fci(List<fdq> $$0, Map<jf<dgl>, fem> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fbw<fci> b() {
      return fbx.i;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.a(dac.rF)) {
         $$0 = $$0.a((djw)dac.vG);
      }

      dgn.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jf<dgl>)$$2, azo.a($$1x.a((jf<dgl>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jf<dgl>)$$2, azo.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fbu.a<fci.a> {
      private final Builder<jf<dgl>, fem> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fci.a a() {
         return this;
      }

      public fci.a a(jf<dgl> $$0, fem $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fbv b() {
         return new fci(this.g(), this.a.build(), this.b);
      }
   }
}
