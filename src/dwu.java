import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwu {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static dwu.c a(dvd $$0, aru $$1, int $$2, int $$3, int $$4, @Nullable ha $$5, int $$6, dwv.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         duq $$9 = dwu.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new dwu.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         duq $$10 = dwu.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new dwu.e($$6, $$10, $$5, $$7);
         }
      } else {
         duq $$11 = dwu.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new dwu.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static dwu.c a(dvc $$0, dvd $$1, aru $$2, int $$3, int $$4, int $$5, ha $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 80 && Math.abs($$5 - $$0.f().i()) <= 80) {
         dwv.a $$8 = ((dwu.c)$$0).a;
         dwu.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends dwu.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(qr $$0) {
         super(dvp.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, aru $$1, duq $$2, ha $$3, dwv.a $$4) {
         super(dvp.a, $$0, $$4, $$2);
         this.a($$3);
         this.b = $$1.a(3) == 0;
         this.c = !this.b && $$1.a(23) == 0;
         if (this.i().o() == ha.a.c) {
            this.h = $$2.e() / 5;
         } else {
            this.h = $$2.c() / 5;
         }
      }

      @Nullable
      public static duq a(dvd $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5) {
         for (int $$6 = $$1.a(3) + 2; $$6 > 0; $$6--) {
            int $$7 = $$6 * 5;

            duq $$11 = switch ($$5) {
               default -> new duq(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new duq(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new duq(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new duq(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(dvc $$0, dvd $$1, aru $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     dwu.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), ha.e, $$3);
                  } else {
                     dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), ha.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     dwu.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, ha.e, $$3);
                  } else {
                     dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, ha.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dwu.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, ha.c, $$3);
                  } else {
                     dwu.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, ha.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dwu.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.i() - 1, ha.c, $$3);
                  } else {
                     dwu.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.l() + 1, ha.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != ha.c && $$5 != ha.d) {
               for (int $$8 = this.f.g() + 3; $$8 + 3 <= this.f.j(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     dwu.a($$0, $$1, $$2, $$8, this.f.h(), this.f.i() - 1, ha.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     dwu.a($$0, $$1, $$2, $$8, this.f.h(), this.f.l() + 1, ha.d, $$3 + 1);
                  }
               }
            } else {
               for (int $$6 = this.f.i() + 3; $$6 + 3 <= this.f.l(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), $$6, ha.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), $$6, ha.f, $$3 + 1);
                  }
               }
            }
         }
      }

      @Override
      protected boolean a(cqf $$0, duq $$1, aru $$2, int $$3, int $$4, int $$5, aer $$6) {
         gu $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).i() && !$$0.a_($$7.d()).i()) {
            dez $$8 = csm.cP.n().a(cyj.d, $$2.h() ? dgd.a : dgd.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            cdk $$9 = new cdk($$0.C(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            dez $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, csm.bs.n(), e, false, true);
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
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, ece.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, ece.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  gu $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, csm.ct.n(), 2);
                     if ($$0.c_($$17) instanceof ddx $$19) {
                        $$19.a(bim.n, $$3);
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
               dez $$24 = csm.cP.n().a(cyj.d, dgd.a);

               for (int $$25 = 0; $$25 <= $$11; $$25++) {
                  dez $$26 = this.a($$0, 1, -1, $$25, $$4);
                  if (!$$26.i() && $$26.i($$0, this.b(1, -1, $$25))) {
                     float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                  }
               }
            }
         }
      }

      private void a(cqf $$0, duq $$1, int $$2, int $$3, int $$4) {
         dez $$5 = this.a.b();
         dez $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }
      }

      @Override
      protected void b(cqf $$0, dez $$1, int $$2, int $$3, int $$4, duq $$5) {
         gu.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();

            while (this.a($$0.a_($$6)) && $$6.v() > $$0.C_() + 1) {
               $$6.c(ha.a);
            }

            if (this.a($$0, $$6, $$0.a_($$6))) {
               while ($$6.v() < $$7) {
                  $$6.c(ha.b);
                  $$0.a($$6, $$1, 2);
               }
            }
         }
      }

      protected void c(cqf $$0, dez $$1, int $$2, int $$3, int $$4, duq $$5) {
         gu.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for (boolean $$10 = true; $$9 || $$10; $$8++) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  dez $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(csm.H);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.C_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  dez $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, csm.eY.n(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.aj() - 1;
               }
            }
         }
      }

      private static void a(cqf $$0, dez $$1, gu.a $$2, int $$3, int $$4) {
         for (int $$5 = $$3; $$5 < $$4; $$5++) {
            $$0.a($$2.q($$5), $$1, 2);
         }
      }

      private boolean a(cpo $$0, gu $$1, dez $$2) {
         return $$2.d($$0, $$1, ha.b);
      }

      private boolean b(cpo $$0, gu $$1, dez $$2) {
         return csl.a($$0, $$1, ha.a) && !($$2.b() instanceof cvd);
      }

      private void a(cqf $$0, duq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, aru $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            dez $$8 = this.a.d();
            dez $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(cvf.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(cvf.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, csm.cq.n().a(dbl.a, ha.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, csm.cq.n().a(dbl.a, ha.c));
            }
         }
      }

      private void a(cqf $$0, duq $$1, aru $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, csm.bs.n(), $$4, $$5, $$6, $$1);
         }
      }

      private boolean a(cqf $$0, duq $$1, int $$2, int $$3, int $$4, int $$5) {
         gu.a $$6 = this.b($$2, $$3, $$4);
         int $$7 = 0;

         for (ha $$8 : ha.values()) {
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

   public static class b extends dwu.c {
      private final ha b;
      private final boolean c;

      public b(qr $$0) {
         super(dvp.b, $$0);
         this.c = $$0.q("tf");
         this.b = ha.b($$0.h("D"));
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, duq $$1, @Nullable ha $$2, dwv.a $$3) {
         super(dvp.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.d() > 3;
      }

      @Nullable
      public static duq a(dvd $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }
         duq $$11 = switch ($$5) {
            default -> new duq(-1, 0, -4, 3, $$6, 0);
            case d -> new duq(-1, 0, 0, 3, $$6, 4);
            case e -> new duq(-4, 0, -1, 0, $$6, 3);
            case f -> new duq(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(dvc $$0, dvd $$1, aru $$2) {
         int $$3 = this.g();
         switch (this.b) {
            case c:
            default:
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, ha.c, $$3);
               dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, ha.e, $$3);
               dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, ha.f, $$3);
               break;
            case d:
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, ha.d, $$3);
               dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, ha.e, $$3);
               dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, ha.f, $$3);
               break;
            case e:
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, ha.c, $$3);
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, ha.d, $$3);
               dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, ha.e, $$3);
               break;
            case f:
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, ha.c, $$3);
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, ha.d, $$3);
               dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, ha.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.i() - 1, ha.c, $$3);
            }

            if ($$2.h()) {
               dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + 3 + 1, this.f.i() + 1, ha.e, $$3);
            }

            if ($$2.h()) {
               dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + 3 + 1, this.f.i() + 1, ha.f, $$3);
            }

            if ($$2.h()) {
               dwu.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.l() + 1, ha.d, $$3);
            }
         }
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
         if (!this.a($$0, $$4)) {
            dez $$7 = this.a.d();
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

      private void a(cqf $$0, duq $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).i()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }
      }
   }

   abstract static class c extends dvc {
      protected dwv.a a;

      public c(dvp $$0, int $$1, dwv.a $$2, duq $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(dvp $$0, qr $$1) {
         super($$0, $$1);
         this.a = dwv.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(cpo $$0, int $$1, int $$2, int $$3, duq $$4) {
         dez $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(csm.eY);
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(cor $$0, duq $$1, int $$2, int $$3, int $$4, int $$5) {
         for (int $$6 = $$2; $$6 <= $$3; $$6++) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).i()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(cpm $$0, duq $$1) {
         int $$2 = Math.max(this.f.g() - 1, $$1.g());
         int $$3 = Math.max(this.f.h() - 1, $$1.h());
         int $$4 = Math.max(this.f.i() - 1, $$1.i());
         int $$5 = Math.min(this.f.j() + 1, $$1.j());
         int $$6 = Math.min(this.f.k() + 1, $$1.k());
         int $$7 = Math.min(this.f.l() + 1, $$1.l());
         gu.a $$8 = new gu.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.s($$8).a(apk.X)) {
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

      protected void a(cqf $$0, duq $$1, dez $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            gu $$6 = this.b($$3, $$4, $$5);
            dez $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, ha.b)) {
               $$0.a($$6, $$2, 2);
            }
         }
      }
   }

   public static class d extends dwu.c {
      private final List<duq> b = Lists.newLinkedList();

      public d(int $$0, aru $$1, int $$2, int $$3, dwv.a $$4) {
         super(dvp.c, $$0, $$4, new duq($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(qr $$0) {
         super(dvp.c, $$0);
         duq.a.listOf().parse(rc.a, $$0.c("Entrances", 11)).resultOrPartial(dwu.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(dvc $$0, dvd $$1, aru $$2) {
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

            dwu.c $$6 = dwu.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.i() - 1, ha.c, $$3);
            if ($$6 != null) {
               duq $$7 = $$6.f();
               this.b.add(new duq($$7.g(), $$7.h(), this.f.i(), $$7.j(), $$7.k(), this.f.i() + 1));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.c()) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dwu.c $$8 = dwu.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.l() + 1, ha.d, $$3);
            if ($$8 != null) {
               duq $$9 = $$8.f();
               this.b.add(new duq($$9.g(), $$9.h(), this.f.l() - 1, $$9.j(), $$9.k(), this.f.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dwu.c $$10 = dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, ha.e, $$3);
            if ($$10 != null) {
               duq $$11 = $$10.f();
               this.b.add(new duq(this.f.g(), $$11.h(), $$11.i(), this.f.g() + 1, $$11.k(), $$11.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dvc $$12 = dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, ha.f, $$3);
            if ($$12 != null) {
               duq $$13 = $$12.f();
               this.b.add(new duq(this.f.j() - 1, $$13.h(), $$13.i(), this.f.j(), $$13.k(), $$13.l()));
            }

            $$5 += 4;
         }
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.g(), this.f.h() + 1, this.f.i(), this.f.j(), Math.min(this.f.h() + 3, this.f.k()), this.f.l(), e, e, false);

            for (duq $$7 : this.b) {
               this.a($$0, $$4, $$7.g(), $$7.k() - 2, $$7.i(), $$7.j(), $$7.k(), $$7.l(), e, e, false);
            }

            this.a($$0, $$4, this.f.g(), this.f.h() + 4, this.f.i(), this.f.j(), this.f.k(), this.f.l(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for (duq $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
         super.a($$0, $$1);
         duq.a.listOf().encodeStart(rc.a, this.b).resultOrPartial(dwu.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends dwu.c {
      public e(int $$0, duq $$1, ha $$2, dwv.a $$3) {
         super(dvp.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(qr $$0) {
         super(dvp.d, $$0);
      }

      @Nullable
      public static duq a(dvd $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5) {
         duq $$9 = switch ($$5) {
            default -> new duq(0, -5, -8, 2, 2, 0);
            case d -> new duq(0, -5, 0, 2, 2, 8);
            case e -> new duq(-8, -5, 0, 0, 2, 2);
            case f -> new duq(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(dvc $$0, dvd $$1, aru $$2) {
         int $$3 = this.g();
         ha $$4 = this.i();
         if ($$4 != null) {
            switch ($$4) {
               case c:
               default:
                  dwu.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.i() - 1, ha.c, $$3);
                  break;
               case d:
                  dwu.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.l() + 1, ha.d, $$3);
                  break;
               case e:
                  dwu.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i(), ha.e, $$3);
                  break;
               case f:
                  dwu.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i(), ha.f, $$3);
            }
         }
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
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
