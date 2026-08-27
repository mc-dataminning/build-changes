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

public class efe extends eeu {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asg.a(Codec.unboundedMap(jy.g.r(), ehd.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, efe::new)
   );
   private final Map<ib<cot>, ehc> b;
   private final boolean c;

   efe(List<egh> $$0, Map<ib<cot>, ehc> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eew b() {
      return eex.f;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      Object2IntMap<cot> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cot)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == ckm.qb) {
         ckj $$3 = new ckj(ckm.tC);
         $$2.forEach(($$1x, $$2x) -> cjf.a($$3, new cow($$1x, $$2x)));
         return $$3;
      } else {
         Map<cot, Integer> $$4 = cov.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cov.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cot, Integer> $$0, cot $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eeu.a<efe.a> {
      private final Builder<ib<cot>, ehc> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected efe.a a() {
         return this;
      }

      public efe.a a(cot $$0, ehc $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eev b() {
         return new efe(this.g(), this.a.build(), this.b);
      }
   }
}
