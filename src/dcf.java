import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dcf(List<dcf.a> e) implements dbj, dci {
   public static final dcf a = new dcf(List.of());
   public static final int b = 160;
   public static final Codec<dcf> c = dcf.a.a.listOf().xmap(dcf::new, dcf::a);
   public static final yw<wj, dcf> d = dcf.a.b.a(yu.a()).a(dcf::new, dcf::a);

   public dcf a(dcf.a $$0) {
      return new dcf(af.a(this.e, $$0));
   }

   @Override
   public void a(dja $$0, bxe $$1, czd $$2, dbi $$3) {
      for (dcf.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      if ($$2.b()) {
         List<bvj> $$4 = new ArrayList<>();

         for (dcf.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         daz.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dcf.a> a() {
      return this.e;
   }

   public static record a(je<bvh> c, int d) {
      public static final Codec<dcf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvh.a.fieldOf("id").forGetter(dcf.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dcf.a::c))
               .apply($$0, dcf.a::new)
      );
      public static final yw<wj, dcf.a> b = yw.a(bvh.b, dcf.a::b, yu.h, dcf.a::c, dcf.a::new);

      public bvj a() {
         return new bvj(this.c, this.d);
      }

      public je<bvh> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
