import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record day(List<buo> c, float f) implements dba {
   public static final MapCodec<day> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(buo.d.listOf().fieldOf("effects").forGetter(day::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(day::c))
            .apply($$0, day::new)
   );
   public static final zt<xg, day> b = zt.a(buo.e.a(zr.a()), day::b, zr.l, day::c, day::new);

   public day(buo $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public day(List<buo> $$0) {
      this($$0, 1.0F);
   }

   public day(buo $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dba.a<day> a() {
      return dba.a.a;
   }

   @Override
   public boolean a(dhh $$0, cxo $$1, bwf $$2) {
      if ($$2.dZ().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (buo $$4 : this.c) {
            if ($$2.a(new buo($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<buo> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
