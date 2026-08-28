import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record ddc(ddd b, ddb c, OptionalInt d, dby e, Optional<List<dbr>> f) {
   public static final yn<wa, ddc> a = yn.a(ddd.a, ddc::a, ddb.e, ddc::b, yl.i, ddc::c, yl.a(mc.aH), ddc::d, dbr.a.a(yl.a()).a(yl::a), ddc::e, ddc::new);

   public List<cxh> a(bak $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpw $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public ddd a() {
      return this.b;
   }

   public ddb b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dby d() {
      return this.e;
   }

   public Optional<List<dbr>> e() {
      return this.f;
   }
}
