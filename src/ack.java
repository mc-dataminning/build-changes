import java.util.function.BiFunction;

public class ack implements zo<acd> {
   public static final zf<ws, ack> a = zf.a(jg.b, ack::b, zd.a(ly.h), ack::e, zd.q, ack::f, ack::new);
   private final jg b;
   private final dsi<?> c;
   private final uj d;

   public static ack a(dsg $$0, BiFunction<dsg, kd, uj> $$1) {
      kd $$2 = $$0.i().H_();
      return new ack($$0.aC_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static ack a(dsg $$0) {
      return a($$0, dsg::a);
   }

   private ack(jg $$0, dsi<?> $$1, uj $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zq<ack> a() {
      return ags.i;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public jg b() {
      return this.b;
   }

   public dsi<?> e() {
      return this.c;
   }

   public uj f() {
      return this.d;
   }
}
