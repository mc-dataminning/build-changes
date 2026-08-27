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

public class egt extends egj {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asu.a(Codec.unboundedMap(jy.g.r(), eis.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, egt::new)
   );
   private final Map<ib<cpu>, eir> b;
   private final boolean c;

   egt(List<ehw> $$0, Map<ib<cpu>, eir> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public egl b() {
      return egm.f;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      Object2IntMap<cpu> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cpu)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == clm.qM) {
         clj $$3 = new clj(clm.uo);
         $$2.forEach(($$1x, $$2x) -> ckf.a($$3, new cpx($$1x, $$2x)));
         return $$3;
      } else {
         Map<cpu, Integer> $$4 = cpw.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cpw.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cpu, Integer> $$0, cpu $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends egj.a<egt.a> {
      private final Builder<ib<cpu>, eir> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected egt.a a() {
         return this;
      }

      public egt.a a(cpu $$0, eir $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public egk b() {
         return new egt(this.g(), this.a.build(), this.b);
      }
   }
}
