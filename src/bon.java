import com.google.common.collect.ImmutableMap;

public class bon<E extends bmq & ccj, T extends bmo> extends bof<E> {
   private static final int c = 1200;
   private int d;
   private bon.a e = bon.a.a;

   public bon() {
      super(ImmutableMap.of(bvq.n, bvr.c, bvq.o, bvr.a), 1200);
   }

   protected boolean a(ane $$0, E $$1) {
      bmo $$2 = b($$1);
      return $$1.b(cnj.vP) && boh.b($$1, $$2) && boh.a($$1, $$2, 0);
   }

   protected boolean a(ane $$0, E $$1, long $$2) {
      return $$1.dN().a(bvq.o) && this.a($$0, $$1);
   }

   protected void b(ane $$0, E $$1, long $$2) {
      bmo $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ane $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cnj.vP)) {
         $$1.b(false);
         clp.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bmo $$1) {
      if (this.e == bon.a.a) {
         $$0.c(cgj.a($$0, cnj.vP));
         this.e = bon.a.b;
         $$0.b(true);
      } else if (this.e == bon.a.b) {
         if (!$$0.fn()) {
            this.e = bon.a.a;
         }

         int $$2 = $$0.fr();
         cng $$3 = $$0.fp();
         if ($$2 >= clp.k($$3)) {
            $$0.fs();
            this.e = bon.a.c;
            this.d = 20 + $$0.eg().a(20);
            $$0.b(false);
         }
      } else if (this.e == bon.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bon.a.d;
         }
      } else if (this.e == bon.a.d) {
         $$0.a($$1, 1.0F);
         cng $$4 = $$0.b(cgj.a($$0, cnj.vP));
         clp.a($$4, false);
         this.e = bon.a.a;
      }
   }

   private void b(bmq $$0, bmo $$1) {
      $$0.dN().a(bvq.n, new boq($$1, true));
   }

   private static bmo b(bmo $$0) {
      return $$0.dN().c(bvq.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
