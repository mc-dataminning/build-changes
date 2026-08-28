import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class foo extends fos<foo.b> {
   private static final ale D = new ale("container/creative_inventory/scroller");
   private static final ale E = new ale("container/creative_inventory/scroller_disabled");
   private static final ale[] F = new ale[]{
      new ale("container/creative_inventory/tab_top_unselected_1"),
      new ale("container/creative_inventory/tab_top_unselected_2"),
      new ale("container/creative_inventory/tab_top_unselected_3"),
      new ale("container/creative_inventory/tab_top_unselected_4"),
      new ale("container/creative_inventory/tab_top_unselected_5"),
      new ale("container/creative_inventory/tab_top_unselected_6"),
      new ale("container/creative_inventory/tab_top_unselected_7")
   };
   private static final ale[] G = new ale[]{
      new ale("container/creative_inventory/tab_top_selected_1"),
      new ale("container/creative_inventory/tab_top_selected_2"),
      new ale("container/creative_inventory/tab_top_selected_3"),
      new ale("container/creative_inventory/tab_top_selected_4"),
      new ale("container/creative_inventory/tab_top_selected_5"),
      new ale("container/creative_inventory/tab_top_selected_6"),
      new ale("container/creative_inventory/tab_top_selected_7")
   };
   private static final ale[] H = new ale[]{
      new ale("container/creative_inventory/tab_bottom_unselected_1"),
      new ale("container/creative_inventory/tab_bottom_unselected_2"),
      new ale("container/creative_inventory/tab_bottom_unselected_3"),
      new ale("container/creative_inventory/tab_bottom_unselected_4"),
      new ale("container/creative_inventory/tab_bottom_unselected_5"),
      new ale("container/creative_inventory/tab_bottom_unselected_6"),
      new ale("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final ale[] I = new ale[]{
      new ale("container/creative_inventory/tab_bottom_selected_1"),
      new ale("container/creative_inventory/tab_bottom_selected_2"),
      new ale("container/creative_inventory/tab_bottom_selected_3"),
      new ale("container/creative_inventory/tab_bottom_selected_4"),
      new ale("container/creative_inventory/tab_bottom_selected_5"),
      new ale("container/creative_inventory/tab_bottom_selected_6"),
      new ale("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String J = "textures/gui/container/creative_inventory/tab_";
   private static final int K = 5;
   private static final int L = 9;
   private static final int M = 26;
   private static final int N = 32;
   private static final int O = 12;
   private static final int P = 15;
   static final brb Q = new brb(45);
   private static final xo R = xo.c("inventory.binSlot");
   private static final int S = 16777215;
   private static csy T = csz.b();
   private float U;
   private boolean V;
   private fhl W;
   @Nullable
   private List<crn> X;
   @Nullable
   private crn Y;
   private fon Z;
   private boolean aa;
   private boolean ab;
   private final Set<axe<cui>> ac = new HashSet<>();
   private final boolean ad;

   public foo(cmv $$0, cpj $$1, boolean $$2) {
      super(new foo.b($$0), $$0.gc(), xn.a);
      $$0.cb = this.w;
      this.d = 136;
      this.c = 195;
      this.ad = $$2;
      csz.a($$1, this.a($$0), $$0.dP().H_());
   }

   private boolean a(cmv $$0) {
      return $$0.gz() && this.ad;
   }

   private void a(cpj $$0, boolean $$1, jk.a $$2) {
      if (csz.a($$0, $$1, $$2)) {
         for (csy $$3 : csz.d()) {
            Collection<cun> $$4 = $$3.l();
            if ($$3 == T) {
               if ($$3.k() == csy.h.a && $$4.isEmpty()) {
                  this.a(csz.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<cun> $$0) {
      int $$1 = this.w.a(this.U);
      this.w.k.clear();
      if (T.k() == csy.h.d) {
         this.I();
      } else {
         this.w.k.addAll($$0);
      }

      this.U = this.w.e($$1);
      this.w.b(this.U);
   }

   @Override
   public void D() {
      super.D();
      if (this.m != null) {
         if (this.m.s != null) {
            this.a(this.m.s.cz.x(), this.a(this.m.s), this.m.s.dP().H_());
         }

         if (!this.m.q.f()) {
            this.m.a(new fpa(this.m.s));
         }
      }
   }

   @Override
   protected void a(@Nullable crn $$0, int $$1, int $$2, cqb $$3) {
      if (this.a($$0)) {
         this.W.c(false);
         this.W.i(0);
      }

      boolean $$4 = $$3 == cqb.b;
      $$3 = $$1 == -999 && $$3 == cqb.a ? cqb.e : $$3;
      if ($$0 == null && T.k() != csy.h.b && $$3 != cqb.f) {
         if (!this.w.g().e() && this.ab) {
            if ($$2 == 0) {
               this.m.s.a(this.w.g(), true);
               this.m.q.a(this.w.g());
               this.w.b(cun.l);
            }

            if ($$2 == 1) {
               cun $$18 = this.w.g().a(1);
               this.m.s.a($$18, true);
               this.m.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.m.s)) {
            return;
         }

         if ($$0 == this.Y && $$4) {
            for (int $$5 = 0; $$5 < this.m.s.ca.c().size(); $$5++) {
               this.m.q.a(cun.l, $$5);
            }
         } else if (T.k() == csy.h.b) {
            if ($$0 == this.Y) {
               this.w.b(cun.l);
            } else if ($$3 == cqb.e && $$0 != null && $$0.h()) {
               cun $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().j());
               cun $$7 = $$0.g();
               this.m.s.a($$6, true);
               this.m.q.a($$6);
               this.m.q.a($$7, ((foo.c)$$0).a.d);
            } else if ($$3 == cqb.e && !this.w.g().e()) {
               this.m.s.a(this.w.g(), true);
               this.m.q.a(this.w.g());
               this.w.b(cun.l);
            } else {
               this.m.s.ca.a($$0 == null ? $$1 : ((foo.c)$$0).a.d, $$2, $$3, this.m.s);
               this.m.s.ca.d();
            }
         } else if ($$3 != cqb.f && $$0.c == Q) {
            cun $$8 = this.w.g();
            cun $$9 = $$0.g();
            if ($$3 == cqb.c) {
               if (!$$9.e()) {
                  this.m.s.gc().a($$2, $$9.c($$9.j()));
                  this.m.s.ca.d();
               }

               return;
            }

            if ($$3 == cqb.d) {
               if (this.w.g().e() && $$0.h()) {
                  cun $$10 = $$0.g();
                  this.w.b($$10.c($$10.j()));
               }

               return;
            }

            if ($$3 == cqb.e) {
               if (!$$9.e()) {
                  cun $$11 = $$9.c($$2 == 0 ? 1 : $$9.j());
                  this.m.s.a($$11, true);
                  this.m.q.a($$11);
               }

               return;
            }

            if (!$$8.e() && !$$9.e() && cun.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.e($$8.j());
                  } else if ($$8.I() < $$8.j()) {
                     $$8.g(1);
                  }
               } else {
                  $$8.h(1);
               }
            } else if (!$$9.e() && $$8.e()) {
               int $$12 = $$4 ? $$9.j() : $$9.I();
               this.w.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.w.b(cun.l);
            } else if (!this.w.g().e()) {
               this.w.g().h(1);
            }
         } else if (this.w != null) {
            cun $$13 = $$0 == null ? cun.l : this.w.b($$0.d).g();
            this.w.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.m.s);
            if (cps.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.m.q.a(this.w.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cun $$15 = this.w.b($$0.d).g();
               this.m.q.a($$15, $$0.d - this.w.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cqb.c) {
                  this.m.q.a($$13, $$16 - this.w.i.size() + 9 + 36);
               } else if ($$3 == cqb.e && !$$13.e()) {
                  cun $$17 = $$13.c($$2 == 0 ? 1 : $$13.j());
                  this.m.s.a($$17, true);
                  this.m.q.a($$17);
               }

               this.m.s.ca.d();
            }
         }
      }
   }

   private boolean a(@Nullable crn $$0) {
      return $$0 != null && $$0.c == Q;
   }

   @Override
   protected void aM_() {
      if (this.m.q.f()) {
         super.aM_();
         this.W = new fhl(this.p, this.z + 82, this.A + 6, 80, 9, xo.c("itemGroup.search"));
         this.W.f(50);
         this.W.d(false);
         this.W.g(false);
         this.W.g(16777215);
         this.d(this.W);
         csy $$0 = T;
         T = csz.b();
         this.a($$0);
         this.m.s.ca.b(this.Z);
         this.Z = new fon(this.m);
         this.m.s.ca.a(this.Z);
         if (!T.i()) {
            this.a(csz.b());
         }
      } else {
         this.m.a(new fpa(this.m.s));
      }
   }

   @Override
   public void a(ffd $$0, int $$1, int $$2) {
      int $$3 = this.w.a(this.U);
      String $$4 = this.W.a();
      this.b($$0, $$1, $$2);
      this.W.a($$4);
      if (!this.W.a().isEmpty()) {
         this.I();
      }

      this.U = this.w.e($$3);
      this.w.b(this.U);
   }

   @Override
   public void j() {
      super.j();
      if (this.m.s != null && this.m.s.gc() != null) {
         this.m.s.ca.b(this.Z);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.aa) {
         return false;
      } else if (T.k() != csy.h.d) {
         return false;
      } else {
         String $$2 = this.W.a();
         if (this.W.a($$0, $$1)) {
            if (!Objects.equals($$2, this.W.a())) {
               this.I();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.aa = false;
      if (T.k() != csy.h.d) {
         if (this.m.m.J.a($$0, $$1)) {
            this.aa = true;
            this.a(csz.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.y) || this.y.h();
         boolean $$4 = eyr.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.aa = true;
            return true;
         } else {
            String $$5 = this.W.a();
            if (this.W.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.W.a())) {
                  this.I();
               }

               return true;
            } else {
               return this.W.aI_() && this.W.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.aa = false;
      return super.c($$0, $$1, $$2);
   }

   private void I() {
      this.w.k.clear();
      this.ac.clear();
      String $$0 = this.W.a();
      if ($$0.isEmpty()) {
         this.w.k.addAll(T.l());
      } else {
         gsy<cun> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.m.a(gsx.b);
            this.a($$0);
         } else {
            $$1 = this.m.a(gsx.a);
         }

         this.w.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.U = 0.0F;
      this.w.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<ale> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lp.h.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.ac::add);
   }

   @Override
   protected void b(fgp $$0, int $$1, int $$2) {
      if (T.d()) {
         $$0.a(this.p, T.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.z;
         double $$4 = $$1 - (double)this.A;

         for (csy $$5 : csz.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (T.k() != csy.h.b && this.b($$0, $$1)) {
            this.V = this.K();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.z;
         double $$4 = $$1 - (double)this.A;
         this.V = false;

         for (csy $$5 : csz.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean K() {
      return T.e() && this.w.m();
   }

   private void a(csy $$0) {
      csy $$1 = T;
      T = $$0;
      this.B.clear();
      this.w.k.clear();
      this.m();
      if (T.k() == csy.h.c) {
         fez $$2 = this.m.aC();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gcq $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cun $$6 = new cun(cuq.qO);
                     $$6.b(km.r, baa.a);
                     xo $$7 = this.m.m.T[$$3].k();
                     xo $$8 = this.m.m.U.k();
                     $$6.b(km.g, xo.a("inventory.hotbarInfo", $$8, $$7));
                     this.w.k.add($$6);
                  } else {
                     this.w.k.add(cun.l);
                  }
               }
            } else {
               this.w.k.addAll($$4.a(this.m.r.H_()));
            }
         }
      } else if (T.k() == csy.h.a) {
         this.w.k.addAll(T.l());
      }

      if (T.k() == csy.h.b) {
         cps $$9 = this.m.s.ca;
         if (this.X == null) {
            this.X = ImmutableList.copyOf(this.w.i);
         }

         this.w.i.clear();

         for (int $$10 = 0; $$10 < $$9.i.size(); $$10++) {
            int $$14;
            int $$15;
            if ($$10 >= 5 && $$10 < 9) {
               int $$11 = $$10 - 5;
               int $$12 = $$11 / 2;
               int $$13 = $$11 % 2;
               $$14 = 54 + $$12 * 54;
               $$15 = 6 + $$13 * 27;
            } else if ($$10 >= 0 && $$10 < 5) {
               $$14 = -2000;
               $$15 = -2000;
            } else if ($$10 == 45) {
               $$14 = 35;
               $$15 = 20;
            } else {
               int $$20 = $$10 - 9;
               int $$21 = $$20 % 9;
               int $$22 = $$20 / 9;
               $$14 = 9 + $$21 * 18;
               if ($$10 >= 36) {
                  $$15 = 112;
               } else {
                  $$15 = 54 + $$22 * 18;
               }
            }

            crn $$26 = new foo.c($$9.i.get($$10), $$10, $$14, $$15);
            this.w.i.add($$26);
         }

         this.Y = new crn(Q, 0, 173, 112);
         this.w.i.add(this.Y);
      } else if ($$1.k() == csy.h.b) {
         this.w.i.clear();
         this.w.i.addAll(this.X);
         this.X = null;
      }

      if (T.k() == csy.h.d) {
         this.W.g(true);
         this.W.f(false);
         this.W.a(true);
         if ($$1 != $$0) {
            this.W.a("");
         }

         this.I();
      } else {
         this.W.g(false);
         this.W.f(true);
         this.W.a(false);
         this.W.a("");
      }

      this.U = 0.0F;
      this.w.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.K()) {
         return false;
      } else {
         this.U = this.w.a(this.U, $$3);
         this.w.b(this.U);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      this.ab = $$5 && !this.a(T, $$0, $$1);
      return this.ab;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.z;
      int $$3 = this.A;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.V) {
         int $$5 = this.A + 18;
         int $$6 = $$5 + 112;
         this.U = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.U = ayx.a(this.U, 0.0F, 1.0F);
         this.w.b(this.U);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (csy $$4 : csz.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.Y != null && T.k() == csy.h.b && this.a(this.Y.e, this.Y.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, R, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<xo> a(cun $$0) {
      boolean $$1 = this.y != null && this.y instanceof foo.a;
      boolean $$2 = T.k() == csy.h.a;
      boolean $$3 = T.k() == csy.h.d;
      cwg.a $$4 = this.m.m.m ? cwg.a.b : cwg.a.a;
      cwg $$5 = $$1 ? $$4.c() : $$4;
      List<xo> $$6 = $$0.a(cui.b.a(this.m.r), this.m.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<xo> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ac.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, xo.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (csy $$9 : csz.c()) {
            if ($$9.k() != csy.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fgp $$0, float $$1, int $$2, int $$3) {
      for (csy $$4 : csz.c()) {
         if ($$4 != T) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new ale("textures/gui/container/creative_inventory/tab_" + T.c()), this.z, this.A, 0, 0, this.c, this.d);
      this.W.a($$0, $$2, $$3, $$1);
      int $$5 = this.z + 175;
      int $$6 = this.A + 18;
      int $$7 = $$6 + 112;
      if (T.e()) {
         ale $$8 = this.K() ? D : E;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.U), 12, 15);
      }

      this.a($$0, T);
      if (T.k() == csy.h.b) {
         fpa.a($$0, this.z + 73, this.A + 6, this.z + 105, this.A + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.s);
      }
   }

   private int b(csy $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(csy $$0) {
      int $$1 = 0;
      if ($$0.g() == csy.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.d;
      }

      return $$1;
   }

   protected boolean a(csy $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fgp $$0, csy $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fgp $$0, csy $$1) {
      boolean $$2 = $$1 == T;
      boolean $$3 = $$1.g() == csy.f.a;
      int $$4 = $$1.f();
      int $$5 = this.z + this.b($$1);
      int $$6 = this.A - ($$3 ? 28 : -(this.d - 4));
      ale[] $$7;
      if ($$3) {
         $$7 = $$2 ? G : F;
      } else {
         $$7 = $$2 ? I : H;
      }

      $$0.a($$7[ayx.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cun $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return T.k() == csy.h.b;
   }

   public static void a(ffd $$0, int $$1, boolean $$2, boolean $$3) {
      gco $$4 = $$0.s;
      jw $$5 = $$4.dP().H_();
      fez $$6 = $$0.aC();
      gcq $$7 = $$6.a($$1);
      if ($$2) {
         List<cun> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cmu.g(); $$9++) {
            cun $$10 = $$8.get($$9);
            $$4.gc().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.ca.d();
      } else if ($$3) {
         $$7.a($$4.gc(), $$5);
         xo $$11 = $$0.m.T[$$1].k();
         xo $$12 = $$0.m.V.k();
         xo $$13 = xo.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aX().c($$13);
         $$6.a();
      }
   }

   static class a extends crn {
      public a(bql $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmv $$0) {
         cun $$1 = this.g();
         return super.a($$0) && !$$1.e() ? $$1.a($$0.dP().J()) && !$$1.b(km.r) : $$1.e();
      }
   }

   public static class b extends cps {
      public final jr<cun> k = jr.a();
      private final cps l;

      public b(cmv $$0) {
         super(null, 0);
         this.l = $$0.ca;
         cmu $$1 = $$0.gc();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new foo.a(foo.Q, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crn($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cmv $$0) {
         return true;
      }

      protected int l() {
         return ayx.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return ayx.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return ayx.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  foo.Q.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  foo.Q.a($$3 + $$2 * 9, cun.l);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public cun a(cmv $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            crn $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cun.l);
            }
         }

         return cun.l;
      }

      @Override
      public boolean a(cun $$0, crn $$1) {
         return $$1.c != foo.Q;
      }

      @Override
      public boolean b(crn $$0) {
         return $$0.c != foo.Q;
      }

      @Override
      public cun g() {
         return this.l.g();
      }

      @Override
      public void b(cun $$0) {
         this.l.b($$0);
      }
   }

   static class c extends crn {
      final crn a;

      public c(crn $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cmv $$0, cun $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cun $$0) {
         return this.a.a($$0);
      }

      @Override
      public cun g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cun $$0, cun $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cun $$0) {
         this.a.f($$0);
      }

      @Override
      public void b() {
         this.a.b();
      }

      @Override
      public int a() {
         return this.a.a();
      }

      @Override
      public int a_(cun $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<ale, ale> c() {
         return this.a.c();
      }

      @Override
      public cun a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cmv $$0) {
         return this.a.a($$0);
      }
   }
}
