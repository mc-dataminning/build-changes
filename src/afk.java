import java.util.Optional;

public record afk(String b, String c, int d, Optional<xe> e, Optional<yu> f) implements zl<abw> {
   public static final zc<wp, afk> a = zc.a(za.l, afk::b, za.l, afk::e, za.g, afk::f, xg.e, afk::g, yw.d, afk::h, afk::new);

   @Override
   public zn<afk> a() {
      return agj.aM;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xe> g() {
      return this.e;
   }

   public Optional<yu> h() {
      return this.f;
   }
}
