import java.util.function.Predicate;

public class dbo {
   private final ewf a;
   private final ewf b;
   private final dbo.a c;
   private final dbo.b d;
   private final ewk e;

   public dbo(ewf $$0, ewf $$1, dbo.a $$2, dbo.b $$3, bsg $$4) {
      this($$0, $$1, $$2, $$3, ewk.a($$4));
   }

   public dbo(ewf $$0, ewf $$1, dbo.a $$2, dbo.b $$3, ewk $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ewf a() {
      return this.b;
   }

   public ewf b() {
      return this.a;
   }

   public ewy a(dsk $$0, dbl $$1, ja $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewy a(eoh $$0, dbl $$1, ja $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewv.a();
   }

   public static enum a implements dbo.c {
      a(dsj.a::b),
      b(dsj.a::a),
      c(dsj.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avw.aQ) ? ewv.b() : ewv.a());

      private final dbo.c e;

      private a(final dbo.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewy get(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eoh::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awc.a));

      private final Predicate<eoh> e;

      private b(final Predicate<eoh> $$0) {
         this.e = $$0;
      }

      public boolean a(eoh $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewy get(dsk var1, dbl var2, ja var3, ewk var4);
   }
}
