import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dye {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ib<dye>>> d = new MutableObject();
   public static final Codec<dye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.a(d::getValue).fieldOf("fallback").forGetter(dye::a),
               Codec.mapPair(dyc.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dye::new)
   );
   public static final Codec<ib<dye>> b = ac.a(agc.a(jz.aE, a), d::setValue);
   private final List<Pair<dyc, Integer>> e;
   private final ObjectArrayList<dyc> f;
   private final ib<dye> g;
   private int h = Integer.MIN_VALUE;

   public dye(ib<dye> $$0, List<Pair<dyc, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<dyc, Integer> $$2 : $$1) {
         dyc $$3 = (dyc)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public dye(ib<dye> $$0, List<Pair<Function<dye.a, ? extends dyc>, Integer>> $$1, dye.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<dye.a, ? extends dyc>, Integer> $$3 : $$1) {
         dyc $$4 = (dyc)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(eaw $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != dxv.b).mapToInt($$1 -> $$1.a($$0, ht.b, dbf.a).d()).max().orElse(0);
      }

      return this.h;
   }

   public ib<dye> a() {
      return this.g;
   }

   public dyc a(ato $$0) {
      return (dyc)this.f.get($$0.a(this.f.size()));
   }

   public List<dyc> b(ato $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements aub {
      a("terrain_matching", ImmutableList.of(new eac(dmf.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final aub.a<dye.a> c = aub.a(dye.a::values);
      private final String d;
      private final ImmutableList<eas> e;

      private a(String $$0, ImmutableList<eas> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dye.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<eas> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
