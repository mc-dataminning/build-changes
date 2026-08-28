public class cyj extends cyp {
   public cyj(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      int $$2 = 0;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cur.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cur.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuo a(cyn $$0, jo.a $$1) {
      int $$2 = 0;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cur.ua)) {
               if (!$$3.e()) {
                  return cuo.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cur.tZ)) {
                  return cuo.l;
               }

               $$2++;
            }
         }
      }

      cxz $$6 = $$3.a(kq.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxz $$7 = $$6.b();
         if ($$7 == null) {
            return cuo.l;
         } else {
            cuo $$8 = $$3.c($$2);
            $$8.b(kq.J, $$7);
            return $$8;
         }
      } else {
         return cuo.l;
      }
   }

   public jv<cuo> a(cyn $$0) {
      jv<cuo> $$1 = jv.a($$0.a(), cuo.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuo $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cuo($$3.g().u()));
         } else if ($$3.g() instanceof cwp) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public czc<?> ap_() {
      return czc.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
