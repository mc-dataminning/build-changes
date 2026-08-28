import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czz(List<btp> c, float f) implements dab {
   public static final MapCodec<czz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btp.d.listOf().fieldOf("effects").forGetter(czz::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czz::c))
            .apply($$0, czz::new)
   );
   public static final ym<vz, czz> b = ym.a(btp.e.a(yk.a()), czz::b, yk.l, czz::c, czz::new);

   public czz(btp $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czz(List<btp> $$0) {
      this($$0, 1.0F);
   }

   public czz(btp $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dab.a<czz> a() {
      return dab.a.a;
   }

   @Override
   public boolean a(dgi $$0, cwp $$1, bvg $$2) {
      if ($$2.dZ().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (btp $$4 : this.c) {
            if ($$2.a(new btp($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<btp> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
