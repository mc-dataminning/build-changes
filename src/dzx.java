import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dzx {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ie<dzx>>> d = new MutableObject();
   public static final Codec<dzx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.a(d::getValue).fieldOf("fallback").forGetter(dzx::a),
               Codec.mapPair(dzv.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dzx::new)
   );
   public static final Codec<ie<dzx>> b = ac.a(agp.a(kc.aF, a), d::setValue);
   private final List<Pair<dzv, Integer>> e;
   private final ObjectArrayList<dzv> f;
   private final ie<dzx> g;
   private int h = Integer.MIN_VALUE;

   public dzx(ie<dzx> $$0, List<Pair<dzv, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dzv, Integer> $$2 : $$1) {
         dzv $$3 = (dzv)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dzx(ie<dzx> $$0, List<Pair<Function<dzx.a, ? extends dzv>, Integer>> $$1, dzx.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dzx.a, ? extends dzv>, Integer> $$3 : $$1) {
         dzv $$4 = (dzv)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ecp $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dzo.b).mapToInt($$1 -> $$1.a($$0, hv.b, dcl.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ie<dzx> a() {
      return this.g;
   }

   public dzv a(auf $$0) {
      return (dzv)this.f.get($$0.a(this.f.size()));
   }

   public List<dzv> b(auf $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements aut {
      a("terrain_matching", ImmutableList.of(new ebv(dny.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final aut.a<dzx.a> c = aut.a(dzx.a::values);
      private final String d;
      private final ImmutableList<ecl> e;

      private a(String $$0, ImmutableList<ecl> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dzx.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ecl> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
