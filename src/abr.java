import java.util.function.BiFunction;

public class abr implements yv<abk> {
   public static final ym<vz, abr> a = ym.a(ji.b, abr::b, yk.a(mc.h), abr::e, yk.s, abr::f, abr::new);
   private final ji b;
   private final dub<?> c;
   private final tq d;

   public static abr a(dtz $$0, BiFunction<dtz, kf, tq> $$1) {
      kf $$2 = $$0.i().K_();
      return new abr($$0.aA_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static abr a(dtz $$0) {
      return a($$0, dtz::a);
   }

   private abr(ji $$0, dub<?> $$1, tq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yx<abr> a() {
      return agd.i;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public dub<?> e() {
      return this.c;
   }

   public tq f() {
      return this.d;
   }
}
