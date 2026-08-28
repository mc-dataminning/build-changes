import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dce(List<bve> c, float f) implements dcg {
   public static final MapCodec<dce> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bve.d.listOf().fieldOf("effects").forGetter(dce::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dce::c))
            .apply($$0, dce::new)
   );
   public static final yu<wh, dce> b = yu.a(bve.e.a(ys.a()), dce::b, ys.l, dce::c, dce::new);

   public dce(bve $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dce(List<bve> $$0) {
      this($$0, 1.0F);
   }

   public dce(bve $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dcg.a<dce> a() {
      return dcg.a.a;
   }

   @Override
   public boolean a(dip $$0, cys $$1, bwz $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bve $$4 : this.c) {
            if ($$2.a(new bve($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bve> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
