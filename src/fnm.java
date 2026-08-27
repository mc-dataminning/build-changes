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

public class fnm extends fnp<fnm.b> {
   private static final akn D = new akn("container/creative_inventory/scroller");
   private static final akn E = new akn("container/creative_inventory/scroller_disabled");
   private static final akn[] F = new akn[]{
      new akn("container/creative_inventory/tab_top_unselected_1"),
      new akn("container/creative_inventory/tab_top_unselected_2"),
      new akn("container/creative_inventory/tab_top_unselected_3"),
      new akn("container/creative_inventory/tab_top_unselected_4"),
      new akn("container/creative_inventory/tab_top_unselected_5"),
      new akn("container/creative_inventory/tab_top_unselected_6"),
      new akn("container/creative_inventory/tab_top_unselected_7")
   };
   private static final akn[] G = new akn[]{
      new akn("container/creative_inventory/tab_top_selected_1"),
      new akn("container/creative_inventory/tab_top_selected_2"),
      new akn("container/creative_inventory/tab_top_selected_3"),
      new akn("container/creative_inventory/tab_top_selected_4"),
      new akn("container/creative_inventory/tab_top_selected_5"),
      new akn("container/creative_inventory/tab_top_selected_6"),
      new akn("container/creative_inventory/tab_top_selected_7")
   };
   private static final akn[] H = new akn[]{
      new akn("container/creative_inventory/tab_bottom_unselected_1"),
      new akn("container/creative_inventory/tab_bottom_unselected_2"),
      new akn("container/creative_inventory/tab_bottom_unselected_3"),
      new akn("container/creative_inventory/tab_bottom_unselected_4"),
      new akn("container/creative_inventory/tab_bottom_unselected_5"),
      new akn("container/creative_inventory/tab_bottom_unselected_6"),
      new akn("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final akn[] I = new akn[]{
      new akn("container/creative_inventory/tab_bottom_selected_1"),
      new akn("container/creative_inventory/tab_bottom_selected_2"),
      new akn("container/creative_inventory/tab_bottom_selected_3"),
      new akn("container/creative_inventory/tab_bottom_selected_4"),
      new akn("container/creative_inventory/tab_bottom_selected_5"),
      new akn("container/creative_inventory/tab_bottom_selected_6"),
      new akn("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String J = "textures/gui/container/creative_inventory/tab_";
   private static final int K = 5;
   private static final int L = 9;
   private static final int M = 26;
   private static final int N = 32;
   private static final int O = 12;
   private static final int P = 15;
   static final bqf Q = new bqf(45);
   private static final wx R = wx.c("inventory.binSlot");
   private static final int S = 16777215;
   private static csb T = csc.b();
   private float U;
   private boolean V;
   private fgj W;
   @Nullable
   private List<cqq> X;
   @Nullable
   private cqq Y;
   private fnl Z;
   private boolean aa;
   private boolean ab;
   private final Set<awm<ctl>> ac = new HashSet<>();
   private final boolean ad;

   public fnm(cly $$0, col $$1, boolean $$2) {
      super(new fnm.b($$0), $$0.gc(), ww.a);
      $$0.cb = this.w;
      this.d = 136;
      this.c = 195;
      this.ad = $$2;
      csc.a($$1, this.a($$0), $$0.dP().H_());
   }

   private boolean a(cly $$0) {
      return $$0.gz() && this.ad;
   }

   private void a(col $$0, boolean $$1, iz.a $$2) {
      if (csc.a($$0, $$1, $$2)) {
         for (csb $$3 : csc.d()) {
            Collection<ctq> $$4 = $$3.l();
            if ($$3 == T) {
               if ($$3.k() == csb.h.a && $$4.isEmpty()) {
                  this.a(csc.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<ctq> $$0) {
      int $$1 = this.w.a(this.U);
      this.w.k.clear();
      if (T.k() == csb.h.d) {
         this.F();
      } else {
         this.w.k.addAll($$0);
      }

      this.U = this.w.e($$1);
      this.w.b(this.U);
   }

   @Override
   public void C() {
      super.C();
      if (this.m != null) {
         if (this.m.s != null) {
            this.a(this.m.s.cz.y(), this.a(this.m.s), this.m.s.dP().H_());
         }

         if (!this.m.q.f()) {
            this.m.a(new fnx(this.m.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cqq $$0, int $$1, int $$2, cpe $$3) {
      if (this.a($$0)) {
         this.W.c(false);
         this.W.i(0);
      }

      boolean $$4 = $$3 == cpe.b;
      $$3 = $$1 == -999 && $$3 == cpe.a ? cpe.e : $$3;
      if ($$0 == null && T.k() != csb.h.b && $$3 != cpe.f) {
         if (!this.w.g().e() && this.ab) {
            if ($$2 == 0) {
               this.m.s.a(this.w.g(), true);
               this.m.q.a(this.w.g());
               this.w.b(ctq.i);
            }

            if ($$2 == 1) {
               ctq $$18 = this.w.g().a(1);
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
               this.m.q.a(ctq.i, $$5);
            }
         } else if (T.k() == csb.h.b) {
            if ($$0 == this.Y) {
               this.w.b(ctq.i);
            } else if ($$3 == cpe.e && $$0 != null && $$0.h()) {
               ctq $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().j());
               ctq $$7 = $$0.g();
               this.m.s.a($$6, true);
               this.m.q.a($$6);
               this.m.q.a($$7, ((fnm.c)$$0).a.d);
            } else if ($$3 == cpe.e && !this.w.g().e()) {
               this.m.s.a(this.w.g(), true);
               this.m.q.a(this.w.g());
               this.w.b(ctq.i);
            } else {
               this.m.s.ca.a($$0 == null ? $$1 : ((fnm.c)$$0).a.d, $$2, $$3, this.m.s);
               this.m.s.ca.d();
            }
         } else if ($$3 != cpe.f && $$0.c == Q) {
            ctq $$8 = this.w.g();
            ctq $$9 = $$0.g();
            if ($$3 == cpe.c) {
               if (!$$9.e()) {
                  this.m.s.gc().a($$2, $$9.c($$9.j()));
                  this.m.s.ca.d();
               }

               return;
            }

            if ($$3 == cpe.d) {
               if (this.w.g().e() && $$0.h()) {
                  ctq $$10 = $$0.g();
                  this.w.b($$10.c($$10.j()));
               }

               return;
            }

            if ($$3 == cpe.e) {
               if (!$$9.e()) {
                  ctq $$11 = $$9.c($$2 == 0 ? 1 : $$9.j());
                  this.m.s.a($$11, true);
                  this.m.q.a($$11);
               }

               return;
            }

            if (!$$8.e() && !$$9.e() && ctq.c($$8, $$9)) {
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
               this.w.b(ctq.i);
            } else if (!this.w.g().e()) {
               this.w.g().h(1);
            }
         } else if (this.w != null) {
            ctq $$13 = $$0 == null ? ctq.i : this.w.b($$0.d).g();
            this.w.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.m.s);
            if (cov.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.m.q.a(this.w.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               ctq $$15 = this.w.b($$0.d).g();
               this.m.q.a($$15, $$0.d - this.w.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cpe.c) {
                  this.m.q.a($$13, $$16 - this.w.i.size() + 9 + 36);
               } else if ($$3 == cpe.e && !$$13.e()) {
                  ctq $$17 = $$13.c($$2 == 0 ? 1 : $$13.j());
                  this.m.s.a($$17, true);
                  this.m.q.a($$17);
               }

               this.m.s.ca.d();
            }
         }
      }
   }

   private boolean a(@Nullable cqq $$0) {
      return $$0 != null && $$0.c == Q;
   }

   @Override
   protected void aN_() {
      if (this.m.q.f()) {
         super.aN_();
         this.W = new fgj(this.p, this.z + 82, this.A + 6, 80, 9, wx.c("itemGroup.search"));
         this.W.f(50);
         this.W.d(false);
         this.W.g(false);
         this.W.g(16777215);
         this.d(this.W);
         csb $$0 = T;
         T = csc.b();
         this.a($$0);
         this.m.s.ca.b(this.Z);
         this.Z = new fnl(this.m);
         this.m.s.ca.a(this.Z);
         if (!T.i()) {
            this.a(csc.b());
         }
      } else {
         this.m.a(new fnx(this.m.s));
      }
   }

   @Override
   public void a(feb $$0, int $$1, int $$2) {
      int $$3 = this.w.a(this.U);
      String $$4 = this.W.a();
      this.b($$0, $$1, $$2);
      this.W.a($$4);
      if (!this.W.a().isEmpty()) {
         this.F();
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
      } else if (T.k() != csb.h.d) {
         return false;
      } else {
         String $$2 = this.W.a();
         if (this.W.a($$0, $$1)) {
            if (!Objects.equals($$2, this.W.a())) {
               this.F();
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
      if (T.k() != csb.h.d) {
         if (this.m.m.J.a($$0, $$1)) {
            this.aa = true;
            this.a(csc.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.y) || this.y.h();
         boolean $$4 = exp.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.aa = true;
            return true;
         } else {
            String $$5 = this.W.a();
            if (this.W.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.W.a())) {
                  this.F();
               }

               return true;
            } else {
               return this.W.aJ_() && this.W.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.aa = false;
      return super.c($$0, $$1, $$2);
   }

   private void F() {
      this.w.k.clear();
      this.ac.clear();
      String $$0 = this.W.a();
      if ($$0.isEmpty()) {
         this.w.k.addAll(T.l());
      } else {
         grw<ctq> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.m.a(grv.b);
            this.a($$0);
         } else {
            $$1 = this.m.a(grv.a);
         }

         this.w.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.U = 0.0F;
      this.w.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<akn> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      le.h.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.ac::add);
   }

   @Override
   protected void b(ffn $$0, int $$1, int $$2) {
      if (T.d()) {
         $$0.a(this.p, T.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.z;
         double $$4 = $$1 - (double)this.A;

         for (csb $$5 : csc.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (T.k() != csb.h.b && this.b($$0, $$1)) {
            this.V = this.J();
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

         for (csb $$5 : csc.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean J() {
      return T.e() && this.w.m();
   }

   private void a(csb $$0) {
      csb $$1 = T;
      T = $$0;
      this.B.clear();
      this.w.k.clear();
      this.m();
      if (T.k() == csb.h.c) {
         fdx $$2 = this.m.aC();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gbo $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     ctq $$6 = new ctq(ctt.qO);
                     $$6.b(kb.r, azh.a);
                     wx $$7 = this.m.m.T[$$3].k();
                     wx $$8 = this.m.m.U.k();
                     $$6.b(kb.g, wx.a("inventory.hotbarInfo", $$8, $$7));
                     this.w.k.add($$6);
                  } else {
                     this.w.k.add(ctq.i);
                  }
               }
            } else {
               this.w.k.addAll($$4.a(this.m.r.H_()));
            }
         }
      } else if (T.k() == csb.h.a) {
         this.w.k.addAll(T.l());
      }

      if (T.k() == csb.h.b) {
         cov $$9 = this.m.s.ca;
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

            cqq $$26 = new fnm.c($$9.i.get($$10), $$10, $$14, $$15);
            this.w.i.add($$26);
         }

         this.Y = new cqq(Q, 0, 173, 112);
         this.w.i.add(this.Y);
      } else if ($$1.k() == csb.h.b) {
         this.w.i.clear();
         this.w.i.addAll(this.X);
         this.X = null;
      }

      if (T.k() == csb.h.d) {
         this.W.g(true);
         this.W.f(false);
         this.W.a(true);
         if ($$1 != $$0) {
            this.W.a("");
         }

         this.F();
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
      if (!this.J()) {
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
         this.U = ayf.a(this.U, 0.0F, 1.0F);
         this.w.b(this.U);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (csb $$4 : csc.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.Y != null && T.k() == csb.h.b && this.a(this.Y.e, this.Y.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, R, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<wx> a(ctq $$0) {
      boolean $$1 = this.y != null && this.y instanceof fnm.a;
      boolean $$2 = T.k() == csb.h.a;
      boolean $$3 = T.k() == csb.h.d;
      cvj.a $$4 = this.m.m.m ? cvj.a.b : cvj.a.a;
      cvj $$5 = $$1 ? $$4.c() : $$4;
      List<wx> $$6 = $$0.a(ctl.b.a(this.m.r), this.m.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<wx> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ac.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, wx.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (csb $$9 : csc.c()) {
            if ($$9.k() != csb.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(ffn $$0, float $$1, int $$2, int $$3) {
      for (csb $$4 : csc.c()) {
         if ($$4 != T) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new akn("textures/gui/container/creative_inventory/tab_" + T.c()), this.z, this.A, 0, 0, this.c, this.d);
      this.W.a($$0, $$2, $$3, $$1);
      int $$5 = this.z + 175;
      int $$6 = this.A + 18;
      int $$7 = $$6 + 112;
      if (T.e()) {
         akn $$8 = this.J() ? D : E;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.U), 12, 15);
      }

      this.a($$0, T);
      if (T.k() == csb.h.b) {
         fnx.a($$0, this.z + 73, this.A + 6, this.z + 105, this.A + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.s);
      }
   }

   private int b(csb $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(csb $$0) {
      int $$1 = 0;
      if ($$0.g() == csb.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.d;
      }

      return $$1;
   }

   protected boolean a(csb $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(ffn $$0, csb $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(ffn $$0, csb $$1) {
      boolean $$2 = $$1 == T;
      boolean $$3 = $$1.g() == csb.f.a;
      int $$4 = $$1.f();
      int $$5 = this.z + this.b($$1);
      int $$6 = this.A - ($$3 ? 28 : -(this.d - 4));
      akn[] $$7;
      if ($$3) {
         $$7 = $$2 ? G : F;
      } else {
         $$7 = $$2 ? I : H;
      }

      $$0.a($$7[ayf.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      ctq $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean E() {
      return T.k() == csb.h.b;
   }

   public static void a(feb $$0, int $$1, boolean $$2, boolean $$3) {
      gbm $$4 = $$0.s;
      jl $$5 = $$4.dP().H_();
      fdx $$6 = $$0.aC();
      gbo $$7 = $$6.a($$1);
      if ($$2) {
         List<ctq> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < clx.g(); $$9++) {
            ctq $$10 = $$8.get($$9);
            $$4.gc().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.ca.d();
      } else if ($$3) {
         $$7.a($$4.gc(), $$5);
         wx $$11 = $$0.m.T[$$1].k();
         wx $$12 = $$0.m.V.k();
         wx $$13 = wx.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aX().c($$13);
         $$6.a();
      }
   }

   static class a extends cqq {
      public a(bpp $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cly $$0) {
         ctq $$1 = this.g();
         return super.a($$0) && !$$1.e() ? $$1.a($$0.dP().J()) && !$$1.b(kb.r) : $$1.e();
      }
   }

   public static class b extends cov {
      public final jg<ctq> k = jg.a();
      private final cov l;

      public b(cly $$0) {
         super(null, 0);
         this.l = $$0.ca;
         clx $$1 = $$0.gc();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fnm.a(fnm.Q, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqq($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cly $$0) {
         return true;
      }

      protected int l() {
         return ayf.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return ayf.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return ayf.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fnm.Q.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fnm.Q.a($$3 + $$2 * 9, ctq.i);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public ctq a(cly $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cqq $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(ctq.i);
            }
         }

         return ctq.i;
      }

      @Override
      public boolean a(ctq $$0, cqq $$1) {
         return $$1.c != fnm.Q;
      }

      @Override
      public boolean b(cqq $$0) {
         return $$0.c != fnm.Q;
      }

      @Override
      public ctq g() {
         return this.l.g();
      }

      @Override
      public void b(ctq $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cqq {
      final cqq a;

      public c(cqq $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cly $$0, ctq $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(ctq $$0) {
         return this.a.a($$0);
      }

      @Override
      public ctq g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(ctq $$0, ctq $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(ctq $$0) {
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
      public int a_(ctq $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<akn, akn> c() {
         return this.a.c();
      }

      @Override
      public ctq a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cly $$0) {
         return this.a.a($$0);
      }
   }
}
