import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ehp {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<iv<ehp>>> d = new MutableObject();
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(d::getValue).fieldOf("fallback").forGetter(ehp::a),
               Codec.mapPair(ehn.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehp::new)
   );
   public static final Codec<iv<ehp>> b = ac.a(akb.a(ld.aL, a), d::setValue);
   private final List<Pair<ehn, Integer>> e;
   private final ObjectArrayList<ehn> f;
   private final iv<ehp> g;
   private int h = Integer.MIN_VALUE;

   public ehp(iv<ehp> $$0, List<Pair<ehn, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ehn, Integer> $$2 : $$1) {
         ehn $$3 = (ehn)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ehp(iv<ehp> $$0, List<Pair<Function<ehp.a, ? extends ehn>, Integer>> $$1, ehp.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ehp.a, ? extends ehn>, Integer> $$3 : $$1) {
         ehn $$4 = (ehn)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ekh $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ehg.b).mapToInt($$1 -> $$1.a($$0, im.c, dji.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public iv<ehp> a() {
      return this.g;
   }

   public ehn a(ayd $$0) {
      return (ehn)this.f.get($$0.a(this.f.size()));
   }

   public List<ehn> b(ayd $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ayq {
      a("terrain_matching", ImmutableList.of(new ejn(dvq.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ayq.a<ehp.a> c = ayq.a(ehp.a::values);
      private final String d;
      private final ImmutableList<ekd> e;

      private a(String $$0, ImmutableList<ekd> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ehp.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ekd> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
