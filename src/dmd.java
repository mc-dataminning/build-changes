import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmd extends dmf {
   public static final Codec<dmd> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dmd::new));

   public dmd(ib $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfe $$0) {
      return $$0.r();
   }

   @Override
   public dlv<?> a() {
      return dlv.f;
   }
}
