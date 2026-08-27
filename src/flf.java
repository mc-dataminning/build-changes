import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record flf(dso a, ix<dpr> b, dsl c, is<ajl> d, ajm e, cwy f) {
   public flf(dsm $$0, is<ajl> $$1, ajm $$2, cwy $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public flf(dso $$0, dsl $$1, is<ajl> $$2, ajm $$3, cwy $$4) {
      this($$0, $$2.a(ajl.c).d(ki.aO), $$1, $$2.a(ajl.c), $$3, $$4);
   }

   public flf a(dso $$0, dsl $$1) {
      return new flf($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public flf a(flf.b $$0) {
      return new flf($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public flf a(flf.a $$0) {
      return new flf(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iy.b a() {
      return this.d.a();
   }

   public dso b() {
      return this.a;
   }

   public ix<dpr> c() {
      return this.b;
   }

   public dsl d() {
      return this.c;
   }

   public is<ajl> e() {
      return this.d;
   }

   public ajm f() {
      return this.e;
   }

   public cwy g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iy.b, dsl, dsl> {
   }

   public interface b extends UnaryOperator<dso> {
   }
}
