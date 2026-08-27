public interface dat extends czj {
   is[] C = is.values();

   default int a(in $$0, is $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default int e_(in $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.d(), is.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.c(), is.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.e(), is.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.f(), is.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.g(), is.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.h(), is.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(in $$0, is $$1, boolean $$2) {
      dqh $$3 = this.a_($$0);
      if ($$2) {
         return dfg.m($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(ddg.ha)) {
         return 15;
      } else if ($$3.a(ddg.cw)) {
         return $$3.c(djg.f);
      } else {
         return $$3.m() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(in $$0, is $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(in $$0, is $$1) {
      dqh $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean C(in $$0) {
      if (this.c($$0.d(), is.a) > 0) {
         return true;
      } else if (this.c($$0.c(), is.b) > 0) {
         return true;
      } else if (this.c($$0.e(), is.c) > 0) {
         return true;
      } else if (this.c($$0.f(), is.d) > 0) {
         return true;
      } else {
         return this.c($$0.g(), is.e) > 0 ? true : this.c($$0.h(), is.f) > 0;
      }
   }

   default int D(in $$0) {
      int $$1 = 0;

      for (is $$2 : C) {
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
