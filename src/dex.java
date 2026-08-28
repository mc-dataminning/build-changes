public interface dex extends ddl {
   jj[] C = jj.values();

   default int a(je $$0, jj $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(je $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jj.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jj.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jj.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jj.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jj.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jj.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(je $$0, jj $$1, boolean $$2) {
      duo $$3 = this.a_($$0);
      if ($$2) {
         return djl.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dhl.ha)) {
         return 15;
      } else if ($$3.a(dhl.cw)) {
         return $$3.c(dnm.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(je $$0, jj $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(je $$0, jj $$1) {
      duo $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(je $$0) {
      if (this.c($$0.e(), jj.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jj.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jj.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jj.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jj.e) > 0 ? true : this.c($$0.i(), jj.f) > 0;
      }
   }

   default int D(je $$0) {
      int $$1 = 0;

      for (jj $$2 : C) {
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
