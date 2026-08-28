import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ead<WC extends dzy>(eaf<WC> d, WC e) {
   public static final Codec<ead<?>> a = lq.N.r().dispatch($$0 -> $$0.d, eaf::c);
   public static final Codec<jj<ead<?>>> b = akg.a(lr.aG, a);
   public static final Codec<jn<ead<?>>> c = jy.a(lr.aG, a);

   public boolean a(aym $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eaa $$0, dud $$1, Function<ja, jj<ddd>> $$2, aym $$3, dxl $$4, dbk $$5, duc $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eaf<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
