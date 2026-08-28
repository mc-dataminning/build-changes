import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czx(List<bto> c, float f) implements czz {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bto.d.listOf().fieldOf("effects").forGetter(czx::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czx::c))
            .apply($$0, czx::new)
   );
   public static final ym<vz, czx> b = ym.a(bto.e.a(yk.a()), czx::b, yk.l, czx::c, czx::new);

   public czx(bto $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czx(List<bto> $$0) {
      this($$0, 1.0F);
   }

   public czx(bto $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czz.a<czx> a() {
      return czz.a.a;
   }

   @Override
   public boolean a(dgg $$0, cwn $$1, bvf $$2) {
      if ($$2.dZ().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bto $$4 : this.c) {
            if ($$2.a(new bto($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bto> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
