import java.util.Set;

public record aft(int b, bwl c, Set<bwm> d, boolean e) implements yw<abl> {
   public static final yn<vl, aft> a = yn.a(yl.h, aft::b, bwl.a, aft::e, bwm.m, aft::f, yl.b, aft::g, aft::new);

   public static aft a(int $$0, bwl $$1, Set<bwm> $$2, boolean $$3) {
      return new aft($$0, $$1, $$2, $$3);
   }

   @Override
   public yy<aft> a() {
      return agd.bc;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bwl e() {
      return this.c;
   }

   public Set<bwm> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
