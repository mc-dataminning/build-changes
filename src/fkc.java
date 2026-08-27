import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fkc(drm a, iv<dop> b, drj c, iq<ajh> d, aji e, cwh f) {
   public fkc(drk $$0, iq<ajh> $$1, aji $$2, cwh $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fkc(drm $$0, drj $$1, iq<ajh> $$2, aji $$3, cwh $$4) {
      this($$0, $$2.a(ajh.c).d(kg.aN), $$1, $$2.a(ajh.c), $$3, $$4);
   }

   public fkc a(drm $$0, drj $$1) {
      return new fkc($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fkc a(fkc.b $$0) {
      return new fkc($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fkc a(fkc.a $$0) {
      return new fkc(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iw.b a() {
      return this.d.a();
   }

   public drm b() {
      return this.a;
   }

   public iv<dop> c() {
      return this.b;
   }

   public drj d() {
      return this.c;
   }

   public iq<ajh> e() {
      return this.d;
   }

   public aji f() {
      return this.e;
   }

   public cwh g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iw.b, drj, drj> {
   }

   public interface b extends UnaryOperator<drm> {
   }
}
