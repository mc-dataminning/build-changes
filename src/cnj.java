import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnj extends coj {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final Logger s = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int n = 50;
   private int u;
   @Nullable
   private String v;
   private final cnz w = cnz.a();
   private static final int x = 0;
   private static final int y = 1;
   private static final int z = 1;
   private static final int A = 1;
   private static final int B = 2;
   private static final int C = 1;
   private static final int D = 1;
   private static final int E = 27;
   private static final int F = 76;
   private static final int G = 134;
   private static final int H = 47;

   public cnj(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cnj(int $$0, ckk $$1, cns $$2) {
      super(cop.i, $$0, $$1, $$2);
      this.a(this.w);
   }

   @Override
   protected cok l() {
      return cok.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.a(avo.M);
   }

   @Override
   protected boolean a(ckl $$0, boolean $$1) {
      return ($$0.fN() || $$0.cp >= this.w.b()) && this.w.b() > 0;
   }

   @Override
   protected void a(ckl $$0, csd $$1) {
      if (!$$0.gb().d) {
         $$0.c(-this.w.b());
      }

      this.q.a(0, csd.i);
      if (this.u > 0) {
         csd $$2 = this.q.a(1);
         if (!$$2.d() && $$2.G() > this.u) {
            $$2.g(this.u);
            this.q.a(1, $$2);
         } else {
            this.q.a(1, csd.i);
         }
      } else {
         this.q.a(1, csd.i);
      }

      this.w.a(0);
      this.o.a(($$1x, $$2x) -> {
         dpy $$3 = $$1x.a_($$2x);
         if (!$$0.fN() && $$3.a(avo.M) && $$0.ej().i() < 0.12F) {
            dpy $$4 = dbv.e($$3);
            if ($$4 == null) {
               $$1x.a($$2x, false);
               $$1x.c(1029, $$2x, 0);
            } else {
               $$1x.a($$2x, $$4, 2);
               $$1x.c(1030, $$2x, 0);
            }
         } else {
            $$1x.c(1030, $$2x, 0);
         }
      });
   }

   @Override
   public void m() {
      csd $$0 = this.q.a(0);
      this.w.a(1);
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      if (!$$0.d() && cxo.a($$0)) {
         csd $$4 = $$0.r();
         csd $$5 = this.q.a(1);
         cxu.a $$6 = new cxu.a(cxo.b($$4));
         $$2 += $$0.a(jz.l, Integer.valueOf(0)) + $$5.a(jz.l, Integer.valueOf(0));
         this.u = 0;
         if (!$$5.d()) {
            boolean $$7 = $$5.b(jz.p);
            if ($$4.k() && $$4.f().a($$0, $$5)) {
               int $$8 = Math.min($$4.m(), $$4.n() / 4);
               if ($$8 <= 0) {
                  this.r.a(0, csd.i);
                  this.w.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.G(); $$9++) {
                  int $$10 = $$4.m() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.m(), $$4.n() / 4);
               }

               this.u = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.f()) || !$$4.k())) {
                  this.r.a(0, csd.i);
                  this.w.a(0);
                  return;
               }

               if ($$4.k() && !$$7) {
                  int $$11 = $$0.n() - $$0.m();
                  int $$12 = $$5.n() - $$5.m();
                  int $$13 = $$12 + $$4.n() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.n() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.m()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               cxu $$16 = cxo.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<iv<cxn>> $$19 : $$16.b()) {
                  iv<cxn> $$20 = (iv<cxn>)$$19.getKey();
                  cxn $$21 = $$20.a();
                  int $$22 = $$6.a($$21);
                  int $$23 = $$19.getIntValue();
                  $$23 = $$22 == $$23 ? $$23 + 1 : Math.max($$23, $$22);
                  boolean $$24 = $$21.a($$0);
                  if (this.p.gb().d || $$0.a(csg.uw)) {
                     $$24 = true;
                  }

                  for (iv<cxn> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !$$21.b($$25.a())) {
                        $$24 = false;
                        $$1++;
                     }
                  }

                  if (!$$24) {
                     $$18 = true;
                  } else {
                     $$17 = true;
                     if ($$23 > $$21.a()) {
                        $$23 = $$21.a();
                     }

                     $$6.a($$21, $$23);

                     int $$26 = switch ($$21.e()) {
                        case a -> 1;
                        case b -> 2;
                        case c -> 4;
                        case d -> 8;
                     };
                     if ($$7) {
                        $$26 = Math.max(1, $$26 / 2);
                     }

                     $$1 += $$26 * $$23;
                     if ($$0.G() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.r.a(0, csd.i);
                  this.w.a(0);
                  return;
               }
            }
         }

         if (this.v != null && !ayr.h(this.v)) {
            if (!this.v.equals($$0.w().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(jz.d, ws.b(this.v));
            }
         } else if ($$0.b(jz.d)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.c(jz.d);
         }

         this.w.a($$2 + $$1);
         if ($$1 <= 0) {
            $$4 = csd.i;
         }

         if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
         }

         if (this.w.b() >= 40 && !this.p.gb().d) {
            $$4 = csd.i;
         }

         if (!$$4.d()) {
            int $$27 = $$4.a(jz.l, Integer.valueOf(0));
            if ($$27 < $$5.a(jz.l, Integer.valueOf(0))) {
               $$27 = $$5.a(jz.l, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$27 = e($$27);
            }

            $$4.b(jz.l, Integer.valueOf($$27));
            cxo.a($$4, $$6.b());
         }

         this.r.a(0, $$4);
         this.d();
      } else {
         this.r.a(0, csd.i);
         this.w.a(0);
      }
   }

   public static int e(int $$0) {
      return $$0 * 2 + 1;
   }

   public boolean a(String $$0) {
      String $$1 = b($$0);
      if ($$1 != null && !$$1.equals(this.v)) {
         this.v = $$1;
         if (this.b(2).h()) {
            csd $$2 = this.b(2).g();
            if (ayr.h($$1)) {
               $$2.c(jz.d);
            } else {
               $$2.b(jz.d, ws.b($$1));
            }
         }

         this.m();
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private static String b(String $$0) {
      String $$1 = ayr.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int n() {
      return this.w.b();
   }
}
