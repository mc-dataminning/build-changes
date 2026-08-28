public interface dkr extends djd {
   jc[] D = jc.values();

   default int a(iw $$0, jc $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(iw $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jc.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jc.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jc.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jc.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jc.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jc.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(iw $$0, jc $$1, boolean $$2) {
      ebg $$3 = this.a_($$0);
      if ($$2) {
         return dph.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dng.hB)) {
         return 15;
      } else if ($$3.a(dng.cH)) {
         return $$3.c(dtn.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(iw $$0, jc $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(iw $$0, jc $$1) {
      ebg $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean D(iw $$0) {
      if (this.c($$0.e(), jc.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jc.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jc.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jc.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jc.e) > 0 ? true : this.c($$0.i(), jc.f) > 0;
      }
   }

   default int E(iw $$0) {
      int $$1 = 0;

      for (jc $$2 : D) {
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
