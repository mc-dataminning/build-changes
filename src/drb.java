import com.mojang.serialization.Codec;
import java.util.function.Function;

public record drb<WC extends dqw>(drd<WC> d, WC e) {
   public static final Codec<drb<?>> a = kd.P.q().dispatch($$0 -> $$0.d, drd::c);
   public static final Codec<ih<drb<?>>> b = ahd.a(ke.av, a);
   public static final Codec<il<drb<?>>> c = iv.a(ke.av, a);

   public boolean a(auw $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dqy $$0, dll $$1, Function<hx, ih<cuw>> $$2, auw $$3, dok $$4, cte $$5, dlk $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public drd<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
