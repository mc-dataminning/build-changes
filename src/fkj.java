import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fkj(drt a, iv<dow> b, drq c, iq<ajh> d, aji e, cwl f) {
   public fkj(drr $$0, iq<ajh> $$1, aji $$2, cwl $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fkj(drt $$0, drq $$1, iq<ajh> $$2, aji $$3, cwl $$4) {
      this($$0, $$2.a(ajh.c).d(kg.aN), $$1, $$2.a(ajh.c), $$3, $$4);
   }

   public fkj a(drt $$0, drq $$1) {
      return new fkj($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fkj a(fkj.b $$0) {
      return new fkj($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fkj a(fkj.a $$0) {
      return new fkj(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iw.b a() {
      return this.d.a();
   }

   public drt b() {
      return this.a;
   }

   public iv<dow> c() {
      return this.b;
   }

   public drq d() {
      return this.c;
   }

   public iq<ajh> e() {
      return this.d;
   }

   public aji f() {
      return this.e;
   }

   public cwl g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iw.b, drq, drq> {
   }

   public interface b extends UnaryOperator<drt> {
   }
}
