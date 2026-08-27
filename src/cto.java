public interface cto extends cse {
   ia[] C = ia.values();

   default int a(hv $$0, ia $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(hv $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ia.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ia.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ia.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ia.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ia.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ia.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(hv $$0, ia $$1, boolean $$2) {
      dip $$3 = this.a_($$0);
      if ($$2) {
         return cyb.h($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(cwb.ha)) {
         return 15;
      } else if ($$3.a(cwb.cw)) {
         return $$3.c(dca.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(hv $$0, ia $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(hv $$0, ia $$1) {
      dip $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean B(hv $$0) {
      if (this.c($$0.d(), ia.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ia.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ia.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ia.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ia.e) > 0 ? true : this.c($$0.h(), ia.f) > 0;
      }
   }

   default int C(hv $$0) {
      int $$1 = 0;

      for (ia $$2 : C) {
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
