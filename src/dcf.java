import java.util.function.Predicate;

public class dcf {
   private final exa a;
   private final exa b;
   private final dcf.a c;
   private final dcf.b d;
   private final exf e;

   public dcf(exa $$0, exa $$1, dcf.a $$2, dcf.b $$3, bsr $$4) {
      this($$0, $$1, $$2, $$3, exf.a($$4));
   }

   public dcf(exa $$0, exa $$1, dcf.a $$2, dcf.b $$3, exf $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public exa a() {
      return this.b;
   }

   public exa b() {
      return this.a;
   }

   public ext a(dtc $$0, dcc $$1, jd $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ext a(epc $$0, dcc $$1, jd $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : exq.a();
   }

   public static enum a implements dcf.c {
      a(dtb.a::b),
      b(dtb.a::a),
      c(dtb.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awe.aQ) ? exq.b() : exq.a());

      private final dcf.c e;

      private a(final dcf.c $$0) {
         this.e = $$0;
      }

      @Override
      public ext get(dtc $$0, dcc $$1, jd $$2, exf $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(epc::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awk.a));

      private final Predicate<epc> e;

      private b(final Predicate<epc> $$0) {
         this.e = $$0;
      }

      public boolean a(epc $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ext get(dtc var1, dcc var2, jd var3, exf var4);
   }
}
