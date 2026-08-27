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

public class eeh extends edx {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arb.a(Codec.unboundedMap(jd.g.r(), egg.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eeh::new)
   );
   private final Map<hg<cnj>, egf> b;
   private final boolean c;

   eeh(List<efk> $$0, Map<hg<cnj>, egf> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public edz b() {
      return eea.f;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      Object2IntMap<cnj> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cnj)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cjd.qb) {
         cja $$3 = new cja(cjd.tC);
         $$2.forEach(($$1x, $$2x) -> chw.a($$3, new cnm($$1x, $$2x)));
         return $$3;
      } else {
         Map<cnj, Integer> $$4 = cnl.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cnl.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cnj, Integer> $$0, cnj $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends edx.a<eeh.a> {
      private final Builder<hg<cnj>, egf> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eeh.a a() {
         return this;
      }

      public eeh.a a(cnj $$0, egf $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public edy b() {
         return new eeh(this.g(), this.a.build(), this.b);
      }
   }
}
