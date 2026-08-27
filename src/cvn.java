import java.util.function.Predicate;

public class cvn {
   private final eov a;
   private final eov b;
   private final cvn.a c;
   private final cvn.b d;
   private final epa e;

   public cvn(eov $$0, eov $$1, cvn.a $$2, cvn.b $$3, bof $$4) {
      this($$0, $$1, $$2, $$3, epa.a($$4));
   }

   public cvn(eov $$0, eov $$1, cvn.a $$2, cvn.b $$3, epa $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public eov a() {
      return this.b;
   }

   public eov b() {
      return this.a;
   }

   public epo a(dme $$0, cvk $$1, ib $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public epo a(ehr $$0, cvk $$1, ib $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : epl.a();
   }

   public static enum a implements cvn.c {
      a(dmd.a::b),
      b(dmd.a::a),
      c(dmd.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(aue.aP) ? epl.b() : epl.a());

      private final cvn.c e;

      private a(cvn.c $$0) {
         this.e = $$0;
      }

      @Override
      public epo get(dme $$0, cvk $$1, ib $$2, epa $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ehr::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(auj.a));

      private final Predicate<ehr> e;

      private b(Predicate<ehr> $$0) {
         this.e = $$0;
      }

      public boolean a(ehr $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      epo get(dme var1, cvk var2, ib var3, epa var4);
   }
}
