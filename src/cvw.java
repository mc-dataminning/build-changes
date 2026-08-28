import javax.annotation.Nullable;

public class cvw extends cxg implements cwf {
   private final eto a;

   public cvw(eto $$0, cxg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      fbo $$4 = a($$0, $$1, this.a == etq.a ? dgi.b.b : dgi.b.a);
      if ($$4.d() == fbq.a.a) {
         return bte.e;
      } else if ($$4.d() != fbq.a.b) {
         return bte.e;
      } else {
         jh $$5 = $$4.b();
         jm $$6 = $$4.c();
         jh $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bte.d;
         } else if (this.a == etq.a) {
            dxn $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dkm $$9) {
               cxk $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(axp.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ecj.y, $$5);
                  cxk $$11 = cxn.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ao.k.a((asi)$$1, $$10);
                  }

                  return bte.a.a($$11);
               }
            }

            return bte.d;
         } else {
            dxn $$12 = $$0.a_($$5);
            jh $$13 = $$12.b() instanceof dox && this.a == etq.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof asi) {
                  ao.z.a((asi)$$1, $$13, $$3);
               }

               $$1.b(axp.c.b(this));
               cxk $$14 = cxn.a($$3, $$1, a($$3, $$1));
               return bte.a.a($$14);
            } else {
               return bte.d;
            }
         }
      }
   }

   public static cxk a(cxk $$0, cps $$1) {
      return !$$1.fT() ? new cxk(cxo.qW) : $$0;
   }

   @Override
   public void a(@Nullable cps $$0, dha $$1, cxk $$2, jh $$3) {
   }

   @Override
   public boolean a(@Nullable cps $$0, dha $$1, jh $$2, @Nullable fbo $$3) {
      if (!(this.a instanceof etn $$4)) {
         return false;
      } else {
         dke $$7;
         boolean $$8;
         dxn $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dox $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
                  break label70;
               }

               var10000 = false;
               break label82;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.b().a($$3.c()), null);
         } else if ($$1.G_().i() && this.a.a(aya.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, axf.jn, axg.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ls.Y, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dox $$15 && this.a == etq.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.C && $$8 && !$$6.n()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.y().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cps $$0, dhb $$1, jh $$2) {
      axe $$3 = this.a.a(aya.b) ? axf.df : axf.dc;
      $$1.a($$0, $$2, $$3, axg.e, 1.0F, 1.0F);
      $$1.a($$0, ecj.z, $$2);
   }
}
