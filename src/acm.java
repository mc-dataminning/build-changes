import java.util.function.BiFunction;

public class acm implements zq<acf> {
   public static final zh<wu, acm> a = zh.a(jh.b, acm::b, zf.a(ma.h), acm::e, zf.r, acm::f, acm::new);
   private final jh b;
   private final dta<?> c;
   private final ul d;

   public static acm a(dsy $$0, BiFunction<dsy, ke, ul> $$1) {
      ke $$2 = $$0.i().J_();
      return new acm($$0.aA_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static acm a(dsy $$0) {
      return a($$0, dsy::a);
   }

   private acm(jh $$0, dta<?> $$1, ul $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zs<acm> a() {
      return agu.i;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public dta<?> e() {
      return this.c;
   }

   public ul f() {
      return this.d;
   }
}
