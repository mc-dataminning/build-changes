import java.util.function.Predicate;

public class ddo {
   private final eys a;
   private final eys b;
   private final ddo.a c;
   private final ddo.b d;
   private final eyx e;

   public ddo(eys $$0, eys $$1, ddo.a $$2, ddo.b $$3, bto $$4) {
      this($$0, $$1, $$2, $$3, eyx.a($$4));
   }

   public ddo(eys $$0, eys $$1, ddo.a $$2, ddo.b $$3, eyx $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public eys a() {
      return this.b;
   }

   public eys b() {
      return this.a;
   }

   public ezm a(duo $$0, ddl $$1, je $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ezm a(eqp $$0, ddl $$1, je $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ezj.a();
   }

   public static enum a implements ddo.c {
      a(dun.a::b),
      b(dun.a::a),
      c(dun.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awt.aR) ? ezj.b() : ezj.a());

      private final ddo.c e;

      private a(final ddo.c $$0) {
         this.e = $$0;
      }

      @Override
      public ezm get(duo $$0, ddl $$1, je $$2, eyx $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eqp::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awz.a));

      private final Predicate<eqp> e;

      private b(final Predicate<eqp> $$0) {
         this.e = $$0;
      }

      public boolean a(eqp $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ezm get(duo var1, ddl var2, je var3, eyx var4);
   }
}
