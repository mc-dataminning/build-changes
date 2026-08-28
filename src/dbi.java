import java.util.function.Predicate;

public class dbi {
   private final evs a;
   private final evs b;
   private final dbi.a c;
   private final dbi.b d;
   private final evx e;

   public dbi(evs $$0, evs $$1, dbi.a $$2, dbi.b $$3, bsv $$4) {
      this($$0, $$1, $$2, $$3, evx.a($$4));
   }

   public dbi(evs $$0, evs $$1, dbi.a $$2, dbi.b $$3, evx $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evs a() {
      return this.b;
   }

   public evs b() {
      return this.a;
   }

   public ewl a(dsd $$0, dbf $$1, iz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewl a(enw $$0, dbf $$1, iz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewi.a();
   }

   public static enum a implements dbi.c {
      a(dsc.a::b),
      b(dsc.a::a),
      c(dsc.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aQ) ? ewi.b() : ewi.a());

      private final dbi.c e;

      private a(final dbi.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewl get(dsd $$0, dbf $$1, iz $$2, evx $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(enw::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<enw> e;

      private b(final Predicate<enw> $$0) {
         this.e = $$0;
      }

      public boolean a(enw $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewl get(dsd var1, dbf var2, iz var3, evx var4);
   }
}
