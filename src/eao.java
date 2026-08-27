import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eao {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ih<eao>>> d = new MutableObject();
   public static final Codec<eao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.a(d::getValue).fieldOf("fallback").forGetter(eao::a),
               Codec.mapPair(eam.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eao::new)
   );
   public static final Codec<ih<eao>> b = ac.a(ahc.a(ke.aG, a), d::setValue);
   private final List<Pair<eam, Integer>> e;
   private final ObjectArrayList<eam> f;
   private final ih<eao> g;
   private int h = Integer.MIN_VALUE;

   public eao(ih<eao> $$0, List<Pair<eam, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eam, Integer> $$2 : $$1) {
         eam $$3 = (eam)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eao(ih<eao> $$0, List<Pair<Function<eao.a, ? extends eam>, Integer>> $$1, eao.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eao.a, ? extends eam>, Integer> $$3 : $$1) {
         eam $$4 = (eam)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(edg $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eaf.b).mapToInt($$1 -> $$1.a($$0, hx.b, ddb.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ih<eao> a() {
      return this.g;
   }

   public eam a(auu $$0) {
      return (eam)this.f.get($$0.a(this.f.size()));
   }

   public List<eam> b(auu $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements avj {
      a("terrain_matching", ImmutableList.of(new ecm(dop.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final avj.a<eao.a> c = avj.a(eao.a::values);
      private final String d;
      private final ImmutableList<edc> e;

      private a(String $$0, ImmutableList<edc> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eao.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<edc> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
