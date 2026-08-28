import java.util.function.BiFunction;

public class ace implements zj<aby> {
   public static final za<wn, ace> a = za.a(iw.b, ace::b, yy.a(mi.e), ace::e, yy.t, ace::f, ace::new);
   private final iw b;
   private final dyg<?> c;
   private final ua d;

   public static ace a(dye $$0, BiFunction<dye, ju, ua> $$1) {
      ju $$2 = $$0.i().J_();
      return new ace($$0.aB_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static ace a(dye $$0) {
      return a($$0, dye::a);
   }

   private ace(iw $$0, dyg<?> $$1, ua $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zl<ace> a() {
      return agr.h;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public dyg<?> e() {
      return this.c;
   }

   public ua f() {
      return this.d;
   }
}
