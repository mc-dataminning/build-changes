import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class czw extends cya implements czq, dab {
   public static final MapCodec<czw> c = b(czw::new);
   private static final dfu d = dft.C;
   private final cyb e = new cyb(new czw.a(cyb.a));
   private final cyb f = new cyb(new czw.a(cyb.e.a));

   @Override
   public MapCodec<czw> a() {
      return c;
   }

   public czw(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public cyb c() {
      return this.e;
   }

   public cyb g() {
      return this.f;
   }

   public static boolean a(cqc $$0, gw $$1, dfd $$2, Collection<ha> $$3) {
      boolean $$4 = false;
      dfd $$5 = cte.qG.o();

      for (ha $$6 : $$3) {
         gw $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.u().c()) {
            $$5 = $$5.a(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(cqc $$0, dfd $$1, gw $$2, ash $$3) {
      if ($$1.a(this)) {
         for (ha $$4 : b) {
            dfu $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cte.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eag $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cte.a : cte.G).o();
         }

         $$0.a($$2, $$1, 3);
         czq.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(czv.a $$0, cqc $$1, gw $$2, ash $$3, czv $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? asb.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(czv $$0, cqc $$1, gw $$2, ash $$3) {
      dfd $$4 = $$1.a_($$2);
      aqk<ctc> $$5 = $$0.c();

      for (ha $$6 : ha.a($$3)) {
         if (a($$4, $$6)) {
            gw $$7 = $$2.a($$6);
            dfd $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dfd $$9 = cte.qF.o();
               $$1.a($$7, $$9, 3);
               ctc.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, apg.ug, aph.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ha $$10 = $$6.g();

               for (ha $$11 : b) {
                  if ($$11 != $$10) {
                     gw $$12 = $$7.a($$11);
                     dfd $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(cqc $$0, dfd $$1, gw $$2) {
      if (!$$1.a(cte.qG)) {
         return false;
      } else {
         for (ha $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(apv.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return !$$1.n().a(cjo.fM) || super.a($$0, $$1);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }

   class a extends cyb.a {
      private final cyb.e[] c;

      public a(cyb.e... $$0) {
         super(czw.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cph $$0, gw $$1, gw $$2, ha $$3, dfd $$4) {
         dfd $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cte.qF) && !$$5.a(cte.qH) && !$$5.a(cte.bQ)) {
            if ($$1.k($$2) == 2) {
               gw $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eag $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eah.c)) {
               return false;
            } else {
               return $$4.a(apv.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cyb.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dfd $$0) {
         return !$$0.a(cte.qG);
      }
   }
}
