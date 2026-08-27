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

public class eqb extends epo {
   public static final Codec<eqb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(Codec.unboundedMap(lc.f.r(), esd.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eqb::new)
   );
   private final Map<iv<cxn>, esc> b;
   private final boolean c;

   eqb(List<erh> $$0, Map<iv<cxn>, esc> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public epq b() {
      return epr.f;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      Object2IntMap<cxn> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cxn)$$2x.a(), $$3.a($$1)));
      if ($$0.a(csg.qP)) {
         $$0 = $$0.a(csg.uw, $$0.G());
         $$0.b(jz.p, $$0.c(jz.f));
      }

      cxo.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends epo.a<eqb.a> {
      private final Builder<iv<cxn>, esc> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eqb.a a() {
         return this;
      }

      public eqb.a a(cxn $$0, esc $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public epp b() {
         return new eqb(this.g(), this.a.build(), this.b);
      }
   }
}
