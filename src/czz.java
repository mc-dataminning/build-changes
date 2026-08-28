import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czz(List<btq> c, float f) implements dab {
   public static final MapCodec<czz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btq.d.listOf().fieldOf("effects").forGetter(czz::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czz::c))
            .apply($$0, czz::new)
   );
   public static final yn<wa, czz> b = yn.a(btq.e.a(yl.a()), czz::b, yl.l, czz::c, czz::new);

   public czz(btq $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czz(List<btq> $$0) {
      this($$0, 1.0F);
   }

   public czz(btq $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dab.a<czz> a() {
      return dab.a.a;
   }

   @Override
   public boolean a(dgi $$0, cwp $$1, bvh $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (btq $$4 : this.c) {
            if ($$2.a(new btq($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<btq> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
