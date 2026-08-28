import java.util.function.Predicate;

public class dbh {
   private final evr a;
   private final evr b;
   private final dbh.a c;
   private final dbh.b d;
   private final evw e;

   public dbh(evr $$0, evr $$1, dbh.a $$2, dbh.b $$3, bsu $$4) {
      this($$0, $$1, $$2, $$3, evw.a($$4));
   }

   public dbh(evr $$0, evr $$1, dbh.a $$2, dbh.b $$3, evw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evr a() {
      return this.b;
   }

   public evr b() {
      return this.a;
   }

   public ewk a(dsc $$0, dbe $$1, iz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewk a(env $$0, dbe $$1, iz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewh.a();
   }

   public static enum a implements dbh.c {
      a(dsb.a::b),
      b(dsb.a::a),
      c(dsb.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aQ) ? ewh.b() : ewh.a());

      private final dbh.c e;

      private a(final dbh.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewk get(dsc $$0, dbe $$1, iz $$2, evw $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(env::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<env> e;

      private b(final Predicate<env> $$0) {
         this.e = $$0;
      }

      public boolean a(env $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewk get(dsc var1, dbe var2, iz var3, evw var4);
   }
}
