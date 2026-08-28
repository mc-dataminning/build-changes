import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record frz(dyr a, jv<dvu> b, dyo c, jp<aln> d, alp e, dcr f) {
   public frz(dyp $$0, jp<aln> $$1, alp $$2, dcr $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public frz(dyr $$0, dyo $$1, jp<aln> $$2, alp $$3, dcr $$4) {
      this($$0, $$2.a(aln.c).d(lq.aT), $$1, $$2.a(aln.c), $$3, $$4);
   }

   public frz a(dyr $$0, dyo $$1) {
      return new frz($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public frz a(frz.b $$0) {
      return new frz($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public frz a(frz.a $$0) {
      return new frz(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jw.b a() {
      return this.d.a();
   }

   public dyr b() {
      return this.a;
   }

   public jv<dvu> c() {
      return this.b;
   }

   public dyo d() {
      return this.c;
   }

   public jp<aln> e() {
      return this.d;
   }

   public alp f() {
      return this.e;
   }

   public dcr g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jw.b, dyo, dyo> {
   }

   public interface b extends UnaryOperator<dyr> {
   }
}
