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

public class esi extends ert {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(lp.f.r(), eun.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esi::new)
   );
   private final Map<ji<czz>, eum> b;
   private final boolean c;

   esi(List<etr> $$0, Map<ji<czz>, eum> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public erv<esi> b() {
      return erw.i;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      Object2IntMap<czz> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((czz)$$2x.a(), ayy.a($$3.a($$1), 0, 255)));
      if ($$0.a(cur.qP)) {
         $$0 = $$0.a(cur.uw, $$0.I());
         $$0.b(km.y, $$0.c(km.k));
      }

      daa.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends ert.a<esi.a> {
      private final Builder<ji<czz>, eum> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esi.a a() {
         return this;
      }

      public esi.a a(czz $$0, eum $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public eru b() {
         return new esi(this.g(), this.a.build(), this.b);
      }
   }
}
