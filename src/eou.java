import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eou {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jr<eou>>> d = new MutableObject();
   public static final Codec<eou> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(eou::a),
               Codec.mapPair(eos.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eou::new)
   );
   public static final Codec<jr<eou>> b = af.a(akq.a(mc.aX, a), d::setValue);
   private final List<Pair<eos, Integer>> e;
   private final ObjectArrayList<eos> f;
   private final jr<eou> g;
   private int h = Integer.MIN_VALUE;

   public eou(jr<eou> $$0, List<Pair<eos, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eos, Integer> $$2 : $$1) {
         eos $$3 = (eos)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eou(jr<eou> $$0, List<Pair<Function<eou.a, ? extends eos>, Integer>> $$1, eou.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eou.a, ? extends eos>, Integer> $$3 : $$1) {
         eos $$4 = (eos)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ern $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eol.b).mapToInt($$1 -> $$1.a($$0, ji.c, dqc.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jr<eou> a() {
      return this.g;
   }

   public eos a(azg $$0) {
      return (eos)(this.f.isEmpty() ? eol.b : (eos)this.f.get($$0.a(this.f.size())));
   }

   public List<eos> b(azg $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azu {
      a("terrain_matching", ImmutableList.of(new eqs(ecq.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azu.a<eou.a> c = azu.a(eou.a::values);
      private final String d;
      private final ImmutableList<erj> e;

      private a(final String $$0, final ImmutableList<erj> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eou.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<erj> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
