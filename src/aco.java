import java.util.function.BiFunction;

public class aco implements zv<ach> {
   public static final zm<wz, aco> a = zm.a(iz.b, aco::b, zk.a(lq.h), aco::e, zk.p, aco::f, aco::new);
   private final iz b;
   private final dph<?> c;
   private final ur d;

   public static aco a(dpf $$0, BiFunction<dpf, jw, ur> $$1) {
      jw $$2 = $$0.i().H_();
      return new aco($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static aco a(dpf $$0) {
      return a($$0, dpf::a);
   }

   private aco(iz $$0, dph<?> $$1, ur $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zx<aco> a() {
      return agt.i;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public dph<?> e() {
      return this.c;
   }

   public ur f() {
      return this.d;
   }
}
