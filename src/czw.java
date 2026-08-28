import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czw(List<btq> c, float f) implements czy {
   public static final MapCodec<czw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btq.d.listOf().fieldOf("effects").forGetter(czw::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czw::c))
            .apply($$0, czw::new)
   );
   public static final zh<wu, czw> b = zh.a(btq.e.a(zf.a()), czw::b, zf.k, czw::c, czw::new);

   public czw(btq $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czw(List<btq> $$0) {
      this($$0, 1.0F);
   }

   public czw(btq $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czy.a<czw> a() {
      return czy.a.a;
   }

   @Override
   public boolean a(dfm $$0, cwm $$1, bvh $$2) {
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
