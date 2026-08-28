import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends djs {
   public static final MapCodec<dua> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), dyf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dua::new)
   );
   public static final dyq d = dyg.aW;
   private final int e;

   @Override
   public MapCodec<dua> a() {
      return c;
   }

   protected dua(int $$0, dyf $$1, dxp.d $$2) {
      super($$2, $$1);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(dgz $$0, ji $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bva.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return ayz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dxq $$0) {
      return $$0.c(d);
   }

   @Override
   protected dxq a(dxq $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d);
   }
}
