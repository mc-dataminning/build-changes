import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class est extends erv {
   static final MapCodec<est> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eup.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, est::new));
   private final euo b;

   private est(List<ett> $$0, euo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public erx<est> b() {
      return ery.Q;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      int $$2 = ayz.a(this.b.a($$1), 0, 4);
      $$0.b(km.Q, Integer.valueOf($$2));
      return $$0;
   }

   public euo c() {
      return this.b;
   }

   public static erv.a<?> a(euo $$0) {
      return a($$1 -> new est($$1, $$0));
   }
}
