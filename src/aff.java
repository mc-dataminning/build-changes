import java.util.Optional;

public record aff(String b, String c, int d, Optional<wo> e, Optional<ye> f) implements yv<abk> {
   public static final ym<vz, aff> a = ym.a(yk.o, aff::b, yk.o, aff::e, yk.h, aff::f, wq.e, aff::g, yg.d, aff::h, aff::new);

   @Override
   public yx<aff> a() {
      return agd.aP;
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

   public Optional<wo> g() {
      return this.e;
   }

   public Optional<ye> h() {
      return this.f;
   }
}
