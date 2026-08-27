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

public class ezh extends ezk<ezh.b> {
   private static final aep x = new aep("container/creative_inventory/scroller");
   private static final aep y = new aep("container/creative_inventory/scroller_disabled");
   private static final aep[] z = new aep[]{
      new aep("container/creative_inventory/tab_top_unselected_1"),
      new aep("container/creative_inventory/tab_top_unselected_2"),
      new aep("container/creative_inventory/tab_top_unselected_3"),
      new aep("container/creative_inventory/tab_top_unselected_4"),
      new aep("container/creative_inventory/tab_top_unselected_5"),
      new aep("container/creative_inventory/tab_top_unselected_6"),
      new aep("container/creative_inventory/tab_top_unselected_7")
   };
   private static final aep[] A = new aep[]{
      new aep("container/creative_inventory/tab_top_selected_1"),
      new aep("container/creative_inventory/tab_top_selected_2"),
      new aep("container/creative_inventory/tab_top_selected_3"),
      new aep("container/creative_inventory/tab_top_selected_4"),
      new aep("container/creative_inventory/tab_top_selected_5"),
      new aep("container/creative_inventory/tab_top_selected_6"),
      new aep("container/creative_inventory/tab_top_selected_7")
   };
   private static final aep[] B = new aep[]{
      new aep("container/creative_inventory/tab_bottom_unselected_1"),
      new aep("container/creative_inventory/tab_bottom_unselected_2"),
      new aep("container/creative_inventory/tab_bottom_unselected_3"),
      new aep("container/creative_inventory/tab_bottom_unselected_4"),
      new aep("container/creative_inventory/tab_bottom_unselected_5"),
      new aep("container/creative_inventory/tab_bottom_unselected_6"),
      new aep("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final aep[] C = new aep[]{
      new aep("container/creative_inventory/tab_bottom_selected_1"),
      new aep("container/creative_inventory/tab_bottom_selected_2"),
      new aep("container/creative_inventory/tab_bottom_selected_3"),
      new aep("container/creative_inventory/tab_bottom_selected_4"),
      new aep("container/creative_inventory/tab_bottom_selected_5"),
      new aep("container/creative_inventory/tab_bottom_selected_6"),
      new aep("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String D = "textures/gui/container/creative_inventory/tab_";
   private static final String E = "CustomCreativeLock";
   private static final int F = 5;
   private static final int G = 9;
   private static final int H = 26;
   private static final int I = 32;
   private static final int J = 12;
   private static final int K = 15;
   static final bgv L = new bgv(45);
   private static final te M = te.c("inventory.binSlot");
   private static final int N = 16777215;
   private static chc O = chd.b();
   private float P;
   private boolean Q;
   private esr R;
   @Nullable
   private List<cfu> S;
   @Nullable
   private cfu T;
   private ezg U;
   private boolean V;
   private boolean W;
   private final Set<apy<cir>> X = new HashSet<>();
   private final boolean Y;

   public ezh(cbl $$0, cdt $$1, boolean $$2) {
      super(new ezh.b($$0), $$0.fQ(), td.a);
      $$0.bQ = this.p;
      this.k = 136;
      this.c = 195;
      this.Y = $$2;
      chd.a($$1, this.a($$0), $$0.dK().B_());
   }

   private boolean a(cbl $$0) {
      return $$0.gn() && this.Y;
   }

   private void a(cdt $$0, boolean $$1, hh.b $$2) {
      if (chd.a($$0, $$1, $$2)) {
         for (chc $$3 : chd.d()) {
            Collection<ciw> $$4 = $$3.l();
            if ($$3 == O) {
               if ($$3.k() == chc.h.a && $$4.isEmpty()) {
                  this.a(chd.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<ciw> $$0) {
      int $$1 = this.p.a(this.P);
      this.p.k.clear();
      if (O.k() == chc.h.d) {
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
         if (this.f.t != null) {
            this.a(this.f.t.cl.x(), this.a(this.f.t), this.f.t.dK().B_());
         }

         if (!this.f.r.g()) {
            this.f.a(new ezs(this.f.t));
         }
      }
   }

   @Override
   protected void a(@Nullable cfu $$0, int $$1, int $$2, cel $$3) {
      if (this.a($$0)) {
         this.R.c(false);
         this.R.n(0);
      }

      boolean $$4 = $$3 == cel.b;
      $$3 = $$1 == -999 && $$3 == cel.a ? cel.e : $$3;
      if ($$0 == null && O.k() != chc.h.b && $$3 != cel.f) {
         if (!this.p.g().b() && this.W) {
            if ($$2 == 0) {
               this.f.t.a(this.p.g(), true);
               this.f.r.a(this.p.g());
               this.p.b(ciw.b);
            }

            if ($$2 == 1) {
               ciw $$18 = this.p.g().a(1);
               this.f.t.a($$18, true);
               this.f.r.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.f.t)) {
            return;
         }

         if ($$0 == this.T && $$4) {
            for (int $$5 = 0; $$5 < this.f.t.bP.c().size(); $$5++) {
               this.f.r.a(ciw.b, $$5);
            }
         } else if (O.k() == chc.h.b) {
            if ($$0 == this.T) {
               this.p.b(ciw.b);
            } else if ($$3 == cel.e && $$0 != null && $$0.f()) {
               ciw $$6 = $$0.a($$2 == 0 ? 1 : $$0.e().g());
               ciw $$7 = $$0.e();
               this.f.t.a($$6, true);
               this.f.r.a($$6);
               this.f.r.a($$7, ((ezh.c)$$0).a.e);
            } else if ($$3 == cel.e && !this.p.g().b()) {
               this.f.t.a(this.p.g(), true);
               this.f.r.a(this.p.g());
               this.p.b(ciw.b);
            } else {
               this.f.t.bP.a($$0 == null ? $$1 : ((ezh.c)$$0).a.e, $$2, $$3, this.f.t);
               this.f.t.bP.d();
            }
         } else if ($$3 != cel.f && $$0.d == L) {
            ciw $$8 = this.p.g();
            ciw $$9 = $$0.e();
            if ($$3 == cel.c) {
               if (!$$9.b()) {
                  this.f.t.fQ().a($$2, $$9.c($$9.g()));
                  this.f.t.bP.d();
               }

               return;
            }

            if ($$3 == cel.d) {
               if (this.p.g().b() && $$0.f()) {
                  ciw $$10 = $$0.e();
                  this.p.b($$10.c($$10.g()));
               }

               return;
            }

            if ($$3 == cel.e) {
               if (!$$9.b()) {
                  ciw $$11 = $$9.c($$2 == 0 ? 1 : $$9.g());
                  this.f.t.a($$11, true);
                  this.f.r.a($$11);
               }

               return;
            }

            if (!$$8.b() && !$$9.b() && ciw.c($$8, $$9)) {
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
               this.p.b(ciw.b);
            } else if (!this.p.g().b()) {
               this.p.g().h(1);
            }
         } else if (this.p != null) {
            ciw $$13 = $$0 == null ? ciw.b : this.p.b($$0.e).e();
            this.p.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.f.t);
            if (cec.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.f.r.a(this.p.b(45 + $$14).e(), 36 + $$14);
               }
            } else if ($$0 != null) {
               ciw $$15 = this.p.b($$0.e).e();
               this.f.r.a($$15, $$0.e - this.p.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cel.c) {
                  this.f.r.a($$13, $$16 - this.p.i.size() + 9 + 36);
               } else if ($$3 == cel.e && !$$13.b()) {
                  ciw $$17 = $$13.c($$2 == 0 ? 1 : $$13.g());
                  this.f.t.a($$17, true);
                  this.f.r.a($$17);
               }

               this.f.t.bP.d();
            }
         }
      }
   }

   private boolean a(@Nullable cfu $$0) {
      return $$0 != null && $$0.d == L;
   }

   @Override
   protected void aE_() {
      if (this.f.r.g()) {
         super.aE_();
         this.R = new esr(this.i, this.t + 82, this.u + 6, 80, 9, te.c("itemGroup.search"));
         this.R.k(50);
         this.R.d(false);
         this.R.g(false);
         this.R.l(16777215);
         this.e(this.R);
         chc $$0 = O;
         O = chd.b();
         this.a($$0);
         this.f.t.bP.b(this.U);
         this.U = new ezg(this.f);
         this.f.t.bP.a(this.U);
         if (!O.i()) {
            this.a(chd.b());
         }
      } else {
         this.f.a(new ezs(this.f.t));
      }
   }

   @Override
   public void a(eqn $$0, int $$1, int $$2) {
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
      if (this.f.t != null && this.f.t.fQ() != null) {
         this.f.t.bP.b(this.U);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.V) {
         return false;
      } else if (O.k() != chc.h.d) {
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
      if (O.k() != chc.h.d) {
         if (this.f.m.K.a($$0, $$1)) {
            this.V = true;
            this.a(chd.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.s) || this.s.f();
         boolean $$4 = ekc.a($$0, $$1).e().isPresent();
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
               return this.R.ax_() && this.R.u() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
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
         gcb<ciw> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.f.a(gca.b);
            this.a($$0);
         } else {
            $$1 = this.f.a(gca.a);
         }

         this.p.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<aep> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      jc.i.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.X::add);
   }

   @Override
   protected void b(erx $$0, int $$1, int $$2) {
      if (O.d()) {
         $$0.a(this.i, O.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.t;
         double $$4 = $$1 - (double)this.u;

         for (chc $$5 : chd.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (O.k() != chc.h.b && this.a($$0, $$1)) {
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

         for (chc $$5 : chd.c()) {
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

   private void a(chc $$0) {
      chc $$1 = O;
      O = $$0;
      this.v.clear();
      this.p.k.clear();
      this.l();
      if (O.k() == chc.h.c) {
         eqj $$2 = this.f.aB();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            fmk $$4 = $$2.a($$3);
            if ($$4.isEmpty()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     ciw $$6 = new ciw(ciz.qa);
                     $$6.a("CustomCreativeLock");
                     te $$7 = this.f.m.U[$$3].k();
                     te $$8 = this.f.m.V.k();
                     $$6.a(te.a("inventory.hotbarInfo", $$8, $$7));
                     this.p.k.add($$6);
                  } else {
                     this.p.k.add(ciw.b);
                  }
               }
            } else {
               this.p.k.addAll($$4);
            }
         }
      } else if (O.k() == chc.h.a) {
         this.p.k.addAll(O.l());
      }

      if (O.k() == chc.h.b) {
         cec $$9 = this.f.t.bP;
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

            cfu $$26 = new ezh.c($$9.i.get($$10), $$10, $$14, $$15);
            this.p.i.add($$26);
         }

         this.T = new cfu(L, 0, 173, 112);
         this.p.i.add(this.T);
      } else if ($$1.k() == chc.h.b) {
         this.p.i.clear();
         this.p.i.addAll(this.S);
         this.S = null;
      }

      if (O.k() == chc.h.d) {
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
         this.P = aro.a(this.P, 0.0F, 1.0F);
         this.p.b(this.P);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (chc $$4 : chd.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.T != null && O.k() == chc.h.b && this.a(this.T.f, this.T.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.i, M, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<te> a(ciw $$0) {
      boolean $$1 = this.s != null && this.s instanceof ezh.a;
      boolean $$2 = O.k() == chc.h.a;
      boolean $$3 = O.k() == chc.h.d;
      ckn.a $$4 = this.f.m.m ? ckn.a.b : ckn.a.a;
      ckn $$5 = $$1 ? $$4.c() : $$4;
      List<te> $$6 = $$0.a(this.f.t, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<te> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.X.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, te.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (chc $$9 : chd.c()) {
            if ($$9.k() != chc.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().e().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(erx $$0, float $$1, int $$2, int $$3) {
      for (chc $$4 : chd.c()) {
         if ($$4 != O) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new aep("textures/gui/container/creative_inventory/tab_" + O.c()), this.t, this.u, 0, 0, this.c, this.k);
      this.R.a($$0, $$2, $$3, $$1);
      int $$5 = this.t + 175;
      int $$6 = this.u + 18;
      int $$7 = $$6 + 112;
      if (O.e()) {
         aep $$8 = this.G() ? x : y;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.P), 12, 15);
      }

      this.a($$0, O);
      if (O.k() == chc.h.b) {
         ezs.a($$0, this.t + 73, this.u + 6, this.t + 105, this.u + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.f.t);
      }
   }

   private int b(chc $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(chc $$0) {
      int $$1 = 0;
      if ($$0.g() == chc.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.k;
      }

      return $$1;
   }

   protected boolean a(chc $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(erx $$0, chc $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.i, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(erx $$0, chc $$1) {
      boolean $$2 = $$1 == O;
      boolean $$3 = $$1.g() == chc.f.a;
      int $$4 = $$1.f();
      int $$5 = this.t + this.b($$1);
      int $$6 = this.u - ($$3 ? 28 : -(this.k - 4));
      aep[] $$7;
      if ($$3) {
         $$7 = $$2 ? A : z;
      } else {
         $$7 = $$2 ? C : B;
      }

      $$0.a($$7[aro.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      ciw $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.i, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean D() {
      return O.k() == chc.h.b;
   }

   public static void a(eqn $$0, int $$1, boolean $$2, boolean $$3) {
      fmi $$4 = $$0.t;
      eqj $$5 = $$0.aB();
      fmk $$6 = $$5.a($$1);
      if ($$2) {
         for (int $$7 = 0; $$7 < cbk.g(); $$7++) {
            ciw $$8 = (ciw)$$6.get($$7);
            ciw $$9 = $$8.a($$4.dK().G()) ? $$8.p() : ciw.b;
            $$4.fQ().a($$7, $$9);
            $$0.r.a($$9, 36 + $$7);
         }

         $$4.bP.d();
      } else if ($$3) {
         for (int $$10 = 0; $$10 < cbk.g(); $$10++) {
            $$6.set($$10, $$4.fQ().a($$10).p());
         }

         te $$11 = $$0.m.U[$$1].k();
         te $$12 = $$0.m.W.k();
         te $$13 = te.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aU().c($$13);
         $$5.a();
      }
   }

   static class a extends cfu {
      public a(bgh $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cbl $$0) {
         ciw $$1 = this.e();
         return super.a($$0) && !$$1.b() ? $$1.a($$0.dK().G()) && $$1.b("CustomCreativeLock") == null : $$1.b();
      }
   }

   public static class b extends cec {
      public final ho<ciw> k = ho.a();
      private final cec l;

      public b(cbl $$0) {
         super(null, 0);
         this.l = $$0.bP;
         cbk $$1 = $$0.fQ();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new ezh.a(ezh.L, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfu($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cbl $$0) {
         return true;
      }

      protected int l() {
         return aro.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return aro.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return aro.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  ezh.L.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  ezh.L.a($$3 + $$2 * 9, ciw.b);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public ciw a(cbl $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cfu $$2 = this.i.get($$1);
            if ($$2 != null && $$2.f()) {
               $$2.d(ciw.b);
            }
         }

         return ciw.b;
      }

      @Override
      public boolean a(ciw $$0, cfu $$1) {
         return $$1.d != ezh.L;
      }

      @Override
      public boolean b(cfu $$0) {
         return $$0.d != ezh.L;
      }

      @Override
      public ciw g() {
         return this.l.g();
      }

      @Override
      public void b(ciw $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cfu {
      final cfu a;

      public c(cfu $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cbl $$0, ciw $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(ciw $$0) {
         return this.a.a($$0);
      }

      @Override
      public ciw e() {
         return this.a.e();
      }

      @Override
      public boolean f() {
         return this.a.f();
      }

      @Override
      public void d(ciw $$0) {
         this.a.d($$0);
      }

      @Override
      public void e(ciw $$0) {
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
      public int a_(ciw $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<aep, aep> b() {
         return this.a.b();
      }

      @Override
      public ciw a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean c() {
         return this.a.c();
      }

      @Override
      public boolean a(cbl $$0) {
         return this.a.a($$0);
      }
   }
}
