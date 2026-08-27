import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eet extends eeu {
   public static final Codec<eet> a = RecordCodecBuilder.create($$0 -> a($$0).and(edh.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eet::new));
   private final edh b;

   private eet(List<egh> $$0, edh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eew b() {
      return eex.q;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.a();
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eeu.a<?> a(edh $$0) {
      return a($$1 -> new eet($$1, $$0));
   }
}
