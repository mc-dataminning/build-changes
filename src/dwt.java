import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwt {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<hg<dwt>>> d = new MutableObject();
   public static final Codec<dwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.a(d::getValue).fieldOf("fallback").forGetter(dwt::a),
               Codec.mapPair(dwr.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwt::new)
   );
   public static final Codec<hg<dwt>> b = ac.a(aeu.a(je.aC, a), d::setValue);
   private final List<Pair<dwr, Integer>> e;
   private final ObjectArrayList<dwr> f;
   private final hg<dwt> g;
   private int h = Integer.MIN_VALUE;

   public dwt(hg<dwt> $$0, List<Pair<dwr, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dwr, Integer> $$2 : $$1) {
         dwr $$3 = (dwr)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dwt(hg<dwt> $$0, List<Pair<Function<dwt.a, ? extends dwr>, Integer>> $$1, dwt.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dwt.a, ? extends dwr>, Integer> $$3 : $$1) {
         dwr $$4 = (dwr)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dze $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dwk.b).mapToInt($$1 -> $$1.a($$0, gw.b, czj.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public hg<dwt> a() {
      return this.g;
   }

   public dwr a(ase $$0) {
      return (dwr)this.f.get($$0.a(this.f.size()));
   }

   public List<dwr> b(ase $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements asr {
      a("terrain_matching", ImmutableList.of(new dyk(dku.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final asr.a<dwt.a> c = asr.a(dwt.a::values);
      private final String d;
      private final ImmutableList<dza> e;

      private a(String $$0, ImmutableList<dza> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dwt.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dza> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
