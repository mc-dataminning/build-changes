import java.util.Optional;

public record afd(String b, String c, int d, Optional<wx> e, Optional<yn> f) implements ze<abq> {
   public static final yv<wi, afd> a = yv.a(yt.k, afd::b, yt.k, afd::e, yt.f, afd::f, wz.e, afd::g, yp.d, afd::h, afd::new);

   @Override
   public zg<afd> a() {
      return agb.aL;
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
