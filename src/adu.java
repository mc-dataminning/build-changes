import java.util.Set;

public record adu(int b, bvt c, Set<bvu> d) implements yv<abk> {
   public static final ym<vl, adu> a = ym.a(yk.h, adu::b, bvt.a, adu::e, bvu.m, adu::f, adu::new);

   public static adu a(int $$0, bvt $$1, Set<bvu> $$2) {
      return new adu($$0, $$1, $$2);
   }

   @Override
   public yx<adu> a() {
      return agd.ai;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public bvt e() {
      return this.c;
   }

   public Set<bvu> f() {
      return this.d;
   }
}
