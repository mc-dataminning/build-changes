import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq extends deo {
   public static final MapCodec<doq> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dss.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, doq::new)
   );
   public static final dtd f = dst.aT;
   private final int g;

   @Override
   public MapCodec<doq> a() {
      return e;
   }

   protected doq(int $$0, dss $$1, dsc.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dbz $$0, iz $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bsv.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dsd $$0) {
      return $$0.c(f);
   }

   @Override
   protected dsd a(dsd $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f);
   }
}
