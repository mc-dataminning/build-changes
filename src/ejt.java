import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ejt<WC extends ejo>(ejv<WC> d, WC e) {
   public static final Codec<ejt<?>> a = mh.N.q().dispatch($$0 -> $$0.d, ejv::c);
   public static final Codec<jg<ejt<?>>> b = aln.a(mi.aK, a);
   public static final Codec<jk<ejt<?>>> c = jv.a(mi.aK, a);

   public boolean a(bai $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ejq $$0, edn $$1, Function<iw, jg<dlm>> $$2, bai $$3, ehb $$4, djo $$5, edm $$6) {
      return ac.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ejv<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
