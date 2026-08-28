import java.util.Optional;

public record afv(String b, String c, int d, Optional<xi> e, Optional<yy> f) implements zp<ace> {
   public static final zg<wt, afv> a = zg.a(ze.m, afv::b, ze.m, afv::e, ze.h, afv::f, xk.e, afv::g, za.d, afv::h, afv::new);

   @Override
   public zr<afv> a() {
      return agt.aM;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xi> g() {
      return this.e;
   }

   public Optional<yy> h() {
      return this.f;
   }
}
