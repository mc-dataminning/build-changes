import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eiu {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ix<eiu>>> d = new MutableObject();
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(eiu::a),
               Codec.mapPair(eis.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiu::new)
   );
   public static final Codec<ix<eiu>> b = ac.a(akj.a(lf.aM, a), d::setValue);
   private final List<Pair<eis, Integer>> e;
   private final ObjectArrayList<eis> f;
   private final ix<eiu> g;
   private int h = Integer.MIN_VALUE;

   public eiu(ix<eiu> $$0, List<Pair<eis, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eis, Integer> $$2 : $$1) {
         eis $$3 = (eis)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eiu(ix<eiu> $$0, List<Pair<Function<eiu.a, ? extends eis>, Integer>> $$1, eiu.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eiu.a, ? extends eis>, Integer> $$3 : $$1) {
         eis $$4 = (eis)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(elm $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eil.b).mapToInt($$1 -> $$1.a($$0, io.c, dkn.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ix<eiu> a() {
      return this.g;
   }

   public eis a(aym $$0) {
      return (eis)this.f.get($$0.a(this.f.size()));
   }

   public List<eis> b(aym $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ayz {
      a("terrain_matching", ImmutableList.of(new eks(dwv.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ayz.a<eiu.a> c = ayz.a(eiu.a::values);
      private final String d;
      private final ImmutableList<eli> e;

      private a(String $$0, ImmutableList<eli> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eiu.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eli> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
