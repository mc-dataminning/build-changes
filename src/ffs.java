import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record ffs(dnp a, io<dks> b, dnm c, ij<agr> d, ags e, cst f) {
   public ffs(dnn $$0, ij<agr> $$1, ags $$2, cst $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public ffs(dnp $$0, dnm $$1, ij<agr> $$2, ags $$3, cst $$4) {
      this($$0, $$2.a(agr.c).d(jz.aK), $$1, $$2.a(agr.c), $$3, $$4);
   }

   public ffs a(dnp $$0, dnm $$1) {
      return new ffs($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public ffs a(ffs.b $$0) {
      return new ffs($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public ffs a(ffs.a $$0) {
      return new ffs(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public ip.b a() {
      return this.d.a();
   }

   public dnp b() {
      return this.a;
   }

   public io<dks> c() {
      return this.b;
   }

   public dnm d() {
      return this.c;
   }

   public ij<agr> e() {
      return this.d;
   }

   public ags f() {
      return this.e;
   }

   public cst g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ip.b, dnm, dnm> {
   }

   public interface b extends UnaryOperator<dnp> {
   }
}
