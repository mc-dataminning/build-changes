import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duf extends dka {
   public static final MapCodec<duf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dyk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, duf::new)
   );
   public static final dyu f = dyl.aU;
   private final int g;

   @Override
   public MapCodec<duf> a() {
      return e;
   }

   protected duf(int $$0, dyk $$1, dxu.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dhi $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bvk.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return bae.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dxv $$0) {
      return $$0.c(f);
   }

   @Override
   protected dxv a(dxv $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f);
   }
}
