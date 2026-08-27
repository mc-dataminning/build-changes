import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Function;

public record ctv(Map<il<dby>, dqc<?>> c) {
   public static final ctv a = new ctv(Map.of());
   public static final Codec<ctv> b = aws.c(kr.e.r(), (Function)($$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dqc<?> $$2 = ((dby)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dqc::f))).xmap(ctv::new, ctv::a);

   public ctv a(il<dby> $$0, dqc<?> $$1) {
      return new ctv(ac.a(this.c, $$0, $$1));
   }

   public Map<il<dby>, dqc<?>> a() {
      return this.c;
   }
}
