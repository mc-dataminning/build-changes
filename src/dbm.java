import java.util.function.Predicate;

public class dbm {
   private final evz a;
   private final evz b;
   private final dbm.a c;
   private final dbm.b d;
   private final ewe e;

   public dbm(evz $$0, evz $$1, dbm.a $$2, dbm.b $$3, bsd $$4) {
      this($$0, $$1, $$2, $$3, ewe.a($$4));
   }

   public dbm(evz $$0, evz $$1, dbm.a $$2, dbm.b $$3, ewe $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evz a() {
      return this.b;
   }

   public evz b() {
      return this.a;
   }

   public ews a(dsh $$0, dbj $$1, ja $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ews a(eob $$0, dbj $$1, ja $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewp.a();
   }

   public static enum a implements dbm.c {
      a(dsg.a::b),
      b(dsg.a::a),
      c(dsg.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avu.aQ) ? ewp.b() : ewp.a());

      private final dbm.c e;

      private a(final dbm.c $$0) {
         this.e = $$0;
      }

      @Override
      public ews get(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eob::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awa.a));

      private final Predicate<eob> e;

      private b(final Predicate<eob> $$0) {
         this.e = $$0;
      }

      public boolean a(eob $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ews get(dsh var1, dbj var2, ja var3, ewe var4);
   }
}
