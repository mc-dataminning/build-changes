import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dyv {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ig<dyv>>> d = new MutableObject();
   public static final Codec<dyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.a(d::getValue).fieldOf("fallback").forGetter(dyv::a),
               Codec.mapPair(dyt.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dyv::new)
   );
   public static final Codec<ig<dyv>> b = ac.a(agi.a(kd.aE, a), d::setValue);
   private final List<Pair<dyt, Integer>> e;
   private final ObjectArrayList<dyt> f;
   private final ig<dyv> g;
   private int h = Integer.MIN_VALUE;

   public dyv(ig<dyv> $$0, List<Pair<dyt, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dyt, Integer> $$2 : $$1) {
         dyt $$3 = (dyt)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dyv(ig<dyv> $$0, List<Pair<Function<dyv.a, ? extends dyt>, Integer>> $$1, dyv.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dyv.a, ? extends dyt>, Integer> $$3 : $$1) {
         dyt $$4 = (dyt)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ebn $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dym.b).mapToInt($$1 -> $$1.a($$0, hx.b, dbr.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ig<dyv> a() {
      return this.g;
   }

   public dyt a(atw $$0) {
      return (dyt)this.f.get($$0.a(this.f.size()));
   }

   public List<dyt> b(atw $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements auk {
      a("terrain_matching", ImmutableList.of(new eat(dmw.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final auk.a<dyv.a> c = auk.a(dyv.a::values);
      private final String d;
      private final ImmutableList<ebj> e;

      private a(String $$0, ImmutableList<ebj> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dyv.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ebj> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
