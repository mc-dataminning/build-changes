import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fqb(dwx a, jj<dua> b, dwu c, jd<akq> d, aks e, dax f) {
   public fqb(dwv $$0, jd<akq> $$1, aks $$2, dax $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fqb(dwx $$0, dwu $$1, jd<akq> $$2, aks $$3, dax $$4) {
      this($$0, $$2.a(akq.c).d(le.aT), $$1, $$2.a(akq.c), $$3, $$4);
   }

   public fqb a(dwx $$0, dwu $$1) {
      return new fqb($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fqb a(fqb.b $$0) {
      return new fqb($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fqb a(fqb.a $$0) {
      return new fqb(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jk.b a() {
      return this.d.a();
   }

   public dwx b() {
      return this.a;
   }

   public jj<dua> c() {
      return this.b;
   }

   public dwu d() {
      return this.c;
   }

   public jd<akq> e() {
      return this.d;
   }

   public aks f() {
      return this.e;
   }

   public dax g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jk.b, dwu, dwu> {
   }

   public interface b extends UnaryOperator<dwx> {
   }
}
