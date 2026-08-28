import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class enh {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jq<enh>>> d = new MutableObject();
   public static final Codec<enh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(enh::a),
               Codec.mapPair(enf.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, enh::new)
   );
   public static final Codec<jq<enh>> b = ae.a(ale.a(lz.aV, a), d::setValue);
   private final List<Pair<enf, Integer>> e;
   private final ObjectArrayList<enf> f;
   private final jq<enh> g;
   private int h = Integer.MIN_VALUE;

   public enh(jq<enh> $$0, List<Pair<enf, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<enf, Integer> $$2 : $$1) {
         enf $$3 = (enf)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public enh(jq<enh> $$0, List<Pair<Function<enh.a, ? extends enf>, Integer>> $$1, enh.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<enh.a, ? extends enf>, Integer> $$3 : $$1) {
         enf $$4 = (enf)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eqa $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != emy.b).mapToInt($$1 -> $$1.a($$0, jh.c, dor.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jq<enh> a() {
      return this.g;
   }

   public enf a(azs $$0) {
      return (enf)(this.f.isEmpty() ? emy.b : (enf)this.f.get($$0.a(this.f.size())));
   }

   public List<enf> b(azs $$0) {
      return ae.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bag {
      a("terrain_matching", ImmutableList.of(new epf(ebf.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bag.a<enh.a> c = bag.a(enh.a::values);
      private final String d;
      private final ImmutableList<epw> e;

      private a(final String $$0, final ImmutableList<epw> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static enh.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<epw> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
