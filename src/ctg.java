import java.util.function.Predicate;

public class ctg {
   private final emc a;
   private final emc b;
   private final ctg.a c;
   private final ctg.b d;
   private final emh e;

   public ctg(emc $$0, emc $$1, ctg.a $$2, ctg.b $$3, blw $$4) {
      this($$0, $$1, $$2, $$3, emh.a($$4));
   }

   public ctg(emc $$0, emc $$1, ctg.a $$2, ctg.b $$3, emh $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public emc a() {
      return this.b;
   }

   public emc b() {
      return this.a;
   }

   public emv a(djp $$0, ctd $$1, hx $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public emv a(eez $$0, ctd $$1, hx $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ems.a();
   }

   public static enum a implements ctg.c {
      a(djo.a::b),
      b(djo.a::a),
      c(djo.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(asi.aP) ? ems.b() : ems.a());

      private final ctg.c e;

      private a(ctg.c $$0) {
         this.e = $$0;
      }

      @Override
      public emv get(djp $$0, ctd $$1, hx $$2, emh $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eez::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(asn.a));

      private final Predicate<eez> e;

      private b(Predicate<eez> $$0) {
         this.e = $$0;
      }

      public boolean a(eez $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      emv get(djp var1, ctd var2, hx var3, emh var4);
   }
}
