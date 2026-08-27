import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class eax {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ih<eax>>> d = new MutableObject();
   public static final Codec<eax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.a(d::getValue).fieldOf("fallback").forGetter(eax::a),
               Codec.mapPair(eav.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eax::new)
   );
   public static final Codec<ih<eax>> b = ac.a(ahd.a(ke.aG, a), d::setValue);
   private final List<Pair<eav, Integer>> e;
   private final ObjectArrayList<eav> f;
   private final ih<eax> g;
   private int h = Integer.MIN_VALUE;

   public eax(ih<eax> $$0, List<Pair<eav, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<eav, Integer> $$2 : $$1) {
         eav $$3 = (eav)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public eax(ih<eax> $$0, List<Pair<Function<eax.a, ? extends eav>, Integer>> $$1, eax.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<eax.a, ? extends eav>, Integer> $$3 : $$1) {
         eav $$4 = (eav)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(edp $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != eao.b).mapToInt($$1 -> $$1.a($$0, hx.b, ddk.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ih<eax> a() {
      return this.g;
   }

   public eav a(auw $$0) {
      return (eav)this.f.get($$0.a(this.f.size()));
   }

   public List<eav> b(auw $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements avl {
      a("terrain_matching", ImmutableList.of(new ecv(doy.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final avl.a<eax.a> c = avl.a(eax.a::values);
      private final String d;
      private final ImmutableList<edl> e;

      private a(String $$0, ImmutableList<edl> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static eax.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<edl> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
