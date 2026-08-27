import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyf extends dyl {
   final awl<ddy> a;
   public static final MapCodec<dyf> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awl.a(lf.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dyf::new)
   );

   protected dyf(js $$0, awl<ddy> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(drb $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dyb<?> a() {
      return dyb.b;
   }
}
