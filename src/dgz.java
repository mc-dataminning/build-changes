public interface dgz extends dfm {
   jn[] D = jn.values();

   default int a(ji $$0, jn $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(ji $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jn.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jn.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jn.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jn.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jn.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jn.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(ji $$0, jn $$1, boolean $$2) {
      dww $$3 = this.a_($$0);
      if ($$2) {
         return dlo.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(djn.hx)) {
         return 15;
      } else if ($$3.a(djn.cE)) {
         return $$3.c(dps.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(ji $$0, jn $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(ji $$0, jn $$1) {
      dww $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(ji $$0) {
      if (this.c($$0.e(), jn.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jn.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jn.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jn.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jn.e) > 0 ? true : this.c($$0.i(), jn.f) > 0;
      }
   }

   default int D(ji $$0) {
      int $$1 = 0;

      for (jn $$2 : D) {
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
