import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fea(dmi a, io<djl> b, dmf c, ij<agf> d, agg e, crs f) {
   public fea(dmg $$0, ij<agf> $$1, agg $$2, crs $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fea(dmi $$0, dmf $$1, ij<agf> $$2, agg $$3, crs $$4) {
      this($$0, $$2.a(agf.c).d(jz.aJ), $$1, $$2.a(agf.c), $$3, $$4);
   }

   public fea a(dmi $$0, dmf $$1) {
      return new fea($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fea a(fea.b $$0) {
      return new fea($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fea a(fea.a $$0) {
      return new fea(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public ip.b a() {
      return this.d.a();
   }

   public dmi b() {
      return this.a;
   }

   public io<djl> c() {
      return this.b;
   }

   public dmf d() {
      return this.c;
   }

   public ij<agf> e() {
      return this.d;
   }

   public agg f() {
      return this.e;
   }

   public crs g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ip.b, dmf, dmf> {
   }

   public interface b extends UnaryOperator<dmi> {
   }
}
