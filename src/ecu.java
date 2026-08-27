import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ecu {
   private static final int c = Integer.MIN_VALUE;
   private static final MutableObject<Codec<ij<ecu>>> d = new MutableObject();
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.a(d::getValue).fieldOf("fallback").forGetter(ecu::a),
               Codec.mapPair(ecs.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecu::new)
   );
   public static final Codec<ij<ecu>> b = ac.a(aiu.a(kg.aG, a), d::setValue);
   private final List<Pair<ecs, Integer>> e;
   private final ObjectArrayList<ecs> f;
   private final ij<ecu> g;
   private int h = Integer.MIN_VALUE;

   public ecu(ij<ecu> $$0, List<Pair<ecs, Integer>> $$1) {
      this.e = $$1;
      this.f = new ObjectArrayList();

      for (Pair<ecs, Integer> $$2 : $$1) {
         ecs $$3 = (ecs)$$2.getFirst();

         for (int $$4 = 0; $$4 < $$2.getSecond(); $$4++) {
            this.f.add($$3);
         }
      }

      this.g = $$0;
   }

   public ecu(ij<ecu> $$0, List<Pair<Function<ecu.a, ? extends ecs>, Integer>> $$1, ecu.a $$2) {
      this.e = Lists.newArrayList();
      this.f = new ObjectArrayList();

      for (Pair<Function<ecu.a, ? extends ecs>, Integer> $$3 : $$1) {
         ecs $$4 = (ecs)((Function)$$3.getFirst()).apply($$2);
         this.e.add(Pair.of($$4, (Integer)$$3.getSecond()));

         for (int $$5 = 0; $$5 < $$3.getSecond(); $$5++) {
            this.f.add($$4);
         }
      }

      this.g = $$0;
   }

   public int a(efm $$0) {
      if (this.h == Integer.MIN_VALUE) {
         this.h = this.f.stream().filter($$0x -> $$0x != ecl.b).mapToInt($$1 -> $$1.a($$0, hz.c, dfe.a).e()).max().orElse(0);
      }

      return this.h;
   }

   public ij<ecu> a() {
      return this.g;
   }

   public ecs a(awp $$0) {
      return (ecs)this.f.get($$0.a(this.f.size()));
   }

   public List<ecs> b(awp $$0) {
      return ac.a(this.f, $$0);
   }

   public int b() {
      return this.f.size();
   }

   public static enum a implements axc {
      a("terrain_matching", ImmutableList.of(new ees(dqv.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final axc.a<ecu.a> c = axc.a(ecu.a::values);
      private final String d;
      private final ImmutableList<efi> e;

      private a(String $$0, ImmutableList<efi> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static ecu.a a(String $$0) {
         return c.a($$0);
      }

      public ImmutableList<efi> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
