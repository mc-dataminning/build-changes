import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dac(jr<avz> c) implements dab {
   public static final MapCodec<dac> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(avz.b.fieldOf("sound").forGetter(dac::b)).apply($$0, dac::new));
   public static final ym<vz, dac> b = ym.a(avz.d, dac::b, dac::new);

   @Override
   public dab.a<dac> a() {
      return dab.a.e;
   }

   @Override
   public boolean a(dgi $$0, cwp $$1, bvg $$2) {
      $$0.a(null, $$2.dw(), this.c.a(), $$2.dn(), 1.0F, 1.0F);
      return true;
   }

   public jr<avz> b() {
      return this.c;
   }
}
