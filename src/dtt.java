import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dtt<WC extends dto>(dtv<WC> d, WC e) {
   public static final Codec<dtt<?>> a = kh.P.q().dispatch($$0 -> $$0.d, dtv::c);
   public static final Codec<il<dtt<?>>> b = aiy.a(ki.aw, a);
   public static final Codec<ip<dtt<?>>> c = iz.a(ki.aw, a);

   public boolean a(awt $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dtq $$0, doa $$1, Function<ib, il<cxd>> $$2, awt $$3, drc $$4, cvl $$5, dnz $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dtv<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
