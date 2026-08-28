import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fsb(dyt a, jv<dvw> b, dyq c, jp<alo> d, alq e, dct f) {
   public fsb(dyr $$0, jp<alo> $$1, alq $$2, dct $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fsb(dyt $$0, dyq $$1, jp<alo> $$2, alq $$3, dct $$4) {
      this($$0, $$2.a(alo.c).d(lq.aT), $$1, $$2.a(alo.c), $$3, $$4);
   }

   public fsb a(dyt $$0, dyq $$1) {
      return new fsb($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fsb a(fsb.b $$0) {
      return new fsb($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fsb a(fsb.a $$0) {
      return new fsb(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jw.b a() {
      return this.d.a();
   }

   public dyt b() {
      return this.a;
   }

   public jv<dvw> c() {
      return this.b;
   }

   public dyq d() {
      return this.c;
   }

   public jp<alo> e() {
      return this.d;
   }

   public alq f() {
      return this.e;
   }

   public dct g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jw.b, dyq, dyq> {
   }

   public interface b extends UnaryOperator<dyt> {
   }
}
