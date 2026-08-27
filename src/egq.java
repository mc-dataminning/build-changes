import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class egq {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<il<egq>>> d = new MutableObject();
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.a(d::getValue).fieldOf("fallback").forGetter(egq::a),
               Codec.mapPair(ego.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egq::new)
   );
   public static final Codec<il<egq>> b = ac.a(ajp.a(ks.aI, a), d::setValue);
   private final List<Pair<ego, Integer>> e;
   private final ObjectArrayList<ego> f;
   private final il<egq> g;
   private int h = Integer.MIN_VALUE;

   public egq(il<egq> $$0, List<Pair<ego, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ego, Integer> $$2 : $$1) {
         ego $$3 = (ego)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public egq(il<egq> $$0, List<Pair<Function<egq.a, ? extends ego>, Integer>> $$1, egq.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<egq.a, ? extends ego>, Integer> $$3 : $$1) {
         ego $$4 = (ego)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eji $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != egh.b).mapToInt($$1 -> $$1.a($$0, ib.c, dik.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public il<egq> a() {
      return this.g;
   }

   public ego a(axr $$0) {
      return (ego)this.f.get($$0.a(this.f.size()));
   }

   public List<ego> b(axr $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements aye {
      a("terrain_matching", ImmutableList.of(new eio(dur.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final aye.a<egq.a> c = aye.a(egq.a::values);
      private final String d;
      private final ImmutableList<eje> e;

      private a(String $$0, ImmutableList<eje> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static egq.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eje> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
