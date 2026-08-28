import java.util.function.BiFunction;

public class aby implements zd<abs> {
   public static final yu<wh, aby> a = yu.a(iu.b, aby::b, ys.a(mg.e), aby::e, ys.s, aby::f, aby::new);
   private final iu b;
   private final dwp<?> c;
   private final tx d;

   public static aby a(dwn $$0, BiFunction<dwn, js, tx> $$1) {
      js $$2 = $$0.i().F_();
      return new aby($$0.aw_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static aby a(dwn $$0) {
      return a($$0, dwn::a);
   }

   private aby(iu $$0, dwp<?> $$1, tx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zf<aby> a() {
      return agl.h;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public dwp<?> e() {
      return this.c;
   }

   public tx f() {
      return this.d;
   }
}
