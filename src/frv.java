import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record frv(dyn a, jv<dvq> b, dyk c, jp<alk> d, alm e, dcn f) {
   public frv(dyl $$0, jp<alk> $$1, alm $$2, dcn $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public frv(dyn $$0, dyk $$1, jp<alk> $$2, alm $$3, dcn $$4) {
      this($$0, $$2.a(alk.c).d(lq.aT), $$1, $$2.a(alk.c), $$3, $$4);
   }

   public frv a(dyn $$0, dyk $$1) {
      return new frv($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public frv a(frv.b $$0) {
      return new frv($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public frv a(frv.a $$0) {
      return new frv(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jw.b a() {
      return this.d.a();
   }

   public dyn b() {
      return this.a;
   }

   public jv<dvq> c() {
      return this.b;
   }

   public dyk d() {
      return this.c;
   }

   public jp<alk> e() {
      return this.d;
   }

   public alm f() {
      return this.e;
   }

   public dcn g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jw.b, dyk, dyk> {
   }

   public interface b extends UnaryOperator<dyn> {
   }
}
