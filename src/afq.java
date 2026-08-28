import java.util.Optional;

public record afq(String b, String c, int d, Optional<xa> e, Optional<yq> f) implements zh<abw> {
   public static final yy<wl, afq> a = yy.a(yw.p, afq::b, yw.p, afq::e, yw.h, afq::f, xc.e, afq::g, ys.d, afq::h, afq::new);

   @Override
   public zj<afq> a() {
      return agp.aP;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xa> g() {
      return this.e;
   }

   public Optional<yq> h() {
      return this.f;
   }
}
