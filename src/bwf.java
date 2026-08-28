import com.google.common.collect.ImmutableMap;

public class bwf<E extends buh & cki, T extends buf> extends bvx<E> {
   private static final int c = 1200;
   private int d;
   private bwf.a e = bwf.a.a;

   public bwf() {
      super(ImmutableMap.of(cdi.n, cdj.c, cdi.o, cdj.a), 1200);
   }

   protected boolean a(arg $$0, E $$1) {
      buf $$2 = b($$1);
      return $$1.b(cvo.vX) && bvz.b($$1, $$2) && bvz.a($$1, $$2, 0);
   }

   protected boolean a(arg $$0, E $$1, long $$2) {
      return $$1.dX().a(cdi.o) && this.a($$0, $$1);
   }

   protected void b(arg $$0, E $$1, long $$2) {
      buf $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arg $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cvo.vX)) {
         $$1.b(false);
         $$1.fx().b(kr.G, cxz.a);
      }
   }

   private void a(E $$0, buf $$1) {
      if (this.e == bwf.a.a) {
         $$0.c(cok.a($$0, cvo.vX));
         this.e = bwf.a.b;
         $$0.b(true);
      } else if (this.e == bwf.a.b) {
         if (!$$0.fv()) {
            this.e = bwf.a.a;
         }

         int $$2 = $$0.fz();
         cvl $$3 = $$0.fx();
         if ($$2 >= cty.b($$3, $$0)) {
            $$0.fA();
            this.e = bwf.a.c;
            this.d = 20 + $$0.dV().a(20);
            $$0.b(false);
         }
      } else if (this.e == bwf.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bwf.a.d;
         }
      } else if (this.e == bwf.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bwf.a.a;
      }
   }

   private void b(buh $$0, buf $$1) {
      $$0.dX().a(cdi.n, new bwi($$1, true));
   }

   private static buf b(buf $$0) {
      return $$0.dX().c(cdi.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
