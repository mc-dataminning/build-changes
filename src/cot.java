import java.util.function.Predicate;

public class cot {
   private final ehf a;
   private final ehf b;
   private final cot.a c;
   private final cot.b d;
   private final ehk e;

   public cot(ehf $$0, ehf $$1, cot.a $$2, cot.b $$3, big $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehk.a($$4);
   }

   public ehf a() {
      return this.b;
   }

   public ehf b() {
      return this.a;
   }

   public ehy a(dey $$0, coq $$1, gv $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ehy a(eab $$0, coq $$1, gv $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ehv.a();
   }

   public static enum a implements cot.c {
      a(dex.a::b),
      b(dex.a::a),
      c(dex.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apj.aP) ? ehv.b() : ehv.a());

      private final cot.c e;

      private a(cot.c $$0) {
         this.e = $$0;
      }

      @Override
      public ehy get(dey $$0, coq $$1, gv $$2, ehk $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eab::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(apo.a));

      private final Predicate<eab> e;

      private b(Predicate<eab> $$0) {
         this.e = $$0;
      }

      public boolean a(eab $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ehy get(dey var1, coq var2, gv var3, ehk var4);
   }
}
