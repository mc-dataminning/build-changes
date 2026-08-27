import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fik(dpw a, it<dmz> b, dpt c, io<ahq> d, ahr e, cur f) {
   public fik(dpu $$0, io<ahq> $$1, ahr $$2, cur $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fik(dpw $$0, dpt $$1, io<ahq> $$2, ahr $$3, cur $$4) {
      this($$0, $$2.a(ahq.c).d(ke.aN), $$1, $$2.a(ahq.c), $$3, $$4);
   }

   public fik a(dpw $$0, dpt $$1) {
      return new fik($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fik a(fik.b $$0) {
      return new fik($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fik a(fik.a $$0) {
      return new fik(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iu.b a() {
      return this.d.a();
   }

   public dpw b() {
      return this.a;
   }

   public it<dmz> c() {
      return this.b;
   }

   public dpt d() {
      return this.c;
   }

   public io<ahq> e() {
      return this.d;
   }

   public ahr f() {
      return this.e;
   }

   public cur g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iu.b, dpt, dpt> {
   }

   public interface b extends UnaryOperator<dpw> {
   }
}
