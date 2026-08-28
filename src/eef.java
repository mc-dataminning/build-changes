import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eef extends eel {
   final axf<djn> a;
   public static final MapCodec<eef> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(mc.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eef::new)
   );

   protected eef(km $$0, axf<djn> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dwy $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eeb<?> a() {
      return eeb.b;
   }
}
