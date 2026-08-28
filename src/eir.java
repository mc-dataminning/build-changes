import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eir<WC extends eim>(eit<WC> d, WC e) {
   public static final Codec<eir<?>> a = mg.N.q().dispatch($$0 -> $$0.d, eit::c);
   public static final Codec<jf<eir<?>>> b = alc.a(mh.aK, a);
   public static final Codec<jj<eir<?>>> c = ju.a(mh.aK, a);

   public boolean a(azv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eio $$0, ecl $$1, Function<iv, jf<dkk>> $$2, azv $$3, efz $$4, dio $$5, eck $$6) {
      return ac.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eit<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
