import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dyw<WC extends dyr>(dyy<WC> d, WC e) {
   public static final Codec<dyw<?>> a = le.P.q().dispatch($$0 -> $$0.d, dyy::c);
   public static final Codec<ix<dyw<?>>> b = aki.a(lf.aB, a);
   public static final Codec<jb<dyw<?>>> c = jm.a(lf.aB, a);

   public boolean a(ayk $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dyt $$0, dsx $$1, Function<io, ix<dbw>> $$2, ayk $$3, dwf $$4, dae $$5, dsw $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dyy<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
