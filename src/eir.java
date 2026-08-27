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

public class eir extends eih {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atv.a(Codec.unboundedMap(kd.f.r(), ekq.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eir::new)
   );
   private final Map<ih<cri>, ekp> b;
   private final boolean c;

   eir(List<eju> $$0, Map<ih<cri>, ekp> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eij b() {
      return eik.f;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      Object2IntMap<cri> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cri)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cna.qM) {
         cmx $$3 = new cmx(cna.up);
         $$2.forEach(($$1x, $$2x) -> clt.a($$3, new crl($$1x, $$2x)));
         return $$3;
      } else {
         Map<cri, Integer> $$4 = crk.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         crk.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cri, Integer> $$0, cri $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eih.a<eir.a> {
      private final Builder<ih<cri>, ekp> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eir.a a() {
         return this;
      }

      public eir.a a(cri $$0, ekp $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eii b() {
         return new eir(this.g(), this.a.build(), this.b);
      }
   }
}
