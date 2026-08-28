import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class emm {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jn<emm>>> d = new MutableObject();
   public static final Codec<emm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(emm::a),
               Codec.mapPair(emk.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emm::new)
   );
   public static final Codec<jn<emm>> b = ad.a(aky.a(lv.aV, a), d::setValue);
   private final List<Pair<emk, Integer>> e;
   private final ObjectArrayList<emk> f;
   private final jn<emm> g;
   private int h = Integer.MIN_VALUE;

   public emm(jn<emm> $$0, List<Pair<emk, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<emk, Integer> $$2 : $$1) {
         emk $$3 = (emk)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public emm(jn<emm> $$0, List<Pair<Function<emm.a, ? extends emk>, Integer>> $$1, emm.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<emm.a, ? extends emk>, Integer> $$3 : $$1) {
         emk $$4 = (emk)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(epf $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != emd.b).mapToInt($$1 -> $$1.a($$0, je.c, dnx.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jn<emm> a() {
      return this.g;
   }

   public emk a(azl $$0) {
      return (emk)(this.f.isEmpty() ? emd.b : (emk)this.f.get($$0.a(this.f.size())));
   }

   public List<emk> b(azl $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azz {
      a("terrain_matching", ImmutableList.of(new eok(eak.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azz.a<emm.a> c = azz.a(emm.a::values);
      private final String d;
      private final ImmutableList<epb> e;

      private a(final String $$0, final ImmutableList<epb> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static emm.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<epb> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
