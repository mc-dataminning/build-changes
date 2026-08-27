import java.util.Optional;

public record aez(String b, String c, int d, Optional<wu> e, Optional<yk> f) implements zb<abm> {
   public static final ys<wf, aez> a = ys.a(yq.k, aez::b, yq.k, aez::e, yq.f, aez::f, ww.e, aez::g, ym.d, aez::h, aez::new);

   @Override
   public zd<aez> a() {
      return afx.aL;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wu> g() {
      return this.e;
   }

   public Optional<yk> h() {
      return this.f;
   }
}
