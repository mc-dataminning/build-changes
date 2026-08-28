import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ebc<WC extends eax>(ebe<WC> d, WC e) {
   public static final Codec<ebc<?>> a = lt.N.r().dispatch($$0 -> $$0.d, ebe::c);
   public static final Codec<jm<ebc<?>>> b = akn.a(lu.aH, a);
   public static final Codec<jq<ebc<?>>> c = kb.a(lu.aH, a);

   public boolean a(ayw $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eaz $$0, duy $$1, Function<jd, jm<ddw>> $$2, ayw $$3, dyk $$4, dcd $$5, dux $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ebe<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
