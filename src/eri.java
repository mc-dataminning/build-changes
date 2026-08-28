import java.util.Optional;

public class eri extends eic {
   private final dky a;
   private final ede b;
   private final Optional<erh> c;

   public eri(dky $$0, ede $$1, Optional<erh> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(ehf.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public edc a(dje $$0) {
      return ((edx)this.a.a($$0.h, $$0.i)).F();
   }

   public ebg a(iw $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.K_();
   }

   public dky d() {
      return this.a;
   }

   public Optional<erh> e() {
      return this.c;
   }

   public ede f() {
      return this.b;
   }
}
