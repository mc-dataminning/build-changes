import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dgi(dgj b, dgh c, OptionalInt d, dfe e, Optional<List<dex>> f) {
   public static final ze<wp, dgi> a = ze.a(dgj.a, dgi::a, dgh.e, dgi::b, zc.i, dgi::c, zc.a(mi.af), dgi::d, dex.a.a(zc.a()).a(zc::a), dgi::e, dgi::new);

   public List<dak> a(bbm $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cso $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dgj a() {
      return this.b;
   }

   public dgh b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dfe d() {
      return this.e;
   }

   public Optional<List<dex>> e() {
      return this.f;
   }
}
