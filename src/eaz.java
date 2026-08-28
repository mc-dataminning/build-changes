import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eaz<WC extends eau>(ebb<WC> d, WC e) {
   public static final Codec<eaz<?>> a = lt.N.r().dispatch($$0 -> $$0.d, ebb::c);
   public static final Codec<jm<eaz<?>>> b = akm.a(lu.aH, a);
   public static final Codec<jq<eaz<?>>> c = kb.a(lu.aH, a);

   public boolean a(ayv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eaw $$0, duw $$1, Function<jd, jm<ddu>> $$2, ayv $$3, dyh $$4, dcb $$5, duv $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ebb<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
