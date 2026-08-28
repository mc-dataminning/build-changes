import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dth extends dja {
   public static final MapCodec<dth> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dxm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dth::new)
   );
   public static final dxw f = dxn.aW;
   private final int g;

   @Override
   public MapCodec<dth> a() {
      return e;
   }

   protected dth(int $$0, dxm $$1, dww.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dgi $$0, ji $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), buk.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dwx $$0) {
      return $$0.c(f);
   }

   @Override
   protected dwx a(dwx $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f);
   }
}
