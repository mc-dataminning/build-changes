import java.util.function.Predicate;

public class dfr {
   private final fbb a;
   private final fbb b;
   private final dfr.a c;
   private final dfr.b d;
   private final fbg e;

   public dfr(fbb $$0, fbb $$1, dfr.a $$2, dfr.b $$3, bum $$4) {
      this($$0, $$1, $$2, $$3, fbg.a($$4));
   }

   public dfr(fbb $$0, fbb $$1, dfr.a $$2, dfr.b $$3, fbg $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fbb a() {
      return this.b;
   }

   public fbb b() {
      return this.a;
   }

   public fbv a(dwy $$0, dfo $$1, ji $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fbv a(eta $$0, dfo $$1, ji $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fbs.a();
   }

   public static enum a implements dfr.c {
      a(dwx.a::b),
      b(dwx.a::a),
      c(dwx.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aT) ? fbs.b() : fbs.a());

      private final dfr.c e;

      private a(final dfr.c $$0) {
         this.e = $$0;
      }

      @Override
      public fbv get(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eta::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<eta> e;

      private b(final Predicate<eta> $$0) {
         this.e = $$0;
      }

      public boolean a(eta $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fbv get(dwy var1, dfo var2, ji var3, fbg var4);
   }
}
