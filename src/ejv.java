import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ejv {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ji<ejv>>> d = new MutableObject();
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ejv::a),
               Codec.mapPair(ejt.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejv::new)
   );
   public static final Codec<ji<ejv>> b = ac.a(alb.a(lq.aM, a), d::setValue);
   private final List<Pair<ejt, Integer>> e;
   private final ObjectArrayList<ejt> f;
   private final ji<ejv> g;
   private int h = Integer.MIN_VALUE;

   public ejv(ji<ejv> $$0, List<Pair<ejt, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ejt, Integer> $$2 : $$1) {
         ejt $$3 = (ejt)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ejv(ji<ejv> $$0, List<Pair<Function<ejv.a, ? extends ejt>, Integer>> $$1, ejv.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ejv.a, ? extends ejt>, Integer> $$3 : $$1) {
         ejt $$4 = (ejt)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(emn $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ejm.b).mapToInt($$1 -> $$1.a($$0, iz.c, dlo.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ji<ejv> a() {
      return this.g;
   }

   public ejt a(azh $$0) {
      return (ejt)this.f.get($$0.a(this.f.size()));
   }

   public List<ejt> b(azh $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azu {
      a("terrain_matching", ImmutableList.of(new elt(dxw.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azu.a<ejv.a> c = azu.a(ejv.a::values);
      private final String d;
      private final ImmutableList<emj> e;

      private a(final String $$0, final ImmutableList<emj> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ejv.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emj> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
