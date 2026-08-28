import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dfb(dfc b, dfa c, OptionalInt d, ddx e, Optional<List<ddq>> f) {
   public static final yw<wj, dfb> a = yw.a(dfc.a, dfb::a, dfa.e, dfb::b, yu.i, dfb::c, yu.a(mg.af), dfb::d, ddq.a.a(yu.a()).a(yu::a), dfb::e, dfb::new);

   public List<czd> a(baz $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cri $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dfc a() {
      return this.b;
   }

   public dfa b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public ddx d() {
      return this.e;
   }

   public Optional<List<ddq>> e() {
      return this.f;
   }
}
