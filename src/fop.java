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

public class fop extends fot<fop.b> {
   private static final akk D = new akk("container/creative_inventory/scroller");
   private static final akk E = new akk("container/creative_inventory/scroller_disabled");
   private static final akk[] F = new akk[]{
      new akk("container/creative_inventory/tab_top_unselected_1"),
      new akk("container/creative_inventory/tab_top_unselected_2"),
      new akk("container/creative_inventory/tab_top_unselected_3"),
      new akk("container/creative_inventory/tab_top_unselected_4"),
      new akk("container/creative_inventory/tab_top_unselected_5"),
      new akk("container/creative_inventory/tab_top_unselected_6"),
      new akk("container/creative_inventory/tab_top_unselected_7")
   };
   private static final akk[] G = new akk[]{
      new akk("container/creative_inventory/tab_top_selected_1"),
      new akk("container/creative_inventory/tab_top_selected_2"),
      new akk("container/creative_inventory/tab_top_selected_3"),
      new akk("container/creative_inventory/tab_top_selected_4"),
      new akk("container/creative_inventory/tab_top_selected_5"),
      new akk("container/creative_inventory/tab_top_selected_6"),
      new akk("container/creative_inventory/tab_top_selected_7")
   };
   private static final akk[] H = new akk[]{
      new akk("container/creative_inventory/tab_bottom_unselected_1"),
      new akk("container/creative_inventory/tab_bottom_unselected_2"),
      new akk("container/creative_inventory/tab_bottom_unselected_3"),
      new akk("container/creative_inventory/tab_bottom_unselected_4"),
      new akk("container/creative_inventory/tab_bottom_unselected_5"),
      new akk("container/creative_inventory/tab_bottom_unselected_6"),
      new akk("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final akk[] I = new akk[]{
      new akk("container/creative_inventory/tab_bottom_selected_1"),
      new akk("container/creative_inventory/tab_bottom_selected_2"),
      new akk("container/creative_inventory/tab_bottom_selected_3"),
      new akk("container/creative_inventory/tab_bottom_selected_4"),
      new akk("container/creative_inventory/tab_bottom_selected_5"),
      new akk("container/creative_inventory/tab_bottom_selected_6"),
      new akk("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String J = "textures/gui/container/creative_inventory/tab_";
   private static final int K = 5;
   private static final int L = 9;
   private static final int M = 26;
   private static final int N = 32;
   private static final int O = 12;
   private static final int P = 15;
   static final bqq Q = new bqq(45);
   private static final wu R = wu.c("inventory.binSlot");
   private static final int S = 16777215;
   private static cso T = csp.b();
   private float U;
   private boolean V;
   private fid W;
   @Nullable
   private List<cre> X;
   @Nullable
   private cre Y;
   private foo Z;
   private boolean aa;
   private boolean ab;
   private final Set<awm<cty>> ac = new HashSet<>();
   private final boolean ad;

   public fop(gdh $$0, coz $$1, boolean $$2) {
      super(new fop.b($$0), $$0.ga(), wt.a);
      $$0.ce = this.w;
      this.q = 136;
      this.c = 195;
      this.ad = $$2;
      this.a($$0.h.B(), $$1, this.a($$0), $$0.dR().H_());
   }

   private boolean a(cml $$0) {
      return $$0.gx() && this.ad;
   }

   private void a(coz $$0, boolean $$1, jl.a $$2) {
      fym $$3 = this.l.L();
      if (this.a($$3 != null ? $$3.B() : null, $$0, $$1, $$2)) {
         for (cso $$4 : csp.d()) {
            Collection<cud> $$5 = $$4.l();
            if ($$4 == T) {
               if ($$4.k() == cso.h.a && $$5.isEmpty()) {
                  this.a(csp.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable fzc $$0, coz $$1, boolean $$2, jl.a $$3) {
      if (!csp.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<cud> $$4 = List.copyOf(csp.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<cud> $$0) {
      int $$1 = this.w.a(this.U);
      this.w.k.clear();
      if (T.k() == cso.h.d) {
         this.G();
      } else {
         this.w.k.addAll($$0);
      }

      this.U = this.w.e($$1);
      this.w.b(this.U);
   }

   @Override
   public void D() {
      super.D();
      if (this.l != null) {
         if (this.l.s != null) {
            this.a(this.l.s.h.x(), this.a(this.l.s), this.l.s.dR().H_());
         }

         if (!this.l.q.f()) {
            this.l.a(new fpb(this.l.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cre $$0, int $$1, int $$2, cps $$3) {
      if (this.a($$0)) {
         this.W.c(false);
         this.W.i(0);
      }

      boolean $$4 = $$3 == cps.b;
      $$3 = $$1 == -999 && $$3 == cps.a ? cps.e : $$3;
      if ($$0 == null && T.k() != cso.h.b && $$3 != cps.f) {
         if (!this.w.g().e() && this.ab) {
            if ($$2 == 0) {
               this.l.s.a(this.w.g(), true);
               this.l.q.a(this.w.g());
               this.w.b(cud.l);
            }

            if ($$2 == 1) {
               cud $$18 = this.w.g().a(1);
               this.l.s.a($$18, true);
               this.l.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.l.s)) {
            return;
         }

         if ($$0 == this.Y && $$4) {
            for (int $$5 = 0; $$5 < this.l.s.cd.c().size(); $$5++) {
               this.l.q.a(cud.l, $$5);
            }
         } else if (T.k() == cso.h.b) {
            if ($$0 == this.Y) {
               this.w.b(cud.l);
            } else if ($$3 == cps.e && $$0 != null && $$0.h()) {
               cud $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().j());
               cud $$7 = $$0.g();
               this.l.s.a($$6, true);
               this.l.q.a($$6);
               this.l.q.a($$7, ((fop.c)$$0).a.d);
            } else if ($$3 == cps.e && !this.w.g().e()) {
               this.l.s.a(this.w.g(), true);
               this.l.q.a(this.w.g());
               this.w.b(cud.l);
            } else {
               this.l.s.cd.a($$0 == null ? $$1 : ((fop.c)$$0).a.d, $$2, $$3, this.l.s);
               this.l.s.cd.d();
            }
         } else if ($$3 != cps.f && $$0.c == Q) {
            cud $$8 = this.w.g();
            cud $$9 = $$0.g();
            if ($$3 == cps.c) {
               if (!$$9.e()) {
                  this.l.s.ga().a($$2, $$9.c($$9.j()));
                  this.l.s.cd.d();
               }

               return;
            }

            if ($$3 == cps.d) {
               if (this.w.g().e() && $$0.h()) {
                  cud $$10 = $$0.g();
                  this.w.b($$10.c($$10.j()));
               }

               return;
            }

            if ($$3 == cps.e) {
               if (!$$9.e()) {
                  cud $$11 = $$9.c($$2 == 0 ? 1 : $$9.j());
                  this.l.s.a($$11, true);
                  this.l.q.a($$11);
               }

               return;
            }

            if (!$$8.e() && !$$9.e() && cud.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.e($$8.j());
                  } else if ($$8.H() < $$8.j()) {
                     $$8.g(1);
                  }
               } else {
                  $$8.h(1);
               }
            } else if (!$$9.e() && $$8.e()) {
               int $$12 = $$4 ? $$9.j() : $$9.H();
               this.w.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.w.b(cud.l);
            } else if (!this.w.g().e()) {
               this.w.g().h(1);
            }
         } else if (this.w != null) {
            cud $$13 = $$0 == null ? cud.l : this.w.b($$0.d).g();
            this.w.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.l.s);
            if (cpi.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.l.q.a(this.w.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cud $$15 = this.w.b($$0.d).g();
               this.l.q.a($$15, $$0.d - this.w.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cps.c) {
                  this.l.q.a($$13, $$16 - this.w.i.size() + 9 + 36);
               } else if ($$3 == cps.e && !$$13.e()) {
                  cud $$17 = $$13.c($$2 == 0 ? 1 : $$13.j());
                  this.l.s.a($$17, true);
                  this.l.q.a($$17);
               }

               this.l.s.cd.d();
            }
         }
      }
   }

   private boolean a(@Nullable cre $$0) {
      return $$0 != null && $$0.c == Q;
   }

   @Override
   protected void aP_() {
      if (this.l.q.f()) {
         super.aP_();
         this.W = new fid(this.o, this.z + 82, this.A + 6, 80, 9, wu.c("itemGroup.search"));
         this.W.f(50);
         this.W.d(false);
         this.W.g(false);
         this.W.g(16777215);
         this.d(this.W);
         cso $$0 = T;
         T = csp.b();
         this.a($$0);
         this.l.s.cd.b(this.Z);
         this.Z = new foo(this.l);
         this.l.s.cd.a(this.Z);
         if (!T.i()) {
            this.a(csp.b());
         }
      } else {
         this.l.a(new fpb(this.l.s));
      }
   }

   @Override
   public void a(ffw $$0, int $$1, int $$2) {
      int $$3 = this.w.a(this.U);
      String $$4 = this.W.a();
      this.b($$0, $$1, $$2);
      this.W.a($$4);
      if (!this.W.a().isEmpty()) {
         this.G();
      }

      this.U = this.w.e($$3);
      this.w.b(this.U);
   }

   @Override
   public void j() {
      super.j();
      if (this.l.s != null && this.l.s.ga() != null) {
         this.l.s.cd.b(this.Z);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.aa) {
         return false;
      } else if (T.k() != cso.h.d) {
         return false;
      } else {
         String $$2 = this.W.a();
         if (this.W.a($$0, $$1)) {
            if (!Objects.equals($$2, this.W.a())) {
               this.G();
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
      if (T.k() != cso.h.d) {
         if (this.l.m.J.a($$0, $$1)) {
            this.aa = true;
            this.a(csp.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.y) || this.y.h();
         boolean $$4 = ezj.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.aa = true;
            return true;
         } else {
            String $$5 = this.W.a();
            if (this.W.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.W.a())) {
                  this.G();
               }

               return true;
            } else {
               return this.W.aK_() && this.W.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.aa = false;
      return super.c($$0, $$1, $$2);
   }

   private void G() {
      this.w.k.clear();
      this.ac.clear();
      String $$0 = this.W.a();
      if ($$0.isEmpty()) {
         this.w.k.addAll(T.l());
      } else {
         fym $$1 = this.l.L();
         if ($$1 != null) {
            fzc $$2 = $$1.B();
            gto<cud> $$3;
            if ($$0.startsWith("#")) {
               $$0 = $$0.substring(1);
               $$3 = $$2.c();
               this.a($$0);
            } else {
               $$3 = $$2.d();
            }

            this.w.k.addAll($$3.search($$0.toLowerCase(Locale.ROOT)));
         }
      }

      this.U = 0.0F;
      this.w.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<akk> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lq.g.k().filter($$1x -> $$2.test($$1x.b())).forEach(this.ac::add);
   }

   @Override
   protected void b(fhh $$0, int $$1, int $$2) {
      if (T.d()) {
         $$0.a(this.o, T.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.z;
         double $$4 = $$1 - (double)this.A;

         for (cso $$5 : csp.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (T.k() != cso.h.b && this.b($$0, $$1)) {
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

         for (cso $$5 : csp.c()) {
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

   private void a(cso $$0) {
      cso $$1 = T;
      T = $$0;
      this.B.clear();
      this.w.k.clear();
      this.m();
      if (T.k() == cso.h.c) {
         ffs $$2 = this.l.aB();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gdj $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cud $$6 = new cud(cug.qO);
                     $$6.b(kn.s, azk.a);
                     wu $$7 = this.l.m.T[$$3].k();
                     wu $$8 = this.l.m.U.k();
                     $$6.b(kn.h, wu.a("inventory.hotbarInfo", $$8, $$7));
                     this.w.k.add($$6);
                  } else {
                     this.w.k.add(cud.l);
                  }
               }
            } else {
               this.w.k.addAll($$4.a(this.l.r.H_()));
            }
         }
      } else if (T.k() == cso.h.a) {
         this.w.k.addAll(T.l());
      }

      if (T.k() == cso.h.b) {
         cpi $$9 = this.l.s.cd;
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

            cre $$26 = new fop.c($$9.i.get($$10), $$10, $$14, $$15);
            this.w.i.add($$26);
         }

         this.Y = new cre(Q, 0, 173, 112);
         this.w.i.add(this.Y);
      } else if ($$1.k() == cso.h.b) {
         this.w.i.clear();
         this.w.i.addAll(this.X);
         this.X = null;
      }

      if (T.k() == cso.h.d) {
         this.W.g(true);
         this.W.f(false);
         this.W.a(true);
         if ($$1 != $$0) {
            this.W.a("");
         }

         this.G();
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
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.q);
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
         this.U = ayg.a(this.U, 0.0F, 1.0F);
         this.w.b(this.U);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cso $$4 : csp.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.Y != null && T.k() == cso.h.b && this.a(this.Y.e, this.Y.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.o, R, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<wu> a(cud $$0) {
      boolean $$1 = this.y != null && this.y instanceof fop.a;
      boolean $$2 = T.k() == cso.h.a;
      boolean $$3 = T.k() == cso.h.d;
      cvw.a $$4 = this.l.m.m ? cvw.a.b : cvw.a.a;
      cvw $$5 = $$1 ? $$4.c() : $$4;
      List<wu> $$6 = $$0.a(cty.b.a(this.l.r), this.l.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<wu> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ac.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, wu.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cso $$9 : csp.c()) {
            if ($$9.k() != cso.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fhh $$0, float $$1, int $$2, int $$3) {
      for (cso $$4 : csp.c()) {
         if ($$4 != T) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new akk("textures/gui/container/creative_inventory/tab_" + T.c()), this.z, this.A, 0, 0, this.c, this.q);
      this.W.a($$0, $$2, $$3, $$1);
      int $$5 = this.z + 175;
      int $$6 = this.A + 18;
      int $$7 = $$6 + 112;
      if (T.e()) {
         akk $$8 = this.K() ? D : E;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.U), 12, 15);
      }

      this.a($$0, T);
      if (T.k() == cso.h.b) {
         fpb.a($$0, this.z + 73, this.A + 6, this.z + 105, this.A + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.l.s);
      }
   }

   private int b(cso $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cso $$0) {
      int $$1 = 0;
      if ($$0.g() == cso.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.q;
      }

      return $$1;
   }

   protected boolean a(cso $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fhh $$0, cso $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.o, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fhh $$0, cso $$1) {
      boolean $$2 = $$1 == T;
      boolean $$3 = $$1.g() == cso.f.a;
      int $$4 = $$1.f();
      int $$5 = this.z + this.b($$1);
      int $$6 = this.A - ($$3 ? 28 : -(this.q - 4));
      akk[] $$7;
      if ($$3) {
         $$7 = $$2 ? G : F;
      } else {
         $$7 = $$2 ? I : H;
      }

      $$0.a($$7[ayg.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cud $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.o, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return T.k() == cso.h.b;
   }

   public static void a(ffw $$0, int $$1, boolean $$2, boolean $$3) {
      gdh $$4 = $$0.s;
      jx $$5 = $$4.dR().H_();
      ffs $$6 = $$0.aB();
      gdj $$7 = $$6.a($$1);
      if ($$2) {
         List<cud> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cmk.g(); $$9++) {
            cud $$10 = $$8.get($$9);
            $$4.ga().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.cd.d();
      } else if ($$3) {
         $$7.a($$4.ga(), $$5);
         wu $$11 = $$0.m.T[$$1].k();
         wu $$12 = $$0.m.V.k();
         wu $$13 = wu.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aV().c($$13);
         $$6.a();
      }
   }

   static class a extends cre {
      public a(bqa $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cml $$0) {
         cud $$1 = this.g();
         return super.a($$0) && !$$1.e() ? $$1.a($$0.dR().J()) && !$$1.b(kn.s) : $$1.e();
      }
   }

   public static class b extends cpi {
      public final js<cud> k = js.a();
      private final cpi l;

      public b(cml $$0) {
         super(null, 0);
         this.l = $$0.cd;
         cmk $$1 = $$0.ga();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fop.a(fop.Q, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean b(cml $$0) {
         return true;
      }

      protected int l() {
         return ayg.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return ayg.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return ayg.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fop.Q.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fop.Q.a($$3 + $$2 * 9, cud.l);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public cud b(cml $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cre $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cud.l);
            }
         }

         return cud.l;
      }

      @Override
      public boolean a(cud $$0, cre $$1) {
         return $$1.c != fop.Q;
      }

      @Override
      public boolean b(cre $$0) {
         return $$0.c != fop.Q;
      }

      @Override
      public cud g() {
         return this.l.g();
      }

      @Override
      public void b(cud $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cre {
      final cre a;

      public c(cre $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cml $$0, cud $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cud $$0) {
         return this.a.a($$0);
      }

      @Override
      public cud g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cud $$0, cud $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cud $$0) {
         this.a.f($$0);
      }

      @Override
      public void c() {
         this.a.c();
      }

      @Override
      public int a() {
         return this.a.a();
      }

      @Override
      public int a_(cud $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<akk, akk> b() {
         return this.a.b();
      }

      @Override
      public cud a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cml $$0) {
         return this.a.a($$0);
      }
   }
}
