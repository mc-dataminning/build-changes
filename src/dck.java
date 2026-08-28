import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dck(dcl b, dcj c, OptionalInt d, dbh e, Optional<List<dba>> f) {
   public static final yn<wa, dck> a = yn.a(dcl.a, dck::a, dcj.e, dck::b, yl.i, dck::c, yl.a(mc.aH), dck::d, dba.a.a(yl.a()).a(yl::a), dck::e, dck::new);

   public List<cwp> a(bak $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpc $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
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
