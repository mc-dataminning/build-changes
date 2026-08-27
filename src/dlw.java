import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlw extends dbv {
   public static final MapCodec<dlw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dpx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dlw::new)
   );
   public static final dqi f = dpy.aT;
   private final int g;

   @Override
   public MapCodec<dlw> a() {
      return e;
   }

   protected dlw(int $$0, dpx $$1, dph.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(czg $$0, id $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bqa.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return axm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dpi $$0) {
      return $$0.c(f);
   }

   @Override
   protected dpi a(dpi $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f);
   }
}
