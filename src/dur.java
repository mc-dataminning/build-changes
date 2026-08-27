import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dur<WC extends dum>(dut<WC> d, WC e) {
   public static final Codec<dur<?>> a = ki.P.q().dispatch($$0 -> $$0.d, dut::c);
   public static final Codec<il<dur<?>>> b = ajd.a(kj.aw, a);
   public static final Codec<ip<dur<?>>> c = ja.a(kj.aw, a);

   public boolean a(axd $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(duo $$0, dox $$1, Function<ib, il<cya>> $$2, axd $$3, dsa $$4, cwi $$5, dow $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dut<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
