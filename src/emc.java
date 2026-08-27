import com.google.common.annotations.VisibleForTesting;

public final class emc extends eml<emd.a, emd> {
   private final io.a g = new io.a();

   public emc(dtk $$0) {
      this($$0, new emd($$0));
   }

   @VisibleForTesting
   public emc(dtk $$0, emd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(long $$0) {
      long $$1 = jq.e($$0);
      if (this.f.b($$1)) {
         drb $$2 = this.c(this.g.f($$0));
         int $$3 = this.a($$0, $$2);
         int $$4 = this.f.e($$0);
         if ($$3 < $$4) {
            this.f.a($$0, 0);
            this.b($$0, eml.a.a($$4));
         } else {
            this.b($$0, c);
         }

         if ($$3 > 0) {
            this.c($$0, eml.a.a($$3, a($$2)));
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1, int $$2) {
      drb $$3 = null;

      for (it $$4 : d) {
         if (eml.a.a($$1, $$4)) {
            long $$5 = io.a($$0, $$4);
            if (this.f.b(jq.e($$5))) {
               int $$6 = this.f.e($$5);
               int $$7 = $$2 - 1;
               if ($$7 > $$6) {
                  this.g.f($$5);
                  drb $$8 = this.c(this.g);
                  int $$9 = $$2 - this.a($$8, this.g);
                  if ($$9 > $$6) {
                     if ($$3 == null) {
                        $$3 = eml.a.b($$1) ? dea.a.n() : this.c(this.g.f($$0));
                     }

                     if (!this.a($$0, $$3, $$5, $$8, $$4)) {
                        this.f.a($$5, $$9);
                        if ($$9 > 1) {
                           this.c($$5, eml.a.a($$9, a($$8), $$4.g()));
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
      int $$2 = eml.a.a($$1);

      for (it $$3 : d) {
         if (eml.a.a($$1, $$3)) {
            long $$4 = io.a($$0, $$3);
            if (this.f.b(jq.e($$4))) {
               int $$5 = this.f.e($$4);
               if ($$5 != 0) {
                  if ($$5 <= $$2 - 1) {
                     drb $$6 = this.c(this.g.f($$4));
                     int $$7 = this.a($$4, $$6);
                     this.f.a($$4, 0);
                     if ($$7 < $$5) {
                        this.b($$4, eml.a.a($$5, $$3.g()));
                     }

                     if ($$7 > 0) {
                        this.c($$4, eml.a.a($$7, a($$6)));
                     }
                  } else {
                     this.c($$4, eml.a.b($$5, false, $$3.g()));
                  }
               }
            }
         }
      }
   }

   private int a(long $$0, drb $$1) {
      int $$2 = $$1.h();
      return $$2 > 0 && this.f.j(jq.e($$0)) ? $$2 : 0;
   }

   @Override
   public void b(dae $$0) {
      this.a($$0, true);
      dtj $$1 = this.e.c($$0.e, $$0.f);
      if ($$1 != null) {
         $$1.a(($$0x, $$1x) -> {
            int $$2 = $$1x.h();
            this.c($$0x.a(), eml.a.a($$2, a($$1x)));
         });
      }
   }
}
