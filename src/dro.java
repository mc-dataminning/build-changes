import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dro extends dhm {
   public static final MapCodec<dro> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dvs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dro::new)
   );
   public static final dwd f = dvt.aT;
   private final int g;

   @Override
   public MapCodec<dro> a() {
      return e;
   }

   protected dro(int $$0, dvs $$1, dvc.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dev $$0, jg $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), btz.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azj.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dvd $$0) {
      return $$0.c(f);
   }

   @Override
   protected dvd a(dvd $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f);
   }
}
