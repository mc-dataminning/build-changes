import java.util.Optional;

public record aex(String b, String c, int d, Optional<ws> e, Optional<yi> f) implements yz<abk> {
   public static final yq<wd, aex> a = yq.a(yo.k, aex::b, yo.k, aex::e, yo.f, aex::f, wu.e, aex::g, yk.d, aex::h, aex::new);

   @Override
   public zb<aex> a() {
      return afv.aL;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<ws> g() {
      return this.e;
   }

   public Optional<yi> h() {
      return this.f;
   }
}
