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

public class fiv extends fiy<fiv.b> {
   private static final ajh x = new ajh("container/creative_inventory/scroller");
   private static final ajh y = new ajh("container/creative_inventory/scroller_disabled");
   private static final ajh[] z = new ajh[]{
      new ajh("container/creative_inventory/tab_top_unselected_1"),
      new ajh("container/creative_inventory/tab_top_unselected_2"),
      new ajh("container/creative_inventory/tab_top_unselected_3"),
      new ajh("container/creative_inventory/tab_top_unselected_4"),
      new ajh("container/creative_inventory/tab_top_unselected_5"),
      new ajh("container/creative_inventory/tab_top_unselected_6"),
      new ajh("container/creative_inventory/tab_top_unselected_7")
   };
   private static final ajh[] A = new ajh[]{
      new ajh("container/creative_inventory/tab_top_selected_1"),
      new ajh("container/creative_inventory/tab_top_selected_2"),
      new ajh("container/creative_inventory/tab_top_selected_3"),
      new ajh("container/creative_inventory/tab_top_selected_4"),
      new ajh("container/creative_inventory/tab_top_selected_5"),
      new ajh("container/creative_inventory/tab_top_selected_6"),
      new ajh("container/creative_inventory/tab_top_selected_7")
   };
   private static final ajh[] B = new ajh[]{
      new ajh("container/creative_inventory/tab_bottom_unselected_1"),
      new ajh("container/creative_inventory/tab_bottom_unselected_2"),
      new ajh("container/creative_inventory/tab_bottom_unselected_3"),
      new ajh("container/creative_inventory/tab_bottom_unselected_4"),
      new ajh("container/creative_inventory/tab_bottom_unselected_5"),
      new ajh("container/creative_inventory/tab_bottom_unselected_6"),
      new ajh("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final ajh[] C = new ajh[]{
      new ajh("container/creative_inventory/tab_bottom_selected_1"),
      new ajh("container/creative_inventory/tab_bottom_selected_2"),
      new ajh("container/creative_inventory/tab_bottom_selected_3"),
      new ajh("container/creative_inventory/tab_bottom_selected_4"),
      new ajh("container/creative_inventory/tab_bottom_selected_5"),
      new ajh("container/creative_inventory/tab_bottom_selected_6"),
      new ajh("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String D = "textures/gui/container/creative_inventory/tab_";
   private static final String E = "CustomCreativeLock";
   private static final int F = 5;
   private static final int G = 9;
   private static final int H = 26;
   private static final int I = 32;
   private static final int J = 12;
   private static final int K = 15;
   static final bnm L = new bnm(45);
   private static final vu M = vu.c("inventory.binSlot");
   private static final int N = 16777215;
   private static cov O = cow.b();
   private float P;
   private boolean Q;
   private fbr R;
   @Nullable
   private List<cnl> S;
   @Nullable
   private cnl T;
   private fiu U;
   private boolean V;
   private boolean W;
   private final Set<avd<cqh>> X = new HashSet<>();
   private final boolean Y;

   public fiv(ciu $$0, clh $$1, boolean $$2) {
      super(new fiv.b($$0), $$0.fZ(), vt.a);
      $$0.bZ = this.p;
      this.k = 136;
      this.c = 195;
      this.Y = $$2;
      cow.a($$1, this.a($$0), $$0.dM().H_());
   }

   private boolean a(ciu $$0) {
      return $$0.gw() && this.Y;
   }

   private void a(clh $$0, boolean $$1, in.a $$2) {
      if (cow.a($$0, $$1, $$2)) {
         for (cov $$3 : cow.d()) {
            Collection<cqm> $$4 = $$3.l();
            if ($$3 == O) {
               if ($$3.k() == cov.h.a && $$4.isEmpty()) {
                  this.a(cow.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<cqm> $$0) {
      int $$1 = this.p.a(this.P);
      this.p.k.clear();
      if (O.k() == cov.h.d) {
         this.J();
      } else {
         this.p.k.addAll($$0);
      }

      this.P = this.p.e($$1);
      this.p.b(this.P);
   }

   @Override
   public void E() {
      super.E();
      if (this.f != null) {
         if (this.f.s != null) {
            this.a(this.f.s.cu.y(), this.a(this.f.s), this.f.s.dM().H_());
         }

         if (!this.f.q.f()) {
            this.f.a(new fjg(this.f.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cnl $$0, int $$1, int $$2, clz $$3) {
      if (this.a($$0)) {
         this.R.c(false);
         this.R.i(0);
      }

      boolean $$4 = $$3 == clz.b;
      $$3 = $$1 == -999 && $$3 == clz.a ? clz.e : $$3;
      if ($$0 == null && O.k() != cov.h.b && $$3 != clz.f) {
         if (!this.p.g().b() && this.W) {
            if ($$2 == 0) {
               this.f.s.a(this.p.g(), true);
               this.f.q.a(this.p.g());
               this.p.b(cqm.h);
            }

            if ($$2 == 1) {
               cqm $$18 = this.p.g().a(1);
               this.f.s.a($$18, true);
               this.f.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.f.s)) {
            return;
         }

         if ($$0 == this.T && $$4) {
            for (int $$5 = 0; $$5 < this.f.s.bY.c().size(); $$5++) {
               this.f.q.a(cqm.h, $$5);
            }
         } else if (O.k() == cov.h.b) {
            if ($$0 == this.T) {
               this.p.b(cqm.h);
            } else if ($$3 == clz.e && $$0 != null && $$0.h()) {
               cqm $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().g());
               cqm $$7 = $$0.g();
               this.f.s.a($$6, true);
               this.f.q.a($$6);
               this.f.q.a($$7, ((fiv.c)$$0).a.e);
            } else if ($$3 == clz.e && !this.p.g().b()) {
               this.f.s.a(this.p.g(), true);
               this.f.q.a(this.p.g());
               this.p.b(cqm.h);
            } else {
               this.f.s.bY.a($$0 == null ? $$1 : ((fiv.c)$$0).a.e, $$2, $$3, this.f.s);
               this.f.s.bY.d();
            }
         } else if ($$3 != clz.f && $$0.d == L) {
            cqm $$8 = this.p.g();
            cqm $$9 = $$0.g();
            if ($$3 == clz.c) {
               if (!$$9.b()) {
                  this.f.s.fZ().a($$2, $$9.c($$9.g()));
                  this.f.s.bY.d();
               }

               return;
            }

            if ($$3 == clz.d) {
               if (this.p.g().b() && $$0.h()) {
                  cqm $$10 = $$0.g();
                  this.p.b($$10.c($$10.g()));
               }

               return;
            }

            if ($$3 == clz.e) {
               if (!$$9.b()) {
                  cqm $$11 = $$9.c($$2 == 0 ? 1 : $$9.g());
                  this.f.s.a($$11, true);
                  this.f.q.a($$11);
               }

               return;
            }

            if (!$$8.b() && !$$9.b() && cqm.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.f($$8.g());
                  } else if ($$8.M() < $$8.g()) {
                     $$8.g(1);
                  }
               } else {
                  $$8.h(1);
               }
            } else if (!$$9.b() && $$8.b()) {
               int $$12 = $$4 ? $$9.g() : $$9.M();
               this.p.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.p.b(cqm.h);
            } else if (!this.p.g().b()) {
               this.p.g().h(1);
            }
         } else if (this.p != null) {
            cqm $$13 = $$0 == null ? cqm.h : this.p.b($$0.e).g();
            this.p.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.f.s);
            if (clq.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.f.q.a(this.p.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cqm $$15 = this.p.b($$0.e).g();
               this.f.q.a($$15, $$0.e - this.p.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == clz.c) {
                  this.f.q.a($$13, $$16 - this.p.i.size() + 9 + 36);
               } else if ($$3 == clz.e && !$$13.b()) {
                  cqm $$17 = $$13.c($$2 == 0 ? 1 : $$13.g());
                  this.f.s.a($$17, true);
                  this.f.q.a($$17);
               }

               this.f.s.bY.d();
            }
         }
      }
   }

   private boolean a(@Nullable cnl $$0) {
      return $$0 != null && $$0.d == L;
   }

   @Override
   protected void aO_() {
      if (this.f.q.f()) {
         super.aO_();
         this.R = new fbr(this.i, this.t + 82, this.u + 6, 80, 9, vu.c("itemGroup.search"));
         this.R.f(50);
         this.R.d(false);
         this.R.g(false);
         this.R.g(16777215);
         this.d(this.R);
         cov $$0 = O;
         O = cow.b();
         this.a($$0);
         this.f.s.bY.b(this.U);
         this.U = new fiu(this.f);
         this.f.s.bY.a(this.U);
         if (!O.i()) {
            this.a(cow.b());
         }
      } else {
         this.f.a(new fjg(this.f.s));
      }
   }

   @Override
   public void a(ezi $$0, int $$1, int $$2) {
      int $$3 = this.p.a(this.P);
      String $$4 = this.R.a();
      this.b($$0, $$1, $$2);
      this.R.a($$4);
      if (!this.R.a().isEmpty()) {
         this.J();
      }

      this.P = this.p.e($$3);
      this.p.b(this.P);
   }

   @Override
   public void k() {
      super.k();
      if (this.f.s != null && this.f.s.fZ() != null) {
         this.f.s.bY.b(this.U);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.V) {
         return false;
      } else if (O.k() != cov.h.d) {
         return false;
      } else {
         String $$2 = this.R.a();
         if (this.R.a($$0, $$1)) {
            if (!Objects.equals($$2, this.R.a())) {
               this.J();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.V = false;
      if (O.k() != cov.h.d) {
         if (this.f.m.K.a($$0, $$1)) {
            this.V = true;
            this.a(cow.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.r) || this.r.h();
         boolean $$4 = esw.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.V = true;
            return true;
         } else {
            String $$5 = this.R.a();
            if (this.R.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.R.a())) {
                  this.J();
               }

               return true;
            } else {
               return this.R.aJ_() && this.R.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.V = false;
      return super.b($$0, $$1, $$2);
   }

   private void J() {
      this.p.k.clear();
      this.X.clear();
      String $$0 = this.R.a();
      if ($$0.isEmpty()) {
         this.p.k.addAll(O.l());
      } else {
         gnc<cqm> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.f.a(gnb.b);
            this.a($$0);
         } else {
            $$1 = this.f.a(gnb.a);
         }

         this.p.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<ajh> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      ki.h.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.X::add);
   }

   @Override
   protected void b(fav $$0, int $$1, int $$2) {
      if (O.d()) {
         $$0.a(this.i, O.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.t;
         double $$4 = $$1 - (double)this.u;

         for (cov $$5 : cow.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (O.k() != cov.h.b && this.b($$0, $$1)) {
            this.Q = this.L();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.t;
         double $$4 = $$1 - (double)this.u;
         this.Q = false;

         for (cov $$5 : cow.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean L() {
      return O.e() && this.p.m();
   }

   private void a(cov $$0) {
      cov $$1 = O;
      O = $$0;
      this.v.clear();
      this.p.k.clear();
      this.o();
      if (O.k() == cov.h.c) {
         eze $$2 = this.f.aD();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            fww $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cqm $$6 = new cqm(cqp.qN);
                     $$6.b("CustomCreativeLock");
                     vu $$7 = this.f.m.U[$$3].k();
                     vu $$8 = this.f.m.V.k();
                     $$6.a(vu.a("inventory.hotbarInfo", $$8, $$7));
                     this.p.k.add($$6);
                  } else {
                     this.p.k.add(cqm.h);
                  }
               }
            } else {
               this.p.k.addAll($$4.a(this.f.r.H_()));
            }
         }
      } else if (O.k() == cov.h.a) {
         this.p.k.addAll(O.l());
      }

      if (O.k() == cov.h.b) {
         clq $$9 = this.f.s.bY;
         if (this.S == null) {
            this.S = ImmutableList.copyOf(this.p.i);
         }

         this.p.i.clear();

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

            cnl $$26 = new fiv.c($$9.i.get($$10), $$10, $$14, $$15);
            this.p.i.add($$26);
         }

         this.T = new cnl(L, 0, 173, 112);
         this.p.i.add(this.T);
      } else if ($$1.k() == cov.h.b) {
         this.p.i.clear();
         this.p.i.addAll(this.S);
         this.S = null;
      }

      if (O.k() == cov.h.d) {
         this.R.g(true);
         this.R.f(false);
         this.R.a(true);
         if ($$1 != $$0) {
            this.R.a("");
         }

         this.J();
      } else {
         this.R.g(false);
         this.R.f(true);
         this.R.a(false);
         this.R.a("");
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.L()) {
         return false;
      } else {
         this.P = this.p.a(this.P, $$3);
         this.p.b(this.P);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      this.W = $$5 && !this.a(O, $$0, $$1);
      return this.W;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.t;
      int $$3 = this.u;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.Q) {
         int $$5 = this.u + 18;
         int $$6 = $$5 + 112;
         this.P = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.P = aww.a(this.P, 0.0F, 1.0F);
         this.p.b(this.P);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cov $$4 : cow.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.T != null && O.k() == cov.h.b && this.a(this.T.f, this.T.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.i, M, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<vu> a(cqm $$0) {
      boolean $$1 = this.r != null && this.r instanceof fiv.a;
      boolean $$2 = O.k() == cov.h.a;
      boolean $$3 = O.k() == cov.h.d;
      csd.a $$4 = this.f.m.m ? csd.a.b : csd.a.a;
      csd $$5 = $$1 ? $$4.c() : $$4;
      List<vu> $$6 = $$0.a(this.f.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<vu> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.X.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, vu.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cov $$9 : cow.c()) {
            if ($$9.k() != cov.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fav $$0, float $$1, int $$2, int $$3) {
      for (cov $$4 : cow.c()) {
         if ($$4 != O) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new ajh("textures/gui/container/creative_inventory/tab_" + O.c()), this.t, this.u, 0, 0, this.c, this.k);
      this.R.a($$0, $$2, $$3, $$1);
      int $$5 = this.t + 175;
      int $$6 = this.u + 18;
      int $$7 = $$6 + 112;
      if (O.e()) {
         ajh $$8 = this.L() ? x : y;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.P), 12, 15);
      }

      this.a($$0, O);
      if (O.k() == cov.h.b) {
         fjg.a($$0, this.t + 73, this.u + 6, this.t + 105, this.u + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.f.s);
      }
   }

   private int b(cov $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cov $$0) {
      int $$1 = 0;
      if ($$0.g() == cov.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.k;
      }

      return $$1;
   }

   protected boolean a(cov $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fav $$0, cov $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.i, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fav $$0, cov $$1) {
      boolean $$2 = $$1 == O;
      boolean $$3 = $$1.g() == cov.f.a;
      int $$4 = $$1.f();
      int $$5 = this.t + this.b($$1);
      int $$6 = this.u - ($$3 ? 28 : -(this.k - 4));
      ajh[] $$7;
      if ($$3) {
         $$7 = $$2 ? A : z;
      } else {
         $$7 = $$2 ? C : B;
      }

      $$0.a($$7[aww.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cqm $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.i, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean I() {
      return O.k() == cov.h.b;
   }

   public static void a(ezi $$0, int $$1, boolean $$2, boolean $$3) {
      fwu $$4 = $$0.s;
      iz $$5 = $$4.dM().H_();
      eze $$6 = $$0.aD();
      fww $$7 = $$6.a($$1);
      if ($$2) {
         List<cqm> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cit.g(); $$9++) {
            cqm $$10 = $$8.get($$9);
            $$4.fZ().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.bY.d();
      } else if ($$3) {
         $$7.a($$4.fZ(), $$5);
         vu $$11 = $$0.m.U[$$1].k();
         vu $$12 = $$0.m.W.k();
         vu $$13 = vu.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aY().c($$13);
         $$6.a();
      }
   }

   static class a extends cnl {
      public a(bmw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciu $$0) {
         cqm $$1 = this.g();
         return super.a($$0) && !$$1.b() ? $$1.a($$0.dM().I()) && $$1.c("CustomCreativeLock") == null : $$1.b();
      }
   }

   public static class b extends clq {
      public final iu<cqm> k = iu.a();
      private final clq l;

      public b(ciu $$0) {
         super(null, 0);
         this.l = $$0.bY;
         cit $$1 = $$0.fZ();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fiv.a(fiv.L, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnl($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(ciu $$0) {
         return true;
      }

      protected int l() {
         return aww.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return aww.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return aww.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fiv.L.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fiv.L.a($$3 + $$2 * 9, cqm.h);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public cqm a(ciu $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cnl $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cqm.h);
            }
         }

         return cqm.h;
      }

      @Override
      public boolean a(cqm $$0, cnl $$1) {
         return $$1.d != fiv.L;
      }

      @Override
      public boolean b(cnl $$0) {
         return $$0.d != fiv.L;
      }

      @Override
      public cqm g() {
         return this.l.g();
      }

      @Override
      public void b(cqm $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cnl {
      final cnl a;

      public c(cnl $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(ciu $$0, cqm $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cqm $$0) {
         return this.a.a($$0);
      }

      @Override
      public cqm g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cqm $$0, cqm $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cqm $$0) {
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
      public int a_(cqm $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<ajh, ajh> c() {
         return this.a.c();
      }

      @Override
      public cqm a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(ciu $$0) {
         return this.a.a($$0);
      }
   }
}
