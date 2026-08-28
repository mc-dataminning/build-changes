import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends del {
   public static final MapCodec<don> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dsp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, don::new)
   );
   public static final dta f = dsq.aT;
   private final int g;

   @Override
   public MapCodec<don> a() {
      return e;
   }

   protected don(int $$0, dsp $$1, drz.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dbw $$0, iz $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bss.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayx.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dsa $$0) {
      return $$0.c(f);
   }

   @Override
   protected dsa a(dsa $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f);
   }
}
