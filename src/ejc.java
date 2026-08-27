import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejc extends eir {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asx.b(ke.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ejc::new)
   );
   private final asx<cmy> b;

   private ejc(List<eke> $$0, asx<cmy> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eit b() {
      return eiu.A;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      cmz.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eir.a<?> a(asx<cmy> $$0) {
      return a($$1 -> new ejc($$1, $$0));
   }
}
