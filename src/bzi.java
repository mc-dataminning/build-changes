import com.google.common.collect.ImmutableMap;

public class bzi<E extends bxl & coa, T extends bxj> extends bza<E> {
   private static final int c = 1200;
   private int d;
   private bzi.a e = bzi.a.a;

   public bzi() {
      super(ImmutableMap.of(cgl.o, cgm.c, cgl.p, cgm.a), 1200);
   }

   protected boolean a(arq $$0, E $$1) {
      bxj $$2 = b($$1);
      return $$1.b(czr.xg) && bzc.b($$1, $$2) && bzc.a($$1, $$2, 0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.eb().a(cgl.p) && this.a($$0, $$1);
   }

   protected void b(arq $$0, E $$1, long $$2) {
      bxj $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.fy()) {
         $$1.fE();
      }

      if ($$1.b(czr.xg)) {
         $$1.b(false);
         $$1.fA().b(kk.P, dbr.a);
      }
   }

   private void a(E $$0, bxj $$1) {
      if (this.e == bzi.a.a) {
         $$0.c(csj.a($$0, czr.xg));
         this.e = bzi.a.b;
         $$0.b(true);
      } else if (this.e == bzi.a.b) {
         if (!$$0.fy()) {
            this.e = bzi.a.a;
         }

         int $$2 = $$0.fC();
         czn $$3 = $$0.fA();
         if ($$2 >= cyg.b($$3, $$0)) {
            $$0.fD();
            this.e = bzi.a.c;
            this.d = 20 + $$0.dX().a(20);
            $$0.b(false);
         }
      } else if (this.e == bzi.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bzi.a.d;
         }
      } else if (this.e == bzi.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bzi.a.a;
      }
   }

   private void b(bxl $$0, bxj $$1) {
      $$0.eb().a(cgl.o, new bzl($$1, true));
   }

   private static bxj b(bxj $$0) {
      return $$0.eb().c(cgl.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
