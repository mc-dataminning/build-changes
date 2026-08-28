import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dus extends dki {
   public static final MapCodec<dus> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), dzb.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dus::new)
   );
   public static final dzm d = dzc.aW;
   private final int e;

   @Override
   public MapCodec<dus> a() {
      return c;
   }

   protected dus(int $$0, dzb $$1, dyl.d $$2) {
      super($$2, $$1);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(dhp $$0, jj $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bvs.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azk.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dym $$0) {
      return $$0.c(d);
   }

   @Override
   protected dym a(dym $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d);
   }
}
