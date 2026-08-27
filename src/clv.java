import java.util.function.Predicate;

public class clv {
   private final eei a;
   private final eei b;
   private final clv.a c;
   private final clv.b d;
   private final een e;

   public clv(eei $$0, eei $$1, clv.a $$2, clv.b $$3, bfj $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = een.a($$4);
   }

   public eei a() {
      return this.b;
   }

   public eei b() {
      return this.a;
   }

   public efb a(dcb $$0, cls $$1, gu $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public efb a(dxe $$0, cls $$1, gu $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eey.a();
   }

   public static enum a implements clv.c {
      a(dca.a::b),
      b(dca.a::a),
      c(dca.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(amw.aO) ? eey.b() : eey.a());

      private final clv.c e;

      private a(clv.c $$0) {
         this.e = $$0;
      }

      @Override
      public efb get(dcb $$0, cls $$1, gu $$2, een $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(dxe::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(anb.a));

      private final Predicate<dxe> e;

      private b(Predicate<dxe> $$0) {
         this.e = $$0;
      }

      public boolean a(dxe $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      efb get(dcb var1, cls var2, gu var3, een var4);
   }
}
