import com.mojang.serialization.Codec;
import java.util.function.Function;

public record efn<WC extends efi>(efp<WC> d, WC e) {
   public static final Codec<efn<?>> a = ma.N.q().dispatch($$0 -> $$0.d, efp::c);
   public static final Codec<jq<efn<?>>> b = all.a(mb.aK, a);
   public static final Codec<ju<efn<?>>> c = kf.a(mb.aK, a);

   public boolean a(bac $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(efk $$0, dzj $$1, Function<jh, jq<dib>> $$2, bac $$3, ecv $$4, dgf $$5, dzi $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public efp<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
