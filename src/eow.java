import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eow {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jr<eow>>> d = new MutableObject();
   public static final Codec<eow> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(eow::a),
               Codec.mapPair(eou.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eow::new)
   );
   public static final Codec<jr<eow>> b = af.a(akr.a(mc.aX, a), d::setValue);
   private final List<Pair<eou, Integer>> e;
   private final ObjectArrayList<eou> f;
   private final jr<eow> g;
   private int h = Integer.MIN_VALUE;

   public eow(jr<eow> $$0, List<Pair<eou, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eou, Integer> $$2 : $$1) {
         eou $$3 = (eou)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eow(jr<eow> $$0, List<Pair<Function<eow.a, ? extends eou>, Integer>> $$1, eow.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eow.a, ? extends eou>, Integer> $$3 : $$1) {
         eou $$4 = (eou)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(erp $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eon.b).mapToInt($$1 -> $$1.a($$0, ji.c, dqe.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jr<eow> a() {
      return this.g;
   }

   public eou a(azh $$0) {
      return (eou)(this.f.isEmpty() ? eon.b : (eou)this.f.get($$0.a(this.f.size())));
   }

   public List<eou> b(azh $$0) {
      return af.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azv {
      a("terrain_matching", ImmutableList.of(new equ(ecs.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azv.a<eow.a> c = azv.a(eow.a::values);
      private final String d;
      private final ImmutableList<erl> e;

      private a(final String $$0, final ImmutableList<erl> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eow.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<erl> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
