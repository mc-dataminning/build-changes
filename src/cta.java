import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cta extends cub {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final Logger u = LogUtils.getLogger();
   private static final boolean v = false;
   public static final int p = 50;
   private int w;
   @Nullable
   private String x;
   private final ctr y = ctr.a();
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

   public cta(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public cta(int $$0, cpr $$1, ctk $$2) {
      super(cug.i, $$0, $$1, $$2, o());
      this.a(this.y);
   }

   private static cuc o() {
      return cuc.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dxn $$0) {
      return $$0.a(axu.O);
   }

   @Override
   protected boolean a(cps $$0, boolean $$1) {
      return ($$0.fT() || $$0.cq >= this.y.b()) && this.y.b() > 0;
   }

   @Override
   protected void a(cps $$0, cxk $$1) {
      if (!$$0.gh().d) {
         $$0.c(-this.y.b());
      }

      if (this.w > 0) {
         cxk $$2 = this.s.a(1);
         if (!$$2.f() && $$2.L() > this.w) {
            $$2.h(this.w);
            this.s.a(1, $$2);
         } else {
            this.s.a(1, cxk.k);
         }
      } else if (!this.z) {
         this.s.a(1, cxk.k);
      }

      this.y.a(0);
      this.s.a(0, cxk.k);
      this.q.a(($$1x, $$2x) -> {
         dxn $$3 = $$1x.a_($$2x);
         if (!$$0.fT() && $$3.a(axu.O) && $$0.dY().i() < 0.12F) {
            dxn $$4 = dje.e($$3);
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
      cxk $$0 = this.s.a(0);
      this.z = false;
      this.y.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.f() && ddt.a($$0)) {
         cxk $$4 = $$0.v();
         cxk $$5 = this.s.a(1);
         ddx.a $$6 = new ddx.a(ddt.b($$4));
         $$2 += (long)$$0.a(ku.s, Integer.valueOf(0)).intValue() + (long)$$5.a(ku.s, Integer.valueOf(0)).intValue();
         this.w = 0;
         if (!$$5.f()) {
            boolean $$7 = $$5.b(ku.I);
            if ($$4.m() && $$0.b($$5)) {
               int $$8 = Math.min($$4.o(), $$4.p() / 4);
               if ($$8 <= 0) {
                  this.t.a(0, cxk.k);
                  this.y.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.L(); $$9++) {
                  int $$10 = $$4.o() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.o(), $$4.p() / 4);
               }

               this.w = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.h()) || !$$4.m())) {
                  this.t.a(0, cxk.k);
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

               ddx $$16 = ddt.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<jq<ddr>> $$19 : $$16.b()) {
                  jq<ddr> $$20 = (jq<ddr>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  ddr $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.r.gh().d || $$0.a(cxo.vm)) {
                     $$24 = true;
                  }

                  for (jq<ddr> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !ddr.a($$20, $$25)) {
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
                     if ($$0.L() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.t.a(0, cxk.k);
                  this.y.a(0);
                  return;
               }
            }
         }

         if (this.x != null && !bbb.h(this.x)) {
            if (!this.x.equals($$0.y().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(ku.g, xv.b(this.x));
            }
         } else if ($$0.b(ku.g)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.c(ku.g);
         }

         int $$27 = $$1 <= 0 ? 0 : (int)bae.a($$2 + (long)$$1, 0L, 2147483647L);
         this.y.a($$27);
         if ($$1 <= 0) {
            $$4 = cxk.k;
         }

         if ($$3 == $$1 && $$3 > 0) {
            if (this.y.b() >= 40) {
               this.y.a(39);
            }

            this.z = true;
         }

         if (this.y.b() >= 40 && !this.r.gh().d) {
            $$4 = cxk.k;
         }

         if (!$$4.f()) {
            int $$28 = $$4.a(ku.s, Integer.valueOf(0));
            if ($$28 < $$5.a(ku.s, Integer.valueOf(0))) {
               $$28 = $$5.a(ku.s, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$28 = e($$28);
            }

            $$4.b(ku.s, $$28);
            ddt.a($$4, $$6.b());
         }

         this.t.a(0, $$4);
         this.d();
      } else {
         this.t.a(0, cxk.k);
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
            cxk $$2 = this.b(2).g();
            if (bbb.h($$1)) {
               $$2.c(ku.g);
            } else {
               $$2.b(ku.g, xv.b($$1));
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
      String $$1 = bbb.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int m() {
      return this.y.b();
   }
}
