import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fso(dzd a, jw<dwg> b, dza c, jq<akt> d, akv e, dda f) {
   public fso(dzb $$0, jq<akt> $$1, akv $$2, dda $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fso(dzd $$0, dza $$1, jq<akt> $$2, akv $$3, dda $$4) {
      this($$0, $$2.a(akt.c).d(lr.ba), $$1, $$2.a(akt.c), $$3, $$4);
   }

   public fso a(dzd $$0, dza $$1) {
      return new fso($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fso a(fso.b $$0) {
      return new fso($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fso a(fso.a $$0) {
      return new fso(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jx.b a() {
      return this.d.a();
   }

   public void b() {
      for (dwg $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public dzd c() {
      return this.a;
   }

   public jw<dwg> d() {
      return this.b;
   }

   public dza e() {
      return this.c;
   }

   public jq<akt> f() {
      return this.d;
   }

   public akv g() {
      return this.e;
   }

   public dda h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jx.b, dza, dza> {
   }

   public interface b extends UnaryOperator<dzd> {
   }
}
