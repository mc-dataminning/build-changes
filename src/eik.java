import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eik<WC extends eif>(eim<WC> d, WC e) {
   public static final Codec<eik<?>> a = mf.N.q().dispatch($$0 -> $$0.d, eim::c);
   public static final Codec<je<eik<?>>> b = alc.a(mg.aK, a);
   public static final Codec<ji<eik<?>>> c = jt.a(mg.aK, a);

   public boolean a(azv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eih $$0, ece $$1, Function<iu, je<dkd>> $$2, azv $$3, efs $$4, dih $$5, ecd $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eim<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
