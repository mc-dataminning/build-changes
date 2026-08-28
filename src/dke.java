public interface dke extends diq {
   jb[] D = jb.values();

   default int a(iv $$0, jb $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(iv $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jb.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jb.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jb.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jb.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jb.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jb.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(iv $$0, jb $$1, boolean $$2) {
      eat $$3 = this.a_($$0);
      if ($$2) {
         return dou.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dmt.hB)) {
         return 15;
      } else if ($$3.a(dmt.cH)) {
         return $$3.c(dta.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(iv $$0, jb $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(iv $$0, jb $$1) {
      eat $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean D(iv $$0) {
      if (this.c($$0.e(), jb.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jb.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jb.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jb.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jb.e) > 0 ? true : this.c($$0.i(), jb.f) > 0;
      }
   }

   default int E(iv $$0) {
      int $$1 = 0;

      for (jb $$2 : D) {
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
