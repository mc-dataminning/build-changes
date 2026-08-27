import com.google.common.collect.ImmutableMap;

public class bqi<E extends bok & cee, T extends boi> extends bqa<E> {
   private static final int c = 1200;
   private int d;
   private bqi.a e = bqi.a.a;

   public bqi() {
      super(ImmutableMap.of(bxl.n, bxm.c, bxl.o, bxm.a), 1200);
   }

   protected boolean a(aow $$0, E $$1) {
      boi $$2 = b($$1);
      return $$1.b(cpg.vP) && bqc.b($$1, $$2) && bqc.a($$1, $$2, 0);
   }

   protected boolean a(aow $$0, E $$1, long $$2) {
      return $$1.dO().a(bxl.o) && this.a($$0, $$1);
   }

   protected void b(aow $$0, E $$1, long $$2) {
      boi $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aow $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cpg.vP)) {
         $$1.b(false);
         cnl.a($$1.fp(), false);
      }
   }

   private void a(E $$0, boi $$1) {
      if (this.e == bqi.a.a) {
         $$0.c(cif.a($$0, cpg.vP));
         this.e = bqi.a.b;
         $$0.b(true);
      } else if (this.e == bqi.a.b) {
         if (!$$0.fn()) {
            this.e = bqi.a.a;
         }

         int $$2 = $$0.fr();
         cpd $$3 = $$0.fp();
         if ($$2 >= cnl.k($$3)) {
            $$0.fs();
            this.e = bqi.a.c;
            this.d = 20 + $$0.eh().a(20);
            $$0.b(false);
         }
      } else if (this.e == bqi.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bqi.a.d;
         }
      } else if (this.e == bqi.a.d) {
         $$0.a($$1, 1.0F);
         cpd $$4 = $$0.b(cif.a($$0, cpg.vP));
         cnl.a($$4, false);
         this.e = bqi.a.a;
      }
   }

   private void b(bok $$0, boi $$1) {
      $$0.dO().a(bxl.n, new bql($$1, true));
   }

   private static boi b(boi $$0) {
      return $$0.dO().c(bxl.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
