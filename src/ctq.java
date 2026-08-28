import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ctq extends cur {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final Logger u = LogUtils.getLogger();
   private static final boolean v = false;
   public static final int p = 50;
   private int w;
   @Nullable
   private String x;
   private final cuh y = cuh.a();
   private boolean z = false;
   private static final int A = 0;
   private static final int B = 1;
   private static final int C = 1;
   private static final int D = 1;
   private static final int E = 2;
   private static final int F = 1;
   private static final int G = 1;
   private static final int H = 27;
   private static final int I = 76;
   private static final int J = 134;
   private static final int K = 47;

   public ctq(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public ctq(int $$0, cqh $$1, cua $$2) {
      super(cuw.i, $$0, $$1, $$2, o());
      this.a(this.y);
   }

   private static cus o() {
      return cus.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.a(awz.O);
   }

   @Override
   protected boolean a(cqi $$0, boolean $$1) {
      return ($$0.fU() || $$0.cd >= this.y.b()) && this.y.b() > 0;
   }

   @Override
   protected void a(cqi $$0, cxy $$1) {
      if (!$$0.fU()) {
         $$0.c(-this.y.b());
      }

      if (this.w > 0) {
         cxy $$2 = this.s.a(1);
         if (!$$2.f() && $$2.M() > this.w) {
            $$2.h(this.w);
            this.s.a(1, $$2);
         } else {
            this.s.a(1, cxy.k);
         }
      } else if (!this.z) {
         this.s.a(1, cxy.k);
      }

      this.y.a(0);
      this.s.a(0, cxy.k);
      this.q.a(($$1x, $$2x) -> {
         dym $$3 = $$1x.a_($$2x);
         if (!$$0.fU() && $$3.a(awz.O) && $$0.dY().i() < 0.12F) {
            dym $$4 = dju.e($$3);
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
   public void l() {
      cxy $$0 = this.s.a(0);
      this.z = false;
      this.y.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.f() && dej.a($$0)) {
         cxy $$4 = $$0.v();
         cxy $$5 = this.s.a(1);
         den.a $$6 = new den.a(dej.b($$4));
         $$2 += (long)$$0.a(kx.s, Integer.valueOf(0)).intValue() + (long)$$5.a(kx.s, Integer.valueOf(0)).intValue();
         this.w = 0;
         if (!$$5.f()) {
            boolean $$7 = $$5.c(kx.J);
            if ($$4.m() && $$0.c($$5)) {
               int $$8 = Math.min($$4.o(), $$4.p() / 4);
               if ($$8 <= 0) {
                  this.t.a(0, cxy.k);
                  this.y.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.M(); $$9++) {
                  int $$10 = $$4.o() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.o(), $$4.p() / 4);
               }

               this.w = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.h()) || !$$4.m())) {
                  this.t.a(0, cxy.k);
                  this.y.a(0);
                  return;
               }

               if ($$4.m() && !$$7) {
                  int $$11 = $$0.p() - $$0.o();
                  int $$12 = $$5.p() - $$5.o();
                  int $$13 = $$12 + $$4.p() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.p() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.o()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               den $$16 = dej.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<js<deh>> $$19 : $$16.b()) {
                  js<deh> $$20 = (js<deh>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  deh $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.r.fU() || $$0.a(cyc.vz)) {
                     $$24 = true;
                  }

                  for (js<deh> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !deh.a($$20, $$25)) {
                        $$24 = false;
                        $$1++;
                     }
                  }

                  if (!$$24) {
                     $$18 = true;
                  } else {
                     $$17 = true;
                     if ($$22 > $$23.e()) {
                        $$22 = $$23.e();
                     }

                     $$6.a($$20, $$22);
                     int $$26 = $$23.c();
                     if ($$7) {
                        $$26 = Math.max(1, $$26 / 2);
                     }

                     $$1 += $$26 * $$22;
                     if ($$0.M() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.t.a(0, cxy.k);
                  this.y.a(0);
                  return;
               }
            }
         }

         if (this.x != null && !bah.h(this.x)) {
            if (!this.x.equals($$0.y().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(kx.g, wv.b(this.x));
            }
         } else if ($$0.c(kx.g)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.e(kx.g);
         }

         int $$27 = $$1 <= 0 ? 0 : (int)azk.a($$2 + (long)$$1, 0L, 2147483647L);
         this.y.a($$27);
         if ($$1 <= 0) {
            $$4 = cxy.k;
         }

         if ($$3 == $$1 && $$3 > 0) {
            if (this.y.b() >= 40) {
               this.y.a(39);
            }

            this.z = true;
         }

         if (this.y.b() >= 40 && !this.r.fU()) {
            $$4 = cxy.k;
         }

         if (!$$4.f()) {
            int $$28 = $$4.a(kx.s, Integer.valueOf(0));
            if ($$28 < $$5.a(kx.s, Integer.valueOf(0))) {
               $$28 = $$5.a(kx.s, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$28 = e($$28);
            }

            $$4.b(kx.s, $$28);
            dej.a($$4, $$6.b());
         }

         this.t.a(0, $$4);
         this.d();
      } else {
         this.t.a(0, cxy.k);
         this.y.a(0);
      }
   }

   public static int e(int $$0) {
      return (int)Math.min((long)$$0 * 2L + 1L, 2147483647L);
   }

   public boolean a(String $$0) {
      String $$1 = b($$0);
      if ($$1 != null && !$$1.equals(this.x)) {
         this.x = $$1;
         if (this.b(2).h()) {
            cxy $$2 = this.b(2).g();
            if (bah.h($$1)) {
               $$2.e(kx.g);
            } else {
               $$2.b(kx.g, wv.b($$1));
            }
         }

         this.l();
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private static String b(String $$0) {
      String $$1 = bah.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int m() {
      return this.y.b();
   }
}
