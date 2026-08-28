import java.util.function.Predicate;

public class dgq {
   private final fby a;
   private final fby b;
   private final dgq.a c;
   private final dgq.b d;
   private final fcd e;

   public dgq(fby $$0, fby $$1, dgq.a $$2, dgq.b $$3, bvk $$4) {
      this($$0, $$1, $$2, $$3, fcd.a($$4));
   }

   public dgq(fby $$0, fby $$1, dgq.a $$2, dgq.b $$3, fcd $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fby a() {
      return this.b;
   }

   public fby b() {
      return this.a;
   }

   public fcs a(dxv $$0, dgn $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fcs a(etx $$0, dgn $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fcp.a();
   }

   public static enum a implements dgq.c {
      a(dxu.a::b),
      b(dxu.a::a),
      c(dxu.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axu.aT) ? fcp.b() : fcp.a());

      private final dgq.c e;

      private a(final dgq.c $$0) {
         this.e = $$0;
      }

      @Override
      public fcs get(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(etx::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aya.a));

      private final Predicate<etx> e;

      private b(final Predicate<etx> $$0) {
         this.e = $$0;
      }

      public boolean a(etx $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fcs get(dxv var1, dgn var2, jh var3, fcd var4);
   }
}
