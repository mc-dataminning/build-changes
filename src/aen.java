import java.util.Optional;

public record aen(String b, String c, int d, Optional<wi> e, Optional<xy> f) implements yp<aba> {
   public static final yg<vt, aen> a = yg.a(ye.k, aen::b, ye.k, aen::e, ye.f, aen::f, wk.e, aen::g, ya.d, aen::h, aen::new);

   @Override
   public yr<aen> a() {
      return afl.aL;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wi> g() {
      return this.e;
   }

   public Optional<xy> h() {
      return this.f;
   }
}
