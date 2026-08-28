import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fsc(dyu a, jv<dvx> b, dyr c, jp<alo> d, alq e, dcu f) {
   public fsc(dys $$0, jp<alo> $$1, alq $$2, dcu $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fsc(dyu $$0, dyr $$1, jp<alo> $$2, alq $$3, dcu $$4) {
      this($$0, $$2.a(alo.c).d(lq.aT), $$1, $$2.a(alo.c), $$3, $$4);
   }

   public fsc a(dyu $$0, dyr $$1) {
      return new fsc($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fsc a(fsc.b $$0) {
      return new fsc($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fsc a(fsc.a $$0) {
      return new fsc(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jw.b a() {
      return this.d.a();
   }

   public dyu b() {
      return this.a;
   }

   public jv<dvx> c() {
      return this.b;
   }

   public dyr d() {
      return this.c;
   }

   public jp<alo> e() {
      return this.d;
   }

   public alq f() {
      return this.e;
   }

   public dcu g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jw.b, dyr, dyr> {
   }

   public interface b extends UnaryOperator<dyu> {
   }
}
