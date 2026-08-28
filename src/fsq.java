import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fsq(dze a, jw<dwh> b, dzb c, jq<akt> d, akv e, ddb f) {
   public fsq(dzc $$0, jq<akt> $$1, akv $$2, ddb $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fsq(dze $$0, dzb $$1, jq<akt> $$2, akv $$3, ddb $$4) {
      this($$0, $$2.a(akt.c).d(lr.ba), $$1, $$2.a(akt.c), $$3, $$4);
   }

   public fsq a(dze $$0, dzb $$1) {
      return new fsq($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fsq a(fsq.b $$0) {
      return new fsq($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fsq a(fsq.a $$0) {
      return new fsq(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jx.b a() {
      return this.d.a();
   }

   public void b() {
      for (dwh $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public dze c() {
      return this.a;
   }

   public jw<dwh> d() {
      return this.b;
   }

   public dzb e() {
      return this.c;
   }

   public jq<akt> f() {
      return this.d;
   }

   public akv g() {
      return this.e;
   }

   public ddb h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jx.b, dzb, dzb> {
   }

   public interface b extends UnaryOperator<dze> {
   }
}
