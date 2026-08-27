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

public class eec extends eds {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aqy.a(Codec.unboundedMap(jb.g.r(), egb.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eec::new)
   );
   private final Map<he<cne>, ega> b;
   private final boolean c;

   eec(List<eff> $$0, Map<he<cne>, ega> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public edu b() {
      return edv.f;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      Object2IntMap<cne> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cne)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cja.qb) {
         cix $$3 = new cix(cja.tC);
         $$2.forEach(($$1x, $$2x) -> cht.a($$3, new cnh($$1x, $$2x)));
         return $$3;
      } else {
         Map<cne, Integer> $$4 = cng.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cng.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cne, Integer> $$0, cne $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eds.a<eec.a> {
      private final Builder<he<cne>, ega> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eec.a a() {
         return this;
      }

      public eec.a a(cne $$0, ega $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public edt b() {
         return new eec(this.g(), this.a.build(), this.b);
      }
   }
}
