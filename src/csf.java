import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class csf extends ctg {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final Logger u = LogUtils.getLogger();
   private static final boolean v = false;
   public static final int p = 50;
   private int w;
   @Nullable
   private String x;
   private final csw y = csw.a();
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

   public csf(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public csf(int $$0, cow $$1, csp $$2) {
      super(ctl.i, $$0, $$1, $$2, o());
      this.a(this.y);
   }

   private static cth o() {
      return cth.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.a(awp.O);
   }

   @Override
   protected boolean a(cox $$0, boolean $$1) {
      return ($$0.fV() || $$0.cr >= this.y.b()) && this.y.b() > 0;
   }

   @Override
   protected void a(cox $$0, cwp $$1) {
      if (!$$0.gj().d) {
         $$0.c(-this.y.b());
      }

      if (this.w > 0) {
         cwp $$2 = this.s.a(1);
         if (!$$2.f() && $$2.M() > this.w) {
            $$2.h(this.w);
            this.s.a(1, $$2);
         } else {
            this.s.a(1, cwp.j);
         }
      } else if (!this.z) {
         this.s.a(1, cwp.j);
      }

      this.y.a(0);
      this.s.a(0, cwp.j);
      this.q.a(($$1x, $$2x) -> {
         dwx $$3 = $$1x.a_($$2x);
         if (!$$0.fV() && $$3.a(awp.O) && $$0.dZ().i() < 0.12F) {
            dwx $$4 = dim.e($$3);
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
      cwp $$0 = this.s.a(0);
      this.z = false;
      this.y.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.f() && ddb.a($$0)) {
         cwp $$4 = $$0.v();
         cwp $$5 = this.s.a(1);
         ddf.a $$6 = new ddf.a(ddb.b($$4));
         $$2 += (long)$$0.a(kv.s, Integer.valueOf(0)).intValue() + (long)$$5.a(kv.s, Integer.valueOf(0)).intValue();
         this.w = 0;
         if (!$$5.f()) {
            boolean $$7 = $$5.b(kv.I);
            if ($$4.m() && $$0.b($$5)) {
               int $$8 = Math.min($$4.o(), $$4.p() / 4);
               if ($$8 <= 0) {
                  this.t.a(0, cwp.j);
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
                  this.t.a(0, cwp.j);
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

               ddf $$16 = ddb.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<jr<dcz>> $$19 : $$16.b()) {
                  jr<dcz> $$20 = (jr<dcz>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  dcz $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.r.gj().d || $$0.a(cwt.vv)) {
                     $$24 = true;
                  }

                  for (jr<dcz> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !dcz.a($$20, $$25)) {
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
                  this.t.a(0, cwp.j);
                  this.y.a(0);
                  return;
               }
            }
         }

         if (this.x != null && !azw.h(this.x)) {
            if (!this.x.equals($$0.y().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(kv.g, wo.b(this.x));
            }
         } else if ($$0.b(kv.g)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.c(kv.g);
         }

         int $$27 = $$1 <= 0 ? 0 : (int)ayz.a($$2 + (long)$$1, 0L, 2147483647L);
         this.y.a($$27);
         if ($$1 <= 0) {
            $$4 = cwp.j;
         }

         if ($$3 == $$1 && $$3 > 0) {
            if (this.y.b() >= 40) {
               this.y.a(39);
            }

            this.z = true;
         }

         if (this.y.b() >= 40 && !this.r.gj().d) {
            $$4 = cwp.j;
         }

         if (!$$4.f()) {
            int $$28 = $$4.a(kv.s, Integer.valueOf(0));
            if ($$28 < $$5.a(kv.s, Integer.valueOf(0))) {
               $$28 = $$5.a(kv.s, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$28 = e($$28);
            }

            $$4.b(kv.s, $$28);
            ddb.a($$4, $$6.b());
         }

         this.t.a(0, $$4);
         this.d();
      } else {
         this.t.a(0, cwp.j);
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
            cwp $$2 = this.b(2).g();
            if (azw.h($$1)) {
               $$2.c(kv.g);
            } else {
               $$2.b(kv.g, wo.b($$1));
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
      String $$1 = azw.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int m() {
      return this.y.b();
   }
}
