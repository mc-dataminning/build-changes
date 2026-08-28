import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class due extends djz {
   public static final MapCodec<due> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dyj.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, due::new)
   );
   public static final dyt f = dyk.aU;
   private final int g;

   @Override
   public MapCodec<due> a() {
      return e;
   }

   protected due(int $$0, dyj $$1, dxt.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dhh $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bvj.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return bae.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dxu $$0) {
      return $$0.c(f);
   }

   @Override
   protected dxu a(dxu $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f);
   }
}
