import java.util.function.BiFunction;

public class acy implements aac<acr> {
   public static final zt<xg, acy> a = zt.a(jh.b, acy::b, zr.a(mb.h), acy::e, zr.s, acy::f, acy::new);
   private final jh b;
   private final duy<?> c;
   private final ux d;

   public static acy a(duw $$0, BiFunction<duw, ke, ux> $$1) {
      ke $$2 = $$0.i().K_();
      return new acy($$0.aB_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static acy a(duw $$0) {
      return a($$0, duw::a);
   }

   private acy(jh $$0, duy<?> $$1, ux $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public aae<acy> a() {
      return ahk.i;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public duy<?> e() {
      return this.c;
   }

   public ux f() {
      return this.d;
   }
}
