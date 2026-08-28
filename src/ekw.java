import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ekw {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jm<ekw>>> d = new MutableObject();
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ekw::a),
               Codec.mapPair(eku.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ekw::new)
   );
   public static final Codec<jm<ekw>> b = ad.a(akm.a(lu.aU, a), d::setValue);
   private final List<Pair<eku, Integer>> e;
   private final ObjectArrayList<eku> f;
   private final jm<ekw> g;
   private int h = Integer.MIN_VALUE;

   public ekw(jm<ekw> $$0, List<Pair<eku, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eku, Integer> $$2 : $$1) {
         eku $$3 = (eku)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ekw(jm<ekw> $$0, List<Pair<Function<ekw.a, ? extends eku>, Integer>> $$1, ekw.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ekw.a, ? extends eku>, Integer> $$3 : $$1) {
         eku $$4 = (eku)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eno $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ekn.b).mapToInt($$1 -> $$1.a($$0, jd.c, dmk.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jm<ekw> a() {
      return this.g;
   }

   public eku a(ayv $$0) {
      return (eku)(this.f.isEmpty() ? ekn.b : (eku)this.f.get($$0.a(this.f.size())));
   }

   public List<eku> b(ayv $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azj {
      a("terrain_matching", ImmutableList.of(new emu(dyv.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azj.a<ekw.a> c = azj.a(ekw.a::values);
      private final String d;
      private final ImmutableList<enk> e;

      private a(final String $$0, final ImmutableList<enk> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ekw.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<enk> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
