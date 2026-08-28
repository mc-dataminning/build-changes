import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddm(List<bvz> c, float f) implements ddo {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvz.d.listOf().fieldOf("effects").forGetter(ddm::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(ddm::c))
            .apply($$0, ddm::new)
   );
   public static final za<wn, ddm> b = za.a(bvz.e.a(yy.a()), ddm::b, yy.l, ddm::c, ddm::new);

   public ddm(bvz $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public ddm(List<bvz> $$0) {
      this($$0, 1.0F);
   }

   public ddm(bvz $$0) {
      this($$0, 1.0F);
   }

   @Override
   public ddo.a<ddm> a() {
      return ddo.a.a;
   }

   @Override
   public boolean a(djz $$0, daa $$1, bxw $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bvz $$4 : this.c) {
            if ($$2.a(new bvz($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bvz> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
