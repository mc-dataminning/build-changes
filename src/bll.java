import com.google.common.collect.ImmutableMap;

public class bll<E extends bjo & bzb, T extends bjm> extends bld<E> {
   private static final int c = 1200;
   private int d;
   private bll.a e = bll.a.a;

   public bll() {
      super(ImmutableMap.of(bsn.n, bso.c, bsn.o, bso.a), 1200);
   }

   protected boolean a(akt $$0, E $$1) {
      bjm $$2 = b($$1);
      return $$1.b(cjo.uZ) && blf.b($$1, $$2) && blf.a($$1, $$2, 0);
   }

   protected boolean a(akt $$0, E $$1, long $$2) {
      return $$1.dN().a(bsn.o) && this.a($$0, $$1);
   }

   protected void b(akt $$0, E $$1, long $$2) {
      bjm $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(akt $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cjo.uZ)) {
         $$1.b(false);
         cht.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bjm $$1) {
      if (this.e == bll.a.a) {
         $$0.c(cct.a($$0, cjo.uZ));
         this.e = bll.a.b;
         $$0.b(true);
      } else if (this.e == bll.a.b) {
         if (!$$0.fn()) {
            this.e = bll.a.a;
         }

         int $$2 = $$0.fr();
         cjl $$3 = $$0.fp();
         if ($$2 >= cht.k($$3)) {
            $$0.fs();
            this.e = bll.a.c;
            this.d = 20 + $$0.ef().a(20);
            $$0.b(false);
         }
      } else if (this.e == bll.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bll.a.d;
         }
      } else if (this.e == bll.a.d) {
         $$0.a($$1, 1.0F);
         cjl $$4 = $$0.b(cct.a($$0, cjo.uZ));
         cht.a($$4, false);
         this.e = bll.a.a;
      }
   }

   private void b(bjo $$0, bjm $$1) {
      $$0.dN().a(bsn.n, new blo($$1, true));
   }

   private static bjm b(bjm $$0) {
      return $$0.dN().c(bsn.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
