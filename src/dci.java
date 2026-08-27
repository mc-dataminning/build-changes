import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dci extends csq {
   public static final MapCodec<dci> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dfs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dci::new)
   );
   public static final dgd f = dft.aT;
   private final int g;

   @Override
   public MapCodec<dci> a() {
      return e;
   }

   protected dci(int $$0, dfs $$1, dfc.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cqb $$0, gw $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), biw.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return asb.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dfd $$0) {
      return $$0.c(f);
   }

   @Override
   protected dfd a(dfd $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f);
   }
}
