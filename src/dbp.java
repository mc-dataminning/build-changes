import java.util.function.Predicate;

public class dbp {
   private final ewh a;
   private final ewh b;
   private final dbp.a c;
   private final dbp.b d;
   private final ewm e;

   public dbp(ewh $$0, ewh $$1, dbp.a $$2, dbp.b $$3, bsh $$4) {
      this($$0, $$1, $$2, $$3, ewm.a($$4));
   }

   public dbp(ewh $$0, ewh $$1, dbp.a $$2, dbp.b $$3, ewm $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ewh a() {
      return this.b;
   }

   public ewh b() {
      return this.a;
   }

   public exa a(dsl $$0, dbm $$1, ja $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public exa a(eoj $$0, dbm $$1, ja $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewx.a();
   }

   public static enum a implements dbp.c {
      a(dsk.a::b),
      b(dsk.a::a),
      c(dsk.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avw.aQ) ? ewx.b() : ewx.a());

      private final dbp.c e;

      private a(final dbp.c $$0) {
         this.e = $$0;
      }

      @Override
      public exa get(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eoj::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awc.a));

      private final Predicate<eoj> e;

      private b(final Predicate<eoj> $$0) {
         this.e = $$0;
      }

      public boolean a(eoj $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      exa get(dsl var1, dbm var2, ja var3, ewm var4);
   }
}
