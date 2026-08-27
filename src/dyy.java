import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyy {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static dyy.c a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, @Nullable hx $$5, int $$6, dyz.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         dwn $$9 = dyy.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new dyy.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         dwn $$10 = dyy.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new dyy.e($$6, $$10, $$5, $$7);
         }
      } else {
         dwn $$11 = dyy.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new dyy.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static dyy.c a(dwz $$0, dxa $$1, ato $$2, int $$3, int $$4, int $$5, hx $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 80 && Math.abs($$5 - $$0.f().i()) <= 80) {
         dyz.a $$8 = ((dyy.c)$$0).a;
         dyy.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends dyy.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(rz $$0) {
         super(dxm.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, ato $$1, dwn $$2, hx $$3, dyz.a $$4) {
         super(dxm.a, $$0, $$4, $$2);
         this.a($$3);
         this.b = $$1.a(3) == 0;
         this.c = !this.b && $$1.a(23) == 0;
         if (this.i().o() == hx.a.c) {
            this.h = $$2.e() / 5;
         } else {
            this.h = $$2.c() / 5;
         }
      }

      @Nullable
      public static dwn a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5) {
         for (int $$6 = $$1.a(3) + 2; $$6 > 0; $$6--) {
            int $$7 = $$6 * 5;

            dwn $$11 = switch ($$5) {
               default -> new dwn(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new dwn(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new dwn(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new dwn(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     dyy.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), hx.e, $$3);
                  } else {
                     dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), hx.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     dyy.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, hx.e, $$3);
                  } else {
                     dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, hx.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dyy.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, hx.c, $$3);
                  } else {
                     dyy.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, hx.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dyy.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.i() - 1, hx.c, $$3);
                  } else {
                     dyy.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.l() + 1, hx.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != hx.c && $$5 != hx.d) {
               for (int $$8 = this.f.g() + 3; $$8 + 3 <= this.f.j(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     dyy.a($$0, $$1, $$2, $$8, this.f.h(), this.f.i() - 1, hx.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     dyy.a($$0, $$1, $$2, $$8, this.f.h(), this.f.l() + 1, hx.d, $$3 + 1);
                  }
               }
            } else {
               for (int $$6 = this.f.i() + 3; $$6 + 3 <= this.f.l(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), $$6, hx.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), $$6, hx.f, $$3 + 1);
                  }
               }
            }
         }
      }

      @Override
      protected boolean a(csm $$0, dwn $$1, ato $$2, int $$3, int $$4, int $$5, agg $$6) {
         ht $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).i() && !$$0.a_($$7.d()).i()) {
            dgw $$8 = cuv.cP.o().a(dar.e, $$2.h() ? dia.a : dia.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            cfk $$9 = new cfk($$0.C(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            dgw $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, cuv.bs.o(), e, false, true);
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
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, eej.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, eej.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  ht $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, cuv.ct.o(), 2);
                     if ($$0.c_($$17) instanceof dge $$19) {
                        $$19.a(bkm.n, $$3);
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
               dgw $$24 = cuv.cP.o().a(dar.e, dia.a);

               for (int $$25 = 0; $$25 <= $$11; $$25++) {
                  dgw $$26 = this.a($$0, 1, -1, $$25, $$4);
                  if (!$$26.i() && $$26.i($$0, this.b(1, -1, $$25))) {
                     float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                  }
               }
            }
         }
      }

      private void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4) {
         dgw $$5 = this.a.b();
         dgw $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }
      }

      @Override
      protected void b(csm $$0, dgw $$1, int $$2, int $$3, int $$4, dwn $$5) {
         ht.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();

            while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
               $$6.c(hx.a);
            }

            if (this.a($$0, $$6, $$0.a_($$6))) {
               while ($$6.v() < $$7) {
                  $$6.c(hx.b);
                  $$0.a($$6, $$1, 2);
               }
            }
         }
      }

      protected void c(csm $$0, dgw $$1, int $$2, int $$3, int $$4, dwn $$5) {
         ht.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for (boolean $$10 = true; $$9 || $$10; $$8++) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  dgw $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(cuv.H);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.I_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  dgw $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, cuv.eX.o(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.aj() - 1;
               }
            }
         }
      }

      private static void a(csm $$0, dgw $$1, ht.a $$2, int $$3, int $$4) {
         for (int $$5 = $$3; $$5 < $$4; $$5++) {
            $$0.a($$2.q($$5), $$1, 2);
         }
      }

      private boolean a(crv $$0, ht $$1, dgw $$2) {
         return $$2.d($$0, $$1, hx.b);
      }

      private boolean b(crv $$0, ht $$1, dgw $$2) {
         return cut.a($$0, $$1, hx.a) && !($$2.b() instanceof cxo);
      }

      private void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, ato $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            dgw $$8 = this.a.d();
            dgw $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(cxq.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(cxq.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, cuv.cq.o().a(ddr.g, hx.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, cuv.cq.o().a(ddr.g, hx.c));
            }
         }
      }

      private void a(csm $$0, dwn $$1, ato $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, cuv.bs.o(), $$4, $$5, $$6, $$1);
         }
      }

      private boolean a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5) {
         ht.a $$6 = this.b($$2, $$3, $$4);
         int $$7 = 0;

         for (hx $$8 : hx.values()) {
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

   public static class b extends dyy.c {
      private final hx b;
      private final boolean c;

      public b(rz $$0) {
         super(dxm.b, $$0);
         this.c = $$0.q("tf");
         this.b = hx.b($$0.h("D"));
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, dwn $$1, @Nullable hx $$2, dyz.a $$3) {
         super(dxm.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.d() > 3;
      }

      @Nullable
      public static dwn a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }
         dwn $$11 = switch ($$5) {
            default -> new dwn(-1, 0, -4, 3, $$6, 0);
            case d -> new dwn(-1, 0, 0, 3, $$6, 4);
            case e -> new dwn(-4, 0, -1, 0, $$6, 3);
            case f -> new dwn(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         int $$3 = this.g();
         switch (this.b) {
            case c:
            default:
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hx.c, $$3);
               dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hx.e, $$3);
               dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hx.f, $$3);
               break;
            case d:
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hx.d, $$3);
               dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hx.e, $$3);
               dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hx.f, $$3);
               break;
            case e:
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hx.c, $$3);
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hx.d, $$3);
               dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hx.e, $$3);
               break;
            case f:
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hx.c, $$3);
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hx.d, $$3);
               dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hx.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.i() - 1, hx.c, $$3);
            }

            if ($$2.h()) {
               dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + 3 + 1, this.f.i() + 1, hx.e, $$3);
            }

            if ($$2.h()) {
               dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + 3 + 1, this.f.i() + 1, hx.f, $$3);
            }

            if ($$2.h()) {
               dyy.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.l() + 1, hx.d, $$3);
            }
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         if (!this.a($$0, $$4)) {
            dgw $$7 = this.a.d();
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

      private void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).i()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }
      }
   }

   abstract static class c extends dwz {
      protected dyz.a a;

      public c(dxm $$0, int $$1, dyz.a $$2, dwn $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(dxm $$0, rz $$1) {
         super($$0, $$1);
         this.a = dyz.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(crv $$0, int $$1, int $$2, int $$3, dwn $$4) {
         dgw $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(cuv.eX);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(cqy $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5) {
         for (int $$6 = $$2; $$6 <= $$3; $$6++) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).i()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(crt $$0, dwn $$1) {
         int $$2 = Math.max(this.f.g() - 1, $$1.g());
         int $$3 = Math.max(this.f.h() - 1, $$1.h());
         int $$4 = Math.max(this.f.i() - 1, $$1.i());
         int $$5 = Math.min(this.f.j() + 1, $$1.j());
         int $$6 = Math.min(this.f.k() + 1, $$1.k());
         int $$7 = Math.min(this.f.l() + 1, $$1.l());
         ht.a $$8 = new ht.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.s($$8).a(arb.X)) {
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

      protected void a(csm $$0, dwn $$1, dgw $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            ht $$6 = this.b($$3, $$4, $$5);
            dgw $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, hx.b)) {
               $$0.a($$6, $$2, 2);
            }
         }
      }
   }

   public static class d extends dyy.c {
      private final List<dwn> b = Lists.newLinkedList();

      public d(int $$0, ato $$1, int $$2, int $$3, dyz.a $$4) {
         super(dxm.c, $$0, $$4, new dwn($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(rz $$0) {
         super(dxm.c, $$0);
         dwn.a.listOf().parse(sn.a, $$0.c("Entrances", 11)).resultOrPartial(dyy.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
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

            dyy.c $$6 = dyy.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.i() - 1, hx.c, $$3);
            if ($$6 != null) {
               dwn $$7 = $$6.f();
               this.b.add(new dwn($$7.g(), $$7.h(), this.f.i(), $$7.j(), $$7.k(), this.f.i() + 1));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.c()) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dyy.c $$8 = dyy.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.l() + 1, hx.d, $$3);
            if ($$8 != null) {
               dwn $$9 = $$8.f();
               this.b.add(new dwn($$9.g(), $$9.h(), this.f.l() - 1, $$9.j(), $$9.k(), this.f.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dyy.c $$10 = dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, hx.e, $$3);
            if ($$10 != null) {
               dwn $$11 = $$10.f();
               this.b.add(new dwn(this.f.g(), $$11.h(), $$11.i(), this.f.g() + 1, $$11.k(), $$11.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dwz $$12 = dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, hx.f, $$3);
            if ($$12 != null) {
               dwn $$13 = $$12.f();
               this.b.add(new dwn(this.f.j() - 1, $$13.h(), $$13.i(), this.f.j(), $$13.k(), $$13.l()));
            }

            $$5 += 4;
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.g(), this.f.h() + 1, this.f.i(), this.f.j(), Math.min(this.f.h() + 3, this.f.k()), this.f.l(), e, e, false);

            for (dwn $$7 : this.b) {
               this.a($$0, $$4, $$7.g(), $$7.k() - 2, $$7.i(), $$7.j(), $$7.k(), $$7.l(), e, e, false);
            }

            this.a($$0, $$4, this.f.g(), this.f.h() + 4, this.f.i(), this.f.j(), this.f.k(), this.f.l(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for (dwn $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         dwn.a.listOf().encodeStart(sn.a, this.b).resultOrPartial(dyy.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends dyy.c {
      public e(int $$0, dwn $$1, hx $$2, dyz.a $$3) {
         super(dxm.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(rz $$0) {
         super(dxm.d, $$0);
      }

      @Nullable
      public static dwn a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5) {
         dwn $$9 = switch ($$5) {
            default -> new dwn(0, -5, -8, 2, 2, 0);
            case d -> new dwn(0, -5, 0, 2, 2, 8);
            case e -> new dwn(-8, -5, 0, 0, 2, 2);
            case f -> new dwn(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         int $$3 = this.g();
         hx $$4 = this.i();
         if ($$4 != null) {
            switch ($$4) {
               case c:
               default:
                  dyy.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.i() - 1, hx.c, $$3);
                  break;
               case d:
                  dyy.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.l() + 1, hx.d, $$3);
                  break;
               case e:
                  dyy.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i(), hx.e, $$3);
                  break;
               case f:
                  dyy.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i(), hx.f, $$3);
            }
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
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
