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

public class eeg extends edw {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arj.a(Codec.unboundedMap(jb.g.r(), egf.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eeg::new)
   );
   private final Map<he<cnu>, ege> b;
   private final boolean c;

   eeg(List<efj> $$0, Map<he<cnu>, ege> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public edy b() {
      return edz.f;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      Object2IntMap<cnu> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cnu)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cjo.qb) {
         cjl $$3 = new cjl(cjo.tC);
         $$2.forEach(($$1x, $$2x) -> cih.a($$3, new cnx($$1x, $$2x)));
         return $$3;
      } else {
         Map<cnu, Integer> $$4 = cnw.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cnw.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cnu, Integer> $$0, cnu $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends edw.a<eeg.a> {
      private final Builder<he<cnu>, ege> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eeg.a a() {
         return this;
      }

      public eeg.a a(cnu $$0, ege $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public edx b() {
         return new eeg(this.g(), this.a.build(), this.b);
      }
   }
}
