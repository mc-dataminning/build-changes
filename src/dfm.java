import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfm extends cvn {
   public static final MapCodec<dfm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dje.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dfm::new)
   );
   public static final djp f = djf.aT;
   private final int g;

   @Override
   public MapCodec<dfm> a() {
      return e;
   }

   protected dfm(int $$0, dje $$1, dio.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(csy $$0, hv $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), blf.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return aty.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dip $$0) {
      return $$0.c(f);
   }

   @Override
   protected dip a(dip $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f);
   }
}
