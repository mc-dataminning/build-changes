public interface dak extends cza {
   ir[] C = ir.values();

   default int a(im $$0, ir $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(im $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ir.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ir.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ir.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ir.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ir.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ir.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(im $$0, ir $$1, boolean $$2) {
      dpy $$3 = this.a_($$0);
      if ($$2) {
         return dex.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dcx.ha)) {
         return 15;
      } else if ($$3.a(dcx.cw)) {
         return $$3.c(dix.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(im $$0, ir $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(im $$0, ir $$1) {
      dpy $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(im $$0) {
      if (this.c($$0.d(), ir.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ir.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ir.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ir.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ir.e) > 0 ? true : this.c($$0.h(), ir.f) > 0;
      }
   }

   default int D(im $$0) {
      int $$1 = 0;

      for (ir $$2 : C) {
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
