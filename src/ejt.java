import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ejt {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ji<ejt>>> d = new MutableObject();
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ejt::a),
               Codec.mapPair(ejr.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejt::new)
   );
   public static final Codec<ji<ejt>> b = ac.a(alb.a(lq.aM, a), d::setValue);
   private final List<Pair<ejr, Integer>> e;
   private final ObjectArrayList<ejr> f;
   private final ji<ejt> g;
   private int h = Integer.MIN_VALUE;

   public ejt(ji<ejt> $$0, List<Pair<ejr, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ejr, Integer> $$2 : $$1) {
         ejr $$3 = (ejr)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ejt(ji<ejt> $$0, List<Pair<Function<ejt.a, ? extends ejr>, Integer>> $$1, ejt.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ejt.a, ? extends ejr>, Integer> $$3 : $$1) {
         ejr $$4 = (ejr)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eml $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ejk.b).mapToInt($$1 -> $$1.a($$0, iz.c, dlm.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ji<ejt> a() {
      return this.g;
   }

   public ejr a(azh $$0) {
      return (ejr)this.f.get($$0.a(this.f.size()));
   }

   public List<ejr> b(azh $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azu {
      a("terrain_matching", ImmutableList.of(new elr(dxu.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azu.a<ejt.a> c = azu.a(ejt.a::values);
      private final String d;
      private final ImmutableList<emh> e;

      private a(final String $$0, final ImmutableList<emh> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ejt.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emh> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
