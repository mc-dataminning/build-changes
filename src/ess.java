import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ess {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jf<ess>>> d = new MutableObject();
   public static final Codec<ess> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ess::b),
               Codec.mapPair(esq.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ess::new)
   );
   public static final Codec<jf<ess>> b = ag.a(alc.a(mh.bf, a), d::setValue);
   private final List<Pair<esq, Integer>> e;
   private final ObjectArrayList<esq> f;
   private final jf<ess> g;
   private int h = Integer.MIN_VALUE;

   public ess(jf<ess> $$0, List<Pair<esq, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<esq, Integer> $$2 : $$1) {
         esq $$3 = (esq)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ess(jf<ess> $$0, List<Pair<Function<ess.a, ? extends esq>, Integer>> $$1, ess.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ess.a, ? extends esq>, Integer> $$3 : $$1) {
         esq $$4 = (esq)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(evl $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != esj.b).mapToInt($$1 -> $$1.a($$0, iv.c, dtg.a).e()).max().orElse(0);
      }

      return this.h;
   }

   @VisibleForTesting
   public List<Pair<esq, Integer>> a() {
      return this.e;
   }

   public jf<ess> b() {
      return this.g;
   }

   public esq a(azv $$0) {
      return (esq)(this.f.isEmpty() ? esj.b : (esq)this.f.get($$0.a(this.f.size())));
   }

   public List<esq> b(azv $$0) {
      return ag.a(this.f, $$0);
   }

   public int c() {
      return this.f.size();
   }

   public static enum a implements bak {
      a("terrain_matching", ImmutableList.of(new euq(egn.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bak.a<ess.a> c = bak.a(ess.a::values);
      private final String d;
      private final ImmutableList<evh> e;

      private a(final String $$0, final ImmutableList<evh> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ess.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<evh> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
