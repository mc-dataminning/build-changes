import java.util.Optional;

public record afz(String b, String c, int d, Optional<xg> e, Optional<yw> f) implements zo<acf> {
   public static final ze<wp, afz> a = ze.a(zc.p, afz::b, zc.p, afz::e, zc.h, afz::f, xi.e, afz::g, yy.d, afz::h, afz::new);

   @Override
   public zq<afz> a() {
      return agy.aP;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xg> g() {
      return this.e;
   }

   public Optional<yw> h() {
      return this.f;
   }
}
