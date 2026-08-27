import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmu extends dcs {
   public static final MapCodec<dmu> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dqw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dmu::new)
   );
   public static final drh f = dqx.aT;
   private final int g;

   @Override
   public MapCodec<dmu> a() {
      return e;
   }

   protected dmu(int $$0, dqw $$1, dqg.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dad $$0, in $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), brh.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return axz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dqh $$0) {
      return $$0.c(f);
   }

   @Override
   protected dqh a(dqh $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f);
   }
}
