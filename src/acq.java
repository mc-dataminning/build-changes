import java.util.Optional;

public record acq(fba b, Optional<fba> c, lr d, jr<avz> e) implements yv<abk> {
   public static final ym<vz, acq> a = ym.a(fba.b, acq::b, fba.b.a(yk::a), acq::e, lt.bj, acq::f, avz.d, acq::g, acq::new);

   @Override
   public yx<acq> a() {
      return agd.E;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public Optional<fba> e() {
      return this.c;
   }

   public lr f() {
      return this.d;
   }

   public jr<avz> g() {
      return this.e;
   }
}
