import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcz(List<bvm> c, float f) implements ddb {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvm.d.listOf().fieldOf("effects").forGetter(dcz::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dcz::c))
            .apply($$0, dcz::new)
   );
   public static final yw<wj, dcz> b = yw.a(bvm.e.a(yu.a()), dcz::b, yu.l, dcz::c, dcz::new);

   public dcz(bvm $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dcz(List<bvm> $$0) {
      this($$0, 1.0F);
   }

   public dcz(bvm $$0) {
      this($$0, 1.0F);
   }

   @Override
   public ddb.a<dcz> a() {
      return ddb.a.a;
   }

   @Override
   public boolean a(djm $$0, czn $$1, bxj $$2) {
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
