public interface crp extends cqf {
   hx[] C = hx.values();

   default int a(ht $$0, hx $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(ht $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), hx.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), hx.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), hx.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), hx.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), hx.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), hx.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(ht $$0, hx $$1, boolean $$2) {
      dgb $$3 = this.a_($$0);
      if ($$2) {
         return cwa.h($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(cuc.ha)) {
         return 15;
      } else if ($$3.a(cuc.cw)) {
         return $$3.c(daa.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(ht $$0, hx $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(ht $$0, hx $$1) {
      dgb $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean B(ht $$0) {
      if (this.c($$0.d(), hx.a) > 0) {
         return true;
      } else if (this.c($$0.c(), hx.b) > 0) {
         return true;
      } else if (this.c($$0.e(), hx.c) > 0) {
         return true;
      } else if (this.c($$0.f(), hx.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), hx.e) > 0 ? true : this.c($$0.h(), hx.f) > 0;
      }
   }

   default int C(ht $$0) {
      int $$1 = 0;

      for (hx $$2 : C) {
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
