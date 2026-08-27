import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eed extends eds {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqa.b(jc.B).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eed::new)
   );
   private final aqa<cip> b;

   private eed(List<eff> $$0, aqa<cip> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edu b() {
      return edv.A;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      ciq.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eds.a<?> a(aqa<cip> $$0) {
      return a($$1 -> new eed($$1, $$0));
   }
}
