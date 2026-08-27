import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwl {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<he<dwl>>> d = new MutableObject();
   public static final Codec<dwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arj.a(d::getValue).fieldOf("fallback").forGetter(dwl::a),
               Codec.mapPair(dwj.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwl::new)
   );
   public static final Codec<he<dwl>> b = ac.a(aev.a(jc.aD, a), d::setValue);
   private final List<Pair<dwj, Integer>> e;
   private final ObjectArrayList<dwj> f;
   private final he<dwl> g;
   private int h = Integer.MIN_VALUE;

   public dwl(he<dwl> $$0, List<Pair<dwj, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dwj, Integer> $$2 : $$1) {
         dwj $$3 = (dwj)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dwl(he<dwl> $$0, List<Pair<Function<dwl.a, ? extends dwj>, Integer>> $$1, dwl.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dwl.a, ? extends dwj>, Integer> $$3 : $$1) {
         dwj $$4 = (dwj)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(dyw $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dwc.b).mapToInt($$1 -> $$1.a($$0, gw.b, czn.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public he<dwl> a() {
      return this.g;
   }

   public dwj a(ash $$0) {
      return (dwj)this.f.get($$0.a(this.f.size()));
   }

   public List<dwj> b(ash $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements asu {
      a("terrain_matching", ImmutableList.of(new dyc(dkm.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final asu.a<dwl.a> c = asu.a(dwl.a::values);
      private final String d;
      private final ImmutableList<dys> e;

      private a(String $$0, ImmutableList<dys> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dwl.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<dys> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
