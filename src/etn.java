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

public class etn {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jg<etn>>> d = new MutableObject();
   public static final Codec<etn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(etn::b),
               Codec.mapPair(etl.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, etn::new)
   );
   public static final Codec<jg<etn>> b = ag.a(alg.a(mi.bf, a), d::setValue);
   private final List<Pair<etl, Integer>> e;
   private final ObjectArrayList<etl> f;
   private final jg<etn> g;
   private int h = Integer.MIN_VALUE;

   public etn(jg<etn> $$0, List<Pair<etl, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<etl, Integer> $$2 : $$1) {
         etl $$3 = (etl)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public etn(jg<etn> $$0, List<Pair<Function<etn.a, ? extends etl>, Integer>> $$1, etn.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<etn.a, ? extends etl>, Integer> $$3 : $$1) {
         etl $$4 = (etl)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ewg $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ete.b).mapToInt($$1 -> $$1.a($$0, iw.c, dty.a).e()).max().orElse(0);
      }

      return this.h;
   }

   @VisibleForTesting
   public List<Pair<etl, Integer>> a() {
      return this.e;
   }

   public jg<etn> b() {
      return this.g;
   }

   public etl a(azz $$0) {
      return (etl)(this.f.isEmpty() ? ete.b : (etl)this.f.get($$0.a(this.f.size())));
   }

   public List<etl> b(azz $$0) {
      return ag.a(this.f, $$0);
   }

   public int c() {
      return this.f.size();
   }

   public static enum a implements bao {
      a("terrain_matching", ImmutableList.of(new evl(ehf.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bao.a<etn.a> c = bao.a(etn.a::values);
      private final String d;
      private final ImmutableList<ewc> e;

      private a(final String $$0, final ImmutableList<ewc> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static etn.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ewc> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
