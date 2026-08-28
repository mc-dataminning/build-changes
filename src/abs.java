import java.util.function.BiFunction;

public class abs implements yw<abl> {
   public static final yn<wa, abs> a = yn.a(ji.b, abs::b, yl.a(mc.h), abs::e, yl.s, abs::f, abs::new);
   private final ji b;
   private final dua<?> c;
   private final tq d;

   public static abs a(dty $$0, BiFunction<dty, kf, tq> $$1) {
      kf $$2 = $$0.i().K_();
      return new abs($$0.aA_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static abs a(dty $$0) {
      return a($$0, dty::a);
   }

   private abs(ji $$0, dua<?> $$1, tq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yy<abs> a() {
      return age.i;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public dua<?> e() {
      return this.c;
   }

   public tq f() {
      return this.d;
   }
}
