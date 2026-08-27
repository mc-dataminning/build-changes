import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dsr<WC extends dsm>(dst<WC> d, WC e) {
   public static final Codec<dsr<?>> a = kf.P.q().dispatch($$0 -> $$0.d, dst::c);
   public static final Codec<ij<dsr<?>>> b = aiu.a(kg.av, a);
   public static final Codec<in<dsr<?>>> c = ix.a(kg.av, a);

   public boolean a(awo $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dso $$0, dnb $$1, Function<hz, ij<cwm>> $$2, awo $$3, dqa $$4, cuu $$5, dna $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dst<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
