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

public class eil extends eib {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atq.a(Codec.unboundedMap(kd.f.r(), ekk.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eil::new)
   );
   private final Map<ih<crc>, ekj> b;
   private final boolean c;

   eil(List<ejo> $$0, Map<ih<crc>, ekj> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eid b() {
      return eie.f;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      Object2IntMap<crc> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((crc)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cmu.qM) {
         cmr $$3 = new cmr(cmu.up);
         $$2.forEach(($$1x, $$2x) -> cln.a($$3, new crf($$1x, $$2x)));
         return $$3;
      } else {
         Map<crc, Integer> $$4 = cre.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cre.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<crc, Integer> $$0, crc $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eib.a<eil.a> {
      private final Builder<ih<crc>, ekj> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eil.a a() {
         return this;
      }

      public eil.a a(crc $$0, ekj $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eic b() {
         return new eil(this.g(), this.a.build(), this.b);
      }
   }
}
