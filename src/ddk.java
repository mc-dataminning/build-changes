import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddk(List<bvx> c, float f) implements ddm {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvx.d.listOf().fieldOf("effects").forGetter(ddk::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(ddk::c))
            .apply($$0, ddk::new)
   );
   public static final yy<wl, ddk> b = yy.a(bvx.e.a(yw.a()), ddk::b, yw.l, ddk::c, ddk::new);

   public ddk(bvx $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public ddk(List<bvx> $$0) {
      this($$0, 1.0F);
   }

   public ddk(bvx $$0) {
      this($$0, 1.0F);
   }

   @Override
   public ddm.a<ddk> a() {
      return ddm.a.a;
   }

   @Override
   public boolean a(djx $$0, czy $$1, bxu $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bvx $$4 : this.c) {
            if ($$2.a(new bvx($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bvx> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
