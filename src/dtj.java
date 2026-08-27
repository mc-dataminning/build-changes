import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dtj {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<he<dtj>>> d = new MutableObject();
   public static final Codec<dtj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aoi.a(d::getValue).fieldOf("fallback").forGetter(dtj::a),
               Codec.mapPair(dth.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dtj::new)
   );
   public static final Codec<he<dtj>> b = ac.a(acm.a(jc.aC, a), d::setValue);
   private final List<Pair<dth, Integer>> e;
   private final ObjectArrayList<dth> f;
   private final he<dtj> g;
   private int h = Integer.MIN_VALUE;

   public dtj(he<dtj> $$0, List<Pair<dth, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dth, Integer> $$2 : $$1) {
         dth $$3 = (dth)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dtj(he<dtj> $$0, List<Pair<Function<dtj.a, ? extends dth>, Integer>> $$1, dtj.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dtj.a, ? extends dth>, Integer> $$3 : $$1) {
         dth $$4 = (dth)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dvu $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dta.b).mapToInt($$1 -> $$1.a($$0, gu.b, cvz.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public he<dtj> a() {
      return this.g;
   }

   public dth a(apf $$0) {
      return (dth)this.f.get($$0.a(this.f.size()));
   }

   public List<dth> b(apf $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements apr {
      a("terrain_matching", ImmutableList.of(new dva(dhk.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final apr.a<dtj.a> c = apr.a(dtj.a::values);
      private final String d;
      private final ImmutableList<dvq> e;

      private a(String $$0, ImmutableList<dvq> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dtj.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dvq> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
