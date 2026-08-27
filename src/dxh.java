import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dxh extends dxi {
   public static final Codec<dxh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxh::new));

   public dxh(jq $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.e();
   }

   @Override
   public dwy<?> a() {
      return dwy.e;
   }
}
