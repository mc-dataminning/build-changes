import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dic extends cyc {
   public static final MapCodec<dic> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dlu.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dic::new)
   );
   public static final dmf f = dlv.aT;
   private final int g;

   @Override
   public MapCodec<dic> a() {
      return e;
   }

   protected dic(int $$0, dlu $$1, dle.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cvn $$0, hz $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bno.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return awh.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dlf $$0) {
      return $$0.c(f);
   }

   @Override
   protected dlf a(dlf $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f);
   }
}
