import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dml extends dcj {
   public static final MapCodec<dml> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dqn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dml::new)
   );
   public static final dqy f = dqo.aT;
   private final int g;

   @Override
   public MapCodec<dml> a() {
      return e;
   }

   protected dml(int $$0, dqn $$1, dpx.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(czu $$0, im $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bql.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return axw.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dpy $$0) {
      return $$0.c(f);
   }

   @Override
   protected dpy a(dpy $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f);
   }
}
