import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czy(List<btp> c, float f) implements daa {
   public static final MapCodec<czy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btp.d.listOf().fieldOf("effects").forGetter(czy::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czy::c))
            .apply($$0, czy::new)
   );
   public static final yn<wa, czy> b = yn.a(btp.e.a(yl.a()), czy::b, yl.l, czy::c, czy::new);

   public czy(btp $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czy(List<btp> $$0) {
      this($$0, 1.0F);
   }

   public czy(btp $$0) {
      this($$0, 1.0F);
   }

   @Override
   public daa.a<czy> a() {
      return daa.a.a;
   }

   @Override
   public boolean a(dgh $$0, cwo $$1, bvg $$2) {
      if ($$2.dY().i() >= this.f) {
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
