import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fol(dvp a, iy<dss> b, dvm c, is<akc> d, akd e, czr f) {
   public fol(dvn $$0, is<akc> $$1, akd $$2, czr $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fol(dvp $$0, dvm $$1, is<akc> $$2, akd $$3, czr $$4) {
      this($$0, $$2.a(akc.c).d(ks.aP), $$1, $$2.a(akc.c), $$3, $$4);
   }

   public fol a(dvp $$0, dvm $$1) {
      return new fol($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fol a(fol.b $$0) {
      return new fol($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fol a(fol.a $$0) {
      return new fol(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iz.b a() {
      return this.d.a();
   }

   public dvp b() {
      return this.a;
   }

   public iy<dss> c() {
      return this.b;
   }

   public dvm d() {
      return this.c;
   }

   public is<akc> e() {
      return this.d;
   }

   public akd f() {
      return this.e;
   }

   public czr g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iz.b, dvm, dvm> {
   }

   public interface b extends UnaryOperator<dvp> {
   }
}
