import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dig extends cyg {
   public static final MapCodec<dig> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dly.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dig::new)
   );
   public static final dmj f = dlz.aT;
   private final int g;

   @Override
   public MapCodec<dig> a() {
      return e;
   }

   protected dig(int $$0, dly $$1, dli.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cvr $$0, hz $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bnq.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return awi.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dlj $$0) {
      return $$0.c(f);
   }

   @Override
   protected dlj a(dlj $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f);
   }
}
