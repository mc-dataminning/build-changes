import java.util.Optional;

public record afy(String b, String c, int d, Optional<xl> e, Optional<zb> f) implements zs<ach> {
   public static final zj<ww, afy> a = zj.a(zh.m, afy::b, zh.m, afy::e, zh.h, afy::f, xn.e, afy::g, zd.d, afy::h, afy::new);

   @Override
   public zu<afy> a() {
      return agw.aM;
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

   public Optional<xl> g() {
      return this.e;
   }

   public Optional<zb> h() {
      return this.f;
   }
}
