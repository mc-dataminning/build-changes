import java.util.function.Predicate;

public class cpg {
   private final ehp a;
   private final ehp b;
   private final cpg.a c;
   private final cpg.b d;
   private final ehu e;

   public cpg(ehp $$0, ehp $$1, cpg.a $$2, cpg.b $$3, bis $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehu.a($$4);
   }

   public ehp a() {
      return this.b;
   }

   public ehp b() {
      return this.a;
   }

   public eii a(dfl $$0, cpd $$1, gw $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eii a(eao $$0, cpd $$1, gw $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eif.a();
   }

   public static enum a implements cpg.c {
      a(dfk.a::b),
      b(dfk.a::a),
      c(dfk.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apu.aP) ? eif.b() : eif.a());

      private final cpg.c e;

      private a(cpg.c $$0) {
         this.e = $$0;
      }

      @Override
      public eii get(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eao::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(apz.a));

      private final Predicate<eao> e;

      private b(Predicate<eao> $$0) {
         this.e = $$0;
      }

      public boolean a(eao $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eii get(dfl var1, cpd var2, gw var3, ehu var4);
   }
}
