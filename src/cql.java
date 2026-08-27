public interface cql extends cpb {
   ha[] C = ha.values();

   default int a(gw $$0, ha $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(gw $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ha.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ha.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ha.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ha.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ha.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ha.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(gw $$0, ha $$1, boolean $$2) {
      dfj $$3 = this.a_($$0);
      if ($$2) {
         return cut.h($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(csw.ha)) {
         return 15;
      } else if ($$3.a(csw.cw)) {
         return $$3.c(cyw.e);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(gw $$0, ha $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(gw $$0, ha $$1) {
      dfj $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean B(gw $$0) {
      if (this.c($$0.d(), ha.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ha.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ha.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ha.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ha.e) > 0 ? true : this.c($$0.h(), ha.f) > 0;
      }
   }

   default int C(gw $$0) {
      int $$1 = 0;

      for (ha $$2 : C) {
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
