import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eho extends ehq {
   public static final MapCodec<eho> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eho::new));

   public eho(jz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dzz $$0) {
      return $$0.v();
   }

   @Override
   public ehg<?> a() {
      return ehg.f;
   }
}
