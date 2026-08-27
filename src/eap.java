import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eap {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ih<eap>>> d = new MutableObject();
   public static final Codec<eap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atw.a(d::getValue).fieldOf("fallback").forGetter(eap::a),
               Codec.mapPair(ean.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eap::new)
   );
   public static final Codec<ih<eap>> b = ac.a(ahc.a(ke.aG, a), d::setValue);
   private final List<Pair<ean, Integer>> e;
   private final ObjectArrayList<ean> f;
   private final ih<eap> g;
   private int h = Integer.MIN_VALUE;

   public eap(ih<eap> $$0, List<Pair<ean, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ean, Integer> $$2 : $$1) {
         ean $$3 = (ean)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eap(ih<eap> $$0, List<Pair<Function<eap.a, ? extends ean>, Integer>> $$1, eap.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eap.a, ? extends ean>, Integer> $$3 : $$1) {
         ean $$4 = (ean)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(edh $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eag.b).mapToInt($$1 -> $$1.a($$0, hx.b, ddc.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ih<eap> a() {
      return this.g;
   }

   public ean a(auv $$0) {
      return (ean)this.f.get($$0.a(this.f.size()));
   }

   public List<ean> b(auv $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements avk {
      a("terrain_matching", ImmutableList.of(new ecn(doq.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final avk.a<eap.a> c = avk.a(eap.a::values);
      private final String d;
      private final ImmutableList<edd> e;

      private a(String $$0, ImmutableList<edd> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eap.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<edd> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
