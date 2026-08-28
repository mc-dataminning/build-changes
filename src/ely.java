import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ely {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jn<ely>>> d = new MutableObject();
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ely::a),
               Codec.mapPair(elw.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ely::new)
   );
   public static final Codec<jn<ely>> b = ad.a(akx.a(lv.aU, a), d::setValue);
   private final List<Pair<elw, Integer>> e;
   private final ObjectArrayList<elw> f;
   private final jn<ely> g;
   private int h = Integer.MIN_VALUE;

   public ely(jn<ely> $$0, List<Pair<elw, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<elw, Integer> $$2 : $$1) {
         elw $$3 = (elw)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ely(jn<ely> $$0, List<Pair<Function<ely.a, ? extends elw>, Integer>> $$1, ely.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ely.a, ? extends elw>, Integer> $$3 : $$1) {
         elw $$4 = (elw)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eor $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != elp.b).mapToInt($$1 -> $$1.a($$0, je.c, dnj.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jn<ely> a() {
      return this.g;
   }

   public elw a(azk $$0) {
      return (elw)(this.f.isEmpty() ? elp.b : (elw)this.f.get($$0.a(this.f.size())));
   }

   public List<elw> b(azk $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azy {
      a("terrain_matching", ImmutableList.of(new enw(dzw.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azy.a<ely.a> c = azy.a(ely.a::values);
      private final String d;
      private final ImmutableList<eon> e;

      private a(final String $$0, final ImmutableList<eon> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ely.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eon> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
