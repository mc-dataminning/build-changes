import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxg extends dxi {
   public static final Codec<dxg> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxg::new));

   public dxg(jq $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.r();
   }

   @Override
   public dwy<?> a() {
      return dwy.f;
   }
}
