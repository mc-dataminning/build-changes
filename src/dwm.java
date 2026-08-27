import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwm {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<hg<dwm>>> d = new MutableObject();
   public static final Codec<dwm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.a(d::getValue).fieldOf("fallback").forGetter(dwm::a),
               Codec.mapPair(dwk.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwm::new)
   );
   public static final Codec<hg<dwm>> b = ac.a(aeq.a(je.aC, a), d::setValue);
   private final List<Pair<dwk, Integer>> e;
   private final ObjectArrayList<dwk> f;
   private final hg<dwm> g;
   private int h = Integer.MIN_VALUE;

   public dwm(hg<dwm> $$0, List<Pair<dwk, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dwk, Integer> $$2 : $$1) {
         dwk $$3 = (dwk)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dwm(hg<dwm> $$0, List<Pair<Function<dwm.a, ? extends dwk>, Integer>> $$1, dwm.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dwm.a, ? extends dwk>, Integer> $$3 : $$1) {
         dwk $$4 = (dwk)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dyx $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dwd.b).mapToInt($$1 -> $$1.a($$0, gw.b, czc.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public hg<dwm> a() {
      return this.g;
   }

   public dwk a(arx $$0) {
      return (dwk)this.f.get($$0.a(this.f.size()));
   }

   public List<dwk> b(arx $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ask {
      a("terrain_matching", ImmutableList.of(new dyd(dkn.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ask.a<dwm.a> c = ask.a(dwm.a::values);
      private final String d;
      private final ImmutableList<dyt> e;

      private a(String $$0, ImmutableList<dyt> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dwm.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dyt> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
