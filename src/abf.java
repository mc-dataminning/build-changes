import java.util.function.BiFunction;

public class abf implements yn<aay> {
   public static final ye<vr, abf> a = ye.a(ib.b, abf::b, yc.a(ks.h), abf::e, yc.o, abf::f, abf::new);
   private final ib b;
   private final dmh<?> c;
   private final tm d;

   public static abf a(dmf $$0, BiFunction<dmf, iz, tm> $$1) {
      iz $$2 = $$0.i().H_();
      return new abf($$0.aA_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static abf a(dmf $$0) {
      return a($$0, dmf::a);
   }

   private abf(ib $$0, dmh<?> $$1, tm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yp<abf> a() {
      return afj.i;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public dmh<?> e() {
      return this.c;
   }

   public tm f() {
      return this.d;
   }
}
