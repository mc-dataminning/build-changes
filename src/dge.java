public interface dge extends der {
   jm[] D = jm.values();

   default int a(jh $$0, jm $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(jh $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jm.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jm.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jm.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jm.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jm.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jm.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(jh $$0, jm $$1, boolean $$2) {
      dvv $$3 = this.a_($$0);
      if ($$2) {
         return dks.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dis.ha)) {
         return 15;
      } else if ($$3.a(dis.cw)) {
         return $$3.c(dos.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(jh $$0, jm $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(jh $$0, jm $$1) {
      dvv $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(jh $$0) {
      if (this.c($$0.e(), jm.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jm.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jm.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jm.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jm.e) > 0 ? true : this.c($$0.i(), jm.f) > 0;
      }
   }

   default int D(jh $$0) {
      int $$1 = 0;

      for (jm $$2 : D) {
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
