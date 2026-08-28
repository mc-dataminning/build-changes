import java.util.function.Predicate;

public class diq {
   private final fex a;
   private final fex b;
   private final diq.a c;
   private final diq.b d;
   private final ffc e;

   public diq(fex $$0, fex $$1, diq.a $$2, diq.b $$3, bwi $$4) {
      this($$0, $$1, $$2, $$3, ffc.a($$4));
   }

   public diq(fex $$0, fex $$1, diq.a $$2, diq.b $$3, ffc $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fex a() {
      return this.b;
   }

   public fex b() {
      return this.a;
   }

   public ffr a(eao $$0, din $$1, iv $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ffr a(ewv $$0, din $$1, iv $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ffo.a();
   }

   public static enum a implements diq.c {
      a(ean.a::b),
      b(ean.a::a),
      c(ean.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axc.aT) ? ffo.b() : ffo.a());

      private final diq.c e;

      private a(final diq.c $$0) {
         this.e = $$0;
      }

      @Override
      public ffr get(eao $$0, din $$1, iv $$2, ffc $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ewv::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axh.a));

      private final Predicate<ewv> e;

      private b(final Predicate<ewv> $$0) {
         this.e = $$0;
      }

      public boolean a(ewv $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ffr get(eao var1, din var2, iv var3, ffc var4);
   }
}
