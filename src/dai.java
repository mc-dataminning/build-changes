import java.util.function.Predicate;

public class dai {
   private final eum a;
   private final eum b;
   private final dai.a c;
   private final dai.b d;
   private final eur e;

   public dai(eum $$0, eum $$1, dai.a $$2, dai.b $$3, brw $$4) {
      this($$0, $$1, $$2, $$3, eur.a($$4));
   }

   public dai(eum $$0, eum $$1, dai.a $$2, dai.b $$3, eur $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public eum a() {
      return this.b;
   }

   public eum b() {
      return this.a;
   }

   public evf a(drd $$0, daf $$1, io $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public evf a(emw $$0, daf $$1, io $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : evc.a();
   }

   public static enum a implements dai.c {
      a(drc.a::b),
      b(drc.a::a),
      c(drc.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avx.aQ) ? evc.b() : evc.a());

      private final dai.c e;

      private a(dai.c $$0) {
         this.e = $$0;
      }

      @Override
      public evf get(drd $$0, daf $$1, io $$2, eur $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(emw::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awc.a));

      private final Predicate<emw> e;

      private b(Predicate<emw> $$0) {
         this.e = $$0;
      }

      public boolean a(emw $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      evf get(drd var1, daf var2, io var3, eur var4);
   }
}
