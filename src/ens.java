import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ens {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jq<ens>>> d = new MutableObject();
   public static final Codec<ens> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ens::a),
               Codec.mapPair(enq.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ens::new)
   );
   public static final Codec<jq<ens>> b = ae.a(alf.a(ma.aV, a), d::setValue);
   private final List<Pair<enq, Integer>> e;
   private final ObjectArrayList<enq> f;
   private final jq<ens> g;
   private int h = Integer.MIN_VALUE;

   public ens(jq<ens> $$0, List<Pair<enq, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<enq, Integer> $$2 : $$1) {
         enq $$3 = (enq)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ens(jq<ens> $$0, List<Pair<Function<ens.a, ? extends enq>, Integer>> $$1, ens.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ens.a, ? extends enq>, Integer> $$3 : $$1) {
         enq $$4 = (enq)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eql $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != enj.b).mapToInt($$1 -> $$1.a($$0, jh.c, dpd.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jq<ens> a() {
      return this.g;
   }

   public enq a(azu $$0) {
      return (enq)(this.f.isEmpty() ? enj.b : (enq)this.f.get($$0.a(this.f.size())));
   }

   public List<enq> b(azu $$0) {
      return ae.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bai {
      a("terrain_matching", ImmutableList.of(new epq(ebq.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bai.a<ens.a> c = bai.a(ens.a::values);
      private final String d;
      private final ImmutableList<eqh> e;

      private a(final String $$0, final ImmutableList<eqh> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ens.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eqh> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
