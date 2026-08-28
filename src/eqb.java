import com.google.common.annotations.VisibleForTesting;

public final class eqb extends eqk<eqc.a, eqc> {
   private final jf.a g = new jf.a();

   public eqb(dxb $$0) {
      this($$0, new eqc($$0));
   }

   @VisibleForTesting
   public eqb(dxb $$0, eqc $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(long $$0) {
      long $$1 = kh.e($$0);
      if (this.f.b($$1)) {
         dus $$2 = this.c(this.g.f($$0));
         int $$3 = this.a($$0, $$2);
         int $$4 = this.f.e($$0);
         if ($$3 < $$4) {
            this.f.a($$0, 0);
            this.b($$0, eqk.a.a($$4));
         } else {
            this.b($$0, c);
         }

         if ($$3 > 0) {
            this.c($$0, eqk.a.a($$3, a($$2)));
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1, int $$2) {
      dus $$3 = null;

      for (jk $$4 : d) {
         if (eqk.a.a($$1, $$4)) {
            long $$5 = jf.a($$0, $$4);
            if (this.f.b(kh.e($$5))) {
               int $$6 = this.f.e($$5);
               int $$7 = $$2 - 1;
               if ($$7 > $$6) {
                  this.g.f($$5);
                  dus $$8 = this.c(this.g);
                  int $$9 = $$2 - this.b($$8);
                  if ($$9 > $$6) {
                     if ($$3 == null) {
                        $$3 = eqk.a.b($$1) ? dho.a.n() : this.c(this.g.f($$0));
                     }

                     if (!this.a($$3, $$8, $$4)) {
                        this.f.a($$5, $$9);
                        if ($$9 > 1) {
                           this.c($$5, eqk.a.a($$9, a($$8), $$4.g()));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1) {
      int $$2 = eqk.a.a($$1);

      for (jk $$3 : d) {
         if (eqk.a.a($$1, $$3)) {
            long $$4 = jf.a($$0, $$3);
            if (this.f.b(kh.e($$4))) {
               int $$5 = this.f.e($$4);
               if ($$5 != 0) {
                  if ($$5 <= $$2 - 1) {
                     dus $$6 = this.c(this.g.f($$4));
                     int $$7 = this.a($$4, $$6);
                     this.f.a($$4, 0);
                     if ($$7 < $$5) {
                        this.b($$4, eqk.a.a($$5, $$3.g()));
                     }

                     if ($$7 > 0) {
                        this.c($$4, eqk.a.a($$7, a($$6)));
                     }
                  } else {
                     this.c($$4, eqk.a.b($$5, false, $$3.g()));
                  }
               }
            }
         }
      }
   }

   private int a(long $$0, dus $$1) {
      int $$2 = $$1.k();
      return $$2 > 0 && this.f.j(kh.e($$0)) ? $$2 : 0;
   }

   @Override
   public void b(ddp $$0) {
      this.a($$0, true);
      dxa $$1 = this.e.c($$0.e, $$0.f);
      if ($$1 != null) {
         $$1.a(($$0x, $$1x) -> {
            int $$2 = $$1x.k();
            this.c($$0x.a(), eqk.a.a($$2, a($$1x)));
         });
      }
   }
}
