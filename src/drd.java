import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drd extends dha {
   public static final MapCodec<drd> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dvh.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, drd::new)
   );
   public static final dvs f = dvi.aT;
   private final int g;

   @Override
   public MapCodec<drd> a() {
      return e;
   }

   protected drd(int $$0, dvh $$1, dur.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dej $$0, jf $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), btr.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azf.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dus $$0) {
      return $$0.c(f);
   }

   @Override
   protected dus a(dus $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f);
   }
}
