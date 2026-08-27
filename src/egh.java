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

public class egh extends efx {
   public static final Codec<egh> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asq.a(Codec.unboundedMap(jy.g.r(), eig.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, egh::new)
   );
   private final Map<ib<cpm>, eif> b;
   private final boolean c;

   egh(List<ehk> $$0, Map<ib<cpm>, eif> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public efz b() {
      return ega.f;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      Object2IntMap<cpm> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cpm)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cle.qb) {
         clb $$3 = new clb(cle.tD);
         $$2.forEach(($$1x, $$2x) -> cjx.a($$3, new cpp($$1x, $$2x)));
         return $$3;
      } else {
         Map<cpm, Integer> $$4 = cpo.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cpo.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cpm, Integer> $$0, cpm $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends efx.a<egh.a> {
      private final Builder<ib<cpm>, eif> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected egh.a a() {
         return this;
      }

      public egh.a a(cpm $$0, eif $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public efy b() {
         return new egh(this.g(), this.a.build(), this.b);
      }
   }
}
