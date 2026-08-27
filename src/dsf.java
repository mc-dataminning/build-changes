import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dsf extends dsg {
   public static final Codec<dsf> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsf::new));

   public dsf(jd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlf $$0) {
      return $$0.e();
   }

   @Override
   public drw<?> a() {
      return drw.e;
   }
}
