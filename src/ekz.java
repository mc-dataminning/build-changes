import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ekz {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jm<ekz>>> d = new MutableObject();
   public static final Codec<ekz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ekz::a),
               Codec.mapPair(ekx.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ekz::new)
   );
   public static final Codec<jm<ekz>> b = ad.a(akn.a(lu.aU, a), d::setValue);
   private final List<Pair<ekx, Integer>> e;
   private final ObjectArrayList<ekx> f;
   private final jm<ekz> g;
   private int h = Integer.MIN_VALUE;

   public ekz(jm<ekz> $$0, List<Pair<ekx, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ekx, Integer> $$2 : $$1) {
         ekx $$3 = (ekx)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ekz(jm<ekz> $$0, List<Pair<Function<ekz.a, ? extends ekx>, Integer>> $$1, ekz.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ekz.a, ? extends ekx>, Integer> $$3 : $$1) {
         ekx $$4 = (ekx)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ens $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ekq.b).mapToInt($$1 -> $$1.a($$0, jd.c, dmm.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jm<ekz> a() {
      return this.g;
   }

   public ekx a(ayw $$0) {
      return (ekx)(this.f.isEmpty() ? ekq.b : (ekx)this.f.get($$0.a(this.f.size())));
   }

   public List<ekx> b(ayw $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azk {
      a("terrain_matching", ImmutableList.of(new emx(dyy.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azk.a<ekz.a> c = azk.a(ekz.a::values);
      private final String d;
      private final ImmutableList<eno> e;

      private a(final String $$0, final ImmutableList<eno> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ekz.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eno> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
