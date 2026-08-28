public interface dfa extends ddo {
   jk[] C = jk.values();

   default int a(jf $$0, jk $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(jf $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jk.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jk.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jk.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jk.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jk.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jk.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(jf $$0, jk $$1, boolean $$2) {
      dus $$3 = this.a_($$0);
      if ($$2) {
         return djo.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dho.ha)) {
         return 15;
      } else if ($$3.a(dho.cw)) {
         return $$3.c(dnp.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(jf $$0, jk $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(jf $$0, jk $$1) {
      dus $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(jf $$0) {
      if (this.c($$0.e(), jk.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jk.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jk.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jk.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jk.e) > 0 ? true : this.c($$0.i(), jk.f) > 0;
      }
   }

   default int D(jf $$0) {
      int $$1 = 0;

      for (jk $$2 : C) {
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
