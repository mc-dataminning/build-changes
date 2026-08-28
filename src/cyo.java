import javax.annotation.Nullable;

public class cyo extends czw implements cyw {
   private final exp a;

   public cyo(exp $$0, czw.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      ffo $$4 = a($$0, $$1, this.a == exr.a ? djg.b.b : djg.b.a);
      if ($$4.d() == ffq.a.a) {
         return but.e;
      } else if ($$4.d() != ffq.a.b) {
         return but.e;
      } else {
         iw $$5 = $$4.b();
         jc $$6 = $$4.c();
         iw $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return but.d;
         } else if (this.a == exr.a) {
            ebg $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dnm $$9) {
               daa $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(axb.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, egg.y, $$5);
                  daa $$11 = dad.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     aq.k.a((arv)$$1, $$10);
                  }

                  return but.a.a($$11);
               }
            }

            return but.d;
         } else {
            ebg $$12 = $$0.a_($$5);
            iw $$13 = $$12.b() instanceof dsb && this.a == exr.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arv) {
                  aq.z.a((arv)$$1, $$13, $$3);
               }

               $$1.b(axb.c.b(this));
               daa $$14 = dad.a($$3, $$1, b($$3, $$1));
               return but.a.a($$14);
            } else {
               return but.d;
            }
         }
      }
   }

   public static daa b(daa $$0, crz $$1) {
      return !$$1.fV() ? new daa(dae.ro) : $$0;
   }

   @Override
   public void a(@Nullable bxw $$0, djz $$1, daa $$2, iw $$3) {
   }

   @Override
   public boolean a(@Nullable bxw $$0, djz $$1, iw $$2, @Nullable ffo $$3) {
      if (!(this.a instanceof exo $$4)) {
         return false;
      } else {
         dne $$7;
         boolean $$8;
         ebg $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dsb $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.F_().i() && this.a.a(axl.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awr.jy, aws.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lz.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dsb $$15 && this.a == exr.c) {
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

   protected void a(@Nullable bxw $$0, dka $$1, iw $$2) {
      awq $$3 = this.a.a(axl.b) ? awr.dg : awr.dd;
      $$1.a($$0, $$2, $$3, aws.e, 1.0F, 1.0F);
      $$1.a($$0, egg.z, $$2);
   }
}
