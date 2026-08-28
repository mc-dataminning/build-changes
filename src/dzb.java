import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzb extends dzh {
   final axb<deu> a;
   public static final MapCodec<dzb> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axb.a(lq.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzb::new)
   );

   protected dzb(kd $$0, axb<deu> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(drx $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dyx<?> a() {
      return dyx.b;
   }
}
