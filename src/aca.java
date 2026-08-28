import java.util.function.BiFunction;

public class aca implements zf<abu> {
   public static final yw<wj, aca> a = yw.a(iv.b, aca::b, yu.a(mh.e), aca::e, yu.t, aca::f, aca::new);
   private final iv b;
   private final dxo<?> c;
   private final tz d;

   public static aca a(dxm $$0, BiFunction<dxm, jt, tz> $$1) {
      jt $$2 = $$0.i().F_();
      return new aca($$0.ax_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static aca a(dxm $$0) {
      return a($$0, dxm::a);
   }

   private aca(iv $$0, dxo<?> $$1, tz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zh<aca> a() {
      return agn.h;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public iv b() {
      return this.b;
   }

   public dxo<?> e() {
      return this.c;
   }

   public tz f() {
      return this.d;
   }
}
