import java.util.function.BiFunction;

public class ach implements zl<aca> {
   public static final zc<wp, ach> a = zc.a(jf.b, ach::b, za.a(lw.h), ach::e, za.q, ach::f, ach::new);
   private final jf b;
   private final drx<?> c;
   private final ug d;

   public static ach a(drv $$0, BiFunction<drv, kc, ug> $$1) {
      kc $$2 = $$0.i().G_();
      return new ach($$0.aC_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static ach a(drv $$0) {
      return a($$0, drv::a);
   }

   private ach(jf $$0, drx<?> $$1, ug $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zn<ach> a() {
      return agp.i;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public jf b() {
      return this.b;
   }

   public drx<?> e() {
      return this.c;
   }

   public ug f() {
      return this.d;
   }
}
