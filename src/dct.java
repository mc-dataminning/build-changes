public interface dct extends dbj {
   jf[] C = jf.values();

   default int a(ja $$0, jf $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(ja $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), jf.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), jf.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), jf.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), jf.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), jf.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), jf.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(ja $$0, jf $$1, boolean $$2) {
      dsh $$3 = this.a_($$0);
      if ($$2) {
         return dhh.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dfh.ha)) {
         return 15;
      } else if ($$3.a(dfh.cw)) {
         return $$3.c(dlh.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(ja $$0, jf $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(ja $$0, jf $$1) {
      dsh $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(ja $$0) {
      if (this.c($$0.d(), jf.a) > 0) {
         return true;
      } else if (this.c($$0.c(), jf.b) > 0) {
         return true;
      } else if (this.c($$0.e(), jf.c) > 0) {
         return true;
      } else if (this.c($$0.f(), jf.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), jf.e) > 0 ? true : this.c($$0.h(), jf.f) > 0;
      }
   }

   default int D(ja $$0) {
      int $$1 = 0;

      for (jf $$2 : C) {
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
