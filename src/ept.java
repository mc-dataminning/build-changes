import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ept {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jr<ept>>> d = new MutableObject();
   public static final Codec<ept> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ept::a),
               Codec.mapPair(epr.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ept::new)
   );
   public static final Codec<jr<ept>> b = af.a(akq.a(mc.aZ, a), d::setValue);
   private final List<Pair<epr, Integer>> e;
   private final ObjectArrayList<epr> f;
   private final jr<ept> g;
   private int h = Integer.MIN_VALUE;

   public ept(jr<ept> $$0, List<Pair<epr, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<epr, Integer> $$2 : $$1) {
         epr $$3 = (epr)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ept(jr<ept> $$0, List<Pair<Function<ept.a, ? extends epr>, Integer>> $$1, ept.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ept.a, ? extends epr>, Integer> $$3 : $$1) {
         epr $$4 = (epr)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(esm $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != epk.b).mapToInt($$1 -> $$1.a($$0, ji.c, dqw.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jr<ept> a() {
      return this.g;
   }

   public epr a(azh $$0) {
      return (epr)(this.f.isEmpty() ? epk.b : (epr)this.f.get($$0.a(this.f.size())));
   }

   public List<epr> b(azh $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azv {
      a("terrain_matching", ImmutableList.of(new err(edo.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azv.a<ept.a> c = azv.a(ept.a::values);
      private final String d;
      private final ImmutableList<esi> e;

      private a(final String $$0, final ImmutableList<esi> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ept.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<esi> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
