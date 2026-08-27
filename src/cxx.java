import javax.annotation.Nullable;

public class cxx extends cpn {
   public static final dcs a = dcr.B;

   public cxx(dca.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
      if (!$$0.r_() && !$$3.f() && $$2.c(a)) {
         a($$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cmm $$0, gu $$1, cme $$2) {
      if (!$$0.B) {
         bvi $$3 = new bvi($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.k();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cmm $$0, gu $$1) {
      a($$0, $$1, null);
   }

   private static void a(cmm $$0, gu $$1, @Nullable bfz $$2) {
      if (!$$0.B) {
         bvi $$3 = new bvi($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dn(), $$3.dp(), $$3.dt(), amh.xF, ami.e, 1.0F, 1.0F);
         $$0.a($$2, dgl.J, $$1);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      cfz $$6 = $$3.b($$4);
      if (!$$6.a(cgc.nE) && !$$6.a(cgc.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cpo.a.n(), 11);
         cfu $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cgc.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(amr.c.b($$7));
         return bdx.a($$1.B);
      }
   }

   @Override
   public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
      if (!$$0.B) {
         gu $$4 = $$2.a();
         bfj $$5 = $$3.v();
         if ($$3.bL() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bfz ? (bfz)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cme $$0) {
      return false;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }
}
