public interface dcp extends dbf {
   je[] C = je.values();

   default int a(iz $$0, je $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(iz $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), je.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), je.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), je.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), je.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), je.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), je.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(iz $$0, je $$1, boolean $$2) {
      dsd $$3 = this.a_($$0);
      if ($$2) {
         return dhc.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dfc.ha)) {
         return 15;
      } else if ($$3.a(dfc.cw)) {
         return $$3.c(dlc.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(iz $$0, je $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(iz $$0, je $$1) {
      dsd $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(iz $$0) {
      if (this.c($$0.d(), je.a) > 0) {
         return true;
      } else if (this.c($$0.c(), je.b) > 0) {
         return true;
      } else if (this.c($$0.e(), je.c) > 0) {
         return true;
      } else if (this.c($$0.f(), je.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), je.e) > 0 ? true : this.c($$0.h(), je.f) > 0;
      }
   }

   default int D(iz $$0) {
      int $$1 = 0;

      for (je $$2 : C) {
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
