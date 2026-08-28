import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehw extends ehy {
   public static final MapCodec<ehw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehw::new));

   public ehw(jz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eah $$0) {
      return $$0.v();
   }

   @Override
   public eho<?> a() {
      return eho.f;
   }
}
