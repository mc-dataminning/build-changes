import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dzz<WC extends dzu>(eab<WC> d, WC e) {
   public static final Codec<dzz<?>> a = lp.P.q().dispatch($$0 -> $$0.d, eab::c);
   public static final Codec<ji<dzz<?>>> b = alb.a(lq.aB, a);
   public static final Codec<jm<dzz<?>>> c = jx.a(lq.aB, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dzw $$0, dua $$1, Function<iz, ji<dcz>> $$2, azh $$3, dxi $$4, dbh $$5, dtz $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eab<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
