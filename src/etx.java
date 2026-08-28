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

public class etx {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jg<etx>>> d = new MutableObject();
   public static final Codec<etx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(etx::b),
               Codec.mapPair(etv.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, etx::new)
   );
   public static final Codec<jg<etx>> b = ag.a(aln.a(mi.bf, a), d::setValue);
   private final List<Pair<etv, Integer>> e;
   private final ObjectArrayList<etv> f;
   private final jg<etx> g;
   private int h = Integer.MIN_VALUE;

   public etx(jg<etx> $$0, List<Pair<etv, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<etv, Integer> $$2 : $$1) {
         etv $$3 = (etv)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public etx(jg<etx> $$0, List<Pair<Function<etx.a, ? extends etv>, Integer>> $$1, etx.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<etx.a, ? extends etv>, Integer> $$3 : $$1) {
         etv $$4 = (etv)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ewq $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eto.b).mapToInt($$1 -> $$1.a($$0, iw.c, dui.a).e()).max().orElse(0);
      }

      return this.h;
   }

   @VisibleForTesting
   public List<Pair<etv, Integer>> a() {
      return this.e;
   }

   public jg<etx> b() {
      return this.g;
   }

   public etv a(bai $$0) {
      return (etv)(this.f.isEmpty() ? eto.b : (etv)this.f.get($$0.a(this.f.size())));
   }

   public List<etv> b(bai $$0) {
      return ag.a(this.f, $$0);
   }

   public int c() {
      return this.f.size();
   }

   public static enum a implements bax {
      a("terrain_matching", ImmutableList.of(new evv(ehp.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bax.a<etx.a> c = bax.a(etx.a::values);
      private final String d;
      private final ImmutableList<ewm> e;

      private a(final String $$0, final ImmutableList<ewm> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static etx.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ewm> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
