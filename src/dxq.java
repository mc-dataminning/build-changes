import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dxq extends dxr {
   public static final Codec<dxq> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxq::new));

   public dxq(jr $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dqh $$0) {
      return $$0.e();
   }

   @Override
   public dxh<?> a() {
      return dxh.e;
   }
}
