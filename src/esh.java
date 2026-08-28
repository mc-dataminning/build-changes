import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class esh extends ers {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(lp.f.r(), eum.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esh::new)
   );
   private final Map<ji<czy>, eul> b;
   private final boolean c;

   esh(List<etq> $$0, Map<ji<czy>, eul> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eru<esh> b() {
      return erv.i;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      Object2IntMap<czy> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((czy)$$2x.a(), ayx.a($$3.a($$1), 0, 255)));
      if ($$0.a(cuq.qP)) {
         $$0 = $$0.a(cuq.uw, $$0.I());
         $$0.b(km.x, $$0.c(km.j));
      }

      czz.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends ers.a<esh.a> {
      private final Builder<ji<czy>, eul> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esh.a a() {
         return this;
      }

      public esh.a a(czy $$0, eul $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public ert b() {
         return new esh(this.g(), this.a.build(), this.b);
      }
   }
}
