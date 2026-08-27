import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fqw(dxt a, jk<duw> b, dxq c, je<akw> d, aky e, dbt f) {
   public fqw(dxr $$0, je<akw> $$1, aky $$2, dbt $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fqw(dxt $$0, dxq $$1, je<akw> $$2, aky $$3, dbt $$4) {
      this($$0, $$2.a(akw.c).d(lf.aT), $$1, $$2.a(akw.c), $$3, $$4);
   }

   public fqw a(dxt $$0, dxq $$1) {
      return new fqw($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fqw a(fqw.b $$0) {
      return new fqw($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fqw a(fqw.a $$0) {
      return new fqw(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jl.b a() {
      return this.d.a();
   }

   public dxt b() {
      return this.a;
   }

   public jk<duw> c() {
      return this.b;
   }

   public dxq d() {
      return this.c;
   }

   public je<akw> e() {
      return this.d;
   }

   public aky f() {
      return this.e;
   }

   public dbt g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jl.b, dxq, dxq> {
   }

   public interface b extends UnaryOperator<dxt> {
   }
}
