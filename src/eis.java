import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eis {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ix<eis>>> d = new MutableObject();
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(eis::a),
               Codec.mapPair(eiq.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eis::new)
   );
   public static final Codec<ix<eis>> b = ac.a(aki.a(lf.aM, a), d::setValue);
   private final List<Pair<eiq, Integer>> e;
   private final ObjectArrayList<eiq> f;
   private final ix<eis> g;
   private int h = Integer.MIN_VALUE;

   public eis(ix<eis> $$0, List<Pair<eiq, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eiq, Integer> $$2 : $$1) {
         eiq $$3 = (eiq)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eis(ix<eis> $$0, List<Pair<Function<eis.a, ? extends eiq>, Integer>> $$1, eis.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eis.a, ? extends eiq>, Integer> $$3 : $$1) {
         eiq $$4 = (eiq)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(elk $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eij.b).mapToInt($$1 -> $$1.a($$0, io.c, dkl.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ix<eis> a() {
      return this.g;
   }

   public eiq a(ayk $$0) {
      return (eiq)this.f.get($$0.a(this.f.size()));
   }

   public List<eiq> b(ayk $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ayx {
      a("terrain_matching", ImmutableList.of(new ekq(dwt.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ayx.a<eis.a> c = ayx.a(eis.a::values);
      private final String d;
      private final ImmutableList<elg> e;

      private a(String $$0, ImmutableList<elg> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eis.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<elg> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
