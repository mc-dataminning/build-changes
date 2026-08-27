import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dyc<WC extends dxx>(dye<WC> d, WC e) {
   public static final Codec<dyc<?>> a = ld.P.q().dispatch($$0 -> $$0.d, dye::c);
   public static final Codec<iw<dyc<?>>> b = akd.a(le.aB, a);
   public static final Codec<ja<dyc<?>>> c = jl.a(le.aB, a);

   public boolean a(ayg $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dxz $$0, dsd $$1, Function<in, iw<dbc>> $$2, ayg $$3, dvl $$4, czk $$5, dsc $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dye<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
