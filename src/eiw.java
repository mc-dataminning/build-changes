import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eiw<WC extends eir>(eiy<WC> d, WC e) {
   public static final Codec<eiw<?>> a = mg.N.q().dispatch($$0 -> $$0.d, eiy::c);
   public static final Codec<jf<eiw<?>>> b = alc.a(mh.aK, a);
   public static final Codec<jj<eiw<?>>> c = ju.a(mh.aK, a);

   public boolean a(azv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eit $$0, ecq $$1, Function<iv, jf<dkp>> $$2, azv $$3, ege $$4, dir $$5, ecp $$6) {
      return ac.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eiy<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
