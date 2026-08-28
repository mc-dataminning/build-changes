import com.mojang.serialization.Codec;
import java.util.function.Function;

public record efu<WC extends efp>(efw<WC> d, WC e) {
   public static final Codec<efu<?>> a = ma.N.q().dispatch($$0 -> $$0.d, efw::c);
   public static final Codec<jq<efu<?>>> b = alv.a(mb.aK, a);
   public static final Codec<ju<efu<?>>> c = kf.a(mb.aK, a);

   public boolean a(bam $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(efr $$0, dzq $$1, Function<jh, jq<dik>> $$2, bam $$3, edc $$4, dgo $$5, dzp $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public efw<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
