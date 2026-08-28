import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fry(dyq a, jv<dvt> b, dyn c, jp<aln> d, alp e, dcq f) {
   public fry(dyo $$0, jp<aln> $$1, alp $$2, dcq $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fry(dyq $$0, dyn $$1, jp<aln> $$2, alp $$3, dcq $$4) {
      this($$0, $$2.a(aln.c).d(lq.aT), $$1, $$2.a(aln.c), $$3, $$4);
   }

   public fry a(dyq $$0, dyn $$1) {
      return new fry($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fry a(fry.b $$0) {
      return new fry($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fry a(fry.a $$0) {
      return new fry(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jw.b a() {
      return this.d.a();
   }

   public dyq b() {
      return this.a;
   }

   public jv<dvt> c() {
      return this.b;
   }

   public dyn d() {
      return this.c;
   }

   public jp<aln> e() {
      return this.d;
   }

   public alp f() {
      return this.e;
   }

   public dcq g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jw.b, dyn, dyn> {
   }

   public interface b extends UnaryOperator<dyq> {
   }
}
