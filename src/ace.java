import java.util.function.BiFunction;

public class ace implements zl<abw> {
   public static final zc<wp, ace> a = zc.a(ir.b, ace::b, za.a(li.h), ace::e, za.p, ace::f, ace::new);
   private final ir b;
   private final dqe<?> c;
   private final uk d;

   public static ace a(dqc $$0, BiFunction<dqc, jo, uk> $$1) {
      jo $$2 = $$0.i().I_();
      return new ace($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static ace a(dqc $$0) {
      return a($$0, dqc::a);
   }

   private ace(ir $$0, dqe<?> $$1, uk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zn<ace> a() {
      return agj.j;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public ir b() {
      return this.b;
   }

   public dqe<?> e() {
      return this.c;
   }

   public uk f() {
      return this.d;
   }
}
