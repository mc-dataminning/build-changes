import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record ddd(dde b, ddc c, OptionalInt d, dbi e, Optional<List<dbv>> f) {
   public static final zt<xg, ddd> a = zt.a(dde.a, ddd::a, ddc.e, ddd::b, zr.i, ddd::c, dbi.o, ddd::d, dbv.a.a(zr.a()).a(zr::a), ddd::e, ddd::new);

   public List<cxk> a(ddi.f $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpx $$0) {
      if (this.f.isEmpty()) {
         return false;
      } else {
         List<cpw.a<jq<cxg>>> $$1 = this.f.get().stream().map(dby::a).toList();
         return $$0.a($$1, null);
      }
   }

   public dde a() {
      return this.b;
   }

   public ddc b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dbi d() {
      return this.e;
   }

   public Optional<List<dbv>> e() {
      return this.f;
   }
}
