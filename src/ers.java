import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ers {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<je<ers>>> d = new MutableObject();
   public static final Codec<ers> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ers::a),
               Codec.mapPair(erq.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ers::new)
   );
   public static final Codec<je<ers>> b = af.a(ala.a(mg.bd, a), d::setValue);
   private final List<Pair<erq, Integer>> e;
   private final ObjectArrayList<erq> f;
   private final je<ers> g;
   private int h = Integer.MIN_VALUE;

   public ers(je<ers> $$0, List<Pair<erq, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<erq, Integer> $$2 : $$1) {
         erq $$3 = (erq)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ers(je<ers> $$0, List<Pair<Function<ers.a, ? extends erq>, Integer>> $$1, ers.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ers.a, ? extends erq>, Integer> $$3 : $$1) {
         erq $$4 = (erq)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eul $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != erj.b).mapToInt($$1 -> $$1.a($$0, iu.c, dsm.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public je<ers> a() {
      return this.g;
   }

   public erq a(azt $$0) {
      return (erq)(this.f.isEmpty() ? erj.b : (erq)this.f.get($$0.a(this.f.size())));
   }

   public List<erq> b(azt $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bai {
      a("terrain_matching", ImmutableList.of(new etq(efn.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bai.a<ers.a> c = bai.a(ers.a::values);
      private final String d;
      private final ImmutableList<euh> e;

      private a(final String $$0, final ImmutableList<euh> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ers.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<euh> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
