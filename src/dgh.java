import java.util.function.Predicate;

public class dgh {
   private final fbr a;
   private final fbr b;
   private final dgh.a c;
   private final dgh.b d;
   private final fbw e;

   public dgh(fbr $$0, fbr $$1, dgh.a $$2, dgh.b $$3, bvb $$4) {
      this($$0, $$1, $$2, $$3, fbw.a($$4));
   }

   public dgh(fbr $$0, fbr $$1, dgh.a $$2, dgh.b $$3, fbw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fbr a() {
      return this.b;
   }

   public fbr b() {
      return this.a;
   }

   public fcl a(dxo $$0, dge $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fcl a(etq $$0, dge $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fci.a();
   }

   public static enum a implements dgh.c {
      a(dxn.a::b),
      b(dxn.a::a),
      c(dxn.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axk.aT) ? fci.b() : fci.a());

      private final dgh.c e;

      private a(final dgh.c $$0) {
         this.e = $$0;
      }

      @Override
      public fcl get(dxo $$0, dge $$1, jh $$2, fbw $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(etq::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axq.a));

      private final Predicate<etq> e;

      private b(final Predicate<etq> $$0) {
         this.e = $$0;
      }

      public boolean a(etq $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fcl get(dxo var1, dge var2, jh var3, fbw var4);
   }
}
