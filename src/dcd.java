import java.util.function.Predicate;

public class dcd {
   private final eww a;
   private final eww b;
   private final dcd.a c;
   private final dcd.b d;
   private final exb e;

   public dcd(eww $$0, eww $$1, dcd.a $$2, dcd.b $$3, bsq $$4) {
      this($$0, $$1, $$2, $$3, exb.a($$4));
   }

   public dcd(eww $$0, eww $$1, dcd.a $$2, dcd.b $$3, exb $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public eww a() {
      return this.b;
   }

   public eww b() {
      return this.a;
   }

   public exp a(dta $$0, dca $$1, jd $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public exp a(eoy $$0, dca $$1, jd $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : exm.a();
   }

   public static enum a implements dcd.c {
      a(dsz.a::b),
      b(dsz.a::a),
      c(dsz.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awd.aQ) ? exm.b() : exm.a());

      private final dcd.c e;

      private a(final dcd.c $$0) {
         this.e = $$0;
      }

      @Override
      public exp get(dta $$0, dca $$1, jd $$2, exb $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eoy::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awj.a));

      private final Predicate<eoy> e;

      private b(final Predicate<eoy> $$0) {
         this.e = $$0;
      }

      public boolean a(eoy $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      exp get(dta var1, dca var2, jd var3, exb var4);
   }
}
