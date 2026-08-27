import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fhr(dph a, it<dmk> b, dpe c, io<ahm> d, ahn e, cuc f) {
   public fhr(dpf $$0, io<ahm> $$1, ahn $$2, cuc $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fhr(dph $$0, dpe $$1, io<ahm> $$2, ahn $$3, cuc $$4) {
      this($$0, $$2.a(ahm.c).d(ke.aN), $$1, $$2.a(ahm.c), $$3, $$4);
   }

   public fhr a(dph $$0, dpe $$1) {
      return new fhr($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fhr a(fhr.b $$0) {
      return new fhr($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fhr a(fhr.a $$0) {
      return new fhr(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iu.b a() {
      return this.d.a();
   }

   public dph b() {
      return this.a;
   }

   public it<dmk> c() {
      return this.b;
   }

   public dpe d() {
      return this.c;
   }

   public io<ahm> e() {
      return this.d;
   }

   public ahn f() {
      return this.e;
   }

   public cuc g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iu.b, dpe, dpe> {
   }

   public interface b extends UnaryOperator<dph> {
   }
}
