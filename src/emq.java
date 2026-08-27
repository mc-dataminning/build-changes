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

public class emq extends emg {
   public static final Codec<emq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awe.a(Codec.unboundedMap(ki.f.r(), eop.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, emq::new)
   );
   private final Map<il<cuu>, eoo> b;
   private final boolean c;

   emq(List<ent> $$0, Map<il<cuu>, eoo> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public emi b() {
      return emj.f;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      Object2IntMap<cuu> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cuu)$$2x.a(), $$3.a($$1)));
      if ($$0.a(cqn.qO)) {
         cqk $$3 = new cqk(cqn.ut);
         $$2.forEach($$3::a);
         return $$3;
      } else {
         Map<cuu, Integer> $$4 = cuv.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cuv.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cuu, Integer> $$0, cuu $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends emg.a<emq.a> {
      private final Builder<il<cuu>, eoo> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected emq.a a() {
         return this;
      }

      public emq.a a(cuu $$0, eoo $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public emh b() {
         return new emq(this.g(), this.a.build(), this.b);
      }
   }
}
