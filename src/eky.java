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

public class eky extends eko {
   public static final Codec<eky> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avq.a(Codec.unboundedMap(kf.f.r(), emx.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eky::new)
   );
   private final Map<ij<ctm>, emw> b;
   private final boolean c;

   eky(List<emb> $$0, Map<ij<ctm>, emw> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ekq b() {
      return ekr.f;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      Object2IntMap<ctm> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((ctm)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cpg.qO) {
         cpd $$3 = new cpd(cpg.us);
         $$2.forEach(($$1x, $$2x) -> cnz.a($$3, new cto($$1x, $$2x)));
         return $$3;
      } else {
         Map<ctm, Integer> $$4 = ctn.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         ctn.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<ctm, Integer> $$0, ctm $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eko.a<eky.a> {
      private final Builder<ij<ctm>, emw> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eky.a a() {
         return this;
      }

      public eky.a a(ctm $$0, emw $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public ekp b() {
         return new eky(this.g(), this.a.build(), this.b);
      }
   }
}
