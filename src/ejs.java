import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ejs {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ji<ejs>>> d = new MutableObject();
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ejs::a),
               Codec.mapPair(ejq.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejs::new)
   );
   public static final Codec<ji<ejs>> b = ac.a(ala.a(lq.aM, a), d::setValue);
   private final List<Pair<ejq, Integer>> e;
   private final ObjectArrayList<ejq> f;
   private final ji<ejs> g;
   private int h = Integer.MIN_VALUE;

   public ejs(ji<ejs> $$0, List<Pair<ejq, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ejq, Integer> $$2 : $$1) {
         ejq $$3 = (ejq)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ejs(ji<ejs> $$0, List<Pair<Function<ejs.a, ? extends ejq>, Integer>> $$1, ejs.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ejs.a, ? extends ejq>, Integer> $$3 : $$1) {
         ejq $$4 = (ejq)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(emk $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ejj.b).mapToInt($$1 -> $$1.a($$0, iz.c, dll.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ji<ejs> a() {
      return this.g;
   }

   public ejq a(azg $$0) {
      return (ejq)this.f.get($$0.a(this.f.size()));
   }

   public List<ejq> b(azg $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azt {
      a("terrain_matching", ImmutableList.of(new elq(dxt.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azt.a<ejs.a> c = azt.a(ejs.a::values);
      private final String d;
      private final ImmutableList<emg> e;

      private a(final String $$0, final ImmutableList<emg> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ejs.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emg> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
