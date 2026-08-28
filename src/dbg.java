import java.util.function.Predicate;

public class dbg {
   private final evq a;
   private final evq b;
   private final dbg.a c;
   private final dbg.b d;
   private final evv e;

   public dbg(evq $$0, evq $$1, dbg.a $$2, dbg.b $$3, bst $$4) {
      this($$0, $$1, $$2, $$3, evv.a($$4));
   }

   public dbg(evq $$0, evq $$1, dbg.a $$2, dbg.b $$3, evv $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evq a() {
      return this.b;
   }

   public evq b() {
      return this.a;
   }

   public ewj a(dsb $$0, dbd $$1, iz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewj a(enu $$0, dbd $$1, iz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewg.a();
   }

   public static enum a implements dbg.c {
      a(dsa.a::b),
      b(dsa.a::a),
      c(dsa.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awo.aQ) ? ewg.b() : ewg.a());

      private final dbg.c e;

      private a(final dbg.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewj get(dsb $$0, dbd $$1, iz $$2, evv $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(enu::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awu.a));

      private final Predicate<enu> e;

      private b(final Predicate<enu> $$0) {
         this.e = $$0;
      }

      public boolean a(enu $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewj get(dsb var1, dbd var2, iz var3, evv var4);
   }
}
