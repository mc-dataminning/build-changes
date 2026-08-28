import java.util.function.BiFunction;

public class acb implements zg<abu> {
   public static final yx<wk, acb> a = yx.a(jd.b, acb::b, yv.a(lu.h), acb::e, yv.p, acb::f, acb::new);
   private final jd b;
   private final dqj<?> c;
   private final ub d;

   public static acb a(dqh $$0, BiFunction<dqh, ka, ub> $$1) {
      ka $$2 = $$0.i().H_();
      return new acb($$0.aD_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static acb a(dqh $$0) {
      return a($$0, dqh::a);
   }

   private acb(jd $$0, dqj<?> $$1, ub $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zi<acb> a() {
      return agg.i;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public dqj<?> e() {
      return this.c;
   }

   public ub f() {
      return this.d;
   }
}
