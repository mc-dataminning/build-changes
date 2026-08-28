import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends dem {
   public static final MapCodec<doo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dsq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, doo::new)
   );
   public static final dtb f = dsr.aT;
   private final int g;

   @Override
   public MapCodec<doo> a() {
      return e;
   }

   protected doo(int $$0, dsq $$1, dsa.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dbx $$0, iz $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bst.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayy.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dsb $$0) {
      return $$0.c(f);
   }

   @Override
   protected dsb a(dsb $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f);
   }
}
