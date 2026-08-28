import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dov extends det {
   public static final MapCodec<dov> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dsw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dov::new)
   );
   public static final dth f = dsx.aT;
   private final int g;

   @Override
   public MapCodec<dov> a() {
      return e;
   }

   protected dov(int $$0, dsw $$1, dsg.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dcd $$0, ja $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bsd.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return aye.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dsh $$0) {
      return $$0.c(f);
   }

   @Override
   protected dsh a(dsh $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f);
   }
}
