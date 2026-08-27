import java.util.UUID;

public record abz(int b, UUID c, double d, double e, double f, cpb g, ja<dcz> h) implements zl<abw> {
   public static final zc<wp, abz> a = zc.a(za.g, abz::b, ju.g, abz::e, za.j, abz::f, za.j, abz::g, za.j, abz::h, cpb.a, abz::i, za.b(li.az), abz::j, abz::new);

   public abz(coz $$0) {
      this($$0.al(), $$0.cE(), $$0.dz(), $$0.dB(), $$0.dF(), $$0.r().e().d(), $$0.r().g());
   }

   @Override
   public zn<abz> a() {
      return agj.e;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }

   public double h() {
      return this.f;
   }

   public cpb i() {
      return this.g;
   }

   public ja<dcz> j() {
      return this.h;
   }
}
