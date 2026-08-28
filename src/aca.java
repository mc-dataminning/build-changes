import java.util.function.BiFunction;

public class aca implements zf<abt> {
   public static final yw<wj, aca> a = yw.a(jd.b, aca::b, yu.a(lu.h), aca::e, yu.p, aca::f, aca::new);
   private final jd b;
   private final dqh<?> c;
   private final ua d;

   public static aca a(dqf $$0, BiFunction<dqf, ka, ua> $$1) {
      ka $$2 = $$0.i().H_();
      return new aca($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static aca a(dqf $$0) {
      return a($$0, dqf::a);
   }

   private aca(jd $$0, dqh<?> $$1, ua $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zh<aca> a() {
      return agf.i;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public dqh<?> e() {
      return this.c;
   }

   public ua f() {
      return this.d;
   }
}
