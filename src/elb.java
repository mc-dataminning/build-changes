import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class elb {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jm<elb>>> d = new MutableObject();
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(elb::a),
               Codec.mapPair(ekz.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, elb::new)
   );
   public static final Codec<jm<elb>> b = ad.a(akn.a(lu.aU, a), d::setValue);
   private final List<Pair<ekz, Integer>> e;
   private final ObjectArrayList<ekz> f;
   private final jm<elb> g;
   private int h = Integer.MIN_VALUE;

   public elb(jm<elb> $$0, List<Pair<ekz, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ekz, Integer> $$2 : $$1) {
         ekz $$3 = (ekz)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public elb(jm<elb> $$0, List<Pair<Function<elb.a, ? extends ekz>, Integer>> $$1, elb.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<elb.a, ? extends ekz>, Integer> $$3 : $$1) {
         ekz $$4 = (ekz)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(enu $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eks.b).mapToInt($$1 -> $$1.a($$0, jd.c, dmm.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jm<elb> a() {
      return this.g;
   }

   public ekz a(ayw $$0) {
      return (ekz)(this.f.isEmpty() ? eks.b : (ekz)this.f.get($$0.a(this.f.size())));
   }

   public List<ekz> b(ayw $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azk {
      a("terrain_matching", ImmutableList.of(new emz(dyy.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azk.a<elb.a> c = azk.a(elb.a::values);
      private final String d;
      private final ImmutableList<enq> e;

      private a(final String $$0, final ImmutableList<enq> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static elb.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<enq> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
