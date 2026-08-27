import javax.annotation.Nullable;

public class cxm extends cpa implements csr {
   public static final dcz<ddl> a = dcr.bj;

   protected cxm(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ddl.b));
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dba($$0, $$1);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      czn $$6 = $$1.c_($$2);
      if ($$6 instanceof dba) {
         return ((dba)$$6).a($$3) ? bdx.a($$1.B) : bdx.d;
      } else {
         return bdx.d;
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            czn $$5 = $$0.c_($$1);
            if ($$5 instanceof dba) {
               ((dba)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if ($$1 instanceof aif) {
         if ($$1.c_($$2) instanceof dba $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aif)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aif $$0, dba $$1) {
      switch ($$1.y()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.a($$0, false);
            break;
         case c:
            $$1.E();
         case d:
      }
   }
}
