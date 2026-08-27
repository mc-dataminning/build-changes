import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Function;

public record cue(Map<in<dch>, dql<?>> c) {
   public static final cue a = new cue(Map.of());
   public static final Codec<cue> b = awu.c(kt.e.r(), (Function)($$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dql<?> $$2 = ((dch)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dql::f))).xmap(cue::new, cue::a);

   public cue a(in<dch> $$0, dql<?> $$1) {
      return new cue(ac.a(this.c, $$0, $$1));
   }

   public Map<in<dch>, dql<?>> a() {
      return this.c;
   }
}
