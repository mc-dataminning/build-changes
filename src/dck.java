import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dck(dcl b, dcj c, OptionalInt d, dbh e, Optional<List<dba>> f) {
   public static final ym<vz, dck> a = ym.a(dcl.a, dck::a, dcj.e, dck::b, yk.i, dck::c, yk.a(mc.aH), dck::d, dba.a.a(yk.a()).a(yk::a), dck::e, dck::new);

   public List<cwp> a(bak $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpc $$0) {
      if (this.f.isEmpty()) {
         return false;
      } else {
         List<cpb.a<jr<cwl>>> $$1 = this.f.get().stream().map(dbd::a).toList();
         return $$0.a($$1, null);
      }
   }

   public dcl a() {
      return this.b;
   }

   public dcj b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dbh d() {
      return this.e;
   }

   public Optional<List<dba>> e() {
      return this.f;
   }
}
