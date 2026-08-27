import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dln extends dbm {
   public static final MapCodec<dln> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dpo.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dln::new)
   );
   public static final dpz f = dpp.aT;
   private final int g;

   @Override
   public MapCodec<dln> a() {
      return e;
   }

   protected dln(int $$0, dpo $$1, doy.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cyx $$0, ib $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bpv.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return axk.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(doz $$0) {
      return $$0.c(f);
   }

   @Override
   protected doz a(doz $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f);
   }
}
