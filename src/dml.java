import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dml<WC extends dmg>(dmn<WC> d, WC e) {
   public static final Codec<dml<?>> a = jb.Q.q().dispatch($$0 -> $$0.d, dmn::c);
   public static final Codec<he<dml<?>>> b = aen.a(jc.ar, a);
   public static final Codec<hi<dml<?>>> c = ht.a(jc.ar, a);

   public boolean a(aru $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dmi $$0, dgv $$1, Function<gu, he<cqj>> $$2, aru $$3, dju $$4, cos $$5, dgu $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dmn<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
