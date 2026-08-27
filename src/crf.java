import javax.annotation.Nullable;

public class crf extends csu implements crq {
   private final elz a;

   public crf(elz $$0, csu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      etl $$4 = a($$0, $$1, this.a == emb.a ? czm.b.b : czm.b.a);
      if ($$4.c() == etn.a.a) {
         return bpn.c($$3);
      } else if ($$4.c() != etn.a.b) {
         return bpn.c($$3);
      } else {
         in $$5 = $$4.a();
         is $$6 = $$4.b();
         in $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bpn.d($$3);
         } else if (this.a == emb.a) {
            dqh $$8 = $$0.a_($$5);
            if ($$8.b() instanceof ddl $$9) {
               csz $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.d()) {
                  $$1.b(avm.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dva.y, $$5);
                  csz $$11 = ctb.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aqi)$$1, $$10);
                  }

                  return bpn.a($$11, $$0.x_());
               }
            }

            return bpn.d($$3);
         } else {
            dqh $$12 = $$0.a_($$5);
            in $$13 = $$12.b() instanceof dhv && this.a == emb.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqi) {
                  am.z.a((aqi)$$1, $$13, $$3);
               }

               $$1.b(avm.c.b(this));
               return bpn.a(a($$3, $$1), $$0.x_());
            } else {
               return bpn.d($$3);
            }
         }
      }
   }

   public static csz a(csz $$0, clh $$1) {
      return !$$1.fN() ? new csz(ctc.qy) : $$0;
   }

   @Override
   public void a(@Nullable clh $$0, dad $$1, csz $$2, in $$3) {
   }

   @Override
   public boolean a(@Nullable clh $$0, dad $$1, in $$2, @Nullable etl $$3) {
      if (!(this.a instanceof ely $$4)) {
         return false;
      } else {
         dde $$7;
         boolean $$8;
         dqh $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dhv $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(avw.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avc.iP, avd.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kx.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dhv $$15 && this.a == emb.c) {
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

   protected void a(@Nullable clh $$0, dae $$1, in $$2) {
      avb $$3 = this.a.a(avw.b) ? avc.df : avc.dc;
      $$1.a($$0, $$2, $$3, avd.e, 1.0F, 1.0F);
      $$1.a($$0, dva.z, $$2);
   }
}
