import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class enl {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jq<enl>>> d = new MutableObject();
   public static final Codec<enl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(enl::a),
               Codec.mapPair(enj.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, enl::new)
   );
   public static final Codec<jq<enl>> b = ae.a(alh.a(ma.aV, a), d::setValue);
   private final List<Pair<enj, Integer>> e;
   private final ObjectArrayList<enj> f;
   private final jq<enl> g;
   private int h = Integer.MIN_VALUE;

   public enl(jq<enl> $$0, List<Pair<enj, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<enj, Integer> $$2 : $$1) {
         enj $$3 = (enj)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public enl(jq<enl> $$0, List<Pair<Function<enl.a, ? extends enj>, Integer>> $$1, enl.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<enl.a, ? extends enj>, Integer> $$3 : $$1) {
         enj $$4 = (enj)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eqe $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != enc.b).mapToInt($$1 -> $$1.a($$0, jh.c, dow.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jq<enl> a() {
      return this.g;
   }

   public enj a(azv $$0) {
      return (enj)(this.f.isEmpty() ? enc.b : (enj)this.f.get($$0.a(this.f.size())));
   }

   public List<enj> b(azv $$0) {
      return ae.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements baj {
      a("terrain_matching", ImmutableList.of(new epj(ebj.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final baj.a<enl.a> c = baj.a(enl.a::values);
      private final String d;
      private final ImmutableList<eqa> e;

      private a(final String $$0, final ImmutableList<eqa> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static enl.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eqa> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
