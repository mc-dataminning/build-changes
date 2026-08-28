import java.util.Set;

public record adu(int b, bwl c, Set<bwm> d) implements yw<abl> {
   public static final yn<vl, adu> a = yn.a(yl.h, adu::b, bwl.a, adu::e, bwm.m, adu::f, adu::new);

   public static adu a(int $$0, bwl $$1, Set<bwm> $$2) {
      return new adu($$0, $$1, $$2);
   }

   @Override
   public yy<adu> a() {
      return agd.ah;
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
}
