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

public class ezl extends ezo<ezl.b> {
   private static final aer x = new aer("container/creative_inventory/scroller");
   private static final aer y = new aer("container/creative_inventory/scroller_disabled");
   private static final aer[] z = new aer[]{
      new aer("container/creative_inventory/tab_top_unselected_1"),
      new aer("container/creative_inventory/tab_top_unselected_2"),
      new aer("container/creative_inventory/tab_top_unselected_3"),
      new aer("container/creative_inventory/tab_top_unselected_4"),
      new aer("container/creative_inventory/tab_top_unselected_5"),
      new aer("container/creative_inventory/tab_top_unselected_6"),
      new aer("container/creative_inventory/tab_top_unselected_7")
   };
   private static final aer[] A = new aer[]{
      new aer("container/creative_inventory/tab_top_selected_1"),
      new aer("container/creative_inventory/tab_top_selected_2"),
      new aer("container/creative_inventory/tab_top_selected_3"),
      new aer("container/creative_inventory/tab_top_selected_4"),
      new aer("container/creative_inventory/tab_top_selected_5"),
      new aer("container/creative_inventory/tab_top_selected_6"),
      new aer("container/creative_inventory/tab_top_selected_7")
   };
   private static final aer[] B = new aer[]{
      new aer("container/creative_inventory/tab_bottom_unselected_1"),
      new aer("container/creative_inventory/tab_bottom_unselected_2"),
      new aer("container/creative_inventory/tab_bottom_unselected_3"),
      new aer("container/creative_inventory/tab_bottom_unselected_4"),
      new aer("container/creative_inventory/tab_bottom_unselected_5"),
      new aer("container/creative_inventory/tab_bottom_unselected_6"),
      new aer("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final aer[] C = new aer[]{
      new aer("container/creative_inventory/tab_bottom_selected_1"),
      new aer("container/creative_inventory/tab_bottom_selected_2"),
      new aer("container/creative_inventory/tab_bottom_selected_3"),
      new aer("container/creative_inventory/tab_bottom_selected_4"),
      new aer("container/creative_inventory/tab_bottom_selected_5"),
      new aer("container/creative_inventory/tab_bottom_selected_6"),
      new aer("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String D = "textures/gui/container/creative_inventory/tab_";
   private static final String E = "CustomCreativeLock";
   private static final int F = 5;
   private static final int G = 9;
   private static final int H = 26;
   private static final int I = 32;
   private static final int J = 12;
   private static final int K = 15;
   static final bgx L = new bgx(45);
   private static final tf M = tf.c("inventory.binSlot");
   private static final int N = 16777215;
   private static che O = chf.b();
   private float P;
   private boolean Q;
   private esq R;
   @Nullable
   private List<cfw> S;
   @Nullable
   private cfw T;
   private ezk U;
   private boolean V;
   private boolean W;
   private final Set<aqa<cit>> X = new HashSet<>();
   private final boolean Y;

   public ezl(cbn $$0, cdv $$1, boolean $$2) {
      super(new ezl.b($$0), $$0.fQ(), te.a);
      $$0.bQ = this.p;
      this.k = 136;
      this.c = 195;
      this.Y = $$2;
      chf.a($$1, this.a($$0), $$0.dK().B_());
   }

   private boolean a(cbn $$0) {
      return $$0.gn() && this.Y;
   }

   private void a(cdv $$0, boolean $$1, hg.b $$2) {
      if (chf.a($$0, $$1, $$2)) {
         for (che $$3 : chf.d()) {
            Collection<ciy> $$4 = $$3.l();
            if ($$3 == O) {
               if ($$3.k() == che.h.a && $$4.isEmpty()) {
                  this.a(chf.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<ciy> $$0) {
      int $$1 = this.p.a(this.P);
      this.p.k.clear();
      if (O.k() == che.h.d) {
         this.E();
      } else {
         this.p.k.addAll($$0);
      }

      this.P = this.p.e($$1);
      this.p.b(this.P);
   }

   @Override
   public void B() {
      super.B();
      if (this.f != null) {
         if (this.f.v != null) {
            this.a(this.f.v.cl.x(), this.a(this.f.v), this.f.v.dK().B_());
         }

         if (!this.f.t.g()) {
            this.f.a(new ezw(this.f.v));
         }
      }
   }

   @Override
   protected void a(@Nullable cfw $$0, int $$1, int $$2, cen $$3) {
      if (this.a($$0)) {
         this.R.c(false);
         this.R.n(0);
      }

      boolean $$4 = $$3 == cen.b;
      $$3 = $$1 == -999 && $$3 == cen.a ? cen.e : $$3;
      if ($$0 == null && O.k() != che.h.b && $$3 != cen.f) {
         if (!this.p.g().b() && this.W) {
            if ($$2 == 0) {
               this.f.v.a(this.p.g(), true);
               this.f.t.a(this.p.g());
               this.p.b(ciy.b);
            }

            if ($$2 == 1) {
               ciy $$18 = this.p.g().a(1);
               this.f.v.a($$18, true);
               this.f.t.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.f.v)) {
            return;
         }

         if ($$0 == this.T && $$4) {
            for (int $$5 = 0; $$5 < this.f.v.bP.c().size(); $$5++) {
               this.f.t.a(ciy.b, $$5);
            }
         } else if (O.k() == che.h.b) {
            if ($$0 == this.T) {
               this.p.b(ciy.b);
            } else if ($$3 == cen.e && $$0 != null && $$0.f()) {
               ciy $$6 = $$0.a($$2 == 0 ? 1 : $$0.e().g());
               ciy $$7 = $$0.e();
               this.f.v.a($$6, true);
               this.f.t.a($$6);
               this.f.t.a($$7, ((ezl.c)$$0).a.e);
            } else if ($$3 == cen.e && !this.p.g().b()) {
               this.f.v.a(this.p.g(), true);
               this.f.t.a(this.p.g());
               this.p.b(ciy.b);
            } else {
               this.f.v.bP.a($$0 == null ? $$1 : ((ezl.c)$$0).a.e, $$2, $$3, this.f.v);
               this.f.v.bP.d();
            }
         } else if ($$3 != cen.f && $$0.d == L) {
            ciy $$8 = this.p.g();
            ciy $$9 = $$0.e();
            if ($$3 == cen.c) {
               if (!$$9.b()) {
                  this.f.v.fQ().a($$2, $$9.c($$9.g()));
                  this.f.v.bP.d();
               }

               return;
            }

            if ($$3 == cen.d) {
               if (this.p.g().b() && $$0.f()) {
                  ciy $$10 = $$0.e();
                  this.p.b($$10.c($$10.g()));
               }

               return;
            }

            if ($$3 == cen.e) {
               if (!$$9.b()) {
                  ciy $$11 = $$9.c($$2 == 0 ? 1 : $$9.g());
                  this.f.v.a($$11, true);
                  this.f.t.a($$11);
               }

               return;
            }

            if (!$$8.b() && !$$9.b() && ciy.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.f($$8.g());
                  } else if ($$8.L() < $$8.g()) {
                     $$8.g(1);
                  }
               } else {
                  $$8.h(1);
               }
            } else if (!$$9.b() && $$8.b()) {
               int $$12 = $$4 ? $$9.g() : $$9.L();
               this.p.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.p.b(ciy.b);
            } else if (!this.p.g().b()) {
               this.p.g().h(1);
            }
         } else if (this.p != null) {
            ciy $$13 = $$0 == null ? ciy.b : this.p.b($$0.e).e();
            this.p.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.f.v);
            if (cee.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.f.t.a(this.p.b(45 + $$14).e(), 36 + $$14);
               }
            } else if ($$0 != null) {
               ciy $$15 = this.p.b($$0.e).e();
               this.f.t.a($$15, $$0.e - this.p.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cen.c) {
                  this.f.t.a($$13, $$16 - this.p.i.size() + 9 + 36);
               } else if ($$3 == cen.e && !$$13.b()) {
                  ciy $$17 = $$13.c($$2 == 0 ? 1 : $$13.g());
                  this.f.v.a($$17, true);
                  this.f.t.a($$17);
               }

               this.f.v.bP.d();
            }
         }
      }
   }

   private boolean a(@Nullable cfw $$0) {
      return $$0 != null && $$0.d == L;
   }

   @Override
   protected void aE_() {
      if (this.f.t.g()) {
         super.aE_();
         this.R = new esq(this.i, this.t + 82, this.u + 6, 80, 9, tf.c("itemGroup.search"));
         this.R.k(50);
         this.R.d(false);
         this.R.g(false);
         this.R.l(16777215);
         this.e(this.R);
         che $$0 = O;
         O = chf.b();
         this.a($$0);
         this.f.v.bP.b(this.U);
         this.U = new ezk(this.f);
         this.f.v.bP.a(this.U);
         if (!O.i()) {
            this.a(chf.b());
         }
      } else {
         this.f.a(new ezw(this.f.v));
      }
   }

   @Override
   public void a(eqm $$0, int $$1, int $$2) {
      int $$3 = this.p.a(this.P);
      String $$4 = this.R.a();
      this.b($$0, $$1, $$2);
      this.R.a($$4);
      if (!this.R.a().isEmpty()) {
         this.E();
      }

      this.P = this.p.e($$3);
      this.p.b(this.P);
   }

   @Override
   public void h() {
      super.h();
      if (this.f.v != null && this.f.v.fQ() != null) {
         this.f.v.bP.b(this.U);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.V) {
         return false;
      } else if (O.k() != che.h.d) {
         return false;
      } else {
         String $$2 = this.R.a();
         if (this.R.a($$0, $$1)) {
            if (!Objects.equals($$2, this.R.a())) {
               this.E();
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
      if (O.k() != che.h.d) {
         if (this.f.m.K.a($$0, $$1)) {
            this.V = true;
            this.a(chf.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.s) || this.s.f();
         boolean $$4 = ekb.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.V = true;
            return true;
         } else {
            String $$5 = this.R.a();
            if (this.R.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.R.a())) {
                  this.E();
               }

               return true;
            } else {
               return this.R.ax_() && this.R.v() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.V = false;
      return super.b($$0, $$1, $$2);
   }

   private void E() {
      this.p.k.clear();
      this.X.clear();
      String $$0 = this.R.a();
      if ($$0.isEmpty()) {
         this.p.k.addAll(O.l());
      } else {
         gcg<ciy> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.f.a(gcf.b);
            this.a($$0);
         } else {
            $$1 = this.f.a(gcf.a);
         }

         this.p.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<aer> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      jb.i.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.X::add);
   }

   @Override
   protected void b(erw $$0, int $$1, int $$2) {
      if (O.d()) {
         $$0.a(this.i, O.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.t;
         double $$4 = $$1 - (double)this.u;

         for (che $$5 : chf.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (O.k() != che.h.b && this.a($$0, $$1)) {
            this.Q = this.G();
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

         for (che $$5 : chf.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean G() {
      return O.e() && this.p.m();
   }

   private void a(che $$0) {
      che $$1 = O;
      O = $$0;
      this.v.clear();
      this.p.k.clear();
      this.l();
      if (O.k() == che.h.c) {
         eqi $$2 = this.f.aC();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            fmp $$4 = $$2.a($$3);
            if ($$4.isEmpty()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     ciy $$6 = new ciy(cjb.qa);
                     $$6.a("CustomCreativeLock");
                     tf $$7 = this.f.m.U[$$3].k();
                     tf $$8 = this.f.m.V.k();
                     $$6.a(tf.a("inventory.hotbarInfo", $$8, $$7));
                     this.p.k.add($$6);
                  } else {
                     this.p.k.add(ciy.b);
                  }
               }
            } else {
               this.p.k.addAll($$4);
            }
         }
      } else if (O.k() == che.h.a) {
         this.p.k.addAll(O.l());
      }

      if (O.k() == che.h.b) {
         cee $$9 = this.f.v.bP;
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

            cfw $$26 = new ezl.c($$9.i.get($$10), $$10, $$14, $$15);
            this.p.i.add($$26);
         }

         this.T = new cfw(L, 0, 173, 112);
         this.p.i.add(this.T);
      } else if ($$1.k() == che.h.b) {
         this.p.i.clear();
         this.p.i.addAll(this.S);
         this.S = null;
      }

      if (O.k() == che.h.d) {
         this.R.g(true);
         this.R.f(false);
         this.R.c_(true);
         if ($$1 != $$0) {
            this.R.a("");
         }

         this.E();
      } else {
         this.R.g(false);
         this.R.f(true);
         this.R.c_(false);
         this.R.a("");
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.G()) {
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

   protected boolean a(double $$0, double $$1) {
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
         this.P = arp.a(this.P, 0.0F, 1.0F);
         this.p.b(this.P);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (che $$4 : chf.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.T != null && O.k() == che.h.b && this.a(this.T.f, this.T.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.i, M, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<tf> a(ciy $$0) {
      boolean $$1 = this.s != null && this.s instanceof ezl.a;
      boolean $$2 = O.k() == che.h.a;
      boolean $$3 = O.k() == che.h.d;
      ckp.a $$4 = this.f.m.m ? ckp.a.b : ckp.a.a;
      ckp $$5 = $$1 ? $$4.c() : $$4;
      List<tf> $$6 = $$0.a(this.f.v, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<tf> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.X.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, tf.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (che $$9 : chf.c()) {
            if ($$9.k() != che.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().e().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(erw $$0, float $$1, int $$2, int $$3) {
      for (che $$4 : chf.c()) {
         if ($$4 != O) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new aer("textures/gui/container/creative_inventory/tab_" + O.c()), this.t, this.u, 0, 0, this.c, this.k);
      this.R.a($$0, $$2, $$3, $$1);
      int $$5 = this.t + 175;
      int $$6 = this.u + 18;
      int $$7 = $$6 + 112;
      if (O.e()) {
         aer $$8 = this.G() ? x : y;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.P), 12, 15);
      }

      this.a($$0, O);
      if (O.k() == che.h.b) {
         ezw.a($$0, this.t + 73, this.u + 6, this.t + 105, this.u + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.f.v);
      }
   }

   private int b(che $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(che $$0) {
      int $$1 = 0;
      if ($$0.g() == che.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.k;
      }

      return $$1;
   }

   protected boolean a(che $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(erw $$0, che $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.i, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(erw $$0, che $$1) {
      boolean $$2 = $$1 == O;
      boolean $$3 = $$1.g() == che.f.a;
      int $$4 = $$1.f();
      int $$5 = this.t + this.b($$1);
      int $$6 = this.u - ($$3 ? 28 : -(this.k - 4));
      aer[] $$7;
      if ($$3) {
         $$7 = $$2 ? A : z;
      } else {
         $$7 = $$2 ? C : B;
      }

      $$0.a($$7[arp.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      ciy $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.i, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean D() {
      return O.k() == che.h.b;
   }

   public static void a(eqm $$0, int $$1, boolean $$2, boolean $$3) {
      fmn $$4 = $$0.v;
      eqi $$5 = $$0.aC();
      fmp $$6 = $$5.a($$1);
      if ($$2) {
         for (int $$7 = 0; $$7 < cbm.g(); $$7++) {
            ciy $$8 = (ciy)$$6.get($$7);
            ciy $$9 = $$8.a($$4.dK().G()) ? $$8.p() : ciy.b;
            $$4.fQ().a($$7, $$9);
            $$0.t.a($$9, 36 + $$7);
         }

         $$4.bP.d();
      } else if ($$3) {
         for (int $$10 = 0; $$10 < cbm.g(); $$10++) {
            $$6.set($$10, $$4.fQ().a($$10).p());
         }

         tf $$11 = $$0.m.U[$$1].k();
         tf $$12 = $$0.m.W.k();
         tf $$13 = tf.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aV().c($$13);
         $$5.a();
      }
   }

   static class a extends cfw {
      public a(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cbn $$0) {
         ciy $$1 = this.e();
         return super.a($$0) && !$$1.b() ? $$1.a($$0.dK().G()) && $$1.b("CustomCreativeLock") == null : $$1.b();
      }
   }

   public static class b extends cee {
      public final hn<ciy> k = hn.a();
      private final cee l;

      public b(cbn $$0) {
         super(null, 0);
         this.l = $$0.bP;
         cbm $$1 = $$0.fQ();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new ezl.a(ezl.L, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfw($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cbn $$0) {
         return true;
      }

      protected int l() {
         return arp.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return arp.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return arp.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  ezl.L.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  ezl.L.a($$3 + $$2 * 9, ciy.b);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public ciy a(cbn $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cfw $$2 = this.i.get($$1);
            if ($$2 != null && $$2.f()) {
               $$2.d(ciy.b);
            }
         }

         return ciy.b;
      }

      @Override
      public boolean a(ciy $$0, cfw $$1) {
         return $$1.d != ezl.L;
      }

      @Override
      public boolean b(cfw $$0) {
         return $$0.d != ezl.L;
      }

      @Override
      public ciy g() {
         return this.l.g();
      }

      @Override
      public void b(ciy $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cfw {
      final cfw a;

      public c(cfw $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cbn $$0, ciy $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(ciy $$0) {
         return this.a.a($$0);
      }

      @Override
      public ciy e() {
         return this.a.e();
      }

      @Override
      public boolean f() {
         return this.a.f();
      }

      @Override
      public void d(ciy $$0) {
         this.a.d($$0);
      }

      @Override
      public void e(ciy $$0) {
         this.a.e($$0);
      }

      @Override
      public void d() {
         this.a.d();
      }

      @Override
      public int a() {
         return this.a.a();
      }

      @Override
      public int a_(ciy $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<aer, aer> b() {
         return this.a.b();
      }

      @Override
      public ciy a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean c() {
         return this.a.c();
      }

      @Override
      public boolean a(cbn $$0) {
         return this.a.a($$0);
      }
   }
}
