import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dem extends cuo {
   public static final MapCodec<dem> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dhx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dem::new)
   );
   public static final dii f = dhy.aT;
   private final int g;

   @Override
   public MapCodec<dem> a() {
      return e;
   }

   protected dem(int $$0, dhx $$1, dhh.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(csa $$0, ht $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bkq.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return atm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dhi $$0) {
      return $$0.c(f);
   }

   @Override
   protected dhi a(dhi $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f);
   }
}
