import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eew<WC extends eer>(eey<WC> d, WC e) {
   public static final Codec<eew<?>> a = mb.N.q().dispatch($$0 -> $$0.d, eey::c);
   public static final Codec<jr<eew<?>>> b = akq.a(mc.aK, a);
   public static final Codec<jv<eew<?>>> c = kg.a(mc.aK, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eet $$0, dys $$1, Function<ji, jr<dhk>> $$2, azh $$3, ece $$4, dfo $$5, dyr $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eey<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
