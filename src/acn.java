import java.util.function.BiFunction;

public class acn implements zr<acg> {
   public static final zi<wv, acn> a = zi.a(jh.b, acn::b, zg.a(mb.h), acn::e, zg.s, acn::f, acn::new);
   private final jh b;
   private final dus<?> c;
   private final um d;

   public static acn a(duq $$0, BiFunction<duq, ke, um> $$1) {
      ke $$2 = $$0.i().K_();
      return new acn($$0.aB_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static acn a(duq $$0) {
      return a($$0, duq::a);
   }

   private acn(jh $$0, dus<?> $$1, um $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zt<acn> a() {
      return agz.i;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public dus<?> e() {
      return this.c;
   }

   public um f() {
      return this.d;
   }
}
