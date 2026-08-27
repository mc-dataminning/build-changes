import java.util.function.Predicate;

public class csx {
   private final els a;
   private final els b;
   private final csx.a c;
   private final csx.b d;
   private final elx e;

   public csx(els $$0, els $$1, csx.a $$2, csx.b $$3, blu $$4) {
      this($$0, $$1, $$2, $$3, elx.a($$4));
   }

   public csx(els $$0, els $$1, csx.a $$2, csx.b $$3, elx $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public els a() {
      return this.b;
   }

   public els b() {
      return this.a;
   }

   public eml a(djg $$0, csu $$1, hx $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eml a(eeq $$0, csu $$1, hx $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : emi.a();
   }

   public static enum a implements csx.c {
      a(djf.a::b),
      b(djf.a::a),
      c(djf.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(asg.aP) ? emi.b() : emi.a());

      private final csx.c e;

      private a(csx.c $$0) {
         this.e = $$0;
      }

      @Override
      public eml get(djg $$0, csu $$1, hx $$2, elx $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eeq::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(asl.a));

      private final Predicate<eeq> e;

      private b(Predicate<eeq> $$0) {
         this.e = $$0;
      }

      public boolean a(eeq $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eml get(djg var1, csu var2, hx var3, elx var4);
   }
}
