import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record ffx(dnu a, is<dkx> b, dnr c, in<agv> d, agw e, csy f) {
   public ffx(dns $$0, in<agv> $$1, agw $$2, csy $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public ffx(dnu $$0, dnr $$1, in<agv> $$2, agw $$3, csy $$4) {
      this($$0, $$2.a(agv.c).d(kd.aK), $$1, $$2.a(agv.c), $$3, $$4);
   }

   public ffx a(dnu $$0, dnr $$1) {
      return new ffx($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public ffx a(ffx.b $$0) {
      return new ffx($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public ffx a(ffx.a $$0) {
      return new ffx(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public it.b a() {
      return this.d.a();
   }

   public dnu b() {
      return this.a;
   }

   public is<dkx> c() {
      return this.b;
   }

   public dnr d() {
      return this.c;
   }

   public in<agv> e() {
      return this.d;
   }

   public agw f() {
      return this.e;
   }

   public csy g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<it.b, dnr, dnr> {
   }

   public interface b extends UnaryOperator<dnu> {
   }
}
