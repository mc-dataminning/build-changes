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

public class eed extends edt {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aqy.a(Codec.unboundedMap(jb.g.r(), egc.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eed::new)
   );
   private final Map<he<cnf>, egb> b;
   private final boolean c;

   eed(List<efg> $$0, Map<he<cnf>, egb> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public edv b() {
      return edw.f;
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      Object2IntMap<cnf> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cnf)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cjb.qb) {
         ciy $$3 = new ciy(cjb.tC);
         $$2.forEach(($$1x, $$2x) -> chu.a($$3, new cni($$1x, $$2x)));
         return $$3;
      } else {
         Map<cnf, Integer> $$4 = cnh.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cnh.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cnf, Integer> $$0, cnf $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends edt.a<eed.a> {
      private final Builder<he<cnf>, egb> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eed.a a() {
         return this;
      }

      public eed.a a(cnf $$0, egb $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public edu b() {
         return new eed(this.g(), this.a.build(), this.b);
      }
   }
}
