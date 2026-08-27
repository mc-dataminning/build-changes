import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpo extends dpq {
   public static final Codec<dpo> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dpo::new));

   public dpo(iz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dip $$0) {
      return $$0.r();
   }

   @Override
   public dpg<?> a() {
      return dpg.f;
   }
}
