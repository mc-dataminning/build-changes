import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dea extends cuh {
   public static final MapCodec<dea> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dhl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dea::new)
   );
   public static final dhw f = dhm.aT;
   private final int g;

   @Override
   public MapCodec<dea> a() {
      return e;
   }

   protected dea(int $$0, dhl $$1, dgv.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(crs $$0, ht $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bki.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ati.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dgw $$0) {
      return $$0.c(f);
   }

   @Override
   protected dgw a(dgw $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f);
   }
}
