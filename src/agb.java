import java.util.Optional;

public record agb(String b, String c, int d, Optional<xk> e, Optional<za> f) implements zr<acg> {
   public static final zi<wv, agb> a = zi.a(zg.o, agb::b, zg.o, agb::e, zg.h, agb::f, xm.e, agb::g, zc.d, agb::h, agb::new);

   @Override
   public zt<agb> a() {
      return agz.aP;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xk> g() {
      return this.e;
   }

   public Optional<za> h() {
      return this.f;
   }
}
