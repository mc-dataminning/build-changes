import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eko {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static eko.c a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, @Nullable je $$5, int $$6, ekp.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         eid $$9 = eko.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new eko.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         eid $$10 = eko.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new eko.e($$6, $$10, $$5, $$7);
         }
      } else {
         eid $$11 = eko.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new eko.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static eko.c a(eip $$0, eiq $$1, azh $$2, int $$3, int $$4, int $$5, je $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 80 && Math.abs($$5 - $$0.f().j()) <= 80) {
         ekp.a $$8 = ((eko.c)$$0).a;
         eko.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends eko.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(us $$0) {
         super(ejc.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, azh $$1, eid $$2, je $$3, ekp.a $$4) {
         super(ejc.a, $$0, $$4, $$2);
         this.a($$3);
         this.b = $$1.a(3) == 0;
         this.c = !this.b && $$1.a(23) == 0;
         if (this.i().o() == je.a.c) {
            this.h = $$2.f() / 5;
         } else {
            this.h = $$2.d() / 5;
         }
      }

      @Nullable
      public static eid a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5) {
         for (int $$6 = $$1.a(3) + 2; $$6 > 0; $$6--) {
            int $$7 = $$6 * 5;

            eid $$11 = switch ($$5) {
               default -> new eid(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new eid(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new eid(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new eid(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     eko.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.j() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.j(), je.e, $$3);
                  } else {
                     eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.j(), je.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     eko.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.m() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.m() - 3, je.e, $$3);
                  } else {
                     eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.m() - 3, je.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.j(), $$5, $$3);
                  } else if ($$4 == 2) {
                     eko.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.j() - 1, je.c, $$3);
                  } else {
                     eko.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.m() + 1, je.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.j(), $$5, $$3);
                  } else if ($$4 == 2) {
                     eko.a($$0, $$1, $$2, this.f.k() - 3, this.f.i() - 1 + $$2.a(3), this.f.j() - 1, je.c, $$3);
                  } else {
                     eko.a($$0, $$1, $$2, this.f.k() - 3, this.f.i() - 1 + $$2.a(3), this.f.m() + 1, je.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != je.c && $$5 != je.d) {
               for (int $$8 = this.f.h() + 3; $$8 + 3 <= this.f.k(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     eko.a($$0, $$1, $$2, $$8, this.f.i(), this.f.j() - 1, je.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     eko.a($$0, $$1, $$2, $$8, this.f.i(), this.f.m() + 1, je.d, $$3 + 1);
                  }
               }
            } else {
               for (int $$6 = this.f.j() + 3; $$6 + 3 <= this.f.m(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), $$6, je.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), $$6, je.f, $$3 + 1);
                  }
               }
            }
         }
      }

      @Override
      protected boolean a(dcu $$0, eid $$1, azh $$2, int $$3, int $$4, int $$5, ale<eqo> $$6) {
         iz $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).i() && !$$0.a_($$7.d()).i()) {
            dsd $$8 = dfc.cP.o().a(dkz.e, $$2.h() ? dth.a : dth.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            cpb $$9 = new cpb($$0.E(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            dsd $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, dfc.bs.o(), e, false, true);
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
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, eqf.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, eqf.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  iz $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, dfc.ct.o(), 2);
                     if ($$0.c_($$17) instanceof dqw $$19) {
                        $$19.a(btb.q, $$3);
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
               dsd $$24 = dfc.cP.o().a(dkz.e, dth.a);

               for (int $$25 = 0; $$25 <= $$11; $$25++) {
                  dsd $$26 = this.a($$0, 1, -1, $$25, $$4);
                  if (!$$26.i() && $$26.i($$0, this.b(1, -1, $$25))) {
                     float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                  }
               }
            }
         }
      }

      private void a(dcu $$0, eid $$1, int $$2, int $$3, int $$4) {
         dsd $$5 = this.a.b();
         dsd $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }
      }

      @Override
      protected void b(dcu $$0, dsd $$1, int $$2, int $$3, int $$4, eid $$5) {
         iz.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();

            while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
               $$6.c(je.a);
            }

            if (this.a($$0, $$6, $$0.a_($$6))) {
               while ($$6.v() < $$7) {
                  $$6.c(je.b);
                  $$0.a($$6, $$1, 2);
               }
            }
         }
      }

      protected void c(dcu $$0, dsd $$1, int $$2, int $$3, int $$4, eid $$5) {
         iz.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for (boolean $$10 = true; $$9 || $$10; $$8++) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  dsd $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(dfc.H);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.I_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  dsd $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, dfc.eX.o(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.am() - 1;
               }
            }
         }
      }

      private static void a(dcu $$0, dsd $$1, iz.a $$2, int $$3, int $$4) {
         for (int $$5 = $$3; $$5 < $$4; $$5++) {
            $$0.a($$2.q($$5), $$1, 2);
         }
      }

      private boolean a(dcc $$0, iz $$1, dsd $$2) {
         return $$2.d($$0, $$1, je.b);
      }

      private boolean b(dcc $$0, iz $$1, dsd $$2) {
         return dfa.a($$0, $$1, je.a) && !($$2.b() instanceof dhw);
      }

      private void a(dcu $$0, eid $$1, int $$2, int $$3, int $$4, int $$5, int $$6, azh $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            dsd $$8 = this.a.d();
            dsd $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(dhy.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(dhy.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, dfc.cq.o().a(doc.g, je.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, dfc.cq.o().a(doc.g, je.c));
            }
         }
      }

      private void a(dcu $$0, eid $$1, azh $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, dfc.bs.o(), $$4, $$5, $$6, $$1);
         }
      }

      private boolean a(dcu $$0, eid $$1, int $$2, int $$3, int $$4, int $$5) {
         iz.a $$6 = this.b($$2, $$3, $$4);
         int $$7 = 0;

         for (je $$8 : je.values()) {
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

   public static class b extends eko.c {
      private final je b;
      private final boolean c;

      public b(us $$0) {
         super(ejc.b, $$0);
         this.c = $$0.q("tf");
         this.b = je.b($$0.h("D"));
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, eid $$1, @Nullable je $$2, ekp.a $$3) {
         super(ejc.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.e() > 3;
      }

      @Nullable
      public static eid a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }
         eid $$11 = switch ($$5) {
            default -> new eid(-1, 0, -4, 3, $$6, 0);
            case d -> new eid(-1, 0, 0, 3, $$6, 4);
            case e -> new eid(-4, 0, -1, 0, $$6, 3);
            case f -> new eid(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         int $$3 = this.g();
         switch (this.b) {
            case c:
            default:
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, je.c, $$3);
               eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, je.e, $$3);
               eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, je.f, $$3);
               break;
            case d:
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, je.d, $$3);
               eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, je.e, $$3);
               eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, je.f, $$3);
               break;
            case e:
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, je.c, $$3);
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, je.d, $$3);
               eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, je.e, $$3);
               break;
            case f:
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, je.c, $$3);
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, je.d, $$3);
               eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, je.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i() + 3 + 1, this.f.j() - 1, je.c, $$3);
            }

            if ($$2.h()) {
               eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + 3 + 1, this.f.j() + 1, je.e, $$3);
            }

            if ($$2.h()) {
               eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + 3 + 1, this.f.j() + 1, je.f, $$3);
            }

            if ($$2.h()) {
               eko.a($$0, $$1, $$2, this.f.h() + 1, this.f.i() + 3 + 1, this.f.m() + 1, je.d, $$3);
            }
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         if (!this.a($$0, $$4)) {
            dsd $$7 = this.a.d();
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

      private void a(dcu $$0, eid $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).i()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }
      }
   }

   abstract static class c extends eip {
      protected ekp.a a;

      public c(ejc $$0, int $$1, ekp.a $$2, eid $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(ejc $$0, us $$1) {
         super($$0, $$1);
         this.a = ekp.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(dcc $$0, int $$1, int $$2, int $$3, eid $$4) {
         dsd $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(dfc.eX);
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(dbf $$0, eid $$1, int $$2, int $$3, int $$4, int $$5) {
         for (int $$6 = $$2; $$6 <= $$3; $$6++) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).i()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(dca $$0, eid $$1) {
         int $$2 = Math.max(this.f.h() - 1, $$1.h());
         int $$3 = Math.max(this.f.i() - 1, $$1.i());
         int $$4 = Math.max(this.f.j() - 1, $$1.j());
         int $$5 = Math.min(this.f.k() + 1, $$1.k());
         int $$6 = Math.min(this.f.l() + 1, $$1.l());
         int $$7 = Math.min(this.f.m() + 1, $$1.m());
         iz.a $$8 = new iz.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.t($$8).a(awo.Y)) {
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

      protected void a(dcu $$0, eid $$1, dsd $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            iz $$6 = this.b($$3, $$4, $$5);
            dsd $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, je.b)) {
               $$0.a($$6, $$2, 2);
            }
         }
      }
   }

   public static class d extends eko.c {
      private final List<eid> b = Lists.newLinkedList();

      public d(int $$0, azh $$1, int $$2, int $$3, ekp.a $$4) {
         super(ejc.c, $$0, $$4, new eid($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(us $$0) {
         super(ejc.c, $$0);
         eid.a.listOf().parse(vg.a, $$0.c("Entrances", 11)).resultOrPartial(eko.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
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

            eko.c $$6 = eko.a($$0, $$1, $$2, this.f.h() + $$5, this.f.i() + $$2.a($$4) + 1, this.f.j() - 1, je.c, $$3);
            if ($$6 != null) {
               eid $$7 = $$6.f();
               this.b.add(new eid($$7.h(), $$7.i(), this.f.j(), $$7.k(), $$7.l(), this.f.j() + 1));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.d()) {
            $$5 += $$2.a(this.f.d());
            if ($$5 + 3 > this.f.d()) {
               break;
            }

            eko.c $$8 = eko.a($$0, $$1, $$2, this.f.h() + $$5, this.f.i() + $$2.a($$4) + 1, this.f.m() + 1, je.d, $$3);
            if ($$8 != null) {
               eid $$9 = $$8.f();
               this.b.add(new eid($$9.h(), $$9.i(), this.f.m() - 1, $$9.k(), $$9.l(), this.f.m()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.f()) {
            $$5 += $$2.a(this.f.f());
            if ($$5 + 3 > this.f.f()) {
               break;
            }

            eko.c $$10 = eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$2.a($$4) + 1, this.f.j() + $$5, je.e, $$3);
            if ($$10 != null) {
               eid $$11 = $$10.f();
               this.b.add(new eid(this.f.h(), $$11.i(), $$11.j(), this.f.h() + 1, $$11.l(), $$11.m()));
            }

            $$5 += 4;
         }

         $$5 = 0;

         while ($$5 < this.f.f()) {
            $$5 += $$2.a(this.f.f());
            if ($$5 + 3 > this.f.f()) {
               break;
            }

            eip $$12 = eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$2.a($$4) + 1, this.f.j() + $$5, je.f, $$3);
            if ($$12 != null) {
               eid $$13 = $$12.f();
               this.b.add(new eid(this.f.k() - 1, $$13.i(), $$13.j(), this.f.k(), $$13.l(), $$13.m()));
            }

            $$5 += 4;
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.h(), this.f.i() + 1, this.f.j(), this.f.k(), Math.min(this.f.i() + 3, this.f.l()), this.f.m(), e, e, false);

            for (eid $$7 : this.b) {
               this.a($$0, $$4, $$7.h(), $$7.l() - 2, $$7.j(), $$7.k(), $$7.l(), $$7.m(), e, e, false);
            }

            this.a($$0, $$4, this.f.h(), this.f.i() + 4, this.f.j(), this.f.k(), this.f.l(), this.f.m(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for (eid $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         eid.a.listOf().encodeStart(vg.a, this.b).resultOrPartial(eko.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends eko.c {
      public e(int $$0, eid $$1, je $$2, ekp.a $$3) {
         super(ejc.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(us $$0) {
         super(ejc.d, $$0);
      }

      @Nullable
      public static eid a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5) {
         eid $$9 = switch ($$5) {
            default -> new eid(0, -5, -8, 2, 2, 0);
            case d -> new eid(0, -5, 0, 2, 2, 8);
            case e -> new eid(-8, -5, 0, 0, 2, 2);
            case f -> new eid(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         int $$3 = this.g();
         je $$4 = this.i();
         if ($$4 != null) {
            switch ($$4) {
               case c:
               default:
                  eko.a($$0, $$1, $$2, this.f.h(), this.f.i(), this.f.j() - 1, je.c, $$3);
                  break;
               case d:
                  eko.a($$0, $$1, $$2, this.f.h(), this.f.i(), this.f.m() + 1, je.d, $$3);
                  break;
               case e:
                  eko.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j(), je.e, $$3);
                  break;
               case f:
                  eko.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j(), je.f, $$3);
            }
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
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
