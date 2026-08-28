import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record ftk(dzw a, jz<dwz> b, dzt c, jt<ala> d, alc e, ddr f) {
   public ftk(dzu $$0, jt<ala> $$1, alc $$2, ddr $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public ftk(dzw $$0, dzt $$1, jt<ala> $$2, alc $$3, ddr $$4) {
      this($$0, $$2.a(ala.c).d(lu.bb), $$1, $$2.a(ala.c), $$3, $$4);
   }

   public ftk a(dzw $$0, dzt $$1) {
      return new ftk($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public ftk a(ftk.b $$0) {
      return new ftk($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public ftk a(ftk.a $$0) {
      return new ftk(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public ka.b a() {
      return this.d.a();
   }

   public void b() {
      for (dwz $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public dzw c() {
      return this.a;
   }

   public jz<dwz> d() {
      return this.b;
   }

   public dzt e() {
      return this.c;
   }

   public jt<ala> f() {
      return this.d;
   }

   public alc g() {
      return this.e;
   }

   public ddr h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ka.b, dzt, dzt> {
   }

   public interface b extends UnaryOperator<dzw> {
   }
}
