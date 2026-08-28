import java.util.function.Predicate;

public class dbj {
   private final evt a;
   private final evt b;
   private final dbj.a c;
   private final dbj.b d;
   private final evy e;

   public dbj(evt $$0, evt $$1, dbj.a $$2, dbj.b $$3, bsw $$4) {
      this($$0, $$1, $$2, $$3, evy.a($$4));
   }

   public dbj(evt $$0, evt $$1, dbj.a $$2, dbj.b $$3, evy $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evt a() {
      return this.b;
   }

   public evt b() {
      return this.a;
   }

   public ewm a(dse $$0, dbg $$1, iz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewm a(enx $$0, dbg $$1, iz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewj.a();
   }

   public static enum a implements dbj.c {
      a(dsd.a::b),
      b(dsd.a::a),
      c(dsd.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aQ) ? ewj.b() : ewj.a());

      private final dbj.c e;

      private a(final dbj.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewm get(dse $$0, dbg $$1, iz $$2, evy $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(enx::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<enx> e;

      private b(final Predicate<enx> $$0) {
         this.e = $$0;
      }

      public boolean a(enx $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewm get(dse var1, dbg var2, iz var3, evy var4);
   }
}
