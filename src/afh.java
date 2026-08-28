import java.util.Optional;

public record afh(String b, String c, int d, Optional<wy> e, Optional<yo> f) implements zf<abt> {
   public static final yw<wj, afh> a = yw.a(yu.l, afh::b, yu.l, afh::e, yu.g, afh::f, xa.e, afh::g, yq.d, afh::h, afh::new);

   @Override
   public zh<afh> a() {
      return agf.aL;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wy> g() {
      return this.e;
   }

   public Optional<yo> h() {
      return this.f;
   }
}
