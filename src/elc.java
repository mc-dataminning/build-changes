import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.tuple.Triple;

public class elc {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ja<elc>>> d = new MutableObject();
   public static final Codec<elc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(d::getValue).fieldOf("fallback").forGetter(elc::a),
               Codec.mapPair(ela.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, elc::new)
   );
   public static final Codec<ja<elc>> b = ad.a(akp.a(li.aM, a), d::setValue);
   private final List<Pair<ela, Integer>> e;
   private final ObjectArrayList<ela> f;
   private final ja<elc> g;
   private int h = Integer.MIN_VALUE;

   public elc(ja<elc> $$0, List<Pair<ela, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ela, Integer> $$2 : $$1) {
         ela $$3 = (ela)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public elc(ja<elc> $$0, List<Pair<Function<elc.a, ? extends ela>, Integer>> $$1, elc.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<elc.a, ? extends ela>, Integer> $$3 : $$1) {
         ela $$4 = (ela)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public elc(List<Triple<Function<elc.a, ? extends ela>, Integer, elc.a>> $$0, ja<elc> $$1) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Triple<Function<elc.a, ? extends ela>, Integer, elc.a> $$2 : $$0) {
         ela $$3 = (ela)((Function)$$2.getLeft()).apply((elc.a)$$2.getRight());
         this.e.add(Pair.of($$3, (Integer)$$2.getMiddle()));

         for (int $$4 = 0; $$4 < $$2.getMiddle(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$1;
   }

   public int a(enu $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ekt.b).mapToInt($$1 -> $$1.a($$0, ir.c, dmd.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ja<elc> a() {
      return this.g;
   }

   public ela a(ayt $$0) {
      return (ela)this.f.get($$0.a(this.f.size()));
   }

   public List<ela> b(ayt $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azg {
      a("terrain_matching", ImmutableList.of(new ena(dyu.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azg.a<elc.a> c = azg.a(elc.a::values);
      private final String d;
      private final ImmutableList<enq> e;

      private a(String $$0, ImmutableList<enq> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static elc.a a(String $$0) {
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
