public interface djs extends dig {
   ja[] D = ja.values();

   default int a(iu $$0, ja $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(iu $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), ja.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), ja.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), ja.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), ja.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), ja.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), ja.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(iu $$0, ja $$1, boolean $$2) {
      eah $$3 = this.a_($$0);
      if ($$2) {
         return doi.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dmh.hB)) {
         return 15;
      } else if ($$3.a(dmh.cH)) {
         return $$3.c(dso.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(iu $$0, ja $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(iu $$0, ja $$1) {
      eah $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean D(iu $$0) {
      if (this.c($$0.e(), ja.a) > 0) {
         return true;
      } else if (this.c($$0.d(), ja.b) > 0) {
         return true;
      } else if (this.c($$0.f(), ja.c) > 0) {
         return true;
      } else if (this.c($$0.g(), ja.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), ja.e) > 0 ? true : this.c($$0.i(), ja.f) > 0;
      }
   }

   default int E(iu $$0) {
      int $$1 = 0;

      for (ja $$2 : D) {
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
