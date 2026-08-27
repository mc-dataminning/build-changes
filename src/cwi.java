import java.util.function.Predicate;

public class cwi {
   private final epr a;
   private final epr b;
   private final cwi.a c;
   private final cwi.b d;
   private final epw e;

   public cwi(epr $$0, epr $$1, cwi.a $$2, cwi.b $$3, bow $$4) {
      this($$0, $$1, $$2, $$3, epw.a($$4));
   }

   public cwi(epr $$0, epr $$1, cwi.a $$2, cwi.b $$3, epw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public epr a() {
      return this.b;
   }

   public epr b() {
      return this.a;
   }

   public eqk a(dmz $$0, cwf $$1, ib $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eqk a(ein $$0, cwf $$1, ib $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eqh.a();
   }

   public static enum a implements cwi.c {
      a(dmy.a::b),
      b(dmy.a::a),
      c(dmy.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(aun.aQ) ? eqh.b() : eqh.a());

      private final cwi.c e;

      private a(cwi.c $$0) {
         this.e = $$0;
      }

      @Override
      public eqk get(dmz $$0, cwf $$1, ib $$2, epw $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ein::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aus.a));

      private final Predicate<ein> e;

      private b(Predicate<ein> $$0) {
         this.e = $$0;
      }

      public boolean a(ein $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eqk get(dmz var1, cwf var2, ib var3, epw var4);
   }
}
