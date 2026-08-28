import java.util.Optional;
import javax.annotation.Nullable;

public class dvm extends dux {
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
   @Nullable
   private cod l;
   private int m;
   private int n;
   @Nullable
   private fby r;
   private int s;

   public dvm(jh $$0, dxv $$1) {
      super(duz.k, $$0, $$1);
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dvm $$3) {
      int $$4 = $$3.f();
      if ($$3.s != $$4) {
         $$3.s = $$4;
         $$0.c($$1, dko.cB);
      }

      if ($$3.n > 0) {
         if ($$3.n > 50) {
            $$3.a((ash)$$0, 1, true);
            $$3.a((ash)$$0, 1, false);
         }

         if ($$3.n % 10 == 0 && $$0 instanceof ash $$5 && $$3.r != null) {
            if ($$3.l != null) {
               $$3.r = $$3.l.cR().f();
            }

            fby $$6 = fby.b($$1);
            float $$7 = 0.2F + 0.8F * (float)(100 - $$3.n) / 100.0F;
            fby $$8 = $$6.d($$3.r).c((double)$$7).e($$3.r);
            jh $$9 = jh.a((ka)$$8);
            float $$10 = (float)$$3.n / 2.0F / 100.0F + 0.5F;
            $$5.a(null, $$9, axf.gx, axg.e, $$10, 1.0F);
         }

         $$3.n--;
      }

      if ($$3.m-- < 0) {
         $$3.m = 20;
         if ($$3.l != null) {
            if (dmi.a($$0) && !($$3.j() > 34.0)) {
               if ($$3.l.dR()) {
                  $$3.l = null;
               }

               if (!dmi.b($$2, $$0, $$1) && $$3.l == null) {
                  $$0.a($$1, $$2.b(dmi.c, dmi.a.a), 3);
               }
            } else {
               $$3.a(null);
            }
         } else if (!dmi.b($$2, $$0, $$1)) {
            $$0.a($$1, $$2.b(dmi.c, dmi.a.a), 3);
         } else {
            if (!dmi.a($$0)) {
               if ($$2.c(dmi.c) == dmi.a.c) {
                  $$0.a($$1, $$2.b(dmi.c, dmi.a.b), 3);
                  return;
               }
            } else if ($$2.c(dmi.c) == dmi.a.b) {
               $$0.a($$1, $$2.b(dmi.c, dmi.a.c), 3);
               return;
            }

            if ($$2.c(dmi.c) == dmi.a.c) {
               if ($$0.al() != btg.a) {
                  if ($$0 instanceof ash $$11 && !$$11.N().b(dhe.e)) {
                     return;
                  }

                  cpx $$12 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                  if ($$12 != null) {
                     $$3.l = a((ash)$$0, $$3);
                     if ($$3.l != null) {
                        $$3.l.b(axf.gs);
                        $$0.a(null, $$3.aB_(), axf.gB, axg.e, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }
   }

   private double j() {
      return this.l == null ? 0.0 : Math.sqrt(this.l.f(fby.c(this.aB_())));
   }

   @Nullable
   private static cod a(ash $$0, dvm $$1) {
      jh $$2 = $$1.aB_();
      Optional<cod> $$3 = bax.a(bvr.E, bvq.c, $$0, $$2, 5, 16, 8, bax.a.c);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cod $$4 = $$3.get();
         $$0.a($$4, ecr.t, $$4.du());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public acy b() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.l != null) {
         if (this.o instanceof ash $$0) {
            this.a($$0, 20, false);
            this.n = 100;
            this.r = this.l.cR().f();
         }
      }
   }

   private void a(ash $$0, int $$1, boolean $$2) {
      if (this.l != null) {
         int $$3 = $$2 ? 16545810 : 6250335;
         bam $$4 = $$0.A;

         for (double $$5 = 0.0; $$5 < (double)$$1; $$5++) {
            fby $$6 = this.l.cR().h().b($$4.j() * this.l.cR().b(), $$4.j() * this.l.cR().c(), $$4.j() * this.l.cR().d());
            fby $$7 = fby.a(this.aB_()).b($$4.j(), $$4.j(), $$4.j());
            if ($$2) {
               fby $$8 = $$6;
               $$6 = $$7;
               $$7 = $$8;
            }

            lx $$9 = new lx($$7, $$3);
            $$0.a($$9, $$6.d, $$6.e, $$6.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable bua $$0) {
      if (this.l != null) {
         this.l.h($$0);
         this.l = null;
      }
   }

   public boolean a(cob $$0) {
      return this.l == $$0;
   }

   public int d() {
      return this.s;
   }

   public int f() {
      if (this.l == null) {
         return 0;
      } else {
         double $$0 = this.j();
         double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor($$1 * 15.0);
      }
   }
}
