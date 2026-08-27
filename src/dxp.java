import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxp extends dxr {
   public static final Codec<dxp> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxp::new));

   public dxp(jr $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dqh $$0) {
      return $$0.r();
   }

   @Override
   public dxh<?> a() {
      return dxh.f;
   }
}
