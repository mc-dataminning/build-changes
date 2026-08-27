import java.util.function.BiFunction;

public class aat implements yb<aam> {
   public static final xs<vf, aat> a = xs.a(ib.b, aat::b, xq.a(kj.h), aat::e, xq.k, aat::f, aat::new);
   private final ib b;
   private final dki<?> c;
   private final ta d;

   public static aat a(dkg $$0, BiFunction<dkg, iz, ta> $$1) {
      iz $$2 = $$0.i().H_();
      return new aat($$0.aC_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static aat a(dkg $$0) {
      return a($$0, dkg::a);
   }

   private aat(ib $$0, dki<?> $$1, ta $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yd<aat> a() {
      return aex.i;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public dki<?> e() {
      return this.c;
   }

   public ta f() {
      return this.d;
   }
}
