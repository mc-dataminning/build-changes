import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eep extends eee {
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqj.b(je.B).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eep::new)
   );
   private final aqj<ciz> b;

   private eep(List<efr> $$0, aqj<ciz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eeg b() {
      return eeh.A;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      cja.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eee.a<?> a(aqj<ciz> $$0) {
      return a($$1 -> new eep($$1, $$0));
   }
}
