import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dcm(List<dcm.a> e) implements dbq, dcp {
   public static final dcm a = new dcm(List.of());
   public static final int b = 160;
   public static final Codec<dcm> c = dcm.a.a.listOf().xmap(dcm::new, dcm::a);
   public static final yw<wj, dcm> d = dcm.a.b.a(yu.a()).a(dcm::new, dcm::a);

   public dcm a(dcm.a $$0) {
      return new dcm(ag.a(this.e, $$0));
   }

   @Override
   public void a(djh $$0, bxj $$1, czk $$2, dbp $$3) {
      for (dcm.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      if ($$2.b()) {
         List<bvm> $$4 = new ArrayList<>();

         for (dcm.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dbg.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dcm.a> a() {
      return this.e;
   }

   public static record a(jf<bvk> c, int d) {
      public static final Codec<dcm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvk.a.fieldOf("id").forGetter(dcm.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dcm.a::c))
               .apply($$0, dcm.a::new)
      );
      public static final yw<wj, dcm.a> b = yw.a(bvk.b, dcm.a::b, yu.h, dcm.a::c, dcm.a::new);

      public bvm a() {
         return new bvm(this.c, this.d);
      }

      public jf<bvk> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
