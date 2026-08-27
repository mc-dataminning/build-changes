import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class edp {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<il<edp>>> d = new MutableObject();
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.a(d::getValue).fieldOf("fallback").forGetter(edp::a),
               Codec.mapPair(edn.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edp::new)
   );
   public static final Codec<il<edp>> b = ac.a(aiy.a(ki.aH, a), d::setValue);
   private final List<Pair<edn, Integer>> e;
   private final ObjectArrayList<edn> f;
   private final il<edp> g;
   private int h = Integer.MIN_VALUE;

   public edp(il<edp> $$0, List<Pair<edn, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<edn, Integer> $$2 : $$1) {
         edn $$3 = (edn)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public edp(il<edp> $$0, List<Pair<Function<edp.a, ? extends edn>, Integer>> $$1, edp.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<edp.a, ? extends edn>, Integer> $$3 : $$1) {
         edn $$4 = (edn)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(egh $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != edg.b).mapToInt($$1 -> $$1.a($$0, ib.c, dfr.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public il<edp> a() {
      return this.g;
   }

   public edn a(awt $$0) {
      return (edn)this.f.get($$0.a(this.f.size()));
   }

   public List<edn> b(awt $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements axg {
      a("terrain_matching", ImmutableList.of(new efn(drq.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final axg.a<edp.a> c = axg.a(edp.a::values);
      private final String d;
      private final ImmutableList<egd> e;

      private a(String $$0, ImmutableList<egd> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static edp.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<egd> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
