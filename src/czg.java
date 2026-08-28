import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czg(jn<awd> c) implements czf {
   public static final MapCodec<czg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awd.b.fieldOf("sound").forGetter(czg::b)).apply($$0, czg::new));
   public static final zb<wo, czg> b = zb.a(awd.d, czg::b, czg::new);

   @Override
   public czf.a<czg> a() {
      return czf.a.e;
   }

   @Override
   public boolean a(deg $$0, cvp $$1, buk $$2) {
      $$0.a(null, $$2.ds(), this.c.a(), $$2.di(), 1.0F, 1.0F);
      return true;
   }

   public jn<awd> b() {
      return this.c;
   }
}
