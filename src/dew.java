import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dew(dex b, dev c, OptionalInt d, dds e, Optional<List<ddl>> f) {
   public static final yw<wj, dew> a = yw.a(dex.a, dew::a, dev.e, dew::b, yu.i, dew::c, yu.a(mg.af), dew::d, ddl.a.a(yu.a()).a(yu::a), dew::e, dew::new);

   public List<cyy> a(baz $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(crd $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dex a() {
      return this.b;
   }

   public dev b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dds d() {
      return this.e;
   }

   public Optional<List<ddl>> e() {
      return this.f;
   }
}
