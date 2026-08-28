import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ekh {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jj<ekh>>> d = new MutableObject();
   public static final Codec<ekh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ekh::a),
               Codec.mapPair(ekf.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ekh::new)
   );
   public static final Codec<jj<ekh>> b = ac.a(akg.a(lr.aT, a), d::setValue);
   private final List<Pair<ekf, Integer>> e;
   private final ObjectArrayList<ekf> f;
   private final jj<ekh> g;
   private int h = Integer.MIN_VALUE;

   public ekh(jj<ekh> $$0, List<Pair<ekf, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ekf, Integer> $$2 : $$1) {
         ekf $$3 = (ekf)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ekh(jj<ekh> $$0, List<Pair<Function<ekh.a, ? extends ekf>, Integer>> $$1, ekh.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ekh.a, ? extends ekf>, Integer> $$3 : $$1) {
         ekf $$4 = (ekf)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(emz $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ejy.b).mapToInt($$1 -> $$1.a($$0, ja.c, dlv.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jj<ekh> a() {
      return this.g;
   }

   public ekf a(ayo $$0) {
      return (ekf)(this.f.isEmpty() ? ejy.b : (ekf)this.f.get($$0.a(this.f.size())));
   }

   public List<ekf> b(ayo $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azc {
      a("terrain_matching", ImmutableList.of(new emf(dyg.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azc.a<ekh.a> c = azc.a(ekh.a::values);
      private final String d;
      private final ImmutableList<emv> e;

      private a(final String $$0, final ImmutableList<emv> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ekh.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emv> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
