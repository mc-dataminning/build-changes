import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dru extends dhs {
   public static final MapCodec<dru> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dvy.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dru::new)
   );
   public static final dwj f = dvz.aT;
   private final int g;

   @Override
   public MapCodec<dru> a() {
      return e;
   }

   protected dru(int $$0, dvy $$1, dvi.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dfb $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bue.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azk.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dvj $$0) {
      return $$0.c(f);
   }

   @Override
   protected dvj a(dvj $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f);
   }
}
