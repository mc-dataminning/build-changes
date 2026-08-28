import java.util.function.BiFunction;

public class aca implements zf<abu> {
   public static final yw<wj, aca> a = yw.a(iu.b, aca::b, yu.a(mg.e), aca::e, yu.s, aca::f, aca::new);
   private final iu b;
   private final dxh<?> c;
   private final tz d;

   public static aca a(dxf $$0, BiFunction<dxf, js, tz> $$1) {
      js $$2 = $$0.i().F_();
      return new aca($$0.ax_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static aca a(dxf $$0) {
      return a($$0, dxf::a);
   }

   private aca(iu $$0, dxh<?> $$1, tz $$2) {
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

   public iu b() {
      return this.b;
   }

   public dxh<?> e() {
      return this.c;
   }

   public tz f() {
      return this.d;
   }
}
