public interface cqa extends coq {
   hb[] C = hb.values();

   default int a(gv $$0, hb $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(gv $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), hb.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), hb.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), hb.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), hb.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), hb.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), hb.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(gv $$0, hb $$1, boolean $$2) {
      dey $$3 = this.a_($$0);
      if ($$2) {
         return cui.h($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(csl.ha)) {
         return 15;
      } else if ($$3.a(csl.cw)) {
         return $$3.c(cyl.e);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(gv $$0, hb $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(gv $$0, hb $$1) {
      dey $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean B(gv $$0) {
      if (this.c($$0.d(), hb.a) > 0) {
         return true;
      } else if (this.c($$0.c(), hb.b) > 0) {
         return true;
      } else if (this.c($$0.e(), hb.c) > 0) {
         return true;
      } else if (this.c($$0.f(), hb.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), hb.e) > 0 ? true : this.c($$0.h(), hb.f) > 0;
      }
   }

   default int C(gv $$0) {
      int $$1 = 0;

      for (hb $$2 : C) {
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
