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

public class esl extends erw {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(lp.f.r(), euq.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esl::new)
   );
   private final Map<ji<dac>, eup> b;
   private final boolean c;

   esl(List<etu> $$0, Map<ji<dac>, eup> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ery<esl> b() {
      return erz.i;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      Object2IntMap<dac> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((dac)$$2x.a(), ayz.a($$3.a($$1), 0, 255)));
      if ($$0.a(cuu.qP)) {
         $$0 = $$0.a(cuu.uw, $$0.I());
         $$0.b(km.y, $$0.c(km.k));
      }

      dad.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends erw.a<esl.a> {
      private final Builder<ji<dac>, eup> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esl.a a() {
         return this;
      }

      public esl.a a(dac $$0, eup $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public erx b() {
         return new esl(this.g(), this.a.build(), this.b);
      }
   }
}
