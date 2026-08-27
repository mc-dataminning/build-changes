import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dqb<WC extends dpw>(dqd<WC> d, WC e) {
   public static final Codec<dqb<?>> a = kb.P.q().dispatch($$0 -> $$0.d, dqd::c);
   public static final Codec<ie<dqb<?>>> b = agp.a(kc.au, a);
   public static final Codec<ij<dqb<?>>> c = it.a(kc.au, a);

   public boolean a(auf $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dpy $$0, dkl $$1, Function<hv, ie<ctx>> $$2, auf $$3, dnk $$4, csf $$5, dkk $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dqd<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
