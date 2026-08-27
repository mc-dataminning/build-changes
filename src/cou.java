import java.util.function.Predicate;

public class cou {
   private final ehd a;
   private final ehd b;
   private final cou.a c;
   private final cou.b d;
   private final ehi e;

   public cou(ehd $$0, ehd $$1, cou.a $$2, cou.b $$3, bii $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehi.a($$4);
   }

   public ehd a() {
      return this.b;
   }

   public ehd b() {
      return this.a;
   }

   public ehw a(dez $$0, cor $$1, gu $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ehw a(eac $$0, cor $$1, gu $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eht.a();
   }

   public static enum a implements cou.c {
      a(dey.a::b),
      b(dey.a::a),
      c(dey.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apl.aP) ? eht.b() : eht.a());

      private final cou.c e;

      private a(cou.c $$0) {
         this.e = $$0;
      }

      @Override
      public ehw get(dez $$0, cor $$1, gu $$2, ehi $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eac::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(apq.a));

      private final Predicate<eac> e;

      private b(Predicate<eac> $$0) {
         this.e = $$0;
      }

      public boolean a(eac $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ehw get(dez var1, cor var2, gu var3, ehi var4);
   }
}
