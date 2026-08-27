import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emt extends emi {
   public static final Codec<emt> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avd.b(kj.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, emt::new)
   );
   private final avd<cqe> b;

   private emt(List<env> $$0, avd<cqe> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emk b() {
      return eml.A;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      cqf.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static emi.a<?> a(avd<cqe> $$0) {
      return a($$1 -> new emt($$1, $$0));
   }
}
