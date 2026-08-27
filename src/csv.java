public interface csv extends crl {
   ib[] C = ib.values();

   default int a(hx $$0, ib $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(hx $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ib.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ib.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ib.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ib.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ib.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ib.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(hx $$0, ib $$1, boolean $$2) {
      dhn $$3 = this.a_($$0);
      if ($$2) {
         return cxh.h($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(cvh.ha)) {
         return 15;
      } else if ($$3.a(cvh.cw)) {
         return $$3.c(dbg.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(hx $$0, ib $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(hx $$0, ib $$1) {
      dhn $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean B(hx $$0) {
      if (this.c($$0.d(), ib.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ib.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ib.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ib.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ib.e) > 0 ? true : this.c($$0.h(), ib.f) > 0;
      }
   }

   default int C(hx $$0) {
      int $$1 = 0;

      for (ib $$2 : C) {
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
