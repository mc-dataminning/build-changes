import com.google.common.collect.ImmutableMap;

public class bmx<E extends bla & can, T extends bky> extends bmp<E> {
   private static final int c = 1200;
   private int d;
   private bmx.a e = bmx.a.a;

   public bmx() {
      super(ImmutableMap.of(btz.n, bua.c, btz.o, bua.a), 1200);
   }

   protected boolean a(ama $$0, E $$1) {
      bky $$2 = b($$1);
      return $$1.b(cle.va) && bmr.b($$1, $$2) && bmr.a($$1, $$2, 0);
   }

   protected boolean a(ama $$0, E $$1, long $$2) {
      return $$1.dN().a(btz.o) && this.a($$0, $$1);
   }

   protected void b(ama $$0, E $$1, long $$2) {
      bky $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ama $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cle.va)) {
         $$1.b(false);
         cjj.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bky $$1) {
      if (this.e == bmx.a.a) {
         $$0.c(cef.a($$0, cle.va));
         this.e = bmx.a.b;
         $$0.b(true);
      } else if (this.e == bmx.a.b) {
         if (!$$0.fn()) {
            this.e = bmx.a.a;
         }

         int $$2 = $$0.fr();
         clb $$3 = $$0.fp();
         if ($$2 >= cjj.k($$3)) {
            $$0.fs();
            this.e = bmx.a.c;
            this.d = 20 + $$0.ef().a(20);
            $$0.b(false);
         }
      } else if (this.e == bmx.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bmx.a.d;
         }
      } else if (this.e == bmx.a.d) {
         $$0.a($$1, 1.0F);
         clb $$4 = $$0.b(cef.a($$0, cle.va));
         cjj.a($$4, false);
         this.e = bmx.a.a;
      }
   }

   private void b(bla $$0, bky $$1) {
      $$0.dN().a(btz.n, new bna($$1, true));
   }

   private static bky b(bky $$0) {
      return $$0.dN().c(btz.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
