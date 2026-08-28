import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fsa(dys a, jv<dvv> b, dyp c, jp<alo> d, alq e, dcs f) {
   public fsa(dyq $$0, jp<alo> $$1, alq $$2, dcs $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fsa(dys $$0, dyp $$1, jp<alo> $$2, alq $$3, dcs $$4) {
      this($$0, $$2.a(alo.c).d(lq.aT), $$1, $$2.a(alo.c), $$3, $$4);
   }

   public fsa a(dys $$0, dyp $$1) {
      return new fsa($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fsa a(fsa.b $$0) {
      return new fsa($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fsa a(fsa.a $$0) {
      return new fsa(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jw.b a() {
      return this.d.a();
   }

   public dys b() {
      return this.a;
   }

   public jv<dvv> c() {
      return this.b;
   }

   public dyp d() {
      return this.c;
   }

   public jp<alo> e() {
      return this.d;
   }

   public alq f() {
      return this.e;
   }

   public dcs g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jw.b, dyp, dyp> {
   }

   public interface b extends UnaryOperator<dys> {
   }
}
