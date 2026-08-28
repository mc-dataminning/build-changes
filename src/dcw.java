import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcw(List<bvm> c, float f) implements dcy {
   public static final MapCodec<dcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvm.d.listOf().fieldOf("effects").forGetter(dcw::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dcw::c))
            .apply($$0, dcw::new)
   );
   public static final yw<wj, dcw> b = yw.a(bvm.e.a(yu.a()), dcw::b, yu.l, dcw::c, dcw::new);

   public dcw(bvm $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dcw(List<bvm> $$0) {
      this($$0, 1.0F);
   }

   public dcw(bvm $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dcy.a<dcw> a() {
      return dcy.a.a;
   }

   @Override
   public boolean a(djh $$0, czk $$1, bxj $$2) {
      if ($$2.dX().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bvm $$4 : this.c) {
            if ($$2.a(new bvm($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bvm> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
