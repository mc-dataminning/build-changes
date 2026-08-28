import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dcw(Map<jg<dno>, ect<?>> c) {
   public static final dcw a = new dcw(Map.of());
   public static final Codec<dcw> b = Codec.dispatchedMap(mh.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ect<?> $$2 = ((dno)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ect::f)).xmap(dcw::new, dcw::a);

   public dcw a(jg<dno> $$0, ect<?> $$1) {
      return new dcw(ag.a(this.c, $$0, $$1));
   }

   public Map<jg<dno>, ect<?>> a() {
      return this.c;
   }
}
