import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fsi(dyx a, jw<dwa> b, dyu c, jq<akt> d, akv e, dcy f) {
   public fsi(dyv $$0, jq<akt> $$1, akv $$2, dcy $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fsi(dyx $$0, dyu $$1, jq<akt> $$2, akv $$3, dcy $$4) {
      this($$0, $$2.a(akt.c).d(lr.ba), $$1, $$2.a(akt.c), $$3, $$4);
   }

   public fsi a(dyx $$0, dyu $$1) {
      return new fsi($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fsi a(fsi.b $$0) {
      return new fsi($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fsi a(fsi.a $$0) {
      return new fsi(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jx.b a() {
      return this.d.a();
   }

   public void b() {
      for (dwa $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public dyx c() {
      return this.a;
   }

   public jw<dwa> d() {
      return this.b;
   }

   public dyu e() {
      return this.c;
   }

   public jq<akt> f() {
      return this.d;
   }

   public akv g() {
      return this.e;
   }

   public dcy h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jx.b, dyu, dyu> {
   }

   public interface b extends UnaryOperator<dyx> {
   }
}
