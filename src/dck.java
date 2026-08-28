import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dck(Map<jf<dnc>, ech<?>> c) {
   public static final dck a = new dck(Map.of());
   public static final Codec<dck> b = Codec.dispatchedMap(mg.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ech<?> $$2 = ((dnc)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ech::f)).xmap(dck::new, dck::a);

   public dck a(jf<dnc> $$0, ech<?> $$1) {
      return new dck(ag.a(this.c, $$0, $$1));
   }

   public Map<jf<dnc>, ech<?>> a() {
      return this.c;
   }
}
