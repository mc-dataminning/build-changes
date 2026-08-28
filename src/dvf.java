import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dvf extends duq {
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
   private cnu n;
   private int r;
   private int s;
   @Nullable
   private fbr t;
   private int u;

   public dvf(jh $$0, dxo $$1) {
      super(dus.k, $$0, $$1);
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dvf $$3) {
      int $$4 = $$3.f();
      if ($$3.u != $$4) {
         $$3.u = $$4;
         $$0.c($$1, dkf.cB);
      }

      if ($$3.s > 0) {
         if ($$3.s > 50) {
            $$3.a((arx)$$0, 1, true);
            $$3.a((arx)$$0, 1, false);
         }

         if ($$3.s % 10 == 0 && $$0 instanceof arx $$5 && $$3.t != null) {
            if ($$3.n != null) {
               $$3.t = $$3.n.cR().f();
            }

            fbr $$6 = fbr.b($$1);
            float $$7 = 0.2F + 0.8F * (float)(100 - $$3.s) / 100.0F;
            fbr $$8 = $$6.d($$3.t).c((double)$$7).e($$3.t);
            jh $$9 = jh.a((ka)$$8);
            float $$10 = (float)$$3.s / 2.0F / 100.0F + 0.5F;
            $$5.a(null, $$9, awv.gy, aww.e, $$10, 1.0F);
         }

         $$3.s--;
      }

      if ($$3.r-- < 0) {
         $$3.r = 20;
         if ($$3.n != null) {
            if (dly.a($$0) && !($$3.j() > 34.0) && !$$3.n.gq()) {
               if ($$3.n.dR()) {
                  $$3.n = null;
               }

               if (!dly.b($$2, $$0, $$1) && $$3.n == null) {
                  $$0.a($$1, $$2.b(dly.c, Boolean.valueOf(false)), 3);
               }
            } else {
               $$3.a(null);
            }
         } else if (!dly.b($$2, $$0, $$1)) {
            $$0.a($$1, $$2.b(dly.c, Boolean.valueOf(false)), 3);
         } else if ($$2.c(dly.c)) {
            if (dly.a($$0)) {
               if ($$0.am() != bsx.a) {
                  if ($$0 instanceof arx $$11 && !$$11.O().b(dgv.e)) {
                     return;
                  }

                  cpo $$12 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                  if ($$12 != null) {
                     $$3.n = a((arx)$$0, $$3);
                     if ($$3.n != null) {
                        $$3.n.b(awv.gs);
                        $$0.a(null, $$3.aB_(), awv.gC, aww.e, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }
   }

   private double j() {
      return this.n == null ? 0.0 : Math.sqrt(this.n.f(fbr.c(this.aB_())));
   }

   @Nullable
   private static cnu a(arx $$0, dvf $$1) {
      jh $$2 = $$1.aB_();
      Optional<cnu> $$3 = ban.a(bvi.E, bvh.c, $$0, $$2, 5, 16, 8, ban.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cnu $$4 = $$3.get();
         $$0.a($$4, eck.t, $$4.du());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public acn b() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.n != null) {
         if (this.o instanceof arx $$0) {
            if (this.s <= 0) {
               this.a($$0, 20, false);
               int $$2 = this.o.H_().a(2, 3);

               for (int $$3 = 0; $$3 < $$2; $$3++) {
                  this.k().ifPresent($$0x -> this.o.a(null, $$0x, awv.yz, aww.e, 1.0F, 1.0F));
               }

               this.s = 100;
               this.t = this.n.cR().f();
            }
         }
      }
   }

   private Optional<jh> k() {
      jh $$0 = this.p;
      Mutable<jh> $$1 = new MutableObject(null);
      jh.a(this.p, 2, 64, ($$0x, $$1x) -> {
         for (jm $$2 : ae.b(jm.values(), this.o.A)) {
            jh $$3 = $$0x.a($$2);
            dxo $$4 = this.o.a_($$3);
            if ($$4.a(axk.w)) {
               $$1x.accept($$3);
            }
         }
      }, $$1x -> {
         if (!this.o.a_($$1x).a(axk.w)) {
            return jh.b.a;
         } else {
            for (jm $$2 : ae.b(jm.values(), this.o.A)) {
               jh $$3 = $$1x.a($$2);
               dxo $$4 = this.o.a_($$3);
               jm $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dkf.fv.m();
               }

               if ($$4.a(dkf.fv) && !dpf.a($$4, $$5)) {
                  this.o.a($$3, $$4.b(dpf.b($$5), Boolean.valueOf(true)), 3);
                  $$1.setValue($$3);
                  return jh.b.c;
               }
            }

            return jh.b.a;
         }
      });
      return Optional.ofNullable((jh)$$1.getValue());
   }

   private void a(arx $$0, int $$1, boolean $$2) {
      if (this.n != null) {
         int $$3 = $$2 ? 16545810 : 6250335;
         bac $$4 = $$0.A;

         for (double $$5 = 0.0; $$5 < (double)$$1; $$5++) {
            fbr $$6 = this.n.cR().h().b($$4.j() * this.n.cR().b(), $$4.j() * this.n.cR().c(), $$4.j() * this.n.cR().d());
            fbr $$7 = fbr.a(this.aB_()).b($$4.j(), $$4.j(), $$4.j());
            if ($$2) {
               fbr $$8 = $$6;
               $$6 = $$7;
               $$7 = $$8;
            }

            lx $$9 = new lx($$7, $$3, $$4.a(40) + 10);
            $$0.a($$9, true, true, $$6.d, $$6.e, $$6.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable btr $$0) {
      if (this.n != null) {
         if ($$0 == null) {
            this.n.gp();
         } else {
            this.n.h($$0);
            this.n.gr();
            this.n.x(0.0F);
         }

         this.n = null;
      }
   }

   public boolean a(cns $$0) {
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
