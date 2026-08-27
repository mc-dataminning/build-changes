import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmk extends dmm {
   public static final Codec<dmk> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dmk::new));

   public dmk(ib $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfl $$0) {
      return $$0.r();
   }

   @Override
   public dmc<?> a() {
      return dmc.f;
   }
}
