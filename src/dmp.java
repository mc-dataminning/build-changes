import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dmp<WC extends dmk>(dmr<WC> d, WC e) {
   public static final Codec<dmp<?>> a = jb.Q.q().dispatch($$0 -> $$0.d, dmr::c);
   public static final Codec<he<dmp<?>>> b = aev.a(jc.as, a);
   public static final Codec<hi<dmp<?>>> c = hs.a(jc.as, a);

   public boolean a(ash $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dmm $$0, dgz $$1, Function<gw, he<cqz>> $$2, ash $$3, djy $$4, cpi $$5, dgy $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dmr<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
