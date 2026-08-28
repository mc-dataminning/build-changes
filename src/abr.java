import java.util.function.BiFunction;

public class abr implements yw<abl> {
   public static final yn<wa, abr> a = yn.a(ji.b, abr::b, yl.a(mc.h), abr::e, yl.s, abr::f, abr::new);
   private final ji b;
   private final duu<?> c;
   private final tq d;

   public static abr a(dus $$0, BiFunction<dus, kf, tq> $$1) {
      kf $$2 = $$0.i().F_();
      return new abr($$0.aA_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static abr a(dus $$0) {
      return a($$0, dus::a);
   }

   private abr(ji $$0, duu<?> $$1, tq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yy<abr> a() {
      return agd.h;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public duu<?> e() {
      return this.c;
   }

   public tq f() {
      return this.d;
   }
}
