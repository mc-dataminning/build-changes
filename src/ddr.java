import java.util.function.Predicate;

public class ddr {
   private final eyw a;
   private final eyw b;
   private final ddr.a c;
   private final ddr.b d;
   private final ezb e;

   public ddr(eyw $$0, eyw $$1, ddr.a $$2, ddr.b $$3, btr $$4) {
      this($$0, $$1, $$2, $$3, ezb.a($$4));
   }

   public ddr(eyw $$0, eyw $$1, ddr.a $$2, ddr.b $$3, ezb $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public eyw a() {
      return this.b;
   }

   public eyw b() {
      return this.a;
   }

   public ezq a(dus $$0, ddo $$1, jf $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ezq a(eqt $$0, ddo $$1, jf $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ezn.a();
   }

   public static enum a implements ddr.c {
      a(dur.a::b),
      b(dur.a::a),
      c(dur.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awv.aR) ? ezn.b() : ezn.a());

      private final ddr.c e;

      private a(final ddr.c $$0) {
         this.e = $$0;
      }

      @Override
      public ezq get(dus $$0, ddo $$1, jf $$2, ezb $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eqt::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axb.a));

      private final Predicate<eqt> e;

      private b(final Predicate<eqt> $$0) {
         this.e = $$0;
      }

      public boolean a(eqt $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ezq get(dus var1, ddo var2, jf var3, ezb var4);
   }
}
