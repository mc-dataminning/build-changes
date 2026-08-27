import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxg {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static dxg.c a(dvp $$0, ase $$1, int $$2, int $$3, int $$4, @Nullable hc $$5, int $$6, dxh.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         dvc $$9 = dxg.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new dxg.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         dvc $$10 = dxg.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new dxg.e($$6, $$10, $$5, $$7);
         }
      } else {
         dvc $$11 = dxg.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new dxg.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static dxg.c a(dvo $$0, dvp $$1, ase $$2, int $$3, int $$4, int $$5, hc $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 80 && Math.abs($$5 - $$0.f().i()) <= 80) {
         dxh.a $$8 = ((dxg.c)$$0).a;
         dxg.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends dxg.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(qy $$0) {
         super(dwb.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, ase $$1, dvc $$2, hc $$3, dxh.a $$4) {
         super(dwb.a, $$0, $$4, $$2);
         this.a($$3);
         this.b = $$1.a(3) == 0;
         this.c = !this.b && $$1.a(23) == 0;
         if (this.i().o() == hc.a.c) {
            this.h = $$2.e() / 5;
         } else {
            this.h = $$2.c() / 5;
         }
      }

      @Nullable
      public static dvc a(dvp $$0, ase $$1, int $$2, int $$3, int $$4, hc $$5) {
         for (int $$6 = $$1.a(3) + 2; $$6 > 0; $$6--) {
            int $$7 = $$6 * 5;

            dvc $$11 = switch ($$5) {
               default -> new dvc(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new dvc(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new dvc(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new dvc(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(dvo $$0, dvp $$1, ase $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         hc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     dxg.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), hc.e, $$3);
                  } else {
                     dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), hc.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     dxg.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, hc.e, $$3);
                  } else {
                     dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, hc.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dxg.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, hc.c, $$3);
                  } else {
                     dxg.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, hc.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dxg.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.i() - 1, hc.c, $$3);
                  } else {
                     dxg.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.l() + 1, hc.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != hc.c && $$5 != hc.d) {
               for (int $$8 = this.f.g() + 3; $$8 + 3 <= this.f.j(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     dxg.a($$0, $$1, $$2, $$8, this.f.h(), this.f.i() - 1, hc.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     dxg.a($$0, $$1, $$2, $$8, this.f.h(), this.f.l() + 1, hc.d, $$3 + 1);
                  }
               }
            } else {
               for (int $$6 = this.f.i() + 3; $$6 + 3 <= this.f.l(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), $$6, hc.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), $$6, hc.f, $$3 + 1);
                  }
               }
            }
         }
      }

      @Override
      protected boolean a(cqr $$0, dvc $$1, ase $$2, int $$3, int $$4, int $$5, aey $$6) {
         gw $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).i() && !$$0.a_($$7.d()).i()) {
            dfl $$8 = csy.cP.n().a(cyv.d, $$2.h() ? dgp.a : dgp.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            cdu $$9 = new cdu($$0.C(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            dfl $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, csy.bs.n(), e, false, true);
            }

            for (int $$13 = 0; $$13 < this.h; $$13++) {
               int $$14 = 2 + $$13 * 5;
               this.a($$0, $$4, 0, 0, $$14, 2, 2, $$3);
               this.a($$0, $$4, $$3, 0.1F, 0, 2, $$14 - 1);
               this.a($$0, $$4, $$3, 0.1F, 2, 2, $$14 - 1);
               this.a($$0, $$4, $$3, 0.1F, 0, 2, $$14 + 1);
               this.a($$0, $$4, $$3, 0.1F, 2, 2, $$14 + 1);
               this.a($$0, $$4, $$3, 0.05F, 0, 2, $$14 - 2);
               this.a($$0, $$4, $$3, 0.05F, 2, 2, $$14 - 2);
               this.a($$0, $$4, $$3, 0.05F, 0, 2, $$14 + 2);
               this.a($$0, $$4, $$3, 0.05F, 2, 2, $$14 + 2);
               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, ecq.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, ecq.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  gw $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, csy.ct.n(), 2);
                     if ($$0.c_($$17) instanceof dej $$19) {
                        $$19.a(biw.n, $$3);
                     }
                  }
               }
            }

            for (int $$20 = 0; $$20 <= 2; $$20++) {
               for (int $$21 = 0; $$21 <= $$11; $$21++) {
                  this.a($$0, $$4, $$12, $$20, -1, $$21);
               }
            }

            int $$22 = 2;
            this.a($$0, $$4, 0, -1, 2);
            if (this.h > 1) {
               int $$23 = $$11 - 2;
               this.a($$0, $$4, 0, -1, $$23);
            }

            if (this.b) {
               dfl $$24 = csy.cP.n().a(cyv.d, dgp.a);

               for (int $$25 = 0; $$25 <= $$11; $$25++) {
                  dfl $$26 = this.a($$0, 1, -1, $$25, $$4);
                  if (!$$26.i() && $$26.i($$0, this.b(1, -1, $$25))) {
                     float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                  }
               }
            }
         }
      }

      private void a(cqr $$0, dvc $$1, int $$2, int $$3, int $$4) {
         dfl $$5 = this.a.b();
         dfl $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }
      }

      @Override
      protected void b(cqr $$0, dfl $$1, int $$2, int $$3, int $$4, dvc $$5) {
         gw.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();

            while (this.a($$0.a_($$6)) && $$6.v() > $$0.H_() + 1) {
               $$6.c(hc.a);
            }

            if (this.a($$0, $$6, $$0.a_($$6))) {
               while ($$6.v() < $$7) {
                  $$6.c(hc.b);
                  $$0.a($$6, $$1, 2);
               }
            }
         }
      }

      protected void c(cqr $$0, dfl $$1, int $$2, int $$3, int $$4, dvc $$5) {
         gw.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for (boolean $$10 = true; $$9 || $$10; $$8++) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  dfl $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(csy.H);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.H_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  dfl $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, csy.eY.n(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.aj() - 1;
               }
            }
         }
      }

      private static void a(cqr $$0, dfl $$1, gw.a $$2, int $$3, int $$4) {
         for (int $$5 = $$3; $$5 < $$4; $$5++) {
            $$0.a($$2.q($$5), $$1, 2);
         }
      }

      private boolean a(cqa $$0, gw $$1, dfl $$2) {
         return $$2.d($$0, $$1, hc.b);
      }

      private boolean b(cqa $$0, gw $$1, dfl $$2) {
         return csx.a($$0, $$1, hc.a) && !($$2.b() instanceof cvp);
      }

      private void a(cqr $$0, dvc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, ase $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            dfl $$8 = this.a.d();
            dfl $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(cvr.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(cvr.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, csy.cq.n().a(dbx.a, hc.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, csy.cq.n().a(dbx.a, hc.c));
            }
         }
      }

      private void a(cqr $$0, dvc $$1, ase $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, csy.bs.n(), $$4, $$5, $$6, $$1);
         }
      }

      private boolean a(cqr $$0, dvc $$1, int $$2, int $$3, int $$4, int $$5) {
         gw.a $$6 = this.b($$2, $$3, $$4);
         int $$7 = 0;

         for (hc $$8 : hc.values()) {
            $$6.c($$8);
            if ($$1.b($$6) && $$0.a_($$6).d($$0, $$6, $$8.g())) {
               if (++$$7 >= $$5) {
                  return true;
               }
            }

            $$6.c($$8.g());
         }

         return false;
      }
   }

   public static class b extends dxg.c {
      private final hc b;
      private final boolean c;

      public b(qy $$0) {
         super(dwb.b, $$0);
         this.c = $$0.q("tf");
         this.b = hc.b($$0.h("D"));
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, dvc $$1, @Nullable hc $$2, dxh.a $$3) {
         super(dwb.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.d() > 3;
      }

      @Nullable
      public static dvc a(dvp $$0, ase $$1, int $$2, int $$3, int $$4, hc $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }
         dvc $$11 = switch ($$5) {
            default -> new dvc(-1, 0, -4, 3, $$6, 0);
            case d -> new dvc(-1, 0, 0, 3, $$6, 4);
            case e -> new dvc(-4, 0, -1, 0, $$6, 3);
            case f -> new dvc(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(dvo $$0, dvp $$1, ase $$2) {
         int $$3 = this.g();
         switch (this.b) {
            case c:
            default:
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hc.c, $$3);
               dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hc.e, $$3);
               dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hc.f, $$3);
               break;
            case d:
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hc.d, $$3);
               dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hc.e, $$3);
               dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hc.f, $$3);
               break;
            case e:
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hc.c, $$3);
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hc.d, $$3);
               dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hc.e, $$3);
               break;
            case f:
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hc.c, $$3);
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hc.d, $$3);
               dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hc.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.i() - 1, hc.c, $$3);
            }

            if ($$2.h()) {
               dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + 3 + 1, this.f.i() + 1, hc.e, $$3);
            }

            if ($$2.h()) {
               dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + 3 + 1, this.f.i() + 1, hc.f, $$3);
            }

            if ($$2.h()) {
               dxg.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.l() + 1, hc.d, $$3);
            }
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         if (!this.a($$0, $$4)) {
            dfl $$7 = this.a.d();
            if (this.c) {
               this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.i(), this.f.j() - 1, this.f.h() + 3 - 1, this.f.l(), e, e, false);
               this.a($$0, $$4, this.f.g(), this.f.h(), this.f.i() + 1, this.f.j(), this.f.h() + 3 - 1, this.f.l() - 1, e, e, false);
               this.a($$0, $$4, this.f.g() + 1, this.f.k() - 2, this.f.i(), this.f.j() - 1, this.f.k(), this.f.l(), e, e, false);
               this.a($$0, $$4, this.f.g(), this.f.k() - 2, this.f.i() + 1, this.f.j(), this.f.k(), this.f.l() - 1, e, e, false);
               this.a($$0, $$4, this.f.g() + 1, this.f.h() + 3, this.f.i() + 1, this.f.j() - 1, this.f.h() + 3, this.f.l() - 1, e, e, false);
            } else {
               this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.i(), this.f.j() - 1, this.f.k(), this.f.l(), e, e, false);
               this.a($$0, $$4, this.f.g(), this.f.h(), this.f.i() + 1, this.f.j(), this.f.k(), this.f.l() - 1, e, e, false);
            }

            this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.i() + 1, this.f.k());
            this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.l() - 1, this.f.k());
            this.a($$0, $$4, this.f.j() - 1, this.f.h(), this.f.i() + 1, this.f.k());
            this.a($$0, $$4, this.f.j() - 1, this.f.h(), this.f.l() - 1, this.f.k());
            int $$8 = this.f.h() - 1;

            for (int $$9 = this.f.g(); $$9 <= this.f.j(); $$9++) {
               for (int $$10 = this.f.i(); $$10 <= this.f.l(); $$10++) {
                  this.a($$0, $$4, $$7, $$9, $$8, $$10);
               }
            }
         }
      }

      private void a(cqr $$0, dvc $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).i()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }
      }
   }

   abstract static class c extends dvo {
      protected dxh.a a;

      public c(dwb $$0, int $$1, dxh.a $$2, dvc $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(dwb $$0, qy $$1) {
         super($$0, $$1);
         this.a = dxh.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(cqa $$0, int $$1, int $$2, int $$3, dvc $$4) {
         dfl $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(csy.eY);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(cpd $$0, dvc $$1, int $$2, int $$3, int $$4, int $$5) {
         for (int $$6 = $$2; $$6 <= $$3; $$6++) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).i()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(cpy $$0, dvc $$1) {
         int $$2 = Math.max(this.f.g() - 1, $$1.g());
         int $$3 = Math.max(this.f.h() - 1, $$1.h());
         int $$4 = Math.max(this.f.i() - 1, $$1.i());
         int $$5 = Math.min(this.f.j() + 1, $$1.j());
         int $$6 = Math.min(this.f.k() + 1, $$1.k());
         int $$7 = Math.min(this.f.l() + 1, $$1.l());
         gw.a $$8 = new gw.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.s($$8).a(apt.X)) {
            return true;
         } else {
            for (int $$9 = $$2; $$9 <= $$5; $$9++) {
               for (int $$10 = $$4; $$10 <= $$7; $$10++) {
                  if ($$0.a_($$8.d($$9, $$3, $$10)).k()) {
                     return true;
                  }

                  if ($$0.a_($$8.d($$9, $$6, $$10)).k()) {
                     return true;
                  }
               }
            }

            for (int $$11 = $$2; $$11 <= $$5; $$11++) {
               for (int $$12 = $$3; $$12 <= $$6; $$12++) {
                  if ($$0.a_($$8.d($$11, $$12, $$4)).k()) {
                     return true;
                  }

                  if ($$0.a_($$8.d($$11, $$12, $$7)).k()) {
                     return true;
                  }
               }
            }

            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               for (int $$14 = $$3; $$14 <= $$6; $$14++) {
                  if ($$0.a_($$8.d($$2, $$14, $$13)).k()) {
                     return true;
                  }

                  if ($$0.a_($$8.d($$5, $$14, $$13)).k()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      protected void a(cqr $$0, dvc $$1, dfl $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            gw $$6 = this.b($$3, $$4, $$5);
            dfl $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, hc.b)) {
               $$0.a($$6, $$2, 2);
            }
         }
      }
   }

   public static class d extends dxg.c {
      private final List<dvc> b = Lists.newLinkedList();

      public d(int $$0, ase $$1, int $$2, int $$3, dxh.a $$4) {
         super(dwb.c, $$0, $$4, new dvc($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(qy $$0) {
         super(dwb.c, $$0);
         dvc.a.listOf().parse(rk.a, $$0.c("Entrances", 11)).resultOrPartial(dxg.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(dvo $$0, dvp $$1, ase $$2) {
         int $$3 = this.g();
         int $$4 = this.f.d() - 3 - 1;
         if ($$4 <= 0) {
            $$4 = 1;
         }

         int $$5 = 0;

         while ($$5 < this.f.c()) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dxg.c $$6 = dxg.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.i() - 1, hc.c, $$3);
            if ($$6 != null) {
               dvc $$7 = $$6.f();
               this.b.add(new dvc($$7.g(), $$7.h(), this.f.i(), $$7.j(), $$7.k(), this.f.i() + 1));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.c()) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dxg.c $$8 = dxg.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.l() + 1, hc.d, $$3);
            if ($$8 != null) {
               dvc $$9 = $$8.f();
               this.b.add(new dvc($$9.g(), $$9.h(), this.f.l() - 1, $$9.j(), $$9.k(), this.f.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dxg.c $$10 = dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, hc.e, $$3);
            if ($$10 != null) {
               dvc $$11 = $$10.f();
               this.b.add(new dvc(this.f.g(), $$11.h(), $$11.i(), this.f.g() + 1, $$11.k(), $$11.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dvo $$12 = dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, hc.f, $$3);
            if ($$12 != null) {
               dvc $$13 = $$12.f();
               this.b.add(new dvc(this.f.j() - 1, $$13.h(), $$13.i(), this.f.j(), $$13.k(), $$13.l()));
            }

            $$5 += 4;
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.g(), this.f.h() + 1, this.f.i(), this.f.j(), Math.min(this.f.h() + 3, this.f.k()), this.f.l(), e, e, false);

            for (dvc $$7 : this.b) {
               this.a($$0, $$4, $$7.g(), $$7.k() - 2, $$7.i(), $$7.j(), $$7.k(), $$7.l(), e, e, false);
            }

            this.a($$0, $$4, this.f.g(), this.f.h() + 4, this.f.i(), this.f.j(), this.f.k(), this.f.l(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for (dvc $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         dvc.a.listOf().encodeStart(rk.a, this.b).resultOrPartial(dxg.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends dxg.c {
      public e(int $$0, dvc $$1, hc $$2, dxh.a $$3) {
         super(dwb.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(qy $$0) {
         super(dwb.d, $$0);
      }

      @Nullable
      public static dvc a(dvp $$0, ase $$1, int $$2, int $$3, int $$4, hc $$5) {
         dvc $$9 = switch ($$5) {
            default -> new dvc(0, -5, -8, 2, 2, 0);
            case d -> new dvc(0, -5, 0, 2, 2, 8);
            case e -> new dvc(-8, -5, 0, 0, 2, 2);
            case f -> new dvc(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(dvo $$0, dvp $$1, ase $$2) {
         int $$3 = this.g();
         hc $$4 = this.i();
         if ($$4 != null) {
            switch ($$4) {
               case c:
               default:
                  dxg.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.i() - 1, hc.c, $$3);
                  break;
               case d:
                  dxg.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.l() + 1, hc.d, $$3);
                  break;
               case e:
                  dxg.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i(), hc.e, $$3);
                  break;
               case f:
                  dxg.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i(), hc.f, $$3);
            }
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, 0, 5, 0, 2, 7, 1, e, e, false);
            this.a($$0, $$4, 0, 0, 7, 2, 2, 8, e, e, false);

            for (int $$7 = 0; $$7 < 5; $$7++) {
               this.a($$0, $$4, 0, 5 - $$7 - ($$7 < 4 ? 1 : 0), 2 + $$7, 2, 7 - $$7, 2 + $$7, e, e, false);
            }
         }
      }
   }
}
