import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dml extends dmm {
   public static final Codec<dml> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dml::new));

   public dml(ib $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfl $$0) {
      return $$0.e();
   }

   @Override
   public dmc<?> a() {
      return dmc.e;
   }
}
