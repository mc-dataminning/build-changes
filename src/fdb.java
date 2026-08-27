import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fdb(dll a, ht<dio> b, dli c, hn<afd> d, afe e, cqj f) {
   public fdb(dlj $$0, hn<afd> $$1, afe $$2, cqj $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fdb(dll $$0, dli $$1, hn<afd> $$2, afe $$3, cqj $$4) {
      this($$0, $$2.a(afd.c).d(je.aI), $$1, $$2.a(afd.c), $$3, $$4);
   }

   public fdb a(dll $$0, dli $$1) {
      return new fdb($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fdb a(fdb.b $$0) {
      return new fdb($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fdb a(fdb.a $$0) {
      return new fdb(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hu.b a() {
      return this.d.a();
   }

   public dll b() {
      return this.a;
   }

   public ht<dio> c() {
      return this.b;
   }

   public dli d() {
      return this.c;
   }

   public hn<afd> e() {
      return this.d;
   }

   public afe f() {
      return this.e;
   }

   public cqj g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hu.b, dli, dli> {
   }

   public interface b extends UnaryOperator<dll> {
   }
}
