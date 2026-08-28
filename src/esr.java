import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esr extends ert {
   static final MapCodec<esr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eun.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, esr::new));
   private final eum b;

   private esr(List<etr> $$0, eum $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.a();
   }

   @Override
   public erv<esr> b() {
      return erw.Q;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      int $$2 = ayy.a(this.b.a($$1), 0, 4);
      $$0.b(km.Q, Integer.valueOf($$2));
      return $$0;
   }

   public eum c() {
      return this.b;
   }

   public static ert.a<?> a(eum $$0) {
      return a($$1 -> new esr($$1, $$0));
   }
}
