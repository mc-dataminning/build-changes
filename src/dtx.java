import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtx extends djs {
   public static final MapCodec<dtx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dyc.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dtx::new)
   );
   public static final dym f = dyd.aU;
   private final int g;

   @Override
   public MapCodec<dtx> a() {
      return e;
   }

   protected dtx(int $$0, dyc $$1, dxm.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dha $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bvf.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return bae.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dxn $$0) {
      return $$0.c(f);
   }

   @Override
   protected dxn a(dxn $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f);
   }
}
