import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ehy {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<iw<ehy>>> d = new MutableObject();
   public static final Codec<ehy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(d::getValue).fieldOf("fallback").forGetter(ehy::a),
               Codec.mapPair(ehw.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehy::new)
   );
   public static final Codec<iw<ehy>> b = ac.a(akd.a(le.aM, a), d::setValue);
   private final List<Pair<ehw, Integer>> e;
   private final ObjectArrayList<ehw> f;
   private final iw<ehy> g;
   private int h = Integer.MIN_VALUE;

   public ehy(iw<ehy> $$0, List<Pair<ehw, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ehw, Integer> $$2 : $$1) {
         ehw $$3 = (ehw)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ehy(iw<ehy> $$0, List<Pair<Function<ehy.a, ? extends ehw>, Integer>> $$1, ehy.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ehy.a, ? extends ehw>, Integer> $$3 : $$1) {
         ehw $$4 = (ehw)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(ekq $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ehp.b).mapToInt($$1 -> $$1.a($$0, in.c, djr.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public iw<ehy> a() {
      return this.g;
   }

   public ehw a(ayg $$0) {
      return (ehw)this.f.get($$0.a(this.f.size()));
   }

   public List<ehw> b(ayg $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements ayt {
      a("terrain_matching", ImmutableList.of(new ejw(dvz.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final ayt.a<ehy.a> c = ayt.a(ehy.a::values);
      private final String d;
      private final ImmutableList<ekm> e;

      private a(String $$0, ImmutableList<ekm> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ehy.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<ekm> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
