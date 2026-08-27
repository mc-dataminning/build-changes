import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class een {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<il<een>>> d = new MutableObject();
   public static final Codec<een> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.a(d::getValue).fieldOf("fallback").forGetter(een::a),
               Codec.mapPair(eel.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, een::new)
   );
   public static final Codec<il<een>> b = ac.a(ajd.a(kj.aH, a), d::setValue);
   private final List<Pair<eel, Integer>> e;
   private final ObjectArrayList<eel> f;
   private final il<een> g;
   private int h = Integer.MIN_VALUE;

   public een(il<een> $$0, List<Pair<eel, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eel, Integer> $$2 : $$1) {
         eel $$3 = (eel)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public een(il<een> $$0, List<Pair<Function<een.a, ? extends eel>, Integer>> $$1, een.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<een.a, ? extends eel>, Integer> $$3 : $$1) {
         eel $$4 = (eel)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ehf $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eee.b).mapToInt($$1 -> $$1.a($$0, ib.c, dgo.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public il<een> a() {
      return this.g;
   }

   public eel a(axd $$0) {
      return (eel)this.f.get($$0.a(this.f.size()));
   }

   public List<eel> b(axd $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements axq {
      a("terrain_matching", ImmutableList.of(new egl(dso.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final axq.a<een.a> c = axq.a(een.a::values);
      private final String d;
      private final ImmutableList<ehb> e;

      private a(String $$0, ImmutableList<ehb> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static een.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ehb> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
