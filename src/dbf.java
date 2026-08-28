import java.util.function.Predicate;

public class dbf {
   private final evp a;
   private final evp b;
   private final dbf.a c;
   private final dbf.b d;
   private final evu e;

   public dbf(evp $$0, evp $$1, dbf.a $$2, dbf.b $$3, bss $$4) {
      this($$0, $$1, $$2, $$3, evu.a($$4));
   }

   public dbf(evp $$0, evp $$1, dbf.a $$2, dbf.b $$3, evu $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evp a() {
      return this.b;
   }

   public evp b() {
      return this.a;
   }

   public ewi a(dsa $$0, dbc $$1, iz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewi a(ent $$0, dbc $$1, iz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewf.a();
   }

   public static enum a implements dbf.c {
      a(drz.a::b),
      b(drz.a::a),
      c(drz.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awo.aQ) ? ewf.b() : ewf.a());

      private final dbf.c e;

      private a(final dbf.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewi get(dsa $$0, dbc $$1, iz $$2, evu $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ent::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awu.a));

      private final Predicate<ent> e;

      private b(final Predicate<ent> $$0) {
         this.e = $$0;
      }

      public boolean a(ent $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewi get(dsa var1, dbc var2, iz var3, evu var4);
   }
}
