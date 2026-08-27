import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fcn(dlf a, hs<dii> b, dlc c, hm<aey> d, aez e, cqd f) {
   public fcn(dld $$0, hm<aey> $$1, aez $$2, cqd $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fcn(dlf $$0, dlc $$1, hm<aey> $$2, aez $$3, cqd $$4) {
      this($$0, $$2.a(aey.c).d(jd.aI), $$1, $$2.a(aey.c), $$3, $$4);
   }

   public fcn a(dlf $$0, dlc $$1) {
      return new fcn($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fcn a(fcn.b $$0) {
      return new fcn($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fcn a(fcn.a $$0) {
      return new fcn(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public ht.b a() {
      return this.d.a();
   }

   public dlf b() {
      return this.a;
   }

   public hs<dii> c() {
      return this.b;
   }

   public dlc d() {
      return this.c;
   }

   public hm<aey> e() {
      return this.d;
   }

   public aez f() {
      return this.e;
   }

   public cqd g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ht.b, dlc, dlc> {
   }

   public interface b extends UnaryOperator<dlf> {
   }
}
