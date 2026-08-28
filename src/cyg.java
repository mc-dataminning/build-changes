public class cyg extends cyl {
   public cyg(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      int $$2 = 0;
      cun $$3 = cun.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuq.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuq.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cun a(cqi $$0, jk.a $$1) {
      int $$2 = 0;
      cun $$3 = cun.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuq.ua)) {
               if (!$$3.e()) {
                  return cun.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuq.tZ)) {
                  return cun.l;
               }

               $$2++;
            }
         }
      }

      cxw $$6 = $$3.a(km.I);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxw $$7 = $$6.b();
         if ($$7 == null) {
            return cun.l;
         } else {
            cun $$8 = $$3.c($$2);
            $$8.b(km.I, $$7);
            return $$8;
         }
      } else {
         return cun.l;
      }
   }

   public jr<cun> a(cqi $$0) {
      jr<cun> $$1 = jr.a($$0.b(), cun.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cun $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cun($$3.g().u()));
         } else if ($$3.g() instanceof cwl) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
