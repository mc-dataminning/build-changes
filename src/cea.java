import javax.annotation.Nullable;

public class cea extends cfu implements cel {
   private final dxd a;

   public cea(dxd $$0, cfu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      eee $$4 = a($$0, $$1, this.a == dxf.a ? clv.b.b : clv.b.a);
      if ($$4.c() == eeg.a.a) {
         return bdy.c($$3);
      } else if ($$4.c() != eeg.a.b) {
         return bdy.c($$3);
      } else {
         gu $$5 = $$4.a();
         ha $$6 = $$4.b();
         gu $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bdy.d($$3);
         } else if (this.a == dxf.a) {
            dcb $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cpt) {
               cpt $$9 = (cpt)$$8.b();
               cfz $$10 = $$9.c($$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(amr.c.b(this));
                  $$9.am_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dgl.z, $$5);
                  cfz $$11 = cgb.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     ai.j.a((aig)$$1, $$10);
                  }

                  return bdy.a($$11, $$0.r_());
               }
            }

            return bdy.d($$3);
         } else {
            dcb $$12 = $$0.a_($$5);
            gu $$13 = $$12.b() instanceof cub && this.a == dxf.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aig) {
                  ai.y.a((aig)$$1, $$13, $$3);
               }

               $$1.b(amr.c.b(this));
               return bdy.a(a($$3, $$1), $$0.r_());
            } else {
               return bdy.d($$3);
            }
         }
      }
   }

   public static cfz a(cfz $$0, byo $$1) {
      return !$$1.fO().d ? new cfz(cgc.pK) : $$0;
   }

   @Override
   public void a(@Nullable byo $$0, cmm $$1, cfz $$2, gu $$3) {
   }

   @Override
   public boolean a(@Nullable byo $$0, cmm $$1, gu $$2, @Nullable eee $$3) {
      if (!(this.a instanceof dxc)) {
         return false;
      } else {
         dcb $$4 = $$1.a_($$2);
         cpn $$5 = $$4.b();
         boolean $$6 = $$4.a(this.a);
         boolean $$7 = $$4.i() || $$6 || $$5 instanceof cub && ((cub)$$5).a($$1, $$2, $$4, this.a);
         if (!$$7) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
         } else if ($$1.x_().i() && this.a.a(anb.a)) {
            int $$8 = $$2.u();
            int $$9 = $$2.v();
            int $$10 = $$2.w();
            $$1.a($$0, $$2, amh.hN, ami.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$11 = 0; $$11 < 8; $$11++) {
               $$1.a(iv.S, (double)$$8 + Math.random(), (double)$$9 + Math.random(), (double)$$10 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else if ($$5 instanceof cub && this.a == dxf.c) {
            ((cub)$$5).a($$1, $$2, $$4, ((dxc)this.a).a(false));
            this.a($$0, $$1, $$2);
            return true;
         } else {
            if (!$$1.B && $$6 && !$$4.k()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$4.u().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable byo $$0, cmn $$1, gu $$2) {
      amg $$3 = this.a.a(anb.b) ? amh.cy : amh.cv;
      $$1.a($$0, $$2, $$3, ami.e, 1.0F, 1.0F);
      $$1.a($$0, dgl.A, $$2);
   }
}
