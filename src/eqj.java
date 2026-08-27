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

public class eqj extends epw {
   public static final Codec<eqj> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axh.a(Codec.unboundedMap(ld.f.r(), esm.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eqj::new)
   );
   private final Map<iw<cyg>, esl> b;
   private final boolean c;

   eqj(List<erq> $$0, Map<iw<cyg>, esl> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public epy b() {
      return epz.h;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      Object2IntMap<cyg> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cyg)$$2x.a(), axz.a($$3.a($$1), 0, 255)));
      if ($$0.a(ctc.qP)) {
         $$0 = $$0.a(ctc.uw, $$0.G());
         $$0.b(ka.w, $$0.c(ka.i));
      }

      cyh.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends epw.a<eqj.a> {
      private final Builder<iw<cyg>, esl> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eqj.a a() {
         return this;
      }

      public eqj.a a(cyg $$0, esl $$1) {
         this.a.put($$0.l(), $$1);
         return this;
      }

      @Override
      public epx b() {
         return new eqj(this.g(), this.a.build(), this.b);
      }
   }
}
