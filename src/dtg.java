import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtg extends diz {
   public static final MapCodec<dtg> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dxl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dtg::new)
   );
   public static final dxv f = dxm.aW;
   private final int g;

   @Override
   public MapCodec<dtg> a() {
      return e;
   }

   protected dtg(int $$0, dxl $$1, dwv.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dgh $$0, ji $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), buk.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dww $$0) {
      return $$0.c(f);
   }

   @Override
   protected dww a(dww $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f);
   }
}
