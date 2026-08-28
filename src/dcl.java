import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dcl(dcm b, dck c, OptionalInt d, dbi e, Optional<List<dbb>> f) {
   public static final yn<wa, dcl> a = yn.a(dcm.a, dcl::a, dck.e, dcl::b, yl.i, dcl::c, yl.a(mc.aH), dcl::d, dbb.a.a(yl.a()).a(yl::a), dcl::e, dcl::new);

   public List<cwq> a(bak $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpd $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dcm a() {
      return this.b;
   }

   public dck b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dbi d() {
      return this.e;
   }

   public Optional<List<dbb>> e() {
      return this.f;
   }
}
