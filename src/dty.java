import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dty extends djr {
   public static final MapCodec<dty> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dyd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dty::new)
   );
   public static final dyn f = dye.aW;
   private final int g;

   @Override
   public MapCodec<dty> a() {
      return e;
   }

   protected dty(int $$0, dyd $$1, dxn.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dgz $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bvb.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azu.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dxo $$0) {
      return $$0.c(f);
   }

   @Override
   protected dxo a(dxo $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f);
   }
}
