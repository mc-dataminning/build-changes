import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class edg extends edi {
   public static final MapCodec<edg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, edg::new));

   public edg(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvv $$0) {
      return $$0.v();
   }

   @Override
   public ecy<?> a() {
      return ecy.f;
   }
}
