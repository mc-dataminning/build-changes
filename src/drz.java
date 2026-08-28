import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drz extends dhx {
   public static final MapCodec<drz> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dwd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, drz::new)
   );
   public static final dwn f = dwe.aT;
   private final int g;

   @Override
   public MapCodec<drz> a() {
      return e;
   }

   protected drz(int $$0, dwd $$1, dvn.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dff $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bui.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azn.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dvo $$0) {
      return $$0.c(f);
   }

   @Override
   protected dvo a(dvo $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f);
   }
}
