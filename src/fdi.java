import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fdi(dls a, ht<div> b, dlp c, hn<afh> d, afi e, cqq f) {
   public fdi(dlq $$0, hn<afh> $$1, afi $$2, cqq $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fdi(dls $$0, dlp $$1, hn<afh> $$2, afi $$3, cqq $$4) {
      this($$0, $$2.a(afh.c).d(je.aI), $$1, $$2.a(afh.c), $$3, $$4);
   }

   public fdi a(dls $$0, dlp $$1) {
      return new fdi($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fdi a(fdi.b $$0) {
      return new fdi($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fdi a(fdi.a $$0) {
      return new fdi(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hu.b a() {
      return this.d.a();
   }

   public dls b() {
      return this.a;
   }

   public ht<div> c() {
      return this.b;
   }

   public dlp d() {
      return this.c;
   }

   public hn<afh> e() {
      return this.d;
   }

   public afi f() {
      return this.e;
   }

   public cqq g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hu.b, dlp, dlp> {
   }

   public interface b extends UnaryOperator<dls> {
   }
}
