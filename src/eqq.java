import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eqq {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<js<eqq>>> d = new MutableObject();
   public static final Codec<eqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(eqq::a),
               Codec.mapPair(eqo.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eqq::new)
   );
   public static final Codec<js<eqq>> b = af.a(akz.a(me.bc, a), d::setValue);
   private final List<Pair<eqo, Integer>> e;
   private final ObjectArrayList<eqo> f;
   private final js<eqq> g;
   private int h = Integer.MIN_VALUE;

   public eqq(js<eqq> $$0, List<Pair<eqo, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eqo, Integer> $$2 : $$1) {
         eqo $$3 = (eqo)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eqq(js<eqq> $$0, List<Pair<Function<eqq.a, ? extends eqo>, Integer>> $$1, eqq.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eqq.a, ? extends eqo>, Integer> $$3 : $$1) {
         eqo $$4 = (eqo)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(etj $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eqh.b).mapToInt($$1 -> $$1.a($$0, jj.c, drm.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public js<eqq> a() {
      return this.g;
   }

   public eqo a(azs $$0) {
      return (eqo)(this.f.isEmpty() ? eqh.b : (eqo)this.f.get($$0.a(this.f.size())));
   }

   public List<eqo> b(azs $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bag {
      a("terrain_matching", ImmutableList.of(new eso(eel.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bag.a<eqq.a> c = bag.a(eqq.a::values);
      private final String d;
      private final ImmutableList<etf> e;

      private a(final String $$0, final ImmutableList<etf> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eqq.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<etf> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
