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

public class fci extends fcl<fci.b> {
   private static final agi x = new agi("container/creative_inventory/scroller");
   private static final agi y = new agi("container/creative_inventory/scroller_disabled");
   private static final agi[] z = new agi[]{
      new agi("container/creative_inventory/tab_top_unselected_1"),
      new agi("container/creative_inventory/tab_top_unselected_2"),
      new agi("container/creative_inventory/tab_top_unselected_3"),
      new agi("container/creative_inventory/tab_top_unselected_4"),
      new agi("container/creative_inventory/tab_top_unselected_5"),
      new agi("container/creative_inventory/tab_top_unselected_6"),
      new agi("container/creative_inventory/tab_top_unselected_7")
   };
   private static final agi[] A = new agi[]{
      new agi("container/creative_inventory/tab_top_selected_1"),
      new agi("container/creative_inventory/tab_top_selected_2"),
      new agi("container/creative_inventory/tab_top_selected_3"),
      new agi("container/creative_inventory/tab_top_selected_4"),
      new agi("container/creative_inventory/tab_top_selected_5"),
      new agi("container/creative_inventory/tab_top_selected_6"),
      new agi("container/creative_inventory/tab_top_selected_7")
   };
   private static final agi[] B = new agi[]{
      new agi("container/creative_inventory/tab_bottom_unselected_1"),
      new agi("container/creative_inventory/tab_bottom_unselected_2"),
      new agi("container/creative_inventory/tab_bottom_unselected_3"),
      new agi("container/creative_inventory/tab_bottom_unselected_4"),
      new agi("container/creative_inventory/tab_bottom_unselected_5"),
      new agi("container/creative_inventory/tab_bottom_unselected_6"),
      new agi("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final agi[] C = new agi[]{
      new agi("container/creative_inventory/tab_bottom_selected_1"),
      new agi("container/creative_inventory/tab_bottom_selected_2"),
      new agi("container/creative_inventory/tab_bottom_selected_3"),
      new agi("container/creative_inventory/tab_bottom_selected_4"),
      new agi("container/creative_inventory/tab_bottom_selected_5"),
      new agi("container/creative_inventory/tab_bottom_selected_6"),
      new agi("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String D = "textures/gui/container/creative_inventory/tab_";
   private static final String E = "CustomCreativeLock";
   private static final int F = 5;
   private static final int G = 9;
   private static final int H = 26;
   private static final int I = 32;
   private static final int J = 12;
   private static final int K = 15;
   static final bje L = new bje(45);
   private static final ur M = ur.c("inventory.binSlot");
   private static final int N = 16777215;
   private static cjp O = cjq.b();
   private float P;
   private boolean Q;
   private evi R;
   @Nullable
   private List<cih> S;
   @Nullable
   private cih T;
   private fch U;
   private boolean V;
   private boolean W;
   private final Set<arv<cle>> X = new HashSet<>();
   private final boolean Y;

   public fci(cdu $$0, cgd $$1, boolean $$2) {
      super(new fci.b($$0), $$0.fT(), uq.a);
      $$0.bS = this.p;
      this.k = 136;
      this.c = 195;
      this.Y = $$2;
      cjq.a($$1, this.a($$0), $$0.dN().H_());
   }

   private boolean a(cdu $$0) {
      return $$0.gq() && this.Y;
   }

   private void a(cgd $$0, boolean $$1, id.b $$2) {
      if (cjq.a($$0, $$1, $$2)) {
         for (cjp $$3 : cjq.d()) {
            Collection<clj> $$4 = $$3.l();
            if ($$3 == O) {
               if ($$3.k() == cjp.h.a && $$4.isEmpty()) {
                  this.a(cjq.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<clj> $$0) {
      int $$1 = this.p.a(this.P);
      this.p.k.clear();
      if (O.k() == cjp.h.d) {
         this.F();
      } else {
         this.p.k.addAll($$0);
      }

      this.P = this.p.e($$1);
      this.p.b(this.P);
   }

   @Override
   public void C() {
      super.C();
      if (this.f != null) {
         if (this.f.s != null) {
            this.a(this.f.s.cn.y(), this.a(this.f.s), this.f.s.dN().H_());
         }

         if (!this.f.q.g()) {
            this.f.a(new fct(this.f.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cih $$0, int $$1, int $$2, cgv $$3) {
      if (this.a($$0)) {
         this.R.c(false);
         this.R.o(0);
      }

      boolean $$4 = $$3 == cgv.b;
      $$3 = $$1 == -999 && $$3 == cgv.a ? cgv.e : $$3;
      if ($$0 == null && O.k() != cjp.h.b && $$3 != cgv.f) {
         if (!this.p.g().b() && this.W) {
            if ($$2 == 0) {
               this.f.s.a(this.p.g(), true);
               this.f.q.a(this.p.g());
               this.p.b(clj.b);
            }

            if ($$2 == 1) {
               clj $$18 = this.p.g().a(1);
               this.f.s.a($$18, true);
               this.f.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.f.s)) {
            return;
         }

         if ($$0 == this.T && $$4) {
            for (int $$5 = 0; $$5 < this.f.s.bR.c().size(); $$5++) {
               this.f.q.a(clj.b, $$5);
            }
         } else if (O.k() == cjp.h.b) {
            if ($$0 == this.T) {
               this.p.b(clj.b);
            } else if ($$3 == cgv.e && $$0 != null && $$0.g()) {
               clj $$6 = $$0.a($$2 == 0 ? 1 : $$0.f().g());
               clj $$7 = $$0.f();
               this.f.s.a($$6, true);
               this.f.q.a($$6);
               this.f.q.a($$7, ((fci.c)$$0).a.e);
            } else if ($$3 == cgv.e && !this.p.g().b()) {
               this.f.s.a(this.p.g(), true);
               this.f.q.a(this.p.g());
               this.p.b(clj.b);
            } else {
               this.f.s.bR.a($$0 == null ? $$1 : ((fci.c)$$0).a.e, $$2, $$3, this.f.s);
               this.f.s.bR.d();
            }
         } else if ($$3 != cgv.f && $$0.d == L) {
            clj $$8 = this.p.g();
            clj $$9 = $$0.f();
            if ($$3 == cgv.c) {
               if (!$$9.b()) {
                  this.f.s.fT().a($$2, $$9.c($$9.g()));
                  this.f.s.bR.d();
               }

               return;
            }

            if ($$3 == cgv.d) {
               if (this.p.g().b() && $$0.g()) {
                  clj $$10 = $$0.f();
                  this.p.b($$10.c($$10.g()));
               }

               return;
            }

            if ($$3 == cgv.e) {
               if (!$$9.b()) {
                  clj $$11 = $$9.c($$2 == 0 ? 1 : $$9.g());
                  this.f.s.a($$11, true);
                  this.f.q.a($$11);
               }

               return;
            }

            if (!$$8.b() && !$$9.b() && clj.c($$8, $$9)) {
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
               this.p.b(clj.b);
            } else if (!this.p.g().b()) {
               this.p.g().h(1);
            }
         } else if (this.p != null) {
            clj $$13 = $$0 == null ? clj.b : this.p.b($$0.e).f();
            this.p.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.f.s);
            if (cgm.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.f.q.a(this.p.b(45 + $$14).f(), 36 + $$14);
               }
            } else if ($$0 != null) {
               clj $$15 = this.p.b($$0.e).f();
               this.f.q.a($$15, $$0.e - this.p.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cgv.c) {
                  this.f.q.a($$13, $$16 - this.p.i.size() + 9 + 36);
               } else if ($$3 == cgv.e && !$$13.b()) {
                  clj $$17 = $$13.c($$2 == 0 ? 1 : $$13.g());
                  this.f.s.a($$17, true);
                  this.f.q.a($$17);
               }

               this.f.s.bR.d();
            }
         }
      }
   }

   private boolean a(@Nullable cih $$0) {
      return $$0 != null && $$0.d == L;
   }

   @Override
   protected void aP_() {
      if (this.f.q.g()) {
         super.aP_();
         this.R = new evi(this.i, this.t + 82, this.u + 6, 80, 9, ur.c("itemGroup.search"));
         this.R.l(50);
         this.R.d(false);
         this.R.g(false);
         this.R.m(16777215);
         this.e(this.R);
         cjp $$0 = O;
         O = cjq.b();
         this.a($$0);
         this.f.s.bR.b(this.U);
         this.U = new fch(this.f);
         this.f.s.bR.a(this.U);
         if (!O.i()) {
            this.a(cjq.b());
         }
      } else {
         this.f.a(new fct(this.f.s));
      }
   }

   @Override
   public void a(etd $$0, int $$1, int $$2) {
      int $$3 = this.p.a(this.P);
      String $$4 = this.R.a();
      this.b($$0, $$1, $$2);
      this.R.a($$4);
      if (!this.R.a().isEmpty()) {
         this.F();
      }

      this.P = this.p.e($$3);
      this.p.b(this.P);
   }

   @Override
   public void aG_() {
      super.aG_();
      if (this.f.s != null && this.f.s.fT() != null) {
         this.f.s.bR.b(this.U);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.V) {
         return false;
      } else if (O.k() != cjp.h.d) {
         return false;
      } else {
         String $$2 = this.R.a();
         if (this.R.a($$0, $$1)) {
            if (!Objects.equals($$2, this.R.a())) {
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
      this.V = false;
      if (O.k() != cjp.h.d) {
         if (this.f.m.K.a($$0, $$1)) {
            this.V = true;
            this.a(cjq.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.r) || this.r.g();
         boolean $$4 = emr.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.V = true;
            return true;
         } else {
            String $$5 = this.R.a();
            if (this.R.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.R.a())) {
                  this.F();
               }

               return true;
            } else {
               return this.R.aJ_() && this.R.u() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.V = false;
      return super.b($$0, $$1, $$2);
   }

   private void F() {
      this.p.k.clear();
      this.X.clear();
      String $$0 = this.R.a();
      if ($$0.isEmpty()) {
         this.p.k.addAll(O.l());
      } else {
         gfp<clj> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.f.a(gfo.b);
            this.a($$0);
         } else {
            $$1 = this.f.a(gfo.a);
         }

         this.p.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<agi> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      jy.i.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.X::add);
   }

   @Override
   protected void b(euo $$0, int $$1, int $$2) {
      if (O.d()) {
         $$0.a(this.i, O.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.t;
         double $$4 = $$1 - (double)this.u;

         for (cjp $$5 : cjq.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (O.k() != cjp.h.b && this.a($$0, $$1)) {
            this.Q = this.H();
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

         for (cjp $$5 : cjq.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean H() {
      return O.e() && this.p.m();
   }

   private void a(cjp $$0) {
      cjp $$1 = O;
      O = $$0;
      this.v.clear();
      this.p.k.clear();
      this.l();
      if (O.k() == cjp.h.c) {
         esz $$2 = this.f.aA();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            fpy $$4 = $$2.a($$3);
            if ($$4.isEmpty()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     clj $$6 = new clj(clm.qL);
                     $$6.a("CustomCreativeLock");
                     ur $$7 = this.f.m.U[$$3].k();
                     ur $$8 = this.f.m.V.k();
                     $$6.a(ur.a("inventory.hotbarInfo", $$8, $$7));
                     this.p.k.add($$6);
                  } else {
                     this.p.k.add(clj.b);
                  }
               }
            } else {
               this.p.k.addAll($$4);
            }
         }
      } else if (O.k() == cjp.h.a) {
         this.p.k.addAll(O.l());
      }

      if (O.k() == cjp.h.b) {
         cgm $$9 = this.f.s.bR;
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

            cih $$26 = new fci.c($$9.i.get($$10), $$10, $$14, $$15);
            this.p.i.add($$26);
         }

         this.T = new cih(L, 0, 173, 112);
         this.p.i.add(this.T);
      } else if ($$1.k() == cjp.h.b) {
         this.p.i.clear();
         this.p.i.addAll(this.S);
         this.S = null;
      }

      if (O.k() == cjp.h.d) {
         this.R.g(true);
         this.R.f(false);
         this.R.b_(true);
         if ($$1 != $$0) {
            this.R.a("");
         }

         this.F();
      } else {
         this.R.g(false);
         this.R.f(true);
         this.R.b_(false);
         this.R.a("");
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.H()) {
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
         this.P = atm.a(this.P, 0.0F, 1.0F);
         this.p.b(this.P);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cjp $$4 : cjq.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.T != null && O.k() == cjp.h.b && this.a(this.T.f, this.T.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.i, M, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<ur> a(clj $$0) {
      boolean $$1 = this.r != null && this.r instanceof fci.a;
      boolean $$2 = O.k() == cjp.h.a;
      boolean $$3 = O.k() == cjp.h.d;
      cna.a $$4 = this.f.m.m ? cna.a.b : cna.a.a;
      cna $$5 = $$1 ? $$4.c() : $$4;
      List<ur> $$6 = $$0.a(this.f.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<ur> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.X.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, ur.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cjp $$9 : cjq.c()) {
            if ($$9.k() != cjp.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      for (cjp $$4 : cjq.c()) {
         if ($$4 != O) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new agi("textures/gui/container/creative_inventory/tab_" + O.c()), this.t, this.u, 0, 0, this.c, this.k);
      this.R.a($$0, $$2, $$3, $$1);
      int $$5 = this.t + 175;
      int $$6 = this.u + 18;
      int $$7 = $$6 + 112;
      if (O.e()) {
         agi $$8 = this.H() ? x : y;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.P), 12, 15);
      }

      this.a($$0, O);
      if (O.k() == cjp.h.b) {
         fct.a($$0, this.t + 73, this.u + 6, this.t + 105, this.u + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.f.s);
      }
   }

   private int b(cjp $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cjp $$0) {
      int $$1 = 0;
      if ($$0.g() == cjp.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.k;
      }

      return $$1;
   }

   protected boolean a(cjp $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(euo $$0, cjp $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.i, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(euo $$0, cjp $$1) {
      boolean $$2 = $$1 == O;
      boolean $$3 = $$1.g() == cjp.f.a;
      int $$4 = $$1.f();
      int $$5 = this.t + this.b($$1);
      int $$6 = this.u - ($$3 ? 28 : -(this.k - 4));
      agi[] $$7;
      if ($$3) {
         $$7 = $$2 ? A : z;
      } else {
         $$7 = $$2 ? C : B;
      }

      $$0.a($$7[atm.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      clj $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.i, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean E() {
      return O.k() == cjp.h.b;
   }

   public static void a(etd $$0, int $$1, boolean $$2, boolean $$3) {
      fpw $$4 = $$0.s;
      esz $$5 = $$0.aA();
      fpy $$6 = $$5.a($$1);
      if ($$2) {
         for (int $$7 = 0; $$7 < cdt.g(); $$7++) {
            clj $$8 = (clj)$$6.get($$7);
            clj $$9 = $$8.a($$4.dN().H()) ? $$8.p() : clj.b;
            $$4.fT().a($$7, $$9);
            $$0.q.a($$9, 36 + $$7);
         }

         $$4.bR.d();
      } else if ($$3) {
         for (int $$10 = 0; $$10 < cdt.g(); $$10++) {
            $$6.set($$10, $$4.fT().a($$10).p());
         }

         ur $$11 = $$0.m.U[$$1].k();
         ur $$12 = $$0.m.W.k();
         ur $$13 = ur.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aU().c($$13);
         $$5.a();
      }
   }

   static class a extends cih {
      public a(biq $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cdu $$0) {
         clj $$1 = this.f();
         return super.a($$0) && !$$1.b() ? $$1.a($$0.dN().H()) && $$1.b("CustomCreativeLock") == null : $$1.b();
      }
   }

   public static class b extends cgm {
      public final il<clj> k = il.a();
      private final cgm l;

      public b(cdu $$0) {
         super(null, 0);
         this.l = $$0.bR;
         cdt $$1 = $$0.fT();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fci.a(fci.L, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cih($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cdu $$0) {
         return true;
      }

      protected int l() {
         return atm.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return atm.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return atm.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fci.L.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fci.L.a($$3 + $$2 * 9, clj.b);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public clj a(cdu $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cih $$2 = this.i.get($$1);
            if ($$2 != null && $$2.g()) {
               $$2.e(clj.b);
            }
         }

         return clj.b;
      }

      @Override
      public boolean a(clj $$0, cih $$1) {
         return $$1.d != fci.L;
      }

      @Override
      public boolean b(cih $$0) {
         return $$0.d != fci.L;
      }

      @Override
      public clj g() {
         return this.l.g();
      }

      @Override
      public void b(clj $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cih {
      final cih a;

      public c(cih $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cdu $$0, clj $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(clj $$0) {
         return this.a.a($$0);
      }

      @Override
      public clj f() {
         return this.a.f();
      }

      @Override
      public boolean g() {
         return this.a.g();
      }

      @Override
      public void a(clj $$0, clj $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(clj $$0) {
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
      public int a_(clj $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<agi, agi> c() {
         return this.a.c();
      }

      @Override
      public clj a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cdu $$0) {
         return this.a.a($$0);
      }
   }
}
