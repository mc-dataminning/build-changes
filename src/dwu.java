import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dwu<WC extends dwp>(dww<WC> d, WC e) {
   public static final Codec<dwu<?>> a = kr.P.q().dispatch($$0 -> $$0.d, dww::c);
   public static final Codec<il<dwu<?>>> b = ajp.a(ks.ax, a);
   public static final Codec<ip<dwu<?>>> c = ja.a(ks.ax, a);

   public boolean a(axr $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dwr $$0, dqv $$1, Function<ib, il<czw>> $$2, axr $$3, dud $$4, cye $$5, dqu $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dww<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
