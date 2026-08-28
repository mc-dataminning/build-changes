import com.google.common.annotations.VisibleForTesting;

public final class ewi extends ewr<ewj.a, ewj> {
   private final iv.a g = new iv.a();

   public ewi(edd $$0) {
      this($$0, new ewj($$0));
   }

   @VisibleForTesting
   public ewi(edd $$0, ewj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(long $$0) {
      long $$1 = jy.e($$0);
      if (this.f.b($$1)) {
         eat $$2 = this.c(this.g.f($$0));
         int $$3 = this.a($$0, $$2);
         int $$4 = this.f.e($$0);
         if ($$3 < $$4) {
            this.f.a($$0, 0);
            this.b($$0, ewr.a.a($$4));
         } else {
            this.b($$0, c);
         }

         if ($$3 > 0) {
            this.c($$0, ewr.a.a($$3, a($$2)));
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1, int $$2) {
      eat $$3 = null;

      for (jb $$4 : d) {
         if (ewr.a.a($$1, $$4)) {
            long $$5 = iv.a($$0, $$4);
            if (this.f.b(jy.e($$5))) {
               int $$6 = this.f.e($$5);
               int $$7 = $$2 - 1;
               if ($$7 > $$6) {
                  this.g.f($$5);
                  eat $$8 = this.c(this.g);
                  int $$9 = $$2 - this.b($$8);
                  if ($$9 > $$6) {
                     if ($$3 == null) {
                        $$3 = ewr.a.b($$1) ? dmt.a.m() : this.c(this.g.f($$0));
                     }

                     if (!this.a($$3, $$8, $$4)) {
                        this.f.a($$5, $$9);
                        if ($$9 > 1) {
                           this.c($$5, ewr.a.a($$9, a($$8), $$4.g()));
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
      int $$2 = ewr.a.a($$1);

      for (jb $$3 : d) {
         if (ewr.a.a($$1, $$3)) {
            long $$4 = iv.a($$0, $$3);
            if (this.f.b(jy.e($$4))) {
               int $$5 = this.f.e($$4);
               if ($$5 != 0) {
                  if ($$5 <= $$2 - 1) {
                     eat $$6 = this.c(this.g.f($$4));
                     int $$7 = this.a($$4, $$6);
                     this.f.a($$4, 0);
                     if ($$7 < $$5) {
                        this.b($$4, ewr.a.a($$5, $$3.g()));
                     }

                     if ($$7 > 0) {
                        this.c($$4, ewr.a.a($$7, a($$6)));
                     }
                  } else {
                     this.c($$4, ewr.a.b($$5, false, $$3.g()));
                  }
               }
            }
         }
      }
   }

   private int a(long $$0, eat $$1) {
      int $$2 = $$1.k();
      return $$2 > 0 && this.f.j(jy.e($$0)) ? $$2 : 0;
   }

   @Override
   public void b(dir $$0) {
      this.a($$0, true);
      edc $$1 = this.e.c($$0.h, $$0.i);
      if ($$1 != null) {
         $$1.a(($$0x, $$1x) -> {
            int $$2 = $$1x.k();
            this.c($$0x.a(), ewr.a.a($$2, a($$1x)));
         });
      }
   }
}
