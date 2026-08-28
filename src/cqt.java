import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqt extends cru {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final Logger u = LogUtils.getLogger();
   private static final boolean v = false;
   public static final int p = 50;
   private int w;
   @Nullable
   private String x;
   private final crk y = crk.a();
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

   public cqt(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public cqt(int $$0, cno $$1, crd $$2) {
      super(crz.i, $$0, $$1, $$2);
      this.a(this.y);
   }

   @Override
   protected crv l() {
      return crv.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dua $$0) {
      return $$0.a(aws.N);
   }

   @Override
   protected boolean a(cnp $$0, boolean $$1) {
      return ($$0.fP() || $$0.cn >= this.y.b()) && this.y.b() > 0;
   }

   @Override
   protected void a(cnp $$0, cvl $$1) {
      if (!$$0.gd().d) {
         $$0.c(-this.y.b());
      }

      if (this.w > 0) {
         cvl $$2 = this.s.a(1);
         if (!$$2.f() && $$2.J() > this.w) {
            $$2.h(this.w);
            this.s.a(1, $$2);
         } else {
            this.s.a(1, cvl.k);
         }
      } else if (!this.z) {
         this.s.a(1, cvl.k);
      }

      this.y.a(0);
      this.s.a(0, cvl.k);
      this.q.a(($$1x, $$2x) -> {
         dua $$3 = $$1x.a_($$2x);
         if (!$$0.fP() && $$3.a(aws.N) && $$0.dV().i() < 0.12F) {
            dua $$4 = dfv.e($$3);
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
      cvl $$0 = this.s.a(0);
      this.z = false;
      this.y.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.f() && day.a($$0)) {
         cvl $$4 = $$0.u();
         cvl $$5 = this.s.a(1);
         dbc.a $$6 = new dbc.a(day.b($$4));
         $$2 += (long)$$0.a(kr.r, Integer.valueOf(0)).intValue() + (long)$$5.a(kr.r, Integer.valueOf(0)).intValue();
         this.w = 0;
         if (!$$5.f()) {
            boolean $$7 = $$5.b(kr.A);
            if ($$4.m() && $$0.b($$5)) {
               int $$8 = Math.min($$4.o(), $$4.p() / 4);
               if ($$8 <= 0) {
                  this.t.a(0, cvl.k);
                  this.y.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.J(); $$9++) {
                  int $$10 = $$4.o() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.o(), $$4.p() / 4);
               }

               this.w = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.h()) || !$$4.m())) {
                  this.t.a(0, cvl.k);
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

               dbc $$16 = day.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<jn<daw>> $$19 : $$16.b()) {
                  jn<daw> $$20 = (jn<daw>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  daw $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.r.gd().d || $$0.a(cvo.uy)) {
                     $$24 = true;
                  }

                  for (jn<daw> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !daw.a($$20, $$25)) {
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
                     if ($$0.J() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.t.a(0, cvl.k);
                  this.y.a(0);
                  return;
               }
            }
         }

         if (this.x != null && !azz.h(this.x)) {
            if (!this.x.equals($$0.y().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(kr.g, xd.b(this.x));
            }
         } else if ($$0.b(kr.g)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.c(kr.g);
         }

         int $$27 = (int)azc.a($$2 + (long)$$1, 0L, 2147483647L);
         this.y.a($$27);
         if ($$1 <= 0) {
            $$4 = cvl.k;
         }

         if ($$3 == $$1 && $$3 > 0) {
            if (this.y.b() >= 40) {
               this.y.a(39);
            }

            this.z = true;
         }

         if (this.y.b() >= 40 && !this.r.gd().d) {
            $$4 = cvl.k;
         }

         if (!$$4.f()) {
            int $$28 = $$4.a(kr.r, Integer.valueOf(0));
            if ($$28 < $$5.a(kr.r, Integer.valueOf(0))) {
               $$28 = $$5.a(kr.r, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$28 = e($$28);
            }

            $$4.b(kr.r, $$28);
            day.a($$4, $$6.b());
         }

         this.t.a(0, $$4);
         this.d();
      } else {
         this.t.a(0, cvl.k);
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
            cvl $$2 = this.b(2).g();
            if (azz.h($$1)) {
               $$2.c(kr.g);
            } else {
               $$2.b(kr.g, xd.b($$1));
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
      String $$1 = azz.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int n() {
      return this.y.b();
   }
}
