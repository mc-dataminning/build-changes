import java.util.function.Predicate;

public class dij {
   private final feq a;
   private final feq b;
   private final dij.a c;
   private final dij.b d;
   private final fev e;

   public dij(feq $$0, feq $$1, dij.a $$2, dij.b $$3, bwf $$4) {
      this($$0, $$1, $$2, $$3, fev.a($$4));
   }

   public dij(feq $$0, feq $$1, dij.a $$2, dij.b $$3, fev $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public feq a() {
      return this.b;
   }

   public feq b() {
      return this.a;
   }

   public ffk a(eah $$0, dig $$1, iu $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ffk a(ewo $$0, dig $$1, iu $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ffh.a();
   }

   public static enum a implements dij.c {
      a(eag.a::b),
      b(eag.a::a),
      c(eag.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axc.aT) ? ffh.b() : ffh.a());

      private final dij.c e;

      private a(final dij.c $$0) {
         this.e = $$0;
      }

      @Override
      public ffk get(eah $$0, dig $$1, iu $$2, fev $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ewo::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axh.a));

      private final Predicate<ewo> e;

      private b(final Predicate<ewo> $$0) {
         this.e = $$0;
      }

      public boolean a(ewo $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ffk get(eah var1, dig var2, iu var3, fev var4);
   }
}
