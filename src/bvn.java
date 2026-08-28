import com.google.common.collect.ImmutableMap;

public class bvn<E extends btn & cjo, T extends btl> extends bvf<E> {
   private static final int c = 1200;
   private int d;
   private bvn.a e = bvn.a.a;

   public bvn() {
      super(ImmutableMap.of(ccq.n, ccr.c, ccq.o, ccr.a), 1200);
   }

   protected boolean a(aqt $$0, E $$1) {
      btl $$2 = b($$1);
      return $$1.b(cur.vW) && bvh.b($$1, $$2) && bvh.a($$1, $$2, 0);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return $$1.dU().a(ccq.o) && this.a($$0, $$1);
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      btl $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      if ($$1.fs()) {
         $$1.fy();
      }

      if ($$1.b(cur.vW)) {
         $$1.b(false);
         $$1.fu().b(kq.E, cxe.a);
      }
   }

   private void a(E $$0, btl $$1) {
      if (this.e == bvn.a.a) {
         $$0.c(cnp.a($$0, cur.vW));
         this.e = bvn.a.b;
         $$0.b(true);
      } else if (this.e == bvn.a.b) {
         if (!$$0.fs()) {
            this.e = bvn.a.a;
         }

         int $$2 = $$0.fw();
         cuo $$3 = $$0.fu();
         if ($$2 >= cta.a($$0)) {
            $$0.fx();
            this.e = bvn.a.c;
            this.d = 20 + $$0.dT().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvn.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvn.a.d;
         }
      } else if (this.e == bvn.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvn.a.a;
      }
   }

   private void b(btn $$0, btl $$1) {
      $$0.dU().a(ccq.n, new bvq($$1, true));
   }

   private static btl b(btl $$0) {
      return $$0.dU().c(ccq.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
