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

public class ems extends emi {
   public static final Codec<ems> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awe.a(Codec.unboundedMap(ki.f.r(), eor.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ems::new)
   );
   private final Map<il<cuw>, eoq> b;
   private final boolean c;

   ems(List<env> $$0, Map<il<cuw>, eoq> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public emk b() {
      return eml.f;
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      Object2IntMap<cuw> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cuw)$$2x.a(), $$3.a($$1)));
      if ($$0.a(cqp.qO)) {
         cqm $$3 = new cqm(cqp.uu);
         $$2.forEach($$3::a);
         return $$3;
      } else {
         Map<cuw, Integer> $$4 = cux.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cux.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cuw, Integer> $$0, cuw $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends emi.a<ems.a> {
      private final Builder<il<cuw>, eoq> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ems.a a() {
         return this;
      }

      public ems.a a(cuw $$0, eoq $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public emj b() {
         return new ems(this.g(), this.a.build(), this.b);
      }
   }
}
