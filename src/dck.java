import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dck(List<bvh> c, float f) implements dcm {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvh.d.listOf().fieldOf("effects").forGetter(dck::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dck::c))
            .apply($$0, dck::new)
   );
   public static final yw<wj, dck> b = yw.a(bvh.e.a(yu.a()), dck::b, yu.l, dck::c, dck::new);

   public dck(bvh $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dck(List<bvh> $$0) {
      this($$0, 1.0F);
   }

   public dck(bvh $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dcm.a<dck> a() {
      return dcm.a.a;
   }

   @Override
   public boolean a(div $$0, cyy $$1, bxc $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bvh $$4 : this.c) {
            if ($$2.a(new bvh($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bvh> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
