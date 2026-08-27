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

public class eia extends ehq {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atg.a(Codec.unboundedMap(kb.f.r(), ejz.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eia::new)
   );
   private final Map<ie<cqs>, ejy> b;
   private final boolean c;

   eia(List<ejd> $$0, Map<ie<cqs>, ejy> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ehs b() {
      return eht.f;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      Object2IntMap<cqs> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cqs)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cmk.qM) {
         cmh $$3 = new cmh(cmk.up);
         $$2.forEach(($$1x, $$2x) -> cld.a($$3, new cqv($$1x, $$2x)));
         return $$3;
      } else {
         Map<cqs, Integer> $$4 = cqu.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cqu.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cqs, Integer> $$0, cqs $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends ehq.a<eia.a> {
      private final Builder<ie<cqs>, ejy> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eia.a a() {
         return this;
      }

      public eia.a a(cqs $$0, ejy $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public ehr b() {
         return new eia(this.g(), this.a.build(), this.b);
      }
   }
}
