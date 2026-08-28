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

public class esj extends eru {
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(lp.f.r(), euo.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esj::new)
   );
   private final Map<ji<daa>, eun> b;
   private final boolean c;

   esj(List<ets> $$0, Map<ji<daa>, eun> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public erw<esj> b() {
      return erx.i;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      Object2IntMap<daa> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((daa)$$2x.a(), ayz.a($$3.a($$1), 0, 255)));
      if ($$0.a(cus.qP)) {
         $$0 = $$0.a(cus.uw, $$0.I());
         $$0.b(km.y, $$0.c(km.k));
      }

      dab.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends eru.a<esj.a> {
      private final Builder<ji<daa>, eun> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esj.a a() {
         return this;
      }

      public esj.a a(daa $$0, eun $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public erv b() {
         return new esj(this.g(), this.a.build(), this.b);
      }
   }
}
