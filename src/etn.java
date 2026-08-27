import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class etn extends eta {
   public static final Codec<etn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.a(Codec.unboundedMap(lh.f.r(), evr.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, etn::new)
   );
   private final Map<ja<dad>, evq> b;
   private final boolean c;

   etn(List<euu> $$0, Map<ja<dad>, evq> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public etc b() {
      return etd.h;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      Object2IntMap<dad> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((dad)$$2x.a(), aym.a($$3.a($$1), 0, 255)));
      if ($$0.a(cuk.sm)) {
         $$0 = $$0.a(cuk.wh, $$0.G());
         $$0.b(ke.w, $$0.c(ke.i));
      }

      dae.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends eta.a<etn.a> {
      private final Builder<ja<dad>, evq> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected etn.a a() {
         return this;
      }

      public etn.a a(dad $$0, evq $$1) {
         this.a.put($$0.l(), $$1);
         return this;
      }

      @Override
      public etb b() {
         return new etn(this.g(), this.a.build(), this.b);
      }
   }
}
