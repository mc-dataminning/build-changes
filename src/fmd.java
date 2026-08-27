import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fmd(dtk a, iy<dqn> b, dth c, is<ajq> d, ajr e, cxt f) {
   public fmd(dti $$0, is<ajq> $$1, ajr $$2, cxt $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fmd(dtk $$0, dth $$1, is<ajq> $$2, ajr $$3, cxt $$4) {
      this($$0, $$2.a(ajq.c).d(kj.aO), $$1, $$2.a(ajq.c), $$3, $$4);
   }

   public fmd a(dtk $$0, dth $$1) {
      return new fmd($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fmd a(fmd.b $$0) {
      return new fmd($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fmd a(fmd.a $$0) {
      return new fmd(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iz.b a() {
      return this.d.a();
   }

   public dtk b() {
      return this.a;
   }

   public iy<dqn> c() {
      return this.b;
   }

   public dth d() {
      return this.c;
   }

   public is<ajq> e() {
      return this.d;
   }

   public ajr f() {
      return this.e;
   }

   public cxt g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iz.b, dth, dth> {
   }

   public interface b extends UnaryOperator<dtk> {
   }
}
