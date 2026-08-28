import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcp(List<bvj> c, float f) implements dcr {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvj.d.listOf().fieldOf("effects").forGetter(dcp::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dcp::c))
            .apply($$0, dcp::new)
   );
   public static final yw<wj, dcp> b = yw.a(bvj.e.a(yu.a()), dcp::b, yu.l, dcp::c, dcp::new);

   public dcp(bvj $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dcp(List<bvj> $$0) {
      this($$0, 1.0F);
   }

   public dcp(bvj $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dcr.a<dcp> a() {
      return dcr.a.a;
   }

   @Override
   public boolean a(dja $$0, czd $$1, bxe $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bvj $$4 : this.c) {
            if ($$2.a(new bvj($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bvj> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
