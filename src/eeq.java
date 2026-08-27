import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeq extends eee {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egn.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eeq::new)
   );
   private final egm b;
   private final boolean c;

   private eeq(List<efr> $$0, egm $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eeg b() {
      return eeh.c;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.a();
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(ary.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eee.a<?> a(egm $$0) {
      return a($$1 -> new eeq($$1, $$0, false));
   }

   public static eee.a<?> a(egm $$0, boolean $$1) {
      return a($$2 -> new eeq($$2, $$0, $$1));
   }
}
