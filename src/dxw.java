import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxw {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static dxw.c a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, @Nullable hx $$5, int $$6, dxx.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         dvs $$9 = dxw.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new dxw.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         dvs $$10 = dxw.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new dxw.e($$6, $$10, $$5, $$7);
         }
      } else {
         dvs $$11 = dxw.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new dxw.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static dxw.c a(dwe $$0, dwf $$1, ate $$2, int $$3, int $$4, int $$5, hx $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 80 && Math.abs($$5 - $$0.f().i()) <= 80) {
         dxx.a $$8 = ((dxw.c)$$0).a;
         dxw.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends dxw.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(rt $$0) {
         super(dwr.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, ate $$1, dvs $$2, hx $$3, dxx.a $$4) {
         super(dwr.a, $$0, $$4, $$2);
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
      public static dvs a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5) {
         for (int $$6 = $$1.a(3) + 2; $$6 > 0; $$6--) {
            int $$7 = $$6 * 5;

            dvs $$11 = switch ($$5) {
               default -> new dvs(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new dvs(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new dvs(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new dvs(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     dxw.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), hx.e, $$3);
                  } else {
                     dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), hx.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     dxw.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, hx.e, $$3);
                  } else {
                     dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, hx.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dxw.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, hx.c, $$3);
                  } else {
                     dxw.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, hx.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dxw.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.i() - 1, hx.c, $$3);
                  } else {
                     dxw.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.l() + 1, hx.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != hx.c && $$5 != hx.d) {
               for (int $$8 = this.f.g() + 3; $$8 + 3 <= this.f.j(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     dxw.a($$0, $$1, $$2, $$8, this.f.h(), this.f.i() - 1, hx.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     dxw.a($$0, $$1, $$2, $$8, this.f.h(), this.f.l() + 1, hx.d, $$3 + 1);
                  }
               }
            } else {
               for (int $$6 = this.f.i() + 3; $$6 + 3 <= this.f.l(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), $$6, hx.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), $$6, hx.f, $$3 + 1);
                  }
               }
            }
         }
      }

      @Override
      protected boolean a(crt $$0, dvs $$1, ate $$2, int $$3, int $$4, int $$5, afw $$6) {
         ht $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).i() && !$$0.a_($$7.d()).i()) {
            dgb $$8 = cuc.cP.o().a(czx.e, $$2.h() ? dhf.a : dhf.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            cev $$9 = new cev($$0.C(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            dgb $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, cuc.bs.o(), e, false, true);
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
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, edg.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, edg.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  ht $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, cuc.ct.o(), 2);
                     if ($$0.c_($$17) instanceof dfj $$19) {
                        $$19.a(bjx.n, $$3);
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
               dgb $$24 = cuc.cP.o().a(czx.e, dhf.a);

               for (int $$25 = 0; $$25 <= $$11; $$25++) {
                  dgb $$26 = this.a($$0, 1, -1, $$25, $$4);
                  if (!$$26.i() && $$26.i($$0, this.b(1, -1, $$25))) {
                     float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                  }
               }
            }
         }
      }

      private void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4) {
         dgb $$5 = this.a.b();
         dgb $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }
      }

      @Override
      protected void b(crt $$0, dgb $$1, int $$2, int $$3, int $$4, dvs $$5) {
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

      protected void c(crt $$0, dgb $$1, int $$2, int $$3, int $$4, dvs $$5) {
         ht.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for (boolean $$10 = true; $$9 || $$10; $$8++) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  dgb $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(cuc.H);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.I_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  dgb $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, cuc.eX.o(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.aj() - 1;
               }
            }
         }
      }

      private static void a(crt $$0, dgb $$1, ht.a $$2, int $$3, int $$4) {
         for (int $$5 = $$3; $$5 < $$4; $$5++) {
            $$0.a($$2.q($$5), $$1, 2);
         }
      }

      private boolean a(crc $$0, ht $$1, dgb $$2) {
         return $$2.d($$0, $$1, hx.b);
      }

      private boolean b(crc $$0, ht $$1, dgb $$2) {
         return cua.a($$0, $$1, hx.a) && !($$2.b() instanceof cwu);
      }

      private void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, ate $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            dgb $$8 = this.a.d();
            dgb $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(cww.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(cww.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, cuc.cq.o().a(dcx.g, hx.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, cuc.cq.o().a(dcx.g, hx.c));
            }
         }
      }

      private void a(crt $$0, dvs $$1, ate $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, cuc.bs.o(), $$4, $$5, $$6, $$1);
         }
      }

      private boolean a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5) {
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

   public static class b extends dxw.c {
      private final hx b;
      private final boolean c;

      public b(rt $$0) {
         super(dwr.b, $$0);
         this.c = $$0.q("tf");
         this.b = hx.b($$0.h("D"));
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, dvs $$1, @Nullable hx $$2, dxx.a $$3) {
         super(dwr.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.d() > 3;
      }

      @Nullable
      public static dvs a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }
         dvs $$11 = switch ($$5) {
            default -> new dvs(-1, 0, -4, 3, $$6, 0);
            case d -> new dvs(-1, 0, 0, 3, $$6, 4);
            case e -> new dvs(-4, 0, -1, 0, $$6, 3);
            case f -> new dvs(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         int $$3 = this.g();
         switch (this.b) {
            case c:
            default:
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hx.c, $$3);
               dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hx.e, $$3);
               dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hx.f, $$3);
               break;
            case d:
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hx.d, $$3);
               dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hx.e, $$3);
               dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hx.f, $$3);
               break;
            case e:
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hx.c, $$3);
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hx.d, $$3);
               dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, hx.e, $$3);
               break;
            case f:
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, hx.c, $$3);
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, hx.d, $$3);
               dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, hx.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.i() - 1, hx.c, $$3);
            }

            if ($$2.h()) {
               dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + 3 + 1, this.f.i() + 1, hx.e, $$3);
            }

            if ($$2.h()) {
               dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + 3 + 1, this.f.i() + 1, hx.f, $$3);
            }

            if ($$2.h()) {
               dxw.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.l() + 1, hx.d, $$3);
            }
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         if (!this.a($$0, $$4)) {
            dgb $$7 = this.a.d();
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

      private void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).i()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }
      }
   }

   abstract static class c extends dwe {
      protected dxx.a a;

      public c(dwr $$0, int $$1, dxx.a $$2, dvs $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(dwr $$0, rt $$1) {
         super($$0, $$1);
         this.a = dxx.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(crc $$0, int $$1, int $$2, int $$3, dvs $$4) {
         dgb $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(cuc.eX);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(cqf $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5) {
         for (int $$6 = $$2; $$6 <= $$3; $$6++) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).i()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(cra $$0, dvs $$1) {
         int $$2 = Math.max(this.f.g() - 1, $$1.g());
         int $$3 = Math.max(this.f.h() - 1, $$1.h());
         int $$4 = Math.max(this.f.i() - 1, $$1.i());
         int $$5 = Math.min(this.f.j() + 1, $$1.j());
         int $$6 = Math.min(this.f.k() + 1, $$1.k());
         int $$7 = Math.min(this.f.l() + 1, $$1.l());
         ht.a $$8 = new ht.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.s($$8).a(aqr.X)) {
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

      protected void a(crt $$0, dvs $$1, dgb $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            ht $$6 = this.b($$3, $$4, $$5);
            dgb $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, hx.b)) {
               $$0.a($$6, $$2, 2);
            }
         }
      }
   }

   public static class d extends dxw.c {
      private final List<dvs> b = Lists.newLinkedList();

      public d(int $$0, ate $$1, int $$2, int $$3, dxx.a $$4) {
         super(dwr.c, $$0, $$4, new dvs($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(rt $$0) {
         super(dwr.c, $$0);
         dvs.a.listOf().parse(sf.a, $$0.c("Entrances", 11)).resultOrPartial(dxw.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
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

            dxw.c $$6 = dxw.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.i() - 1, hx.c, $$3);
            if ($$6 != null) {
               dvs $$7 = $$6.f();
               this.b.add(new dvs($$7.g(), $$7.h(), this.f.i(), $$7.j(), $$7.k(), this.f.i() + 1));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.c()) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dxw.c $$8 = dxw.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.l() + 1, hx.d, $$3);
            if ($$8 != null) {
               dvs $$9 = $$8.f();
               this.b.add(new dvs($$9.g(), $$9.h(), this.f.l() - 1, $$9.j(), $$9.k(), this.f.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dxw.c $$10 = dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, hx.e, $$3);
            if ($$10 != null) {
               dvs $$11 = $$10.f();
               this.b.add(new dvs(this.f.g(), $$11.h(), $$11.i(), this.f.g() + 1, $$11.k(), $$11.l()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.e()) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dwe $$12 = dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, hx.f, $$3);
            if ($$12 != null) {
               dvs $$13 = $$12.f();
               this.b.add(new dvs(this.f.j() - 1, $$13.h(), $$13.i(), this.f.j(), $$13.k(), $$13.l()));
            }

            $$5 += 4;
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.g(), this.f.h() + 1, this.f.i(), this.f.j(), Math.min(this.f.h() + 3, this.f.k()), this.f.l(), e, e, false);

            for (dvs $$7 : this.b) {
               this.a($$0, $$4, $$7.g(), $$7.k() - 2, $$7.i(), $$7.j(), $$7.k(), $$7.l(), e, e, false);
            }

            this.a($$0, $$4, this.f.g(), this.f.h() + 4, this.f.i(), this.f.j(), this.f.k(), this.f.l(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for (dvs $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         dvs.a.listOf().encodeStart(sf.a, this.b).resultOrPartial(dxw.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends dxw.c {
      public e(int $$0, dvs $$1, hx $$2, dxx.a $$3) {
         super(dwr.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(rt $$0) {
         super(dwr.d, $$0);
      }

      @Nullable
      public static dvs a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5) {
         dvs $$9 = switch ($$5) {
            default -> new dvs(0, -5, -8, 2, 2, 0);
            case d -> new dvs(0, -5, 0, 2, 2, 8);
            case e -> new dvs(-8, -5, 0, 0, 2, 2);
            case f -> new dvs(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         int $$3 = this.g();
         hx $$4 = this.i();
         if ($$4 != null) {
            switch ($$4) {
               case c:
               default:
                  dxw.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.i() - 1, hx.c, $$3);
                  break;
               case d:
                  dxw.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.l() + 1, hx.d, $$3);
                  break;
               case e:
                  dxw.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i(), hx.e, $$3);
                  break;
               case f:
                  dxw.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i(), hx.f, $$3);
            }
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
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
