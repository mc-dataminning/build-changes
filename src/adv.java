import java.util.Set;

public record adv(int b, bvv c, Set<bvw> d) implements yw<abl> {
   public static final yn<vl, adv> a = yn.a(yl.h, adv::b, bvv.a, adv::e, bvw.m, adv::f, adv::new);

   public static adv a(int $$0, bvv $$1, Set<bvw> $$2) {
      return new adv($$0, $$1, $$2);
   }

   @Override
   public yy<adv> a() {
      return age.ai;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bvv e() {
      return this.c;
   }

   public Set<bvw> f() {
      return this.d;
   }
}
