public interface dcq extends dbg {
   iw[] D = iw.values();

   default int a(ir $$0, iw $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(ir $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), iw.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), iw.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), iw.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), iw.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), iw.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), iw.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(ir $$0, iw $$1, boolean $$2) {
      dtc $$3 = this.a_($$0);
      if ($$2) {
         return dhf.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dfe.hU)) {
         return 15;
      } else if ($$3.a(dfe.dh)) {
         return $$3.c(dls.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(ir $$0, iw $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(ir $$0, iw $$1) {
      dtc $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(ir $$0) {
      if (this.c($$0.d(), iw.a) > 0) {
         return true;
      } else if (this.c($$0.c(), iw.b) > 0) {
         return true;
      } else if (this.c($$0.e(), iw.c) > 0) {
         return true;
      } else if (this.c($$0.f(), iw.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), iw.e) > 0 ? true : this.c($$0.h(), iw.f) > 0;
      }
   }

   default int D(ir $$0) {
      int $$1 = 0;

      for (iw $$2 : D) {
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
