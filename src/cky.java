import javax.annotation.Nullable;

public class cky extends cms implements clj {
   private final eep a;

   public cky(eep $$0, cms.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      elo $$4 = a($$0, $$1, this.a == eer.a ? csx.b.b : csx.b.a);
      if ($$4.c() == elq.a.a) {
         return bkb.c($$3);
      } else if ($$4.c() != elq.a.b) {
         return bkb.c($$3);
      } else {
         hx $$5 = $$4.a();
         ic $$6 = $$4.b();
         hx $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bkb.d($$3);
         } else if (this.a == eer.a) {
            djg $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cww $$9) {
               cmx $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(asb.c.b(this));
                  $$9.au_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dnq.y, $$5);
                  cmx $$11 = cmz.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((ane)$$1, $$10);
                  }

                  return bkb.a($$11, $$0.y_());
               }
            }

            return bkb.d($$3);
         } else {
            djg $$12 = $$0.a_($$5);
            hx $$13 = $$12.b() instanceof dbf && this.a == eer.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof ane) {
                  am.z.a((ane)$$1, $$13, $$3);
               }

               $$1.b(asb.c.b(this));
               return bkb.a(a($$3, $$1), $$0.y_());
            } else {
               return bkb.d($$3);
            }
         }
      }
   }

   public static cmx a(cmx $$0, cfh $$1) {
      return !$$1.fT().d ? new cmx(cna.qv) : $$0;
   }

   @Override
   public void a(@Nullable cfh $$0, cto $$1, cmx $$2, hx $$3) {
   }

   @Override
   public boolean a(@Nullable cfh $$0, cto $$1, hx $$2, @Nullable elo $$3) {
      if (!(this.a instanceof eeo $$4)) {
         return false;
      } else {
         cwp $$7;
         boolean $$8;
         djg $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dbf $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(asl.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, arr.iq, ars.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(jx.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dbf $$15 && this.a == eer.c) {
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

   protected void a(@Nullable cfh $$0, ctp $$1, hx $$2) {
      arq $$3 = this.a.a(asl.b) ? arr.cH : arr.cE;
      $$1.a($$0, $$2, $$3, ars.e, 1.0F, 1.0F);
      $$1.a($$0, dnq.z, $$2);
   }
}
