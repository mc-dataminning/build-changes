import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fdb(dlk a, hq<din> b, dlh c, hl<afi> d, afj e, cqu f) {
   public fdb(dli $$0, hl<afi> $$1, afj $$2, cqu $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fdb(dlk $$0, dlh $$1, hl<afi> $$2, afj $$3, cqu $$4) {
      this($$0, $$2.a(afi.c).d(jc.aJ), $$1, $$2.a(afi.c), $$3, $$4);
   }

   public fdb a(dlk $$0, dlh $$1) {
      return new fdb($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fdb a(fdb.b $$0) {
      return new fdb($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fdb a(fdb.a $$0) {
      return new fdb(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hr.b a() {
      return this.d.a();
   }

   public dlk b() {
      return this.a;
   }

   public hq<din> c() {
      return this.b;
   }

   public dlh d() {
      return this.c;
   }

   public hl<afi> e() {
      return this.d;
   }

   public afj f() {
      return this.e;
   }

   public cqu g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hr.b, dlh, dlh> {
   }

   public interface b extends UnaryOperator<dlk> {
   }
}
