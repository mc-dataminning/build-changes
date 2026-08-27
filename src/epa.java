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

public class epa extends eoo {
   public static final Codec<epa> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aws.a(Codec.unboundedMap(kr.f.r(), eqy.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, epa::new)
   );
   private final Map<il<cwq>, eqx> b;
   private final boolean c;

   epa(List<eqc> $$0, Map<il<cwq>, eqx> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eoq b() {
      return eor.f;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      Object2IntMap<cwq> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cwq)$$2x.a(), $$3.a($$1)));
      if ($$0.a(crm.qO)) {
         $$0 = $$0.a(crm.uu, $$0.G());
         $$0.b(jp.p, $$0.c(jp.f));
      }

      cwr.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends eoo.a<epa.a> {
      private final Builder<il<cwq>, eqx> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected epa.a a() {
         return this;
      }

      public epa.a a(cwq $$0, eqx $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public eop b() {
         return new epa(this.g(), this.a.build(), this.b);
      }
   }
}
