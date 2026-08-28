import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eev<WC extends eeq>(eex<WC> d, WC e) {
   public static final Codec<eev<?>> a = mb.N.q().dispatch($$0 -> $$0.d, eex::c);
   public static final Codec<jr<eev<?>>> b = akr.a(mc.aK, a);
   public static final Codec<jv<eev<?>>> c = kg.a(mc.aK, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ees $$0, dyr $$1, Function<ji, jr<dhj>> $$2, azh $$3, ecd $$4, dfn $$5, dyq $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eex<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
