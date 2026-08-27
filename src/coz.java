import java.util.function.Predicate;

public class coz {
   private final ehi a;
   private final ehi b;
   private final coz.a c;
   private final coz.b d;
   private final ehn e;

   public coz(ehi $$0, ehi $$1, coz.a $$2, coz.b $$3, bil $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehn.a($$4);
   }

   public ehi a() {
      return this.b;
   }

   public ehi b() {
      return this.a;
   }

   public eib a(dfe $$0, cow $$1, gw $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eib a(eah $$0, cow $$1, gw $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ehy.a();
   }

   public static enum a implements coz.c {
      a(dfd.a::b),
      b(dfd.a::a),
      c(dfd.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apo.aP) ? ehy.b() : ehy.a());

      private final coz.c e;

      private a(coz.c $$0) {
         this.e = $$0;
      }

      @Override
      public eib get(dfe $$0, cow $$1, gw $$2, ehn $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eah::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(apt.a));

      private final Predicate<eah> e;

      private b(Predicate<eah> $$0) {
         this.e = $$0;
      }

      public boolean a(eah $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eib get(dfe var1, cow var2, gw var3, ehn var4);
   }
}
