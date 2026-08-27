import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fmf(dtm a, iy<dqp> b, dtj c, is<ajq> d, ajr e, cxv f) {
   public fmf(dtk $$0, is<ajq> $$1, ajr $$2, cxv $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fmf(dtm $$0, dtj $$1, is<ajq> $$2, ajr $$3, cxv $$4) {
      this($$0, $$2.a(ajq.c).d(kj.aO), $$1, $$2.a(ajq.c), $$3, $$4);
   }

   public fmf a(dtm $$0, dtj $$1) {
      return new fmf($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fmf a(fmf.b $$0) {
      return new fmf($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fmf a(fmf.a $$0) {
      return new fmf(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public iz.b a() {
      return this.d.a();
   }

   public dtm b() {
      return this.a;
   }

   public iy<dqp> c() {
      return this.b;
   }

   public dtj d() {
      return this.c;
   }

   public is<ajq> e() {
      return this.d;
   }

   public ajr f() {
      return this.e;
   }

   public cxv g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<iz.b, dtj, dtj> {
   }

   public interface b extends UnaryOperator<dtm> {
   }
}
