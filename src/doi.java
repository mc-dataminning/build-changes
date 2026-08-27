import com.mojang.serialization.Codec;
import java.util.function.Function;

public record doi<WC extends dod>(dok<WC> d, WC e) {
   public static final Codec<doi<?>> a = jy.Q.q().dispatch($$0 -> $$0.d, dok::c);
   public static final Codec<ib<doi<?>>> b = agc.a(jz.at, a);
   public static final Codec<ig<doi<?>>> c = iq.a(jz.at, a);

   public boolean a(ato $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dof $$0, dis $$1, Function<ht, ib<csq>> $$2, ato $$3, dlr $$4, cqz $$5, dir $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dok<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
