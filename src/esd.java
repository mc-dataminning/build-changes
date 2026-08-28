import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class esd {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<je<esd>>> d = new MutableObject();
   public static final Codec<esd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(esd::a),
               Codec.mapPair(esb.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, esd::new)
   );
   public static final Codec<je<esd>> b = af.a(alc.a(mg.be, a), d::setValue);
   private final List<Pair<esb, Integer>> e;
   private final ObjectArrayList<esb> f;
   private final je<esd> g;
   private int h = Integer.MIN_VALUE;

   public esd(je<esd> $$0, List<Pair<esb, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<esb, Integer> $$2 : $$1) {
         esb $$3 = (esb)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public esd(je<esd> $$0, List<Pair<Function<esd.a, ? extends esb>, Integer>> $$1, esd.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<esd.a, ? extends esb>, Integer> $$3 : $$1) {
         esb $$4 = (esb)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(euw $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eru.b).mapToInt($$1 -> $$1.a($$0, iu.c, dst.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public je<esd> a() {
      return this.g;
   }

   public esb a(azv $$0) {
      return (esb)(this.f.isEmpty() ? eru.b : (esb)this.f.get($$0.a(this.f.size())));
   }

   public List<esb> b(azv $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bak {
      a("terrain_matching", ImmutableList.of(new eub(efy.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bak.a<esd.a> c = bak.a(esd.a::values);
      private final String d;
      private final ImmutableList<eus> e;

      private a(final String $$0, final ImmutableList<eus> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static esd.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eus> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
