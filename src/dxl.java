import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxl extends dxr {
   final awg<dde> a;
   public static final Codec<dxl> e = RecordCodecBuilder.create($$0 -> a($$0).and(awg.a(le.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dxl::new));

   protected dxl(jr $$0, awg<dde> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dqh $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dxh<?> a() {
      return dxh.b;
   }
}
