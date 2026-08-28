import java.util.function.BiFunction;

public class abu implements zb<abn> {
   public static final ys<wf, abu> a = ys.a(ja.b, abu::b, yq.a(lr.h), abu::e, yq.p, abu::f, abu::new);
   private final ja b;
   private final dps<?> c;
   private final tx d;

   public static abu a(dpq $$0, BiFunction<dpq, jx, tx> $$1) {
      jx $$2 = $$0.i().H_();
      return new abu($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static abu a(dpq $$0) {
      return a($$0, dpq::a);
   }

   private abu(ja $$0, dps<?> $$1, tx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zd<abu> a() {
      return afz.i;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public dps<?> e() {
      return this.c;
   }

   public tx f() {
      return this.d;
   }
}
