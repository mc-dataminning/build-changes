import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class duo extends dtz {
   private static final int b = 32;
   public static final int a = 32;
   private static final int c = 34;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 5;
   private static final int g = 20;
   private static final int h = 100;
   private static final int i = 10;
   private static final int j = 10;
   private static final int k = 50;
   private static final int l = 2;
   private static final int m = 64;
   @Nullable
   private cnd n;
   private int r;
   private int s;
   @Nullable
   private fba t;
   private int u;

   public duo(ji $$0, dwx $$1) {
      super(dub.k, $$0, $$1);
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, duo $$3) {
      int $$4 = $$3.f();
      if ($$3.u != $$4) {
         $$3.u = $$4;
         $$0.c($$1, djo.cB);
      }

      if ($$3.s > 0) {
         if ($$3.s > 50) {
            $$3.a((arc)$$0, 1, true);
            $$3.a((arc)$$0, 1, false);
         }

         if ($$3.s % 10 == 0 && $$0 instanceof arc $$5 && $$3.t != null) {
            if ($$3.n != null) {
               $$3.t = $$3.n.cR().f();
            }

            fba $$6 = fba.b($$1);
            float $$7 = 0.2F + 0.8F * (float)(100 - $$3.s) / 100.0F;
            fba $$8 = $$6.d($$3.t).c((double)$$7).e($$3.t);
            ji $$9 = ji.a((kb)$$8);
            float $$10 = (float)$$3.s / 2.0F / 100.0F + 0.5F;
            $$5.a(null, $$9, awa.gy, awb.e, $$10, 1.0F);
         }

         $$3.s--;
      }

      if ($$3.r-- < 0) {
         $$3.r = 20;
         if ($$3.n != null) {
            if (dlh.a($$0) && !($$3.j() > 34.0) && !$$3.n.gr()) {
               if ($$3.n.dR()) {
                  $$3.n = null;
               }

               if (!dlh.b($$2, $$0, $$1) && $$3.n == null) {
                  $$0.a($$1, $$2.b(dlh.c, Boolean.valueOf(false)), 3);
               }
            } else {
               $$3.a(null);
            }
         } else if (!dlh.b($$2, $$0, $$1)) {
            $$0.a($$1, $$2.b(dlh.c, Boolean.valueOf(false)), 3);
         } else if ($$2.c(dlh.c)) {
            if (dlh.a($$0)) {
               if ($$0.am() != bsg.a) {
                  if ($$0 instanceof arc $$11 && !$$11.O().b(dge.e)) {
                     return;
                  }

                  cox $$12 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                  if ($$12 != null) {
                     $$3.n = a((arc)$$0, $$3);
                     if ($$3.n != null) {
                        $$3.n.b(awa.gs);
                        $$0.a(null, $$3.aA_(), awa.gC, awb.e, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }
   }

   private double j() {
      return this.n == null ? 0.0 : Math.sqrt(this.n.f(fba.c(this.aA_())));
   }

   @Nullable
   private static cnd a(arc $$0, duo $$1) {
      ji $$2 = $$1.aA_();
      Optional<cnd> $$3 = azs.a(bur.E, buq.c, $$0, $$2, 5, 16, 8, azs.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cnd $$4 = $$3.get();
         $$0.a($$4, ebt.t, $$4.du());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.n != null) {
         if (this.o instanceof arc $$0) {
            if (this.s <= 0) {
               this.a($$0, 20, false);
               int $$2 = this.o.H_().a(2, 3);

               for (int $$3 = 0; $$3 < $$2; $$3++) {
                  this.k().ifPresent($$0x -> {
                     this.o.a(null, $$0x, awa.yz, awb.e, 1.0F, 1.0F);
                     this.o.a(ebt.i, $$0x, ebt.a.a(this.o.a_($$0x)));
                  });
               }

               this.s = 100;
               this.t = this.n.cR().f();
            }
         }
      }
   }

   private Optional<ji> k() {
      ji $$0 = this.p;
      Mutable<ji> $$1 = new MutableObject(null);
      ji.a(this.p, 2, 64, ($$0x, $$1x) -> {
         for (jn $$2 : af.b(jn.values(), this.o.A)) {
            ji $$3 = $$0x.a($$2);
            dwx $$4 = this.o.a_($$3);
            if ($$4.a(awp.w)) {
               $$1x.accept($$3);
            }
         }
      }, $$1x -> {
         if (!this.o.a_($$1x).a(awp.w)) {
            return ji.b.a;
         } else {
            for (jn $$2 : af.b(jn.values(), this.o.A)) {
               ji $$3 = $$1x.a($$2);
               dwx $$4 = this.o.a_($$3);
               jn $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = djo.fv.m();
               }

               if ($$4.a(djo.fv) && !doo.a($$4, $$5)) {
                  this.o.a($$3, $$4.b(doo.b($$5), Boolean.valueOf(true)), 3);
                  $$1.setValue($$3);
                  return ji.b.c;
               }
            }

            return ji.b.a;
         }
      });
      return Optional.ofNullable((ji)$$1.getValue());
   }

   private void a(arc $$0, int $$1, boolean $$2) {
      if (this.n != null) {
         int $$3 = $$2 ? 16545810 : 6250335;
         azh $$4 = $$0.A;

         for (double $$5 = 0.0; $$5 < (double)$$1; $$5++) {
            fba $$6 = this.n.cR().h().b($$4.j() * this.n.cR().b(), $$4.j() * this.n.cR().c(), $$4.j() * this.n.cR().d());
            fba $$7 = fba.a(this.aA_()).b($$4.j(), $$4.j(), $$4.j());
            if ($$2) {
               fba $$8 = $$6;
               $$6 = $$7;
               $$7 = $$8;
            }

            ly $$9 = new ly($$7, $$3, $$4.a(40) + 10);
            $$0.a($$9, true, true, $$6.d, $$6.e, $$6.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable bta $$0) {
      if (this.n != null) {
         if ($$0 == null) {
            this.n.gq();
         } else {
            this.n.i($$0);
            this.n.gs();
            this.n.x(0.0F);
         }

         this.n = null;
      }
   }

   public boolean a(cnb $$0) {
      return this.n == $$0;
   }

   public int d() {
      return this.u;
   }

   public int f() {
      if (this.n == null) {
         return 0;
      } else {
         double $$0 = this.j();
         double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor($$1 * 15.0);
      }
   }
}
