import com.google.common.annotations.VisibleForTesting;

public final class eok extends eot<eol.a, eol> {
   private final jd.a g = new jd.a();

   public eok(dvl $$0) {
      this($$0, new eol($$0));
   }

   @VisibleForTesting
   public eok(dvl $$0, eol $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(long $$0) {
      long $$1 = kf.e($$0);
      if (this.f.b($$1)) {
         dtc $$2 = this.c(this.g.f($$0));
         int $$3 = this.a($$0, $$2);
         int $$4 = this.f.e($$0);
         if ($$3 < $$4) {
            this.f.a($$0, 0);
            this.b($$0, eot.a.a($$4));
         } else {
            this.b($$0, c);
         }

         if ($$3 > 0) {
            this.c($$0, eot.a.a($$3, a($$2)));
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1, int $$2) {
      dtc $$3 = null;

      for (ji $$4 : d) {
         if (eot.a.a($$1, $$4)) {
            long $$5 = jd.a($$0, $$4);
            if (this.f.b(kf.e($$5))) {
               int $$6 = this.f.e($$5);
               int $$7 = $$2 - 1;
               if ($$7 > $$6) {
                  this.g.f($$5);
                  dtc $$8 = this.c(this.g);
                  int $$9 = $$2 - this.a($$8, this.g);
                  if ($$9 > $$6) {
                     if ($$3 == null) {
                        $$3 = eot.a.b($$1) ? dga.a.o() : this.c(this.g.f($$0));
                     }

                     if (!this.a($$0, $$3, $$5, $$8, $$4)) {
                        this.f.a($$5, $$9);
                        if ($$9 > 1) {
                           this.c($$5, eot.a.a($$9, a($$8), $$4.g()));
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
      int $$2 = eot.a.a($$1);

      for (ji $$3 : d) {
         if (eot.a.a($$1, $$3)) {
            long $$4 = jd.a($$0, $$3);
            if (this.f.b(kf.e($$4))) {
               int $$5 = this.f.e($$4);
               if ($$5 != 0) {
                  if ($$5 <= $$2 - 1) {
                     dtc $$6 = this.c(this.g.f($$4));
                     int $$7 = this.a($$4, $$6);
                     this.f.a($$4, 0);
                     if ($$7 < $$5) {
                        this.b($$4, eot.a.a($$5, $$3.g()));
                     }

                     if ($$7 > 0) {
                        this.c($$4, eot.a.a($$7, a($$6)));
                     }
                  } else {
                     this.c($$4, eot.a.b($$5, false, $$3.g()));
                  }
               }
            }
         }
      }
   }

   private int a(long $$0, dtc $$1) {
      int $$2 = $$1.h();
      return $$2 > 0 && this.f.j(kf.e($$0)) ? $$2 : 0;
   }

   @Override
   public void b(dcd $$0) {
      this.a($$0, true);
      dvk $$1 = this.e.c($$0.e, $$0.f);
      if ($$1 != null) {
         $$1.a(($$0x, $$1x) -> {
            int $$2 = $$1x.h();
            this.c($$0x.a(), eot.a.a($$2, a($$1x)));
         });
      }
   }
}
