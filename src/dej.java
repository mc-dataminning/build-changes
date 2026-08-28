import java.util.function.Predicate;

public class dej {
   private final ezn a;
   private final ezn b;
   private final dej.a c;
   private final dej.b d;
   private final ezs e;

   public dej(ezn $$0, ezn $$1, dej.a $$2, dej.b $$3, bue $$4) {
      this($$0, $$1, $$2, $$3, ezs.a($$4));
   }

   public dej(ezn $$0, ezn $$1, dej.a $$2, dej.b $$3, ezs $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ezn a() {
      return this.b;
   }

   public ezn b() {
      return this.a;
   }

   public fah a(dvj $$0, deg $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fah a(erk $$0, deg $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fae.a();
   }

   public static enum a implements dej.c {
      a(dvi.a::b),
      b(dvi.a::a),
      c(dvi.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axa.aR) ? fae.b() : fae.a());

      private final dej.c e;

      private a(final dej.c $$0) {
         this.e = $$0;
      }

      @Override
      public fah get(dvj $$0, deg $$1, jh $$2, ezs $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(erk::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axg.a));

      private final Predicate<erk> e;

      private b(final Predicate<erk> $$0) {
         this.e = $$0;
      }

      public boolean a(erk $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fah get(dvj var1, deg var2, jh var3, ezs var4);
   }
}
