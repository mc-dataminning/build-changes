import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ejo {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ji<ejo>>> d = new MutableObject();
   public static final Codec<ejo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.lazyInitialized(d::getValue).fieldOf("fallback").forGetter(ejo::a),
               Codec.mapPair(ejm.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejo::new)
   );
   public static final Codec<ji<ejo>> b = ac.a(akx.a(lq.aM, a), d::setValue);
   private final List<Pair<ejm, Integer>> e;
   private final ObjectArrayList<ejm> f;
   private final ji<ejo> g;
   private int h = Integer.MIN_VALUE;

   public ejo(ji<ejo> $$0, List<Pair<ejm, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ejm, Integer> $$2 : $$1) {
         ejm $$3 = (ejm)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ejo(ji<ejo> $$0, List<Pair<Function<ejo.a, ? extends ejm>, Integer>> $$1, ejo.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ejo.a, ? extends ejm>, Integer> $$3 : $$1) {
         ejm $$4 = (ejm)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(emg $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ejf.b).mapToInt($$1 -> $$1.a($$0, iz.c, dlh.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ji<ejo> a() {
      return this.g;
   }

   public ejm a(azc $$0) {
      return (ejm)this.f.get($$0.a(this.f.size()));
   }

   public List<ejm> b(azc $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements azp {
      a("terrain_matching", ImmutableList.of(new elm(dxp.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final azp.a<ejo.a> c = azp.a(ejo.a::values);
      private final String d;
      private final ImmutableList<emc> e;

      private a(final String $$0, final ImmutableList<emc> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ejo.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<emc> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
