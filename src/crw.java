import javax.annotation.Nullable;

public class crw extends ctl implements csh {
   private final emv a;

   public crw(emv $$0, ctl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      eui $$4 = a($$0, $$1, this.a == emx.a ? dai.b.b : dai.b.a);
      if ($$4.c() == euk.a.a) {
         return bpx.c($$3);
      } else if ($$4.c() != euk.a.b) {
         return bpx.c($$3);
      } else {
         io $$5 = $$4.a();
         it $$6 = $$4.b();
         io $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bpx.d($$3);
         } else if (this.a == emx.a) {
            drd $$8 = $$0.a_($$5);
            if ($$8.b() instanceof deh $$9) {
               ctq $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(avs.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dvw.y, $$5);
                  ctq $$11 = cts.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aqo)$$1, $$10);
                  }

                  return bpx.a($$11, $$0.x_());
               }
            }

            return bpx.d($$3);
         } else {
            drd $$12 = $$0.a_($$5);
            io $$13 = $$12.b() instanceof dir && this.a == emx.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqo) {
                  am.z.a((aqo)$$1, $$13, $$3);
               }

               $$1.b(avs.c.b(this));
               return bpx.a(a($$3, $$1), $$0.x_());
            } else {
               return bpx.d($$3);
            }
         }
      }
   }

   public static ctq a(ctq $$0, cly $$1) {
      return !$$1.fP() ? new ctq(ctt.qy) : $$0;
   }

   @Override
   public void a(@Nullable cly $$0, daz $$1, ctq $$2, io $$3) {
   }

   @Override
   public boolean a(@Nullable cly $$0, daz $$1, io $$2, @Nullable eui $$3) {
      if (!(this.a instanceof emu $$4)) {
         return false;
      } else {
         dea $$7;
         boolean $$8;
         drd $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dir $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(awc.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avi.iU, avj.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ky.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dir $$15 && this.a == emx.c) {
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

   protected void a(@Nullable cly $$0, dba $$1, io $$2) {
      avh $$3 = this.a.a(awc.b) ? avi.df : avi.dc;
      $$1.a($$0, $$2, $$3, avj.e, 1.0F, 1.0F);
      $$1.a($$0, dvw.z, $$2);
   }
}
