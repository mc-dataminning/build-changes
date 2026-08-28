import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record deq(der b, dep c, OptionalInt d, ddm e, Optional<List<ddf>> f) {
   public static final yu<wh, deq> a = yu.a(der.a, deq::a, dep.e, deq::b, ys.i, deq::c, ys.a(mg.af), deq::d, ddf.a.a(ys.a()).a(ys::a), deq::e, deq::new);

   public List<cys> a(bax $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cqx $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public der a() {
      return this.b;
   }

   public dep b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public ddm d() {
      return this.e;
   }

   public Optional<List<ddf>> e() {
      return this.f;
   }
}
