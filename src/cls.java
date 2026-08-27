import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cls extends cms {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final Logger s = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int n = 50;
   private int u;
   @Nullable
   private String v;
   private final cmi w = cmi.a();
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

   public cls(int $$0, cit $$1) {
      this($$0, $$1, cmb.a);
   }

   public cls(int $$0, cit $$1, cmb $$2) {
      super(cmx.i, $$0, $$1, $$2);
      this.a(this.w);
   }

   @Override
   protected cmt l() {
      return cmt.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dnb $$0) {
      return $$0.a(aun.M);
   }

   @Override
   protected boolean a(ciu $$0, boolean $$1) {
      return ($$0.fM() || $$0.cm >= this.w.b()) && this.w.b() > 0;
   }

   @Override
   protected void a(ciu $$0, cqm $$1) {
      if (!$$0.ga().d) {
         $$0.c(-this.w.b());
      }

      this.q.a(0, cqm.h);
      if (this.u > 0) {
         cqm $$2 = this.q.a(1);
         if (!$$2.b() && $$2.M() > this.u) {
            $$2.h(this.u);
            this.q.a(1, $$2);
         } else {
            this.q.a(1, cqm.h);
         }
      } else {
         this.q.a(1, cqm.h);
      }

      this.w.a(0);
      this.o.a(($$1x, $$2x) -> {
         dnb $$3 = $$1x.a_($$2x);
         if (!$$0.fM() && $$3.a(aun.M) && $$0.ei().i() < 0.12F) {
            dnb $$4 = czc.e($$3);
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
      cqm $$0 = this.q.a(0);
      this.w.a(1);
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      if ($$0.b()) {
         this.r.a(0, cqm.h);
         this.w.a(0);
      } else {
         cqm $$4 = $$0.q();
         cqm $$5 = this.q.a(1);
         Map<cuw, Integer> $$6 = cux.a($$4);
         $$2 += $$0.J() + ($$5.b() ? 0 : $$5.J());
         this.u = 0;
         if (!$$5.b()) {
            boolean $$7 = $$5.a(cqp.uu) && !cpj.d($$5).isEmpty();
            if ($$4.i() && $$4.d().a($$0, $$5)) {
               int $$8 = Math.min($$4.l(), $$4.m() / 4);
               if ($$8 <= 0) {
                  this.r.a(0, cqm.h);
                  this.w.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.M(); $$9++) {
                  int $$10 = $$4.l() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.l(), $$4.m() / 4);
               }

               this.u = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.d()) || !$$4.i())) {
                  this.r.a(0, cqm.h);
                  this.w.a(0);
                  return;
               }

               if ($$4.i() && !$$7) {
                  int $$11 = $$0.m() - $$0.l();
                  int $$12 = $$5.m() - $$5.l();
                  int $$13 = $$12 + $$4.m() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.m() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.l()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               Map<cuw, Integer> $$16 = cux.a($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (cuw $$19 : $$16.keySet()) {
                  if ($$19 != null) {
                     int $$20 = $$6.getOrDefault($$19, 0);
                     int $$21 = $$16.get($$19);
                     $$21 = $$20 == $$21 ? $$21 + 1 : Math.max($$21, $$20);
                     boolean $$22 = $$19.a($$0);
                     if (this.p.ga().d || $$0.a(cqp.uu)) {
                        $$22 = true;
                     }

                     for (cuw $$23 : $$6.keySet()) {
                        if ($$23 != $$19 && !$$19.b($$23)) {
                           $$22 = false;
                           $$1++;
                        }
                     }

                     if (!$$22) {
                        $$18 = true;
                     } else {
                        $$17 = true;
                        if ($$21 > $$19.a()) {
                           $$21 = $$19.a();
                        }

                        $$6.put($$19, $$21);
                        int $$24 = 0;
                        switch ($$19.e()) {
                           case a:
                              $$24 = 1;
                              break;
                           case b:
                              $$24 = 2;
                              break;
                           case c:
                              $$24 = 4;
                              break;
                           case d:
                              $$24 = 8;
                        }

                        if ($$7) {
                           $$24 = Math.max(1, $$24 / 2);
                        }

                        $$1 += $$24 * $$21;
                        if ($$0.M() > 1) {
                           $$1 = 40;
                        }
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.r.a(0, cqm.h);
                  this.w.a(0);
                  return;
               }
            }
         }

         if (this.v != null && !ac.b(this.v)) {
            if (!this.v.equals($$0.z().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.a(vu.b(this.v));
            }
         } else if ($$0.B()) {
            $$3 = 1;
            $$1 += $$3;
            $$4.A();
         }

         this.w.a($$2 + $$1);
         if ($$1 <= 0) {
            $$4 = cqm.h;
         }

         if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
         }

         if (this.w.b() >= 40 && !this.p.ga().d) {
            $$4 = cqm.h;
         }

         if (!$$4.b()) {
            int $$25 = $$4.J();
            if (!$$5.b() && $$25 < $$5.J()) {
               $$25 = $$5.J();
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$25 = e($$25);
            }

            $$4.d($$25);
            cux.a($$6, $$4);
         }

         this.r.a(0, $$4);
         this.d();
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
            cqm $$2 = this.b(2).g();
            if (ac.b($$1)) {
               $$2.A();
            } else {
               $$2.a(vu.b($$1));
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
      String $$1 = aa.a($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int n() {
      return this.w.b();
   }
}
