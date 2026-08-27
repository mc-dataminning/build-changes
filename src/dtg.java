import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dtg extends dti {
   public static final Codec<dtg> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtg::new));

   public dtg(jf $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dme $$0) {
      return $$0.r();
   }

   @Override
   public dsy<?> a() {
      return dsy.f;
   }
}
