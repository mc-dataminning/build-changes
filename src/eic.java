import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eic<WC extends ehx>(eie<WC> d, WC e) {
   public static final Codec<eic<?>> a = mf.N.q().dispatch($$0 -> $$0.d, eie::c);
   public static final Codec<je<eic<?>>> b = alc.a(mg.aJ, a);
   public static final Codec<ji<eic<?>>> c = jt.a(mg.aJ, a);

   public boolean a(azv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ehz $$0, ebw $$1, Function<iu, je<djy>> $$2, azv $$3, efk $$4, dic $$5, ebv $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eie<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
