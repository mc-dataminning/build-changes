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

public class elu extends elk {
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avu.a(Codec.unboundedMap(kh.f.r(), ent.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, elu::new)
   );
   private final Map<il<ctz>, ens> b;
   private final boolean c;

   elu(List<emx> $$0, Map<il<ctz>, ens> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public elm b() {
      return eln.f;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      Object2IntMap<ctz> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((ctz)$$2x.a(), $$3.a($$1)));
      if ($$0.a(cpt.qO)) {
         cpq $$3 = new cpq(cpt.us);
         $$2.forEach($$3::a);
         return $$3;
      } else {
         Map<ctz, Integer> $$4 = cua.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cua.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<ctz, Integer> $$0, ctz $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends elk.a<elu.a> {
      private final Builder<il<ctz>, ens> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected elu.a a() {
         return this;
      }

      public elu.a a(ctz $$0, ens $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public ell b() {
         return new elu(this.g(), this.a.build(), this.b);
      }
   }
}
