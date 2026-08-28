import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record ddk(ddl b, ddj c, OptionalInt d, dch e, Optional<List<dca>> f) {
   public static final zt<xg, ddk> a = zt.a(ddl.a, ddk::a, ddj.e, ddk::b, zr.i, ddk::c, zr.a(mb.aH), ddk::d, dca.a.a(zr.a()).a(zr::a), ddk::e, ddk::new);

   public List<cxp> a(bbp $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cqc $$0) {
      if (this.f.isEmpty()) {
         return false;
      } else {
         List<cqb.a<jq<cxl>>> $$1 = this.f.get().stream().map(dcd::a).toList();
         return $$0.a($$1, null);
      }
   }

   public ddl a() {
      return this.b;
   }

   public ddj b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dch d() {
      return this.e;
   }

   public Optional<List<dca>> e() {
      return this.f;
   }
}
