import java.util.Optional;

public record afv(String b, String c, int d, Optional<xo> e, Optional<ze> f) implements zv<ach> {
   public static final zm<wz, afv> a = zm.a(zk.l, afv::b, zk.l, afv::e, zk.g, afv::f, xq.e, afv::g, zg.d, afv::h, afv::new);

   @Override
   public zx<afv> a() {
      return agt.aL;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xo> g() {
      return this.e;
   }

   public Optional<ze> h() {
      return this.f;
   }
}
