public interface czw extends cym {
   ij[] C = ij.values();

   default int a(id $$0, ij $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(id $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), ij.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), ij.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), ij.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), ij.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), ij.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), ij.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(id $$0, ij $$1, boolean $$2) {
      dpi $$3 = this.a_($$0);
      if ($$2) {
         return dej.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dcj.ha)) {
         return 15;
      } else if ($$3.a(dcj.cw)) {
         return $$3.c(dii.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(id $$0, ij $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(id $$0, ij $$1) {
      dpi $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(id $$0) {
      if (this.c($$0.d(), ij.a) > 0) {
         return true;
      } else if (this.c($$0.c(), ij.b) > 0) {
         return true;
      } else if (this.c($$0.e(), ij.c) > 0) {
         return true;
      } else if (this.c($$0.f(), ij.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), ij.e) > 0 ? true : this.c($$0.h(), ij.f) > 0;
      }
   }

   default int D(id $$0) {
      int $$1 = 0;

      for (ij $$2 : C) {
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
