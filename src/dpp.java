import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpp extends dfm {
   public static final MapCodec<dpp> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dpp::new)
   );
   public static final duc f = dts.aT;
   private final int g;

   @Override
   public MapCodec<dpp> a() {
      return e;
   }

   protected dpp(int $$0, dtr $$1, dtb.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dcw $$0, jd $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bsr.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayo.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dtc $$0) {
      return $$0.c(f);
   }

   @Override
   protected dtc a(dtc $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f);
   }
}
