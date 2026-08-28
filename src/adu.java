import java.util.Set;

public record adu(int b, bvs c, Set<bvt> d) implements yv<abk> {
   public static final ym<vl, adu> a = ym.a(yk.h, adu::b, bvs.a, adu::e, bvt.m, adu::f, adu::new);

   public static adu a(int $$0, bvs $$1, Set<bvt> $$2) {
      return new adu($$0, $$1, $$2);
   }

   @Override
   public yx<adu> a() {
      return agd.ai;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public bvs e() {
      return this.c;
   }

   public Set<bvt> f() {
      return this.d;
   }
}
