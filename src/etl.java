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

public class etl {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jf<etl>>> d = new MutableObject();
   public static final Codec<etl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(etl::b),
               Codec.mapPair(etj.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, etl::new)
   );
   public static final Codec<jf<etl>> b = ag.a(ale.a(mh.bf, a), d::setValue);
   private final List<Pair<etj, Integer>> e;
   private final ObjectArrayList<etj> f;
   private final jf<etl> g;
   private int h = Integer.MIN_VALUE;

   public etl(jf<etl> $$0, List<Pair<etj, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<etj, Integer> $$2 : $$1) {
         etj $$3 = (etj)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public etl(jf<etl> $$0, List<Pair<Function<etl.a, ? extends etj>, Integer>> $$1, etl.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<etl.a, ? extends etj>, Integer> $$3 : $$1) {
         etj $$4 = (etj)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ewe $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != etc.b).mapToInt($$1 -> $$1.a($$0, iv.c, dtw.a).e()).max().orElse(0);
      }

      return this.h;
   }

   @VisibleForTesting
   public List<Pair<etj, Integer>> a() {
      return this.e;
   }

   public jf<etl> b() {
      return this.g;
   }

   public etj a(azx $$0) {
      return (etj)(this.f.isEmpty() ? etc.b : (etj)this.f.get($$0.a(this.f.size())));
   }

   public List<etj> b(azx $$0) {
      return ag.a(this.f, $$0);
   }

   public int c() {
      return this.f.size();
   }

   public static enum a implements bam {
      a("terrain_matching", ImmutableList.of(new evj(ehd.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bam.a<etl.a> c = bam.a(etl.a::values);
      private final String d;
      private final ImmutableList<ewa> e;

      private a(final String $$0, final ImmutableList<ewa> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static etl.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ewa> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
