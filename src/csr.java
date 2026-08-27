import java.util.function.Predicate;

public class csr {
   private final elm a;
   private final elm b;
   private final csr.a c;
   private final csr.b d;
   private final elr e;

   public csr(elm $$0, elm $$1, csr.a $$2, csr.b $$3, blp $$4) {
      this($$0, $$1, $$2, $$3, elr.a($$4));
   }

   public csr(elm $$0, elm $$1, csr.a $$2, csr.b $$3, elr $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public elm a() {
      return this.b;
   }

   public elm b() {
      return this.a;
   }

   public emf a(dja $$0, cso $$1, hx $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public emf a(eek $$0, cso $$1, hx $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : emc.a();
   }

   public static enum a implements csr.c {
      a(diz.a::b),
      b(diz.a::a),
      c(diz.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(asb.aP) ? emc.b() : emc.a());

      private final csr.c e;

      private a(csr.c $$0) {
         this.e = $$0;
      }

      @Override
      public emf get(dja $$0, cso $$1, hx $$2, elr $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eek::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(asg.a));

      private final Predicate<eek> e;

      private b(Predicate<eek> $$0) {
         this.e = $$0;
      }

      public boolean a(eek $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      emf get(dja var1, cso var2, hx var3, elr var4);
   }
}
