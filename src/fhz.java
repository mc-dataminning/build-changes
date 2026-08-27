import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fhz(dpo a, it<dmr> b, dpl c, io<ahp> d, ahq e, cuj f) {
   public fhz(dpm $$0, io<ahp> $$1, ahq $$2, cuj $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fhz(dpo $$0, dpl $$1, io<ahp> $$2, ahq $$3, cuj $$4) {
      this($$0, $$2.a(ahp.c).d(ke.aN), $$1, $$2.a(ahp.c), $$3, $$4);
   }

   public fhz a(dpo $$0, dpl $$1) {
      return new fhz($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fhz a(fhz.b $$0) {
      return new fhz($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fhz a(fhz.a $$0) {
      return new fhz(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iu.b a() {
      return this.d.a();
   }

   public dpo b() {
      return this.a;
   }

   public it<dmr> c() {
      return this.b;
   }

   public dpl d() {
      return this.c;
   }

   public io<ahp> e() {
      return this.d;
   }

   public ahq f() {
      return this.e;
   }

   public cuj g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iu.b, dpl, dpl> {
   }

   public interface b extends UnaryOperator<dpo> {
   }
}
