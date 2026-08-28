import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class emq {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jo<emq>>> d = new MutableObject();
   public static final Codec<emq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(emq::a),
               Codec.mapPair(emo.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emq::new)
   );
   public static final Codec<jo<emq>> b = ad.a(ala.a(lw.aW, a), d::setValue);
   private final List<Pair<emo, Integer>> e;
   private final ObjectArrayList<emo> f;
   private final jo<emq> g;
   private int h = Integer.MIN_VALUE;

   public emq(jo<emq> $$0, List<Pair<emo, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<emo, Integer> $$2 : $$1) {
         emo $$3 = (emo)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public emq(jo<emq> $$0, List<Pair<Function<emq.a, ? extends emo>, Integer>> $$1, emq.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<emq.a, ? extends emo>, Integer> $$3 : $$1) {
         emo $$4 = (emo)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(epj $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != emh.b).mapToInt($$1 -> $$1.a($$0, jf.c, doa.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jo<emq> a() {
      return this.g;
   }

   public emo a(azn $$0) {
      return (emo)(this.f.isEmpty() ? emh.b : (emo)this.f.get($$0.a(this.f.size())));
   }

   public List<emo> b(azn $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements bab {
      a("terrain_matching", ImmutableList.of(new eoo(eao.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bab.a<emq.a> c = bab.a(emq.a::values);
      private final String d;
      private final ImmutableList<epf> e;

      private a(final String $$0, final ImmutableList<epf> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static emq.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<epf> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
