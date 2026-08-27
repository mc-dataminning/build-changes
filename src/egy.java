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

public class egy extends ego {
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asy.a(Codec.unboundedMap(kc.g.r(), eix.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, egy::new)
   );
   private final Map<ig<cpz>, eiw> b;
   private final boolean c;

   egy(List<eib> $$0, Map<ig<cpz>, eiw> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public egq b() {
      return egr.f;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      Object2IntMap<cpz> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cpz)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == clr.qM) {
         clo $$3 = new clo(clr.uo);
         $$2.forEach(($$1x, $$2x) -> ckk.a($$3, new cqc($$1x, $$2x)));
         return $$3;
      } else {
         Map<cpz, Integer> $$4 = cqb.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cqb.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cpz, Integer> $$0, cpz $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends ego.a<egy.a> {
      private final Builder<ig<cpz>, eiw> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected egy.a a() {
         return this;
      }

      public egy.a a(cpz $$0, eiw $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public egp b() {
         return new egy(this.g(), this.a.build(), this.b);
      }
   }
}
