import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efa extends efg {
   final axf<dke> a;
   public static final MapCodec<efa> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(mc.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, efa::new)
   );

   protected efa(km $$0, axf<dke> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dxq $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eew<?> a() {
      return eew.b;
   }
}
