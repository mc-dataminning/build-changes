import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class der extends cut {
   public static final MapCodec<der> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dic.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, der::new)
   );
   public static final din f = did.aT;
   private final int g;

   @Override
   public MapCodec<der> a() {
      return e;
   }

   protected der(int $$0, dic $$1, dhm.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(csf $$0, hx $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bkv.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return atq.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dhn $$0) {
      return $$0.c(f);
   }

   @Override
   protected dhn a(dhn $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f);
   }
}
