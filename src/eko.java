public class eko {
   public static class a extends eja {
      public a(ja $$0) {
         super(ejn.aa, 0, new eio($$0));
      }

      public a(tx $$0) {
         super(ejn.aa, $$0);
      }

      @Override
      protected void a(ejm $$0, tx $$1) {
      }

      @Override
      public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
         int $$7 = $$0.a(dyf.a.c, this.f.h(), this.f.j());
         ja.a $$8 = new ja.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dsk $$9 = $$0.a_($$8);
            dsk $$10 = $$0.a_($$8.d());
            if ($$10 == dfj.aV.o() || $$10 == dfj.b.o() || $$10 == dfj.g.o() || $$10 == dfj.c.o() || $$10 == dfj.e.o()) {
               dsk $$11 = !$$9.i() && !this.b($$9) ? $$9 : dfj.I.o();

               for (jf $$12 : jf.values()) {
                  ja $$13 = $$8.a($$12);
                  dsk $$14 = $$0.a_($$13);
                  if ($$14.i() || this.b($$14)) {
                     ja $$15 = $$13.d();
                     dsk $$16 = $$0.a_($$15);
                     if (($$16.i() || this.b($$16)) && $$12 != jf.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new eio($$8);
               this.a($$0, $$4, $$3, $$8, eqq.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dsk $$0) {
         return $$0 == dfj.G.o() || $$0 == dfj.H.o();
      }
   }
}
