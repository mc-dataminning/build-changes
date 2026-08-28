import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dfi(dfj b, dfh c, OptionalInt d, dee e, Optional<List<ddx>> f) {
   public static final yw<wj, dfi> a = yw.a(dfj.a, dfi::a, dfh.e, dfi::b, yu.i, dfi::c, yu.a(mh.af), dfi::d, ddx.a.a(yu.a()).a(yu::a), dfi::e, dfi::new);

   public List<czk> a(baz $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(crp $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dfj a() {
      return this.b;
   }

   public dfh b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dee d() {
      return this.e;
   }

   public Optional<List<ddx>> e() {
      return this.f;
   }
}
