import java.util.function.BiFunction;

public class acc implements zh<abw> {
   public static final yy<wl, acc> a = yy.a(iv.b, acc::b, yw.a(mh.e), acc::e, yw.t, acc::f, acc::new);
   private final iv b;
   private final dye<?> c;
   private final tz d;

   public static acc a(dyc $$0, BiFunction<dyc, jt, tz> $$1) {
      jt $$2 = $$0.i().J_();
      return new acc($$0.aB_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static acc a(dyc $$0) {
      return a($$0, dyc::a);
   }

   private acc(iv $$0, dye<?> $$1, tz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zj<acc> a() {
      return agp.h;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public iv b() {
      return this.b;
   }

   public dye<?> e() {
      return this.c;
   }

   public tz f() {
      return this.d;
   }
}
