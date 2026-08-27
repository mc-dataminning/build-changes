import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fqw(dxr a, jk<duu> b, dxo c, je<akv> d, akx e, dbr f) {
   public fqw(dxp $$0, je<akv> $$1, akx $$2, dbr $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fqw(dxr $$0, dxo $$1, je<akv> $$2, akx $$3, dbr $$4) {
      this($$0, $$2.a(akv.c).d(lf.aT), $$1, $$2.a(akv.c), $$3, $$4);
   }

   public fqw a(dxr $$0, dxo $$1) {
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

   public dxr b() {
      return this.a;
   }

   public jk<duu> c() {
      return this.b;
   }

   public dxo d() {
      return this.c;
   }

   public je<akv> e() {
      return this.d;
   }

   public akx f() {
      return this.e;
   }

   public dbr g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jl.b, dxo, dxo> {
   }

   public interface b extends UnaryOperator<dxr> {
   }
}
