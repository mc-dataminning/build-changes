import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ejz {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jj<ejz>>> d = new MutableObject();
   public static final Codec<ejz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ejz::a),
               Codec.mapPair(ejx.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejz::new)
   );
   public static final Codec<jj<ejz>> b = ac.a(akg.a(lr.aT, a), d::setValue);
   private final List<Pair<ejx, Integer>> e;
   private final ObjectArrayList<ejx> f;
   private final jj<ejz> g;
   private int h = Integer.MIN_VALUE;

   public ejz(jj<ejz> $$0, List<Pair<ejx, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ejx, Integer> $$2 : $$1) {
         ejx $$3 = (ejx)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ejz(jj<ejz> $$0, List<Pair<Function<ejz.a, ? extends ejx>, Integer>> $$1, ejz.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ejz.a, ? extends ejx>, Integer> $$3 : $$1) {
         ejx $$4 = (ejx)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(emr $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ejq.b).mapToInt($$1 -> $$1.a($$0, ja.c, dls.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jj<ejz> a() {
      return this.g;
   }

   public ejx a(aym $$0) {
      return (ejx)this.f.get($$0.a(this.f.size()));
   }

   public List<ejx> b(aym $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ayz {
      a("terrain_matching", ImmutableList.of(new elx(dxz.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ayz.a<ejz.a> c = ayz.a(ejz.a::values);
      private final String d;
      private final ImmutableList<emn> e;

      private a(final String $$0, final ImmutableList<emn> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ejz.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emn> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
