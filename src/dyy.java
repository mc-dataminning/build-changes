import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dyy<WC extends dyt>(dza<WC> d, WC e) {
   public static final Codec<dyy<?>> a = le.P.q().dispatch($$0 -> $$0.d, dza::c);
   public static final Codec<ix<dyy<?>>> b = akj.a(lf.aB, a);
   public static final Codec<jb<dyy<?>>> c = jm.a(lf.aB, a);

   public boolean a(aym $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dyv $$0, dsz $$1, Function<io, ix<dby>> $$2, aym $$3, dwh $$4, dag $$5, dsy $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dza<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
