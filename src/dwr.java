import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwr {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<he<dwr>>> d = new MutableObject();
   public static final Codec<dwr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arf.a(d::getValue).fieldOf("fallback").forGetter(dwr::a),
               Codec.mapPair(dwp.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwr::new)
   );
   public static final Codec<he<dwr>> b = ac.a(aes.a(jc.aC, a), d::setValue);
   private final List<Pair<dwp, Integer>> e;
   private final ObjectArrayList<dwp> f;
   private final he<dwr> g;
   private int h = Integer.MIN_VALUE;

   public dwr(he<dwr> $$0, List<Pair<dwp, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dwp, Integer> $$2 : $$1) {
         dwp $$3 = (dwp)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dwr(he<dwr> $$0, List<Pair<Function<dwr.a, ? extends dwp>, Integer>> $$1, dwr.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dwr.a, ? extends dwp>, Integer> $$3 : $$1) {
         dwp $$4 = (dwp)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dzc $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dwi.b).mapToInt($$1 -> $$1.a($$0, gw.b, czh.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public he<dwr> a() {
      return this.g;
   }

   public dwp a(asc $$0) {
      return (dwp)this.f.get($$0.a(this.f.size()));
   }

   public List<dwp> b(asc $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements asp {
      a("terrain_matching", ImmutableList.of(new dyi(dks.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final asp.a<dwr.a> c = asp.a(dwr.a::values);
      private final String d;
      private final ImmutableList<dyy> e;

      private a(String $$0, ImmutableList<dyy> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dwr.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dyy> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
