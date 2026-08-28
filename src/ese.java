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

public class ese extends erp {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(lp.f.r(), euj.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ese::new)
   );
   private final Map<ji<czv>, eui> b;
   private final boolean c;

   ese(List<etn> $$0, Map<ji<czv>, eui> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public err<ese> b() {
      return ers.i;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      Object2IntMap<czv> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((czv)$$2x.a(), ayu.a($$3.a($$1), 0, 255)));
      if ($$0.a(cun.qP)) {
         $$0 = $$0.a(cun.uw, $$0.I());
         $$0.b(km.x, $$0.c(km.j));
      }

      czw.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends erp.a<ese.a> {
      private final Builder<ji<czv>, eui> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ese.a a() {
         return this;
      }

      public ese.a a(czv $$0, eui $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public erq b() {
         return new ese(this.g(), this.a.build(), this.b);
      }
   }
}
