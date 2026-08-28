import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class esl {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<je<esl>>> d = new MutableObject();
   public static final Codec<esl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(esl::a),
               Codec.mapPair(esj.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, esl::new)
   );
   public static final Codec<je<esl>> b = af.a(alc.a(mg.bf, a), d::setValue);
   private final List<Pair<esj, Integer>> e;
   private final ObjectArrayList<esj> f;
   private final je<esl> g;
   private int h = Integer.MIN_VALUE;

   public esl(je<esl> $$0, List<Pair<esj, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<esj, Integer> $$2 : $$1) {
         esj $$3 = (esj)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public esl(je<esl> $$0, List<Pair<Function<esl.a, ? extends esj>, Integer>> $$1, esl.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<esl.a, ? extends esj>, Integer> $$3 : $$1) {
         esj $$4 = (esj)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eve $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != esc.b).mapToInt($$1 -> $$1.a($$0, iu.c, dsz.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public je<esl> a() {
      return this.g;
   }

   public esj a(azv $$0) {
      return (esj)(this.f.isEmpty() ? esc.b : (esj)this.f.get($$0.a(this.f.size())));
   }

   public List<esj> b(azv $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bak {
      a("terrain_matching", ImmutableList.of(new euj(egg.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bak.a<esl.a> c = bak.a(esl.a::values);
      private final String d;
      private final ImmutableList<eva> e;

      private a(final String $$0, final ImmutableList<eva> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static esl.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eva> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
