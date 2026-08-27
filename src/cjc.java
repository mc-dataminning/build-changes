import javax.annotation.Nullable;

public class cjc extends ckw implements cjn {
   private final ecf a;

   public cjc(ecf $$0, ckw.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      eje $$4 = a($$0, $$1, this.a == ech.a ? crb.b.b : crb.b.a);
      if ($$4.c() == ejg.a.a) {
         return bir.c($$3);
      } else if ($$4.c() != ejg.a.b) {
         return bir.c($$3);
      } else {
         ht $$5 = $$4.a();
         hx $$6 = $$4.b();
         ht $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bir.d($$3);
         } else if (this.a == ech.a) {
            dgw $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cva $$9) {
               clb $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(aqx.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dlg.y, $$5);
                  clb $$11 = cld.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((amb)$$1, $$10);
                  }

                  return bir.a($$11, $$0.x_());
               }
            }

            return bir.d($$3);
         } else {
            dgw $$12 = $$0.a_($$5);
            ht $$13 = $$12.b() instanceof czj && this.a == ech.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof amb) {
                  al.y.a((amb)$$1, $$13, $$3);
               }

               $$1.b(aqx.c.b(this));
               return bir.a(a($$3, $$1), $$0.x_());
            } else {
               return bir.d($$3);
            }
         }
      }
   }

   public static clb a(clb $$0, cdm $$1) {
      return !$$1.fT().d ? new clb(cle.pK) : $$0;
   }

   @Override
   public void a(@Nullable cdm $$0, crs $$1, clb $$2, ht $$3) {
   }

   @Override
   public boolean a(@Nullable cdm $$0, crs $$1, ht $$2, @Nullable eje $$3) {
      if (!(this.a instanceof ece $$4)) {
         return false;
      } else {
         cut $$7;
         boolean $$8;
         dgw $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof czj $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
                  break label70;
               }

               var10000 = false;
               break label82;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
         } else if ($$1.D_().i() && this.a.a(arh.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aqn.hR, aqo.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(js.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof czj $$15 && this.a == ech.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.B && $$8 && !$$6.k()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.u().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cdm $$0, crt $$1, ht $$2) {
      aqm $$3 = this.a.a(arh.b) ? aqn.cy : aqn.cv;
      $$1.a($$0, $$2, $$3, aqo.e, 1.0F, 1.0F);
      $$1.a($$0, dlg.z, $$2);
   }
}
