import java.util.Set;

public record aft(int b, bvs c, Set<bvt> d, boolean e) implements yv<abk> {
   public static final ym<vl, aft> a = ym.a(yk.h, aft::b, bvs.a, aft::e, bvt.m, aft::f, yk.b, aft::g, aft::new);

   public static aft a(int $$0, bvs $$1, Set<bvt> $$2, boolean $$3) {
      return new aft($$0, $$1, $$2, $$3);
   }

   @Override
   public yx<aft> a() {
      return agd.bd;
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

   public boolean g() {
      return this.e;
   }
}
