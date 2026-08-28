public class czc extends czk {
   public czc(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      cue $$2 = null;
      cvl $$3 = null;
      cvl $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cvl $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cvg $$7 = $$6.h();
            if (!($$7 instanceof cti)) {
               return false;
            }

            cti $$8 = (cti)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(kr.aa, dqv.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cvl a(czi $$0, jp.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cvl $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kr.aa, dqv.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cvl.k;
   }

   public jw<cvl> a(czi $$0) {
      jw<cvl> $$1 = jw.a($$0.a(), cvl.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvl $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().v()) {
               $$1.set($$2, new cvl($$3.h().u()));
            } else if (!$$3.a(kr.aa, dqv.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public czy<?> as_() {
      return czy.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
