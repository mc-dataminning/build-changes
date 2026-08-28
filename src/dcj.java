import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dcj(dck b, dci c, OptionalInt d, dbg e, Optional<List<daz>> f) {
   public static final yn<wa, dcj> a = yn.a(dck.a, dcj::a, dci.e, dcj::b, yl.i, dcj::c, yl.a(mc.aH), dcj::d, daz.a.a(yl.a()).a(yl::a), dcj::e, dcj::new);

   public List<cwo> a(bak $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpb $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dck a() {
      return this.b;
   }

   public dci b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dbg d() {
      return this.e;
   }

   public Optional<List<daz>> e() {
      return this.f;
   }
}
