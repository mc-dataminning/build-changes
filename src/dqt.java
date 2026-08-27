import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dqt<WC extends dqo>(dqv<WC> d, WC e) {
   public static final Codec<dqt<?>> a = kd.P.q().dispatch($$0 -> $$0.d, dqv::c);
   public static final Codec<ih<dqt<?>>> b = ahc.a(ke.av, a);
   public static final Codec<il<dqt<?>>> c = iv.a(ke.av, a);

   public boolean a(auv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dqq $$0, dld $$1, Function<hx, ih<cuo>> $$2, auv $$3, doc $$4, csw $$5, dlc $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dqv<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
