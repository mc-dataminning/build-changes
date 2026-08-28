import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record ddj(ddk b, ddi c, OptionalInt d, dcg e, Optional<List<dbz>> f) {
   public static final zt<xg, ddj> a = zt.a(ddk.a, ddj::a, ddi.e, ddj::b, zr.i, ddj::c, zr.a(mb.aH), ddj::d, dbz.a.a(zr.a()).a(zr::a), ddj::e, ddj::new);

   public List<cxo> a(bbp $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cqb $$0) {
      if (this.f.isEmpty()) {
         return false;
      } else {
         List<cqa.a<jq<cxk>>> $$1 = this.f.get().stream().map(dcc::a).toList();
         return $$0.a($$1, null);
      }
   }

   public ddk a() {
      return this.b;
   }

   public ddi b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dcg d() {
      return this.e;
   }

   public Optional<List<dbz>> e() {
      return this.f;
   }
}
