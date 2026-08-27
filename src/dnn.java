import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dnn<WC extends dni>(dnp<WC> d, WC e) {
   public static final Codec<dnn<?>> a = jy.Q.q().dispatch($$0 -> $$0.d, dnp::c);
   public static final Codec<ib<dnn<?>>> b = afs.a(jz.as, a);
   public static final Codec<ig<dnn<?>>> c = iq.a(jz.as, a);

   public boolean a(ate $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dnk $$0, dhx $$1, Function<ht, ib<crx>> $$2, ate $$3, dkw $$4, cqg $$5, dhw $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dnp<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
