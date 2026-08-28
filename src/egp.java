import com.mojang.serialization.Codec;
import java.util.function.Function;

public record egp<WC extends egk>(egr<WC> d, WC e) {
   public static final Codec<egp<?>> a = md.N.q().dispatch($$0 -> $$0.d, egr::c);
   public static final Codec<js<egp<?>>> b = akz.a(me.aO, a);
   public static final Codec<jw<egp<?>>> c = kh.a(me.aO, a);

   public boolean a(azs $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(egm $$0, eaj $$1, Function<jj, js<dis>> $$2, azs $$3, edx $$4, dgw $$5, eai $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public egr<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
