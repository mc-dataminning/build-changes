import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eel {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<il<eel>>> d = new MutableObject();
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.a(d::getValue).fieldOf("fallback").forGetter(eel::a),
               Codec.mapPair(eej.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eel::new)
   );
   public static final Codec<il<eel>> b = ac.a(ajd.a(kj.aH, a), d::setValue);
   private final List<Pair<eej, Integer>> e;
   private final ObjectArrayList<eej> f;
   private final il<eel> g;
   private int h = Integer.MIN_VALUE;

   public eel(il<eel> $$0, List<Pair<eej, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eej, Integer> $$2 : $$1) {
         eej $$3 = (eej)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eel(il<eel> $$0, List<Pair<Function<eel.a, ? extends eej>, Integer>> $$1, eel.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eel.a, ? extends eej>, Integer> $$3 : $$1) {
         eej $$4 = (eej)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ehd $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eec.b).mapToInt($$1 -> $$1.a($$0, ib.c, dgm.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public il<eel> a() {
      return this.g;
   }

   public eej a(axd $$0) {
      return (eej)this.f.get($$0.a(this.f.size()));
   }

   public List<eej> b(axd $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements axq {
      a("terrain_matching", ImmutableList.of(new egj(dsm.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final axq.a<eel.a> c = axq.a(eel.a::values);
      private final String d;
      private final ImmutableList<egz> e;

      private a(String $$0, ImmutableList<egz> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eel.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<egz> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
