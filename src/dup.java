import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dup<WC extends duk>(dur<WC> d, WC e) {
   public static final Codec<dup<?>> a = ki.P.q().dispatch($$0 -> $$0.d, dur::c);
   public static final Codec<il<dup<?>>> b = ajd.a(kj.aw, a);
   public static final Codec<ip<dup<?>>> c = ja.a(kj.aw, a);

   public boolean a(axd $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dum $$0, dov $$1, Function<ib, il<cxy>> $$2, axd $$3, dry $$4, cwg $$5, dou $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dur<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
