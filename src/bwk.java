import com.google.common.collect.ImmutableMap;

public class bwk<E extends bum & ckn, T extends buk> extends bwc<E> {
   private static final int c = 1200;
   private int d;
   private bwk.a e = bwk.a.a;

   public bwk() {
      super(ImmutableMap.of(cdn.n, cdo.c, cdn.o, cdo.a), 1200);
   }

   protected boolean a(arh $$0, E $$1) {
      buk $$2 = b($$1);
      return $$1.b(cvt.vX) && bwe.b($$1, $$2) && bwe.a($$1, $$2, 0);
   }

   protected boolean a(arh $$0, E $$1, long $$2) {
      return $$1.dX().a(cdn.o) && this.a($$0, $$1);
   }

   protected void b(arh $$0, E $$1, long $$2) {
      buk $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arh $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cvt.vX)) {
         $$1.b(false);
         $$1.fx().b(kr.J, cya.a);
      }
   }

   private void a(E $$0, buk $$1) {
      if (this.e == bwk.a.a) {
         $$0.c(coq.a($$0, cvt.vX));
         this.e = bwk.a.b;
         $$0.b(true);
      } else if (this.e == bwk.a.b) {
         if (!$$0.fv()) {
            this.e = bwk.a.a;
         }

         int $$2 = $$0.fz();
         cvp $$3 = $$0.fx();
         if ($$2 >= cud.b($$3, $$0)) {
            $$0.fA();
            this.e = bwk.a.c;
            this.d = 20 + $$0.dV().a(20);
            $$0.b(false);
         }
      } else if (this.e == bwk.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bwk.a.d;
         }
      } else if (this.e == bwk.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bwk.a.a;
      }
   }

   private void b(bum $$0, buk $$1) {
      $$0.dX().a(cdn.n, new bwn($$1, true));
   }

   private static buk b(buk $$0) {
      return $$0.dX().c(cdn.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
