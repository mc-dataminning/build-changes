import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record ddb(ddc b, dda c, OptionalInt d, dby e, Optional<List<dbr>> f) {
   public static final zi<wv, ddb> a = zi.a(ddc.a, ddb::a, dda.e, ddb::b, zg.i, ddb::c, zg.a(mb.aH), ddb::d, dbr.a.a(zg.a()).a(zg::a), ddb::e, ddb::new);

   public List<cxg> a(bbf $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpt $$0) {
      if (this.f.isEmpty()) {
         return false;
      } else {
         List<cps.a<jq<cxc>>> $$1 = this.f.get().stream().map(dbu::a).toList();
         return $$0.a($$1, null);
      }
   }

   public ddc a() {
      return this.b;
   }

   public dda b() {
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
