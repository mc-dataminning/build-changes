import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dca(List<dca.a> e) implements dbe, dcd {
   public static final dca a = new dca(List.of());
   public static final int b = 160;
   public static final Codec<dca> c = dca.a.a.listOf().xmap(dca::new, dca::a);
   public static final yw<wj, dca> d = dca.a.b.a(yu.a()).a(dca::new, dca::a);

   public dca a(dca.a $$0) {
      return new dca(af.a(this.e, $$0));
   }

   @Override
   public void a(div $$0, bxc $$1, cyy $$2, dbd $$3) {
      for (dca.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      if ($$2.b()) {
         List<bvh> $$4 = new ArrayList<>();

         for (dca.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dau.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dca.a> a() {
      return this.e;
   }

   public static record a(je<bvf> c, int d) {
      public static final Codec<dca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvf.a.fieldOf("id").forGetter(dca.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dca.a::c))
               .apply($$0, dca.a::new)
      );
      public static final yw<wj, dca.a> b = yw.a(bvf.b, dca.a::b, yu.h, dca.a::c, dca.a::new);

      public bvh a() {
         return new bvh(this.c, this.d);
      }

      public je<bvf> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
