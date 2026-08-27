import javax.annotation.Nullable;

public class cru extends ctj implements csf {
   private final emt a;

   public cru(emt $$0, ctj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      eug $$4 = a($$0, $$1, this.a == emv.a ? dag.b.b : dag.b.a);
      if ($$4.c() == eui.a.a) {
         return bpv.c($$3);
      } else if ($$4.c() != eui.a.b) {
         return bpv.c($$3);
      } else {
         io $$5 = $$4.a();
         it $$6 = $$4.b();
         io $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bpv.d($$3);
         } else if (this.a == emv.a) {
            drb $$8 = $$0.a_($$5);
            if ($$8.b() instanceof def $$9) {
               cto $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(avr.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dvu.y, $$5);
                  cto $$11 = ctq.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aqn)$$1, $$10);
                  }

                  return bpv.a($$11, $$0.x_());
               }
            }

            return bpv.d($$3);
         } else {
            drb $$12 = $$0.a_($$5);
            io $$13 = $$12.b() instanceof dip && this.a == emv.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqn) {
                  am.z.a((aqn)$$1, $$13, $$3);
               }

               $$1.b(avr.c.b(this));
               return bpv.a(a($$3, $$1), $$0.x_());
            } else {
               return bpv.d($$3);
            }
         }
      }
   }

   public static cto a(cto $$0, clw $$1) {
      return !$$1.fP() ? new cto(ctr.qy) : $$0;
   }

   @Override
   public void a(@Nullable clw $$0, dax $$1, cto $$2, io $$3) {
   }

   @Override
   public boolean a(@Nullable clw $$0, dax $$1, io $$2, @Nullable eug $$3) {
      if (!(this.a instanceof ems $$4)) {
         return false;
      } else {
         ddy $$7;
         boolean $$8;
         drb $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dip $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(awb.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avh.iU, avi.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ky.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dip $$15 && this.a == emv.c) {
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

   protected void a(@Nullable clw $$0, day $$1, io $$2) {
      avg $$3 = this.a.a(awb.b) ? avh.df : avh.dc;
      $$1.a($$0, $$2, $$3, avi.e, 1.0F, 1.0F);
      $$1.a($$0, dvu.z, $$2);
   }
}
