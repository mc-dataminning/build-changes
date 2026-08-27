import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eed extends eee {
   public static final Codec<eed> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecr.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eed::new));
   private final ecr b;

   private eed(List<efr> $$0, ecr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eeg b() {
      return eeh.q;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.a();
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eee.a<?> a(ecr $$0) {
      return a($$1 -> new eed($$1, $$0));
   }
}
