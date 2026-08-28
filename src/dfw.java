import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dfw(dfx b, dfv c, OptionalInt d, des e, Optional<List<del>> f) {
   public static final yy<wl, dfw> a = yy.a(dfx.a, dfw::a, dfv.e, dfw::b, yw.i, dfw::c, yw.a(mh.af), dfw::d, del.a.a(yw.a()).a(yw::a), dfw::e, dfw::new);

   public List<czy> a(bbb $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(csd $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dfx a() {
      return this.b;
   }

   public dfv b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public des d() {
      return this.e;
   }

   public Optional<List<del>> e() {
      return this.f;
   }
}
