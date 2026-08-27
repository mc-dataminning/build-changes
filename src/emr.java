import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emr extends emg {
   public static final Codec<emr> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avd.b(kj.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, emr::new)
   );
   private final avd<cqc> b;

   private emr(List<ent> $$0, avd<cqc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emi b() {
      return emj.A;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      cqd.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static emg.a<?> a(avd<cqc> $$0) {
      return a($$1 -> new emr($$1, $$0));
   }
}
