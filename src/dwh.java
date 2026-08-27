import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwh {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<he<dwh>>> d = new MutableObject();
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(d::getValue).fieldOf("fallback").forGetter(dwh::a),
               Codec.mapPair(dwf.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwh::new)
   );
   public static final Codec<he<dwh>> b = ac.a(aen.a(jc.aC, a), d::setValue);
   private final List<Pair<dwf, Integer>> e;
   private final ObjectArrayList<dwf> f;
   private final he<dwh> g;
   private int h = Integer.MIN_VALUE;

   public dwh(he<dwh> $$0, List<Pair<dwf, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dwf, Integer> $$2 : $$1) {
         dwf $$3 = (dwf)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dwh(he<dwh> $$0, List<Pair<Function<dwh.a, ? extends dwf>, Integer>> $$1, dwh.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dwh.a, ? extends dwf>, Integer> $$3 : $$1) {
         dwf $$4 = (dwf)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dys $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dvy.b).mapToInt($$1 -> $$1.a($$0, gu.b, cyx.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public he<dwh> a() {
      return this.g;
   }

   public dwf a(aru $$0) {
      return (dwf)this.f.get($$0.a(this.f.size()));
   }

   public List<dwf> b(aru $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ash {
      a("terrain_matching", ImmutableList.of(new dxy(dki.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ash.a<dwh.a> c = ash.a(dwh.a::values);
      private final String d;
      private final ImmutableList<dyo> e;

      private a(String $$0, ImmutableList<dyo> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dwh.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dyo> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
