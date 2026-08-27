import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dme extends dmf {
   public static final Codec<dme> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dme::new));

   public dme(ib $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfe $$0) {
      return $$0.e();
   }

   @Override
   public dlv<?> a() {
      return dlv.e;
   }
}
