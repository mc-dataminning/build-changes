public interface dfm extends dea {
   jl[] D = jl.values();

   default int a(jg $$0, jl $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(jg $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jl.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jl.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jl.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jl.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jl.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jl.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(jg $$0, jl $$1, boolean $$2) {
      dvd $$3 = this.a_($$0);
      if ($$2) {
         return dka.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dia.ha)) {
         return 15;
      } else if ($$3.a(dia.cw)) {
         return $$3.c(doa.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(jg $$0, jl $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(jg $$0, jl $$1) {
      dvd $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(jg $$0) {
      if (this.c($$0.e(), jl.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jl.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jl.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jl.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jl.e) > 0 ? true : this.c($$0.i(), jl.f) > 0;
      }
   }

   default int D(jg $$0) {
      int $$1 = 0;

      for (jl $$2 : D) {
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
