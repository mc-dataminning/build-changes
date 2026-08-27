import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class erf extends eqs {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(le.f.r(), etj.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, erf::new)
   );
   private final Map<ix<czb>, eti> b;
   private final boolean c;

   erf(List<esn> $$0, Map<ix<czb>, eti> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public equ b() {
      return eqv.h;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      Object2IntMap<czb> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((czb)$$2x.a(), ayf.a($$3.a($$1), 0, 255)));
      if ($$0.a(ctt.qP)) {
         $$0 = $$0.a(ctt.uw, $$0.I());
         $$0.b(kb.x, $$0.c(kb.j));
      }

      czc.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends eqs.a<erf.a> {
      private final Builder<ix<czb>, eti> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected erf.a a() {
         return this;
      }

      public erf.a a(czb $$0, eti $$1) {
         this.a.put($$0.m(), $$1);
         return this;
      }

      @Override
      public eqt b() {
         return new erf(this.g(), this.a.build(), this.b);
      }
   }
}
