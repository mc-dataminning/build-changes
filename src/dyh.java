import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyh extends dyn {
   final awm<dea> a;
   public static final MapCodec<dyh> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awm.a(lf.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dyh::new)
   );

   protected dyh(js $$0, awm<dea> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(drd $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dyd<?> a() {
      return dyd.b;
   }
}
