import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record ezi(dii a, hr<dfl> b, dif c, hl<acz> d, ada e, cnf f) {
   public ezi(dig $$0, hl<acz> $$1, ada $$2, cnf $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public ezi(dii $$0, dif $$1, hl<acz> $$2, ada $$3, cnf $$4) {
      this($$0, $$2.a(acz.c).d(jc.aI), $$1, $$2.a(acz.c), $$3, $$4);
   }

   public ezi a(dii $$0, dif $$1) {
      return new ezi($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public ezi a(ezi.b $$0) {
      return new ezi($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public ezi a(ezi.a $$0) {
      return new ezi(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hs.b a() {
      return this.d.a();
   }

   public dii b() {
      return this.a;
   }

   public hr<dfl> c() {
      return this.b;
   }

   public dif d() {
      return this.c;
   }

   public hl<acz> e() {
      return this.d;
   }

   public ada f() {
      return this.e;
   }

   public cnf g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hs.b, dif, dif> {
   }

   public interface b extends UnaryOperator<dii> {
   }
}
