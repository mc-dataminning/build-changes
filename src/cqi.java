import java.util.function.Predicate;

public class cqi {
   private final eif a;
   private final eif b;
   private final cqi.a c;
   private final cqi.b d;
   private final eik e;

   public cqi(eif $$0, eif $$1, cqi.a $$2, cqi.b $$3, bjt $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = eik.a($$4);
   }

   public eif a() {
      return this.b;
   }

   public eif b() {
      return this.a;
   }

   public eiy a(dgb $$0, cqf $$1, ht $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eiy a(ebe $$0, cqf $$1, ht $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eiv.a();
   }

   public static enum a implements cqi.c {
      a(dga.a::b),
      b(dga.a::a),
      c(dga.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(aqs.aP) ? eiv.b() : eiv.a());

      private final cqi.c e;

      private a(cqi.c $$0) {
         this.e = $$0;
      }

      @Override
      public eiy get(dgb $$0, cqf $$1, ht $$2, eik $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ebe::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aqx.a));

      private final Predicate<ebe> e;

      private b(Predicate<ebe> $$0) {
         this.e = $$0;
      }

      public boolean a(ebe $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eiy get(dgb var1, cqf var2, ht var3, eik var4);
   }
}
