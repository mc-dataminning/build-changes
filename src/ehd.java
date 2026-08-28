import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehd extends ehf {
   public static final MapCodec<ehd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehd::new));

   public ehd(jz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dzo $$0) {
      return $$0.v();
   }

   @Override
   public egv<?> a() {
      return egv.f;
   }
}
