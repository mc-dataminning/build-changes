import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fte(dzt a, jz<dww> b, dzq c, jt<akz> d, alb e, ddp f) {
   public fte(dzr $$0, jt<akz> $$1, alb $$2, ddp $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fte(dzt $$0, dzq $$1, jt<akz> $$2, alb $$3, ddp $$4) {
      this($$0, $$2.a(akz.c).d(lu.bb), $$1, $$2.a(akz.c), $$3, $$4);
   }

   public fte a(dzt $$0, dzq $$1) {
      return new fte($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fte a(fte.b $$0) {
      return new fte($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fte a(fte.a $$0) {
      return new fte(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public ka.b a() {
      return this.d.a();
   }

   public void b() {
      for (dww $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public dzt c() {
      return this.a;
   }

   public jz<dww> d() {
      return this.b;
   }

   public dzq e() {
      return this.c;
   }

   public jt<akz> f() {
      return this.d;
   }

   public alb g() {
      return this.e;
   }

   public ddp h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ka.b, dzq, dzq> {
   }

   public interface b extends UnaryOperator<dzt> {
   }
}
