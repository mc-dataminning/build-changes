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

public class eis extends eii {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atw.a(Codec.unboundedMap(kd.f.r(), ekr.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eis::new)
   );
   private final Map<ih<crj>, ekq> b;
   private final boolean c;

   eis(List<ejv> $$0, Map<ih<crj>, ekq> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eik b() {
      return eil.f;
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      Object2IntMap<crj> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((crj)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cnb.qM) {
         cmy $$3 = new cmy(cnb.up);
         $$2.forEach(($$1x, $$2x) -> clu.a($$3, new crm($$1x, $$2x)));
         return $$3;
      } else {
         Map<crj, Integer> $$4 = crl.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         crl.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<crj, Integer> $$0, crj $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eii.a<eis.a> {
      private final Builder<ih<crj>, ekq> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eis.a a() {
         return this;
      }

      public eis.a a(crj $$0, ekq $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eij b() {
         return new eis(this.g(), this.a.build(), this.b);
      }
   }
}
