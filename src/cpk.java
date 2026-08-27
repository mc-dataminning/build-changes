import java.util.function.Predicate;

public class cpk {
   private final ehh a;
   private final ehh b;
   private final cpk.a c;
   private final cpk.b d;
   private final ehm e;

   public cpk(ehh $$0, ehh $$1, cpk.a $$2, cpk.b $$3, biw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehm.a($$4);
   }

   public ehh a() {
      return this.b;
   }

   public ehh b() {
      return this.a;
   }

   public eia a(dfd $$0, cph $$1, gw $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eia a(eag $$0, cph $$1, gw $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ehx.a();
   }

   public static enum a implements cpk.c {
      a(dfc.a::b),
      b(dfc.a::a),
      c(dfc.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apv.aP) ? ehx.b() : ehx.a());

      private final cpk.c e;

      private a(cpk.c $$0) {
         this.e = $$0;
      }

      @Override
      public eia get(dfd $$0, cph $$1, gw $$2, ehm $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eag::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aqa.a));

      private final Predicate<eag> e;

      private b(Predicate<eag> $$0) {
         this.e = $$0;
      }

      public boolean a(eag $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eia get(dfd var1, cph var2, gw var3, ehm var4);
   }
}
