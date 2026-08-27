import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eij {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static eij.c a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, @Nullable ir $$5, int $$6, eik.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         efy $$9 = eij.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new eij.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         efy $$10 = eij.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new eij.e($$6, $$10, $$5, $$7);
         }
      } else {
         efy $$11 = eij.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new eij.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static eij.c a(egk $$0, egl $$1, ayd $$2, int $$3, int $$4, int $$5, ir $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 80 && Math.abs($$5 - $$0.f().j()) <= 80) {
         eik.a $$8 = ((eij.c)$$0).a;
         eij.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends eij.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(ty $$0) {
         super(egx.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, ayd $$1, efy $$2, ir $$3, eik.a $$4) {
         super(egx.a, $$0, $$4, $$2);
         this.a($$3);
         this.b = $$1.a(3) == 0;
         this.c = !this.b && $$1.a(23) == 0;
         if (this.i().o() == ir.a.c) {
            this.h = $$2.f() / 5;
         } else {
            this.h = $$2.d() / 5;
         }
      }

      @Nullable
      public static efy a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5) {
         for (int $$6 = $$1.a(3) + 2; $$6 > 0; $$6--) {
            int $$7 = $$6 * 5;

            efy $$11 = switch ($$5) {
               default -> new efy(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new efy(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new efy(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new efy(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         ir $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     eij.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.j() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.j(), ir.e, $$3);
                  } else {
                     eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.j(), ir.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     eij.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.m() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.m() - 3, ir.e, $$3);
                  } else {
                     eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.m() - 3, ir.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.j(), $$5, $$3);
                  } else if ($$4 == 2) {
                     eij.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.j() - 1, ir.c, $$3);
                  } else {
                     eij.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.m() + 1, ir.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.j(), $$5, $$3);
                  } else if ($$4 == 2) {
                     eij.a($$0, $$1, $$2, this.f.k() - 3, this.f.i() - 1 + $$2.a(3), this.f.j() - 1, ir.c, $$3);
                  } else {
                     eij.a($$0, $$1, $$2, this.f.k() - 3, this.f.i() - 1 + $$2.a(3), this.f.m() + 1, ir.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != ir.c && $$5 != ir.d) {
               for (int $$8 = this.f.h() + 3; $$8 + 3 <= this.f.k(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     eij.a($$0, $$1, $$2, $$8, this.f.i(), this.f.j() - 1, ir.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     eij.a($$0, $$1, $$2, $$8, this.f.i(), this.f.m() + 1, ir.d, $$3 + 1);
                  }
               }
            } else {
               for (int $$6 = this.f.j() + 3; $$6 + 3 <= this.f.m(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), $$6, ir.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), $$6, ir.f, $$3 + 1);
                  }
               }
            }
         }
      }

      @Override
      protected boolean a(dap $$0, efy $$1, ayd $$2, int $$3, int $$4, int $$5, akf $$6) {
         im $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).i() && !$$0.a_($$7.d()).i()) {
            dpy $$8 = dcx.cP.n().a(diu.e, $$2.h() ? drc.a : drc.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            cmn $$9 = new cmn($$0.E(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            dpy $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, dcx.bs.n(), e, false, true);
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
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, eny.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, eny.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  im $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, dcx.ct.n(), 2);
                     if ($$0.c_($$17) instanceof dor $$19) {
                        $$19.a(bqr.q, $$3);
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
               dpy $$24 = dcx.cP.n().a(diu.e, drc.a);

               for (int $$25 = 0; $$25 <= $$11; $$25++) {
                  dpy $$26 = this.a($$0, 1, -1, $$25, $$4);
                  if (!$$26.i() && $$26.i($$0, this.b(1, -1, $$25))) {
                     float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                  }
               }
            }
         }
      }

      private void a(dap $$0, efy $$1, int $$2, int $$3, int $$4) {
         dpy $$5 = this.a.b();
         dpy $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }
      }

      @Override
      protected void b(dap $$0, dpy $$1, int $$2, int $$3, int $$4, efy $$5) {
         im.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();

            while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
               $$6.c(ir.a);
            }

            if (this.a($$0, $$6, $$0.a_($$6))) {
               while ($$6.v() < $$7) {
                  $$6.c(ir.b);
                  $$0.a($$6, $$1, 2);
               }
            }
         }
      }

      protected void c(dap $$0, dpy $$1, int $$2, int $$3, int $$4, efy $$5) {
         im.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for (boolean $$10 = true; $$9 || $$10; $$8++) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  dpy $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(dcx.H);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.I_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  dpy $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, dcx.eX.n(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.al() - 1;
               }
            }
         }
      }

      private static void a(dap $$0, dpy $$1, im.a $$2, int $$3, int $$4) {
         for (int $$5 = $$3; $$5 < $$4; $$5++) {
            $$0.a($$2.q($$5), $$1, 2);
         }
      }

      private boolean a(czx $$0, im $$1, dpy $$2) {
         return $$2.d($$0, $$1, ir.b);
      }

      private boolean b(czx $$0, im $$1, dpy $$2) {
         return dcv.a($$0, $$1, ir.a) && !($$2.b() instanceof dfr);
      }

      private void a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, ayd $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            dpy $$8 = this.a.d();
            dpy $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(dft.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(dft.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, dcx.cq.n().a(dlx.g, ir.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, dcx.cq.n().a(dlx.g, ir.c));
            }
         }
      }

      private void a(dap $$0, efy $$1, ayd $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, dcx.bs.n(), $$4, $$5, $$6, $$1);
         }
      }

      private boolean a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5) {
         im.a $$6 = this.b($$2, $$3, $$4);
         int $$7 = 0;

         for (ir $$8 : ir.values()) {
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

   public static class b extends eij.c {
      private final ir b;
      private final boolean c;

      public b(ty $$0) {
         super(egx.b, $$0);
         this.c = $$0.q("tf");
         this.b = ir.b($$0.h("D"));
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, efy $$1, @Nullable ir $$2, eik.a $$3) {
         super(egx.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.e() > 3;
      }

      @Nullable
      public static efy a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }
         efy $$11 = switch ($$5) {
            default -> new efy(-1, 0, -4, 3, $$6, 0);
            case d -> new efy(-1, 0, 0, 3, $$6, 4);
            case e -> new efy(-4, 0, -1, 0, $$6, 3);
            case f -> new efy(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         int $$3 = this.g();
         switch (this.b) {
            case c:
            default:
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, ir.c, $$3);
               eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, ir.e, $$3);
               eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, ir.f, $$3);
               break;
            case d:
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, ir.d, $$3);
               eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, ir.e, $$3);
               eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, ir.f, $$3);
               break;
            case e:
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, ir.c, $$3);
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, ir.d, $$3);
               eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, ir.e, $$3);
               break;
            case f:
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, ir.c, $$3);
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, ir.d, $$3);
               eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, ir.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i() + 3 + 1, this.f.j() - 1, ir.c, $$3);
            }

            if ($$2.h()) {
               eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + 3 + 1, this.f.j() + 1, ir.e, $$3);
            }

            if ($$2.h()) {
               eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + 3 + 1, this.f.j() + 1, ir.f, $$3);
            }

            if ($$2.h()) {
               eij.a($$0, $$1, $$2, this.f.h() + 1, this.f.i() + 3 + 1, this.f.m() + 1, ir.d, $$3);
            }
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         if (!this.a($$0, $$4)) {
            dpy $$7 = this.a.d();
            if (this.c) {
               this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.j(), this.f.k() - 1, this.f.i() + 3 - 1, this.f.m(), e, e, false);
               this.a($$0, $$4, this.f.h(), this.f.i(), this.f.j() + 1, this.f.k(), this.f.i() + 3 - 1, this.f.m() - 1, e, e, false);
               this.a($$0, $$4, this.f.h() + 1, this.f.l() - 2, this.f.j(), this.f.k() - 1, this.f.l(), this.f.m(), e, e, false);
               this.a($$0, $$4, this.f.h(), this.f.l() - 2, this.f.j() + 1, this.f.k(), this.f.l(), this.f.m() - 1, e, e, false);
               this.a($$0, $$4, this.f.h() + 1, this.f.i() + 3, this.f.j() + 1, this.f.k() - 1, this.f.i() + 3, this.f.m() - 1, e, e, false);
            } else {
               this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.j(), this.f.k() - 1, this.f.l(), this.f.m(), e, e, false);
               this.a($$0, $$4, this.f.h(), this.f.i(), this.f.j() + 1, this.f.k(), this.f.l(), this.f.m() - 1, e, e, false);
            }

            this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.j() + 1, this.f.l());
            this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.m() - 1, this.f.l());
            this.a($$0, $$4, this.f.k() - 1, this.f.i(), this.f.j() + 1, this.f.l());
            this.a($$0, $$4, this.f.k() - 1, this.f.i(), this.f.m() - 1, this.f.l());
            int $$8 = this.f.i() - 1;

            for (int $$9 = this.f.h(); $$9 <= this.f.k(); $$9++) {
               for (int $$10 = this.f.j(); $$10 <= this.f.m(); $$10++) {
                  this.a($$0, $$4, $$7, $$9, $$8, $$10);
               }
            }
         }
      }

      private void a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).i()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }
      }
   }

   abstract static class c extends egk {
      protected eik.a a;

      public c(egx $$0, int $$1, eik.a $$2, efy $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(egx $$0, ty $$1) {
         super($$0, $$1);
         this.a = eik.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(czx $$0, int $$1, int $$2, int $$3, efy $$4) {
         dpy $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(dcx.eX);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(cza $$0, efy $$1, int $$2, int $$3, int $$4, int $$5) {
         for (int $$6 = $$2; $$6 <= $$3; $$6++) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).i()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(czv $$0, efy $$1) {
         int $$2 = Math.max(this.f.h() - 1, $$1.h());
         int $$3 = Math.max(this.f.i() - 1, $$1.i());
         int $$4 = Math.max(this.f.j() - 1, $$1.j());
         int $$5 = Math.min(this.f.k() + 1, $$1.k());
         int $$6 = Math.min(this.f.l() + 1, $$1.l());
         int $$7 = Math.min(this.f.m() + 1, $$1.m());
         im.a $$8 = new im.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.t($$8).a(avn.Y)) {
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

      protected void a(dap $$0, efy $$1, dpy $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            im $$6 = this.b($$3, $$4, $$5);
            dpy $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, ir.b)) {
               $$0.a($$6, $$2, 2);
            }
         }
      }
   }

   public static class d extends eij.c {
      private final List<efy> b = Lists.newLinkedList();

      public d(int $$0, ayd $$1, int $$2, int $$3, eik.a $$4) {
         super(egx.c, $$0, $$4, new efy($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(ty $$0) {
         super(egx.c, $$0);
         efy.a.listOf().parse(um.a, $$0.c("Entrances", 11)).resultOrPartial(eij.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         int $$3 = this.g();
         int $$4 = this.f.e() - 3 - 1;
         if ($$4 <= 0) {
            $$4 = 1;
         }

         int $$5 = 0;

         while ($$5 < this.f.d()) {
            $$5 += $$2.a(this.f.d());
            if ($$5 + 3 > this.f.d()) {
               break;
            }

            eij.c $$6 = eij.a($$0, $$1, $$2, this.f.h() + $$5, this.f.i() + $$2.a($$4) + 1, this.f.j() - 1, ir.c, $$3);
            if ($$6 != null) {
               efy $$7 = $$6.f();
               this.b.add(new efy($$7.h(), $$7.i(), this.f.j(), $$7.k(), $$7.l(), this.f.j() + 1));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.d()) {
            $$5 += $$2.a(this.f.d());
            if ($$5 + 3 > this.f.d()) {
               break;
            }

            eij.c $$8 = eij.a($$0, $$1, $$2, this.f.h() + $$5, this.f.i() + $$2.a($$4) + 1, this.f.m() + 1, ir.d, $$3);
            if ($$8 != null) {
               efy $$9 = $$8.f();
               this.b.add(new efy($$9.h(), $$9.i(), this.f.m() - 1, $$9.k(), $$9.l(), this.f.m()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.f()) {
            $$5 += $$2.a(this.f.f());
            if ($$5 + 3 > this.f.f()) {
               break;
            }

            eij.c $$10 = eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$2.a($$4) + 1, this.f.j() + $$5, ir.e, $$3);
            if ($$10 != null) {
               efy $$11 = $$10.f();
               this.b.add(new efy(this.f.h(), $$11.i(), $$11.j(), this.f.h() + 1, $$11.l(), $$11.m()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.f()) {
            $$5 += $$2.a(this.f.f());
            if ($$5 + 3 > this.f.f()) {
               break;
            }

            egk $$12 = eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$2.a($$4) + 1, this.f.j() + $$5, ir.f, $$3);
            if ($$12 != null) {
               efy $$13 = $$12.f();
               this.b.add(new efy(this.f.k() - 1, $$13.i(), $$13.j(), this.f.k(), $$13.l(), $$13.m()));
            }

            $$5 += 4;
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.h(), this.f.i() + 1, this.f.j(), this.f.k(), Math.min(this.f.i() + 3, this.f.l()), this.f.m(), e, e, false);

            for (efy $$7 : this.b) {
               this.a($$0, $$4, $$7.h(), $$7.l() - 2, $$7.j(), $$7.k(), $$7.l(), $$7.m(), e, e, false);
            }

            this.a($$0, $$4, this.f.h(), this.f.i() + 4, this.f.j(), this.f.k(), this.f.l(), this.f.m(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for (efy $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         efy.a.listOf().encodeStart(um.a, this.b).resultOrPartial(eij.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends eij.c {
      public e(int $$0, efy $$1, ir $$2, eik.a $$3) {
         super(egx.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(ty $$0) {
         super(egx.d, $$0);
      }

      @Nullable
      public static efy a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5) {
         efy $$9 = switch ($$5) {
            default -> new efy(0, -5, -8, 2, 2, 0);
            case d -> new efy(0, -5, 0, 2, 2, 8);
            case e -> new efy(-8, -5, 0, 0, 2, 2);
            case f -> new efy(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         int $$3 = this.g();
         ir $$4 = this.i();
         if ($$4 != null) {
            switch ($$4) {
               case c:
               default:
                  eij.a($$0, $$1, $$2, this.f.h(), this.f.i(), this.f.j() - 1, ir.c, $$3);
                  break;
               case d:
                  eij.a($$0, $$1, $$2, this.f.h(), this.f.i(), this.f.m() + 1, ir.d, $$3);
                  break;
               case e:
                  eij.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j(), ir.e, $$3);
                  break;
               case f:
                  eij.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j(), ir.f, $$3);
            }
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
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
