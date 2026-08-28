import java.util.Optional;

public record afr(String b, String c, int d, Optional<xe> e, Optional<yu> f) implements zl<aca> {
   public static final zc<wp, afr> a = zc.a(za.m, afr::b, za.m, afr::e, za.h, afr::f, xg.e, afr::g, yw.d, afr::h, afr::new);

   @Override
   public zn<afr> a() {
      return agp.aM;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xe> g() {
      return this.e;
   }

   public Optional<yu> h() {
      return this.f;
   }
}
