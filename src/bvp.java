import com.google.common.collect.ImmutableMap;

public class bvp<E extends btp & cjq, T extends btn> extends bvh<E> {
   private static final int c = 1200;
   private int d;
   private bvp.a e = bvp.a.a;

   public bvp() {
      super(ImmutableMap.of(ccs.n, cct.c, ccs.o, cct.a), 1200);
   }

   protected boolean a(aqu $$0, E $$1) {
      btn $$2 = b($$1);
      return $$1.b(cut.vW) && bvj.b($$1, $$2) && bvj.a($$1, $$2, 0);
   }

   protected boolean a(aqu $$0, E $$1, long $$2) {
      return $$1.dT().a(ccs.o) && this.a($$0, $$1);
   }

   protected void b(aqu $$0, E $$1, long $$2) {
      btn $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqu $$0, E $$1, long $$2) {
      if ($$1.fr()) {
         $$1.fx();
      }

      if ($$1.b(cut.vW)) {
         $$1.b(false);
         $$1.ft().b(kq.E, cxg.a);
      }
   }

   private void a(E $$0, btn $$1) {
      if (this.e == bvp.a.a) {
         $$0.c(cnr.a($$0, cut.vW));
         this.e = bvp.a.b;
         $$0.b(true);
      } else if (this.e == bvp.a.b) {
         if (!$$0.fr()) {
            this.e = bvp.a.a;
         }

         int $$2 = $$0.fv();
         cuq $$3 = $$0.ft();
         if ($$2 >= ctc.b($$3, $$0)) {
            $$0.fw();
            this.e = bvp.a.c;
            this.d = 20 + $$0.dR().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvp.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvp.a.d;
         }
      } else if (this.e == bvp.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvp.a.a;
      }
   }

   private void b(btp $$0, btn $$1) {
      $$0.dT().a(ccs.n, new bvs($$1, true));
   }

   private static btn b(btn $$0) {
      return $$0.dT().c(ccs.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
