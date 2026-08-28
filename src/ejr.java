import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ejr {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ji<ejr>>> d = new MutableObject();
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ejr::a),
               Codec.mapPair(ejp.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejr::new)
   );
   public static final Codec<ji<ejr>> b = ac.a(ala.a(lq.aM, a), d::setValue);
   private final List<Pair<ejp, Integer>> e;
   private final ObjectArrayList<ejp> f;
   private final ji<ejr> g;
   private int h = Integer.MIN_VALUE;

   public ejr(ji<ejr> $$0, List<Pair<ejp, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ejp, Integer> $$2 : $$1) {
         ejp $$3 = (ejp)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ejr(ji<ejr> $$0, List<Pair<Function<ejr.a, ? extends ejp>, Integer>> $$1, ejr.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ejr.a, ? extends ejp>, Integer> $$3 : $$1) {
         ejp $$4 = (ejp)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(emj $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eji.b).mapToInt($$1 -> $$1.a($$0, iz.c, dlk.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ji<ejr> a() {
      return this.g;
   }

   public ejp a(azf $$0) {
      return (ejp)this.f.get($$0.a(this.f.size()));
   }

   public List<ejp> b(azf $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azs {
      a("terrain_matching", ImmutableList.of(new elp(dxs.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azs.a<ejr.a> c = azs.a(ejr.a::values);
      private final String d;
      private final ImmutableList<emf> e;

      private a(final String $$0, final ImmutableList<emf> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ejr.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emf> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
