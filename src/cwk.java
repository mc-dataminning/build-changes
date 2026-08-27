import java.util.function.Predicate;

public class cwk {
   private final ept a;
   private final ept b;
   private final cwk.a c;
   private final cwk.b d;
   private final epy e;

   public cwk(ept $$0, ept $$1, cwk.a $$2, cwk.b $$3, box $$4) {
      this($$0, $$1, $$2, $$3, epy.a($$4));
   }

   public cwk(ept $$0, ept $$1, cwk.a $$2, cwk.b $$3, epy $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ept a() {
      return this.b;
   }

   public ept b() {
      return this.a;
   }

   public eqm a(dnb $$0, cwh $$1, ib $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eqm a(eip $$0, cwh $$1, ib $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eqj.a();
   }

   public static enum a implements cwk.c {
      a(dna.a::b),
      b(dna.a::a),
      c(dna.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(aun.aQ) ? eqj.b() : eqj.a());

      private final cwk.c e;

      private a(cwk.c $$0) {
         this.e = $$0;
      }

      @Override
      public eqm get(dnb $$0, cwh $$1, ib $$2, epy $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eip::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aus.a));

      private final Predicate<eip> e;

      private b(Predicate<eip> $$0) {
         this.e = $$0;
      }

      public boolean a(eip $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eqm get(dnb var1, cwh var2, ib var3, epy var4);
   }
}
