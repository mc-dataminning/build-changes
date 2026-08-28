import java.util.Set;

public record adv(int b, bvt c, Set<bvu> d) implements yw<abl> {
   public static final yn<vl, adv> a = yn.a(yl.h, adv::b, bvt.a, adv::e, bvu.m, adv::f, adv::new);

   public static adv a(int $$0, bvt $$1, Set<bvu> $$2) {
      return new adv($$0, $$1, $$2);
   }

   @Override
   public yy<adv> a() {
      return age.ai;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bvt e() {
      return this.c;
   }

   public Set<bvu> f() {
      return this.d;
   }
}
