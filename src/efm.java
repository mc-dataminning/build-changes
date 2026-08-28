import com.mojang.serialization.Codec;
import java.util.function.Function;

public record efm<WC extends efh>(efo<WC> d, WC e) {
   public static final Codec<efm<?>> a = ma.N.q().dispatch($$0 -> $$0.d, efo::c);
   public static final Codec<jq<efm<?>>> b = alv.a(mb.aJ, a);
   public static final Codec<ju<efm<?>>> c = kf.a(mb.aJ, a);

   public boolean a(bam $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(efj $$0, dzi $$1, Function<jh, jq<dic>> $$2, bam $$3, ecu $$4, dgg $$5, dzh $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public efo<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
