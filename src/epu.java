import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class epu {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jq<epu>>> d = new MutableObject();
   public static final Codec<epu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(epu::a),
               Codec.mapPair(eps.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, epu::new)
   );
   public static final Codec<jq<epu>> b = ae.a(alv.a(mb.aX, a), d::setValue);
   private final List<Pair<eps, Integer>> e;
   private final ObjectArrayList<eps> f;
   private final jq<epu> g;
   private int h = Integer.MIN_VALUE;

   public epu(jq<epu> $$0, List<Pair<eps, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eps, Integer> $$2 : $$1) {
         eps $$3 = (eps)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public epu(jq<epu> $$0, List<Pair<Function<epu.a, ? extends eps>, Integer>> $$1, epu.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<epu.a, ? extends eps>, Integer> $$3 : $$1) {
         eps $$4 = (eps)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(esn $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != epl.b).mapToInt($$1 -> $$1.a($$0, jh.c, drc.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jq<epu> a() {
      return this.g;
   }

   public eps a(bam $$0) {
      return (eps)(this.f.isEmpty() ? epl.b : (eps)this.f.get($$0.a(this.f.size())));
   }

   public List<eps> b(bam $$0) {
      return ae.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bba {
      a("terrain_matching", ImmutableList.of(new ers(edq.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bba.a<epu.a> c = bba.a(epu.a::values);
      private final String d;
      private final ImmutableList<esj> e;

      private a(final String $$0, final ImmutableList<esj> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static epu.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<esj> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
