import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class egz {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<in<egz>>> d = new MutableObject();
   public static final Codec<egz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(d::getValue).fieldOf("fallback").forGetter(egz::a),
               Codec.mapPair(egx.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egz::new)
   );
   public static final Codec<in<egz>> b = ac.a(ajr.a(ku.aJ, a), d::setValue);
   private final List<Pair<egx, Integer>> e;
   private final ObjectArrayList<egx> f;
   private final in<egz> g;
   private int h = Integer.MIN_VALUE;

   public egz(in<egz> $$0, List<Pair<egx, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<egx, Integer> $$2 : $$1) {
         egx $$3 = (egx)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public egz(in<egz> $$0, List<Pair<Function<egz.a, ? extends egx>, Integer>> $$1, egz.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<egz.a, ? extends egx>, Integer> $$3 : $$1) {
         egx $$4 = (egx)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ejr $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != egq.b).mapToInt($$1 -> $$1.a($$0, id.c, dit.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public in<egz> a() {
      return this.g;
   }

   public egx a(axt $$0) {
      return (egx)this.f.get($$0.a(this.f.size()));
   }

   public List<egx> b(axt $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ayg {
      a("terrain_matching", ImmutableList.of(new eix(dva.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ayg.a<egz.a> c = ayg.a(egz.a::values);
      private final String d;
      private final ImmutableList<ejn> e;

      private a(String $$0, ImmutableList<ejn> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static egz.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ejn> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
