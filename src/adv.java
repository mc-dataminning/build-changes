import java.util.Set;

public record adv(int b, bvu c, Set<bvv> d) implements yw<abl> {
   public static final yn<vl, adv> a = yn.a(yl.h, adv::b, bvu.a, adv::e, bvv.m, adv::f, adv::new);

   public static adv a(int $$0, bvu $$1, Set<bvv> $$2) {
      return new adv($$0, $$1, $$2);
   }

   @Override
   public yy<adv> a() {
      return age.ai;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bvu e() {
      return this.c;
   }

   public Set<bvv> f() {
      return this.d;
   }
}
