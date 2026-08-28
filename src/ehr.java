import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ehr<WC extends ehm>(eht<WC> d, WC e) {
   public static final Codec<ehr<?>> a = mf.N.q().dispatch($$0 -> $$0.d, eht::c);
   public static final Codec<je<ehr<?>>> b = ala.a(mg.aJ, a);
   public static final Codec<ji<ehr<?>>> c = jt.a(mg.aJ, a);

   public boolean a(azt $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eho $$0, ebl $$1, Function<iu, je<djs>> $$2, azt $$3, eez $$4, dhw $$5, ebk $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eht<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
