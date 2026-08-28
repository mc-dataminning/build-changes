import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class enb {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<jp<enb>>> d = new MutableObject();
   public static final Codec<enb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(enb::a),
               Codec.mapPair(emz.f.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, enb::new)
   );
   public static final Codec<jp<enb>> b = ad.a(ald.a(ly.aV, a), d::setValue);
   private final List<Pair<emz, Integer>> e;
   private final ObjectArrayList<emz> f;
   private final jp<enb> g;
   private int h = Integer.MIN_VALUE;

   public enb(jp<enb> $$0, List<Pair<emz, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<emz, Integer> $$2 : $$1) {
         emz $$3 = (emz)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public enb(jp<enb> $$0, List<Pair<Function<enb.a, ? extends emz>, Integer>> $$1, enb.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<enb.a, ? extends emz>, Integer> $$3 : $$1) {
         emz $$4 = (emz)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(epu $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ems.b).mapToInt($$1 -> $$1.a($$0, jg.c, dol.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public jp<enb> a() {
      return this.g;
   }

   public emz a(azr $$0) {
      return (emz)(this.f.isEmpty() ? ems.b : (emz)this.f.get($$0.a(this.f.size())));
   }

   public List<emz> b(azr $$0) {
      return ad.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements baf {
      a("terrain_matching", ImmutableList.of(new eoz(eaz.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final baf.a<enb.a> c = baf.a(enb.a::values);
      private final String d;
      private final ImmutableList<epq> e;

      private a(final String $$0, final ImmutableList<epq> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static enb.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<epq> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
