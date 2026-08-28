public interface dih extends dgv {
   jo[] D = jo.values();

   default int a(jj $$0, jo $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(jj $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jo.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jo.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jo.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jo.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jo.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jo.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(jj $$0, jo $$1, boolean $$2) {
      dym $$3 = this.a_($$0);
      if ($$2) {
         return dmx.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dkw.hx)) {
         return 15;
      } else if ($$3.a(dkw.cE)) {
         return $$3.c(drb.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(jj $$0, jo $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(jj $$0, jo $$1) {
      dym $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(jj $$0) {
      if (this.c($$0.e(), jo.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jo.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jo.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jo.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jo.e) > 0 ? true : this.c($$0.i(), jo.f) > 0;
      }
   }

   default int D(jj $$0) {
      int $$1 = 0;

      for (jo $$2 : D) {
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
