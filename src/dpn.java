import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpn extends dfk {
   public static final MapCodec<dpn> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dtp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dpn::new)
   );
   public static final dua f = dtq.aT;
   private final int g;

   @Override
   public MapCodec<dpn> a() {
      return e;
   }

   protected dpn(int $$0, dtp $$1, dsz.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dcu $$0, jd $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bsq.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayn.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dta $$0) {
      return $$0.c(f);
   }

   @Override
   protected dta a(dta $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f);
   }
}
