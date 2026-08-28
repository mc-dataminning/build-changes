public interface ddk extends dca {
   ji[] C = ji.values();

   default int a(jd $$0, ji $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(jd $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ji.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ji.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ji.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ji.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ji.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ji.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(jd $$0, ji $$1, boolean $$2) {
      dta $$3 = this.a_($$0);
      if ($$2) {
         return dhy.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dfy.ha)) {
         return 15;
      } else if ($$3.a(dfy.cw)) {
         return $$3.c(dlz.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(jd $$0, ji $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(jd $$0, ji $$1) {
      dta $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(jd $$0) {
      if (this.c($$0.d(), ji.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ji.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ji.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ji.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ji.e) > 0 ? true : this.c($$0.h(), ji.f) > 0;
      }
   }

   default int D(jd $$0) {
      int $$1 = 0;

      for (ji $$2 : C) {
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
