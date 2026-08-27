public interface cxr extends cwh {
   ih[] C = ih.values();

   default int a(ib $$0, ih $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(ib $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ih.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ih.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ih.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ih.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ih.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ih.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(ib $$0, ih $$1, boolean $$2) {
      dnb $$3 = this.a_($$0);
      if ($$2) {
         return dce.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dae.ha)) {
         return 15;
      } else if ($$3.a(dae.cw)) {
         return $$3.c(dgd.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(ib $$0, ih $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(ib $$0, ih $$1) {
      dnb $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(ib $$0) {
      if (this.c($$0.d(), ih.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ih.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ih.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ih.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ih.e) > 0 ? true : this.c($$0.h(), ih.f) > 0;
      }
   }

   default int D(ib $$0) {
      int $$1 = 0;

      for (ih $$2 : C) {
         int $$3 = this.c($$0.a($$2), $$2);
         if ($$3 >= 15) {
            return 15;
         }

         if ($$3 > $$1) {
            $$1 = $$3;
         }
      }

      return $$1;
   }
}
