import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eeu<WC extends eep>(eew<WC> d, WC e) {
   public static final Codec<eeu<?>> a = mb.N.q().dispatch($$0 -> $$0.d, eew::c);
   public static final Codec<jr<eeu<?>>> b = akq.a(mc.aK, a);
   public static final Codec<jv<eeu<?>>> c = kg.a(mc.aK, a);

   public boolean a(azg $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eer $$0, dyq $$1, Function<ji, jr<dhi>> $$2, azg $$3, ecc $$4, dfm $$5, dyp $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eew<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
