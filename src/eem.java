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

public class eem extends eec {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arf.a(Codec.unboundedMap(jb.g.r(), egl.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eem::new)
   );
   private final Map<he<cno>, egk> b;
   private final boolean c;

   eem(List<efp> $$0, Map<he<cno>, egk> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eee b() {
      return eef.f;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      Object2IntMap<cno> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cno)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cji.qb) {
         cjf $$3 = new cjf(cji.tC);
         $$2.forEach(($$1x, $$2x) -> cib.a($$3, new cnr($$1x, $$2x)));
         return $$3;
      } else {
         Map<cno, Integer> $$4 = cnq.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cnq.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cno, Integer> $$0, cno $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eec.a<eem.a> {
      private final Builder<he<cno>, egk> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eem.a a() {
         return this;
      }

      public eem.a a(cno $$0, egk $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eed b() {
         return new eem(this.g(), this.a.build(), this.b);
      }
   }
}
