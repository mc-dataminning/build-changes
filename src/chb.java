import javax.annotation.Nullable;

public class chb extends civ implements chm {
   private final eag a;

   public chb(eag $$0, civ.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      ehe $$4 = a($$0, $$1, this.a == eai.a ? coz.b.b : coz.b.a);
      if ($$4.c() == ehg.a.a) {
         return bgu.c($$3);
      } else if ($$4.c() != ehg.a.b) {
         return bgu.c($$3);
      } else {
         gw $$5 = $$4.a();
         hc $$6 = $$4.b();
         gw $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bgu.d($$3);
         } else if (this.a == eai.a) {
            dfe $$8 = $$0.a_($$5);
            if ($$8.b() instanceof csw $$9) {
               cja $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(apj.c.b(this));
                  $$9.al_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, djo.y, $$5);
                  cja $$11 = cjc.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((ako)$$1, $$10);
                  }

                  return bgu.a($$11, $$0.r_());
               }
            }

            return bgu.d($$3);
         } else {
            dfe $$12 = $$0.a_($$5);
            gw $$13 = $$12.b() instanceof cxe && this.a == eai.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof ako) {
                  al.y.a((ako)$$1, $$13, $$3);
               }

               $$1.b(apj.c.b(this));
               return bgu.a(a($$3, $$1), $$0.r_());
            } else {
               return bgu.d($$3);
            }
         }
      }
   }

   public static cja a(cja $$0, cbp $$1) {
      return !$$1.fR().d ? new cja(cjd.pK) : $$0;
   }

   @Override
   public void a(@Nullable cbp $$0, cpq $$1, cja $$2, gw $$3) {
   }

   @Override
   public boolean a(@Nullable cbp $$0, cpq $$1, gw $$2, @Nullable ehe $$3) {
      if (!(this.a instanceof eaf $$4)) {
         return false;
      } else {
         csq $$7;
         boolean $$8;
         dfe $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cxe $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.x_().i() && this.a.a(apt.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aoz.hN, apa.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ix.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cxe $$15 && this.a == eai.c) {
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

   protected void a(@Nullable cbp $$0, cpr $$1, gw $$2) {
      aoy $$3 = this.a.a(apt.b) ? aoz.cy : aoz.cv;
      $$1.a($$0, $$2, $$3, apa.e, 1.0F, 1.0F);
      $$1.a($$0, djo.z, $$2);
   }
}
