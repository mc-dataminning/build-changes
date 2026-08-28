import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class epm {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jq<epm>>> d = new MutableObject();
   public static final Codec<epm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(epm::a),
               Codec.mapPair(epk.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, epm::new)
   );
   public static final Codec<jq<epm>> b = ae.a(alv.a(mb.aW, a), d::setValue);
   private final List<Pair<epk, Integer>> e;
   private final ObjectArrayList<epk> f;
   private final jq<epm> g;
   private int h = Integer.MIN_VALUE;

   public epm(jq<epm> $$0, List<Pair<epk, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<epk, Integer> $$2 : $$1) {
         epk $$3 = (epk)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public epm(jq<epm> $$0, List<Pair<Function<epm.a, ? extends epk>, Integer>> $$1, epm.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<epm.a, ? extends epk>, Integer> $$3 : $$1) {
         epk $$4 = (epk)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(esf $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != epd.b).mapToInt($$1 -> $$1.a($$0, jh.c, dqu.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jq<epm> a() {
      return this.g;
   }

   public epk a(bam $$0) {
      return (epk)(this.f.isEmpty() ? epd.b : (epk)this.f.get($$0.a(this.f.size())));
   }

   public List<epk> b(bam $$0) {
      return ae.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bba {
      a("terrain_matching", ImmutableList.of(new erk(edi.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bba.a<epm.a> c = bba.a(epm.a::values);
      private final String d;
      private final ImmutableList<esb> e;

      private a(final String $$0, final ImmutableList<esb> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static epm.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<esb> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
