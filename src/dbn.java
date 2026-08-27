public interface dbn extends dad {
   it[] C = it.values();

   default int a(io $$0, it $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(io $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), it.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), it.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), it.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), it.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), it.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), it.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(io $$0, it $$1, boolean $$2) {
      drb $$3 = this.a_($$0);
      if ($$2) {
         return dga.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dea.ha)) {
         return 15;
      } else if ($$3.a(dea.cw)) {
         return $$3.c(dka.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(io $$0, it $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(io $$0, it $$1) {
      drb $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(io $$0) {
      if (this.c($$0.d(), it.a) > 0) {
         return true;
      } else if (this.c($$0.c(), it.b) > 0) {
         return true;
      } else if (this.c($$0.e(), it.c) > 0) {
         return true;
      } else if (this.c($$0.f(), it.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), it.e) > 0 ? true : this.c($$0.h(), it.f) > 0;
      }
   }

   default int D(io $$0) {
      int $$1 = 0;

      for (it $$2 : C) {
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
