import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeu extends eee {
   public static final Codec<eeu> a = RecordCodecBuilder.create($$0 -> a($$0).and(rt.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eeu::new));
   private final qy b;

   private eeu(List<efr> $$0, qy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eeg b() {
      return eeh.g;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eee.a<?> a(qy $$0) {
      return a($$1 -> new eeu($$1, $$0));
   }
}
