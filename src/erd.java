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

public class erd extends eqq {
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(le.f.r(), eth.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, erd::new)
   );
   private final Map<ix<cyz>, etg> b;
   private final boolean c;

   erd(List<esl> $$0, Map<ix<cyz>, etg> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eqs b() {
      return eqt.h;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      Object2IntMap<cyz> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cyz)$$2x.a(), ayd.a($$3.a($$1), 0, 255)));
      if ($$0.a(ctr.qP)) {
         $$0 = $$0.a(ctr.uw, $$0.I());
         $$0.b(kb.x, $$0.c(kb.j));
      }

      cza.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends eqq.a<erd.a> {
      private final Builder<ix<cyz>, etg> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected erd.a a() {
         return this;
      }

      public erd.a a(cyz $$0, etg $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public eqr b() {
         return new erd(this.g(), this.a.build(), this.b);
      }
   }
}
