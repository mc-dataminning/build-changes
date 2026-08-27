import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fcr(dlh a, hr<dik> b, dle c, hl<afa> d, afb e, cqf f) {
   public fcr(dlf $$0, hl<afa> $$1, afb $$2, cqf $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fcr(dlh $$0, dle $$1, hl<afa> $$2, afb $$3, cqf $$4) {
      this($$0, $$2.a(afa.c).d(jc.aI), $$1, $$2.a(afa.c), $$3, $$4);
   }

   public fcr a(dlh $$0, dle $$1) {
      return new fcr($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fcr a(fcr.b $$0) {
      return new fcr($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fcr a(fcr.a $$0) {
      return new fcr(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hs.b a() {
      return this.d.a();
   }

   public dlh b() {
      return this.a;
   }

   public hr<dik> c() {
      return this.b;
   }

   public dle d() {
      return this.c;
   }

   public hl<afa> e() {
      return this.d;
   }

   public afb f() {
      return this.e;
   }

   public cqf g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hs.b, dle, dle> {
   }

   public interface b extends UnaryOperator<dlh> {
   }
}
