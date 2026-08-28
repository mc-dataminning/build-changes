import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dra extends dgx {
   public static final MapCodec<dra> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dvd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dra::new)
   );
   public static final dvo f = dve.aT;
   private final int g;

   @Override
   public MapCodec<dra> a() {
      return e;
   }

   protected dra(int $$0, dvd $$1, dun.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(deg $$0, je $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bto.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azd.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(duo $$0) {
      return $$0.c(f);
   }

   @Override
   protected duo a(duo $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f);
   }
}
