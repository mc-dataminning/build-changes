import java.util.function.BiFunction;

public class acp implements zw<aci> {
   public static final zn<xa, acp> a = zn.a(iz.b, acp::b, zl.a(lq.h), acp::e, zl.p, acp::f, acp::new);
   private final iz b;
   private final dpk<?> c;
   private final us d;

   public static acp a(dpi $$0, BiFunction<dpi, jw, us> $$1) {
      jw $$2 = $$0.i().H_();
      return new acp($$0.ay_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static acp a(dpi $$0) {
      return a($$0, dpi::a);
   }

   private acp(iz $$0, dpk<?> $$1, us $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zy<acp> a() {
      return agu.i;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public dpk<?> e() {
      return this.c;
   }

   public us f() {
      return this.d;
   }
}
