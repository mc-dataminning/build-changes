import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etz extends etc {
   static final MapCodec<etz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evx.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, etz::new));
   private final evw b;

   private etz(List<eva> $$0, evw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.a();
   }

   @Override
   public ete<etz> b() {
      return etf.Q;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      int $$2 = ayo.a(this.b.a($$1), 0, 4);
      $$0.b(kq.Q, $$2);
      return $$0;
   }

   public evw c() {
      return this.b;
   }

   public static etc.a<?> a(evw $$0) {
      return a($$1 -> new etz($$1, $$0));
   }
}
