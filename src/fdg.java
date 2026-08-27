import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fdg(dlq a, hq<dit> b, dln c, hl<aff> d, afg e, cqo f) {
   public fdg(dlo $$0, hl<aff> $$1, afg $$2, cqo $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fdg(dlq $$0, dln $$1, hl<aff> $$2, afg $$3, cqo $$4) {
      this($$0, $$2.a(aff.c).d(jc.aI), $$1, $$2.a(aff.c), $$3, $$4);
   }

   public fdg a(dlq $$0, dln $$1) {
      return new fdg($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fdg a(fdg.b $$0) {
      return new fdg($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fdg a(fdg.a $$0) {
      return new fdg(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hr.b a() {
      return this.d.a();
   }

   public dlq b() {
      return this.a;
   }

   public hq<dit> c() {
      return this.b;
   }

   public dln d() {
      return this.c;
   }

   public hl<aff> e() {
      return this.d;
   }

   public afg f() {
      return this.e;
   }

   public cqo g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hr.b, dln, dln> {
   }

   public interface b extends UnaryOperator<dlq> {
   }
}
