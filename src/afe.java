import java.util.Optional;

public record afe(String b, String c, int d, Optional<wx> e, Optional<yn> f) implements ze<abq> {
   public static final yv<wi, afe> a = yv.a(yt.k, afe::b, yt.k, afe::e, yt.f, afe::f, wz.e, afe::g, yp.d, afe::h, afe::new);

   @Override
   public zg<afe> a() {
      return agc.aL;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wx> g() {
      return this.e;
   }

   public Optional<yn> h() {
      return this.f;
   }
}
