public interface cty extends cso {
   ic[] C = ic.values();

   default int a(hx $$0, ic $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(hx $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ic.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ic.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ic.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ic.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ic.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ic.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(hx $$0, ic $$1, boolean $$2) {
      dja $$3 = this.a_($$0);
      if ($$2) {
         return cyl.h($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(cwl.ha)) {
         return 15;
      } else if ($$3.a(cwl.cw)) {
         return $$3.c(dck.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(hx $$0, ic $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(hx $$0, ic $$1) {
      dja $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(hx $$0) {
      if (this.c($$0.d(), ic.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ic.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ic.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ic.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ic.e) > 0 ? true : this.c($$0.h(), ic.f) > 0;
      }
   }

   default int D(hx $$0) {
      int $$1 = 0;

      for (ic $$2 : C) {
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
