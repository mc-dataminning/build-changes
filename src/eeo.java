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

public class eeo extends eee {
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arh.a(Codec.unboundedMap(jd.g.r(), egn.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eeo::new)
   );
   private final Map<hg<cnq>, egm> b;
   private final boolean c;

   eeo(List<efr> $$0, Map<hg<cnq>, egm> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eeg b() {
      return eeh.f;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      Object2IntMap<cnq> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cnq)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cjk.qb) {
         cjh $$3 = new cjh(cjk.tC);
         $$2.forEach(($$1x, $$2x) -> cid.a($$3, new cnt($$1x, $$2x)));
         return $$3;
      } else {
         Map<cnq, Integer> $$4 = cns.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cns.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cnq, Integer> $$0, cnq $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eee.a<eeo.a> {
      private final Builder<hg<cnq>, egm> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eeo.a a() {
         return this;
      }

      public eeo.a a(cnq $$0, egm $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eef b() {
         return new eeo(this.g(), this.a.build(), this.b);
      }
   }
}
