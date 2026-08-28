import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtf extends diy {
   public static final MapCodec<dtf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dxk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dtf::new)
   );
   public static final dxu f = dxl.aW;
   private final int g;

   @Override
   public MapCodec<dtf> a() {
      return e;
   }

   protected dtf(int $$0, dxk $$1, dwu.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dgg $$0, ji $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), buj.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayy.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dwv $$0) {
      return $$0.c(f);
   }

   @Override
   protected dwv a(dwv $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f);
   }
}
