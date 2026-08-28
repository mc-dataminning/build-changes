import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dev {
   public static final MapCodec<dox> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dsz.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dox::new)
   );
   public static final dtk f = dta.aT;
   private final int g;

   @Override
   public MapCodec<dox> a() {
      return e;
   }

   protected dox(int $$0, dsz $$1, dsj.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dcf $$0, ja $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bsg.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayg.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dsk $$0) {
      return $$0.c(f);
   }

   @Override
   protected dsk a(dsk $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f);
   }
}
