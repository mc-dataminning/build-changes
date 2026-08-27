import java.util.function.Predicate;

public class cyg {
   private final esa a;
   private final esa b;
   private final cyg.a c;
   private final cyg.b d;
   private final esf e;

   public cyg(esa $$0, esa $$1, cyg.a $$2, cyg.b $$3, bpv $$4) {
      this($$0, $$1, $$2, $$3, esf.a($$4));
   }

   public cyg(esa $$0, esa $$1, cyg.a $$2, cyg.b $$3, esf $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public esa a() {
      return this.b;
   }

   public esa b() {
      return this.a;
   }

   public est a(doz $$0, cyd $$1, ib $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public est a(eks $$0, cyd $$1, ib $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : esq.a();
   }

   public static enum a implements cyg.c {
      a(doy.a::b),
      b(doy.a::a),
      c(doy.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avc.aQ) ? esq.b() : esq.a());

      private final cyg.c e;

      private a(cyg.c $$0) {
         this.e = $$0;
      }

      @Override
      public est get(doz $$0, cyd $$1, ib $$2, esf $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eks::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(avh.a));

      private final Predicate<eks> e;

      private b(Predicate<eks> $$0) {
         this.e = $$0;
      }

      public boolean a(eks $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      est get(doz var1, cyd var2, ib var3, esf var4);
   }
}
