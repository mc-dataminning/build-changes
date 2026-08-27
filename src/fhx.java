import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fhx(dpn a, it<dmq> b, dpk c, io<ahp> d, ahq e, cui f) {
   public fhx(dpl $$0, io<ahp> $$1, ahq $$2, cui $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fhx(dpn $$0, dpk $$1, io<ahp> $$2, ahq $$3, cui $$4) {
      this($$0, $$2.a(ahp.c).d(ke.aN), $$1, $$2.a(ahp.c), $$3, $$4);
   }

   public fhx a(dpn $$0, dpk $$1) {
      return new fhx($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fhx a(fhx.b $$0) {
      return new fhx($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fhx a(fhx.a $$0) {
      return new fhx(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iu.b a() {
      return this.d.a();
   }

   public dpn b() {
      return this.a;
   }

   public it<dmq> c() {
      return this.b;
   }

   public dpk d() {
      return this.c;
   }

   public io<ahp> e() {
      return this.d;
   }

   public ahq f() {
      return this.e;
   }

   public cui g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iu.b, dpk, dpk> {
   }

   public interface b extends UnaryOperator<dpn> {
   }
}
