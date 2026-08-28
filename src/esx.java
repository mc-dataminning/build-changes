import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class esx {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jf<esx>>> d = new MutableObject();
   public static final Codec<esx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(esx::b),
               Codec.mapPair(esv.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, esx::new)
   );
   public static final Codec<jf<esx>> b = ag.a(alc.a(mh.bf, a), d::setValue);
   private final List<Pair<esv, Integer>> e;
   private final ObjectArrayList<esv> f;
   private final jf<esx> g;
   private int h = Integer.MIN_VALUE;

   public esx(jf<esx> $$0, List<Pair<esv, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<esv, Integer> $$2 : $$1) {
         esv $$3 = (esv)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public esx(jf<esx> $$0, List<Pair<Function<esx.a, ? extends esv>, Integer>> $$1, esx.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<esx.a, ? extends esv>, Integer> $$3 : $$1) {
         esv $$4 = (esv)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(evq $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eso.b).mapToInt($$1 -> $$1.a($$0, iv.c, dtl.a).e()).max().orElse(0);
      }

      return this.h;
   }

   @VisibleForTesting
   public List<Pair<esv, Integer>> a() {
      return this.e;
   }

   public jf<esx> b() {
      return this.g;
   }

   public esv a(azv $$0) {
      return (esv)(this.f.isEmpty() ? eso.b : (esv)this.f.get($$0.a(this.f.size())));
   }

   public List<esv> b(azv $$0) {
      return ag.a(this.f, $$0);
   }

   public int c() {
      return this.f.size();
   }

   public static enum a implements bak {
      a("terrain_matching", ImmutableList.of(new euv(egs.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final bak.a<esx.a> c = bak.a(esx.a::values);
      private final String d;
      private final ImmutableList<evm> e;

      private a(final String $$0, final ImmutableList<evm> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static esx.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<evm> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
