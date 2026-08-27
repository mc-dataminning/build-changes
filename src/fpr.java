import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fpr(dwo a, ji<dtr> b, dwl c, jc<ako> d, akp e, dao f) {
   public fpr(dwm $$0, jc<ako> $$1, akp $$2, dao $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fpr(dwo $$0, dwl $$1, jc<ako> $$2, akp $$3, dao $$4) {
      this($$0, $$2.a(ako.c).d(ld.aS), $$1, $$2.a(ako.c), $$3, $$4);
   }

   public fpr a(dwo $$0, dwl $$1) {
      return new fpr($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fpr a(fpr.b $$0) {
      return new fpr($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fpr a(fpr.a $$0) {
      return new fpr(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jj.b a() {
      return this.d.a();
   }

   public dwo b() {
      return this.a;
   }

   public ji<dtr> c() {
      return this.b;
   }

   public dwl d() {
      return this.c;
   }

   public jc<ako> e() {
      return this.d;
   }

   public akp f() {
      return this.e;
   }

   public dao g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jj.b, dwl, dwl> {
   }

   public interface b extends UnaryOperator<dwo> {
   }
}
