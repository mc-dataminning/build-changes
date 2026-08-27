import java.util.function.BiFunction;

public class aap implements xz<aai> {
   public static final xq<vd, aap> a = xq.a(ib.b, aap::b, xo.a(ki.h), aap::e, xo.k, aap::f, aap::new);
   private final ib b;
   private final djn<?> c;
   private final sy d;

   public static aap a(djl $$0, BiFunction<djl, iy, sy> $$1) {
      iy $$2 = $$0.i().I_();
      return new aap($$0.aD_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static aap a(djl $$0) {
      return a($$0, djl::a);
   }

   private aap(ib $$0, djn<?> $$1, sy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yb<aap> a() {
      return aet.i;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public djn<?> e() {
      return this.c;
   }

   public sy f() {
      return this.d;
   }
}
