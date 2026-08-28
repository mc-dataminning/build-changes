import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eox {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jr<eox>>> d = new MutableObject();
   public static final Codec<eox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(eox::a),
               Codec.mapPair(eov.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eox::new)
   );
   public static final Codec<jr<eox>> b = af.a(akr.a(mc.aX, a), d::setValue);
   private final List<Pair<eov, Integer>> e;
   private final ObjectArrayList<eov> f;
   private final jr<eox> g;
   private int h = Integer.MIN_VALUE;

   public eox(jr<eox> $$0, List<Pair<eov, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eov, Integer> $$2 : $$1) {
         eov $$3 = (eov)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eox(jr<eox> $$0, List<Pair<Function<eox.a, ? extends eov>, Integer>> $$1, eox.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eox.a, ? extends eov>, Integer> $$3 : $$1) {
         eov $$4 = (eov)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(erq $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eoo.b).mapToInt($$1 -> $$1.a($$0, ji.c, dqf.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jr<eox> a() {
      return this.g;
   }

   public eov a(azh $$0) {
      return (eov)(this.f.isEmpty() ? eoo.b : (eov)this.f.get($$0.a(this.f.size())));
   }

   public List<eov> b(azh $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azv {
      a("terrain_matching", ImmutableList.of(new eqv(ect.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azv.a<eox.a> c = azv.a(eox.a::values);
      private final String d;
      private final ImmutableList<erm> e;

      private a(final String $$0, final ImmutableList<erm> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eox.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<erm> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
