import com.google.common.collect.ImmutableMap;

public class bvr<E extends bts & cjr, T extends btq> extends bvj<E> {
   private static final int c = 1200;
   private int d;
   private bvr.a e = bvr.a.a;

   public bvr() {
      super(ImmutableMap.of(ccu.n, ccv.c, ccu.o, ccv.a), 1200);
   }

   protected boolean a(arf $$0, E $$1) {
      btq $$2 = b($$1);
      return $$1.b(cut.vT) && bvl.b($$1, $$2) && bvl.a($$1, $$2, 0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return $$1.dS().a(ccu.o) && this.a($$0, $$1);
   }

   protected void b(arf $$0, E $$1, long $$2) {
      btq $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cut.vT)) {
         $$1.b(false);
         $$1.fx().b(km.E, cxe.a);
      }
   }

   private void a(E $$0, btq $$1) {
      if (this.e == bvr.a.a) {
         $$0.c(cns.a($$0, cut.vT));
         this.e = bvr.a.b;
         $$0.b(true);
      } else if (this.e == bvr.a.b) {
         if (!$$0.fv()) {
            this.e = bvr.a.a;
         }

         int $$2 = $$0.fz();
         cuq $$3 = $$0.fx();
         if ($$2 >= ctd.l($$3)) {
            $$0.fA();
            this.e = bvr.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvr.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvr.a.d;
         }
      } else if (this.e == bvr.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvr.a.a;
      }
   }

   private void b(bts $$0, btq $$1) {
      $$0.dS().a(ccu.n, new bvu($$1, true));
   }

   private static btq b(btq $$0) {
      return $$0.dS().c(ccu.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
