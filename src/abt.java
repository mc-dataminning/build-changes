import java.util.function.BiFunction;

public class abt implements zb<abm> {
   public static final ys<wf, abt> a = ys.a(in.b, abt::b, yq.a(le.h), abt::e, yq.o, abt::f, abt::new);
   private final in b;
   private final dno<?> c;
   private final ua d;

   public static abt a(dnm $$0, BiFunction<dnm, jk, ua> $$1) {
      jk $$2 = $$0.i().H_();
      return new abt($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static abt a(dnm $$0) {
      return a($$0, dnm::a);
   }

   private abt(in $$0, dno<?> $$1, ua $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zd<abt> a() {
      return afx.i;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public dno<?> e() {
      return this.c;
   }

   public ua f() {
      return this.d;
   }
}
