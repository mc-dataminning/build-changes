import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwg {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<hf<dwg>>> d = new MutableObject();
   public static final Codec<dwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.a(d::getValue).fieldOf("fallback").forGetter(dwg::a),
               Codec.mapPair(dwe.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwg::new)
   );
   public static final Codec<hf<dwg>> b = ac.a(ael.a(jd.aC, a), d::setValue);
   private final List<Pair<dwe, Integer>> e;
   private final ObjectArrayList<dwe> f;
   private final hf<dwg> g;
   private int h = Integer.MIN_VALUE;

   public dwg(hf<dwg> $$0, List<Pair<dwe, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dwe, Integer> $$2 : $$1) {
         dwe $$3 = (dwe)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dwg(hf<dwg> $$0, List<Pair<Function<dwg.a, ? extends dwe>, Integer>> $$1, dwg.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dwg.a, ? extends dwe>, Integer> $$3 : $$1) {
         dwe $$4 = (dwe)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dyr $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dvx.b).mapToInt($$1 -> $$1.a($$0, gv.b, cyw.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public hf<dwg> a() {
      return this.g;
   }

   public dwe a(art $$0) {
      return (dwe)this.f.get($$0.a(this.f.size()));
   }

   public List<dwe> b(art $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements asf {
      a("terrain_matching", ImmutableList.of(new dxx(dkh.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final asf.a<dwg.a> c = asf.a(dwg.a::values);
      private final String d;
      private final ImmutableList<dyn> e;

      private a(String $$0, ImmutableList<dyn> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dwg.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dyn> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
