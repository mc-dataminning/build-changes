import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eaj<WC extends eae>(eal<WC> d, WC e) {
   public static final Codec<eaj<?>> a = lq.N.r().dispatch($$0 -> $$0.d, eal::c);
   public static final Codec<jj<eaj<?>>> b = akg.a(lr.aG, a);
   public static final Codec<jn<eaj<?>>> c = jy.a(lr.aG, a);

   public boolean a(ayo $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eag $$0, dug $$1, Function<ja, jj<ddf>> $$2, ayo $$3, dxr $$4, dbm $$5, duf $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eal<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
