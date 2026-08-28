import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dti extends djb {
   public static final MapCodec<dti> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dxn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dti::new)
   );
   public static final dxx f = dxo.aW;
   private final int g;

   @Override
   public MapCodec<dti> a() {
      return e;
   }

   protected dti(int $$0, dxn $$1, dwx.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dgj $$0, ji $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bum.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dwy $$0) {
      return $$0.c(f);
   }

   @Override
   protected dwy a(dwy $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f);
   }
}
