import java.util.Optional;

public record ael(String b, String c, int d, Optional<wg> e, Optional<xw> f) implements yn<aay> {
   public static final ye<vr, ael> a = ye.a(yc.k, ael::b, yc.k, ael::e, yc.f, ael::f, wi.e, ael::g, xy.d, ael::h, ael::new);

   @Override
   public yp<ael> a() {
      return afj.aL;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wg> g() {
      return this.e;
   }

   public Optional<xw> h() {
      return this.f;
   }
}
