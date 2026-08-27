import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsl extends dsn {
   public static final Codec<dsl> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsl::new));

   public dsl(jd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlj $$0) {
      return $$0.r();
   }

   @Override
   public dsd<?> a() {
      return dsd.f;
   }
}
