import java.util.function.BiFunction;

public class aco implements zs<ach> {
   public static final zj<ww, aco> a = zj.a(jh.b, aco::b, zh.a(ma.h), aco::e, zh.q, aco::f, aco::new);
   private final jh b;
   private final dst<?> c;
   private final un d;

   public static aco a(dsr $$0, BiFunction<dsr, ke, un> $$1) {
      ke $$2 = $$0.i().H_();
      return new aco($$0.aB_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static aco a(dsr $$0) {
      return a($$0, dsr::a);
   }

   private aco(jh $$0, dst<?> $$1, un $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zu<aco> a() {
      return agw.i;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public dst<?> e() {
      return this.c;
   }

   public un f() {
      return this.d;
   }
}
