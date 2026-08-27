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

public class ekr extends ekh {
   public static final Codec<ekr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avp.a(Codec.unboundedMap(kf.f.r(), emq.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ekr::new)
   );
   private final Map<ij<cti>, emp> b;
   private final boolean c;

   ekr(List<elu> $$0, Map<ij<cti>, emp> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ekj b() {
      return ekk.f;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      Object2IntMap<cti> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cti)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cpc.qO) {
         coz $$3 = new coz(cpc.us);
         $$2.forEach(($$1x, $$2x) -> cnv.a($$3, new ctk($$1x, $$2x)));
         return $$3;
      } else {
         Map<cti, Integer> $$4 = ctj.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         ctj.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cti, Integer> $$0, cti $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends ekh.a<ekr.a> {
      private final Builder<ij<cti>, emp> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ekr.a a() {
         return this;
      }

      public ekr.a a(cti $$0, emp $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public eki b() {
         return new ekr(this.g(), this.a.build(), this.b);
      }
   }
}
