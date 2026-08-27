import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fha(dow a, ir<dlz> b, dot c, im<ahc> d, ahd e, cts f) {
   public fha(dou $$0, im<ahc> $$1, ahd $$2, cts $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fha(dow $$0, dot $$1, im<ahc> $$2, ahd $$3, cts $$4) {
      this($$0, $$2.a(ahc.c).d(kc.aM), $$1, $$2.a(ahc.c), $$3, $$4);
   }

   public fha a(dow $$0, dot $$1) {
      return new fha($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fha a(fha.b $$0) {
      return new fha($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fha a(fha.a $$0) {
      return new fha(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public is.b a() {
      return this.d.a();
   }

   public dow b() {
      return this.a;
   }

   public ir<dlz> c() {
      return this.b;
   }

   public dot d() {
      return this.c;
   }

   public im<ahc> e() {
      return this.d;
   }

   public ahd f() {
      return this.e;
   }

   public cts g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<is.b, dot, dot> {
   }

   public interface b extends UnaryOperator<dow> {
   }
}
