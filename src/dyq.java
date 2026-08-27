import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dyq {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ib<dyq>>> d = new MutableObject();
   public static final Codec<dyq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.a(d::getValue).fieldOf("fallback").forGetter(dyq::a),
               Codec.mapPair(dyo.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dyq::new)
   );
   public static final Codec<ib<dyq>> b = ac.a(age.a(jz.aE, a), d::setValue);
   private final List<Pair<dyo, Integer>> e;
   private final ObjectArrayList<dyo> f;
   private final ib<dyq> g;
   private int h = Integer.MIN_VALUE;

   public dyq(ib<dyq> $$0, List<Pair<dyo, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dyo, Integer> $$2 : $$1) {
         dyo $$3 = (dyo)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dyq(ib<dyq> $$0, List<Pair<Function<dyq.a, ? extends dyo>, Integer>> $$1, dyq.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dyq.a, ? extends dyo>, Integer> $$3 : $$1) {
         dyo $$4 = (dyo)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ebi $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dyh.b).mapToInt($$1 -> $$1.a($$0, ht.b, dbm.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public ib<dyq> a() {
      return this.g;
   }

   public dyo a(ats $$0) {
      return (dyo)this.f.get($$0.a(this.f.size()));
   }

   public List<dyo> b(ats $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements aug {
      a("terrain_matching", ImmutableList.of(new eao(dmr.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final aug.a<dyq.a> c = aug.a(dyq.a::values);
      private final String d;
      private final ImmutableList<ebe> e;

      private a(String $$0, ImmutableList<ebe> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dyq.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ebe> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
