import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eak<WC extends eaf>(eam<WC> d, WC e) {
   public static final Codec<eak<?>> a = lq.N.r().dispatch($$0 -> $$0.d, eam::c);
   public static final Codec<jj<eak<?>>> b = akg.a(lr.aG, a);
   public static final Codec<jn<eak<?>>> c = jy.a(lr.aG, a);

   public boolean a(ayo $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eah $$0, duh $$1, Function<ja, jj<ddg>> $$2, ayo $$3, dxs $$4, dbn $$5, dug $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eam<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
