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

public class ezw extends ezz<ezw.b> {
   private static final aex x = new aex("container/creative_inventory/scroller");
   private static final aex y = new aex("container/creative_inventory/scroller_disabled");
   private static final aex[] z = new aex[]{
      new aex("container/creative_inventory/tab_top_unselected_1"),
      new aex("container/creative_inventory/tab_top_unselected_2"),
      new aex("container/creative_inventory/tab_top_unselected_3"),
      new aex("container/creative_inventory/tab_top_unselected_4"),
      new aex("container/creative_inventory/tab_top_unselected_5"),
      new aex("container/creative_inventory/tab_top_unselected_6"),
      new aex("container/creative_inventory/tab_top_unselected_7")
   };
   private static final aex[] A = new aex[]{
      new aex("container/creative_inventory/tab_top_selected_1"),
      new aex("container/creative_inventory/tab_top_selected_2"),
      new aex("container/creative_inventory/tab_top_selected_3"),
      new aex("container/creative_inventory/tab_top_selected_4"),
      new aex("container/creative_inventory/tab_top_selected_5"),
      new aex("container/creative_inventory/tab_top_selected_6"),
      new aex("container/creative_inventory/tab_top_selected_7")
   };
   private static final aex[] B = new aex[]{
      new aex("container/creative_inventory/tab_bottom_unselected_1"),
      new aex("container/creative_inventory/tab_bottom_unselected_2"),
      new aex("container/creative_inventory/tab_bottom_unselected_3"),
      new aex("container/creative_inventory/tab_bottom_unselected_4"),
      new aex("container/creative_inventory/tab_bottom_unselected_5"),
      new aex("container/creative_inventory/tab_bottom_unselected_6"),
      new aex("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final aex[] C = new aex[]{
      new aex("container/creative_inventory/tab_bottom_selected_1"),
      new aex("container/creative_inventory/tab_bottom_selected_2"),
      new aex("container/creative_inventory/tab_bottom_selected_3"),
      new aex("container/creative_inventory/tab_bottom_selected_4"),
      new aex("container/creative_inventory/tab_bottom_selected_5"),
      new aex("container/creative_inventory/tab_bottom_selected_6"),
      new aex("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String D = "textures/gui/container/creative_inventory/tab_";
   private static final String E = "CustomCreativeLock";
   private static final int F = 5;
   private static final int G = 9;
   private static final int H = 26;
   private static final int I = 32;
   private static final int J = 12;
   private static final int K = 15;
   static final bhf L = new bhf(45);
   private static final tm M = tm.c("inventory.binSlot");
   private static final int N = 16777215;
   private static chl O = chm.b();
   private float P;
   private boolean Q;
   private esz R;
   @Nullable
   private List<cgd> S;
   @Nullable
   private cgd T;
   private ezv U;
   private boolean V;
   private boolean W;
   private final Set<aqi<cja>> X = new HashSet<>();
   private final boolean Y;

   public ezw(cbu $$0, cec $$1, boolean $$2) {
      super(new ezw.b($$0), $$0.fR(), tl.a);
      $$0.bS = this.p;
      this.k = 136;
      this.c = 195;
      this.Y = $$2;
      chm.a($$1, this.a($$0), $$0.dL().G_());
   }

   private boolean a(cbu $$0) {
      return $$0.go() && this.Y;
   }

   private void a(cec $$0, boolean $$1, hi.b $$2) {
      if (chm.a($$0, $$1, $$2)) {
         for (chl $$3 : chm.d()) {
            Collection<cjf> $$4 = $$3.l();
            if ($$3 == O) {
               if ($$3.k() == chl.h.a && $$4.isEmpty()) {
                  this.a(chm.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<cjf> $$0) {
      int $$1 = this.p.a(this.P);
      this.p.k.clear();
      if (O.k() == chl.h.d) {
         this.G();
      } else {
         this.p.k.addAll($$0);
      }

      this.P = this.p.e($$1);
      this.p.b(this.P);
   }

   @Override
   public void D() {
      super.D();
      if (this.f != null) {
         if (this.f.s != null) {
            this.a(this.f.s.cn.x(), this.a(this.f.s), this.f.s.dL().G_());
         }

         if (!this.f.q.g()) {
            this.f.a(new fah(this.f.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cgd $$0, int $$1, int $$2, ceu $$3) {
      if (this.a($$0)) {
         this.R.c(false);
         this.R.o(0);
      }

      boolean $$4 = $$3 == ceu.b;
      $$3 = $$1 == -999 && $$3 == ceu.a ? ceu.e : $$3;
      if ($$0 == null && O.k() != chl.h.b && $$3 != ceu.f) {
         if (!this.p.g().b() && this.W) {
            if ($$2 == 0) {
               this.f.s.a(this.p.g(), true);
               this.f.q.a(this.p.g());
               this.p.b(cjf.b);
            }

            if ($$2 == 1) {
               cjf $$18 = this.p.g().a(1);
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
               this.f.q.a(cjf.b, $$5);
            }
         } else if (O.k() == chl.h.b) {
            if ($$0 == this.T) {
               this.p.b(cjf.b);
            } else if ($$3 == ceu.e && $$0 != null && $$0.f()) {
               cjf $$6 = $$0.a($$2 == 0 ? 1 : $$0.e().g());
               cjf $$7 = $$0.e();
               this.f.s.a($$6, true);
               this.f.q.a($$6);
               this.f.q.a($$7, ((ezw.c)$$0).a.e);
            } else if ($$3 == ceu.e && !this.p.g().b()) {
               this.f.s.a(this.p.g(), true);
               this.f.q.a(this.p.g());
               this.p.b(cjf.b);
            } else {
               this.f.s.bR.a($$0 == null ? $$1 : ((ezw.c)$$0).a.e, $$2, $$3, this.f.s);
               this.f.s.bR.d();
            }
         } else if ($$3 != ceu.f && $$0.d == L) {
            cjf $$8 = this.p.g();
            cjf $$9 = $$0.e();
            if ($$3 == ceu.c) {
               if (!$$9.b()) {
                  this.f.s.fR().a($$2, $$9.c($$9.g()));
                  this.f.s.bR.d();
               }

               return;
            }

            if ($$3 == ceu.d) {
               if (this.p.g().b() && $$0.f()) {
                  cjf $$10 = $$0.e();
                  this.p.b($$10.c($$10.g()));
               }

               return;
            }

            if ($$3 == ceu.e) {
               if (!$$9.b()) {
                  cjf $$11 = $$9.c($$2 == 0 ? 1 : $$9.g());
                  this.f.s.a($$11, true);
                  this.f.q.a($$11);
               }

               return;
            }

            if (!$$8.b() && !$$9.b() && cjf.c($$8, $$9)) {
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
               this.p.b(cjf.b);
            } else if (!this.p.g().b()) {
               this.p.g().h(1);
            }
         } else if (this.p != null) {
            cjf $$13 = $$0 == null ? cjf.b : this.p.b($$0.e).e();
            this.p.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.f.s);
            if (cel.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.f.q.a(this.p.b(45 + $$14).e(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cjf $$15 = this.p.b($$0.e).e();
               this.f.q.a($$15, $$0.e - this.p.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == ceu.c) {
                  this.f.q.a($$13, $$16 - this.p.i.size() + 9 + 36);
               } else if ($$3 == ceu.e && !$$13.b()) {
                  cjf $$17 = $$13.c($$2 == 0 ? 1 : $$13.g());
                  this.f.s.a($$17, true);
                  this.f.q.a($$17);
               }

               this.f.s.bR.d();
            }
         }
      }
   }

   private boolean a(@Nullable cgd $$0) {
      return $$0 != null && $$0.d == L;
   }

   @Override
   protected void aI_() {
      if (this.f.q.g()) {
         super.aI_();
         this.R = new esz(this.i, this.t + 82, this.u + 6, 80, 9, tm.c("itemGroup.search"));
         this.R.l(50);
         this.R.d(false);
         this.R.g(false);
         this.R.m(16777215);
         this.e(this.R);
         chl $$0 = O;
         O = chm.b();
         this.a($$0);
         this.f.s.bR.b(this.U);
         this.U = new ezv(this.f);
         this.f.s.bR.a(this.U);
         if (!O.i()) {
            this.a(chm.b());
         }
      } else {
         this.f.a(new fah(this.f.s));
      }
   }

   @Override
   public void a(eqv $$0, int $$1, int $$2) {
      int $$3 = this.p.a(this.P);
      String $$4 = this.R.a();
      this.b($$0, $$1, $$2);
      this.R.a($$4);
      if (!this.R.a().isEmpty()) {
         this.G();
      }

      this.P = this.p.e($$3);
      this.p.b(this.P);
   }

   @Override
   public void aA_() {
      super.aA_();
      if (this.f.s != null && this.f.s.fR() != null) {
         this.f.s.bR.b(this.U);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.V) {
         return false;
      } else if (O.k() != chl.h.d) {
         return false;
      } else {
         String $$2 = this.R.a();
         if (this.R.a($$0, $$1)) {
            if (!Objects.equals($$2, this.R.a())) {
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
      this.V = false;
      if (O.k() != chl.h.d) {
         if (this.f.m.K.a($$0, $$1)) {
            this.V = true;
            this.a(chm.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.s) || this.s.f();
         boolean $$4 = ekk.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.V = true;
            return true;
         } else {
            String $$5 = this.R.a();
            if (this.R.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.R.a())) {
                  this.G();
               }

               return true;
            } else {
               return this.R.aD_() && this.R.v() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.V = false;
      return super.b($$0, $$1, $$2);
   }

   private void G() {
      this.p.k.clear();
      this.X.clear();
      String $$0 = this.R.a();
      if ($$0.isEmpty()) {
         this.p.k.addAll(O.l());
      } else {
         gcz<cjf> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.f.a(gcy.b);
            this.a($$0);
         } else {
            $$1 = this.f.a(gcy.a);
         }

         this.p.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.P = 0.0F;
      this.p.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<aex> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      jd.i.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.X::add);
   }

   @Override
   protected void b(esf $$0, int $$1, int $$2) {
      if (O.d()) {
         $$0.a(this.i, O.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.t;
         double $$4 = $$1 - (double)this.u;

         for (chl $$5 : chm.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (O.k() != chl.h.b && this.a($$0, $$1)) {
            this.Q = this.I();
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

         for (chl $$5 : chm.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean I() {
      return O.e() && this.p.m();
   }

   private void a(chl $$0) {
      chl $$1 = O;
      O = $$0;
      this.v.clear();
      this.p.k.clear();
      this.l();
      if (O.k() == chl.h.c) {
         eqr $$2 = this.f.aB();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            fni $$4 = $$2.a($$3);
            if ($$4.isEmpty()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cjf $$6 = new cjf(cji.qa);
                     $$6.a("CustomCreativeLock");
                     tm $$7 = this.f.m.U[$$3].k();
                     tm $$8 = this.f.m.V.k();
                     $$6.a(tm.a("inventory.hotbarInfo", $$8, $$7));
                     this.p.k.add($$6);
                  } else {
                     this.p.k.add(cjf.b);
                  }
               }
            } else {
               this.p.k.addAll($$4);
            }
         }
      } else if (O.k() == chl.h.a) {
         this.p.k.addAll(O.l());
      }

      if (O.k() == chl.h.b) {
         cel $$9 = this.f.s.bR;
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

            cgd $$26 = new ezw.c($$9.i.get($$10), $$10, $$14, $$15);
            this.p.i.add($$26);
         }

         this.T = new cgd(L, 0, 173, 112);
         this.p.i.add(this.T);
      } else if ($$1.k() == chl.h.b) {
         this.p.i.clear();
         this.p.i.addAll(this.S);
         this.S = null;
      }

      if (O.k() == chl.h.d) {
         this.R.g(true);
         this.R.f(false);
         this.R.b_(true);
         if ($$1 != $$0) {
            this.R.a("");
         }

         this.G();
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
      if (!this.I()) {
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
         this.P = arx.a(this.P, 0.0F, 1.0F);
         this.p.b(this.P);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (chl $$4 : chm.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.T != null && O.k() == chl.h.b && this.a(this.T.f, this.T.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.i, M, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<tm> a(cjf $$0) {
      boolean $$1 = this.s != null && this.s instanceof ezw.a;
      boolean $$2 = O.k() == chl.h.a;
      boolean $$3 = O.k() == chl.h.d;
      ckw.a $$4 = this.f.m.m ? ckw.a.b : ckw.a.a;
      ckw $$5 = $$1 ? $$4.c() : $$4;
      List<tm> $$6 = $$0.a(this.f.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<tm> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.X.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, tm.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (chl $$9 : chm.c()) {
            if ($$9.k() != chl.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().e().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(esf $$0, float $$1, int $$2, int $$3) {
      for (chl $$4 : chm.c()) {
         if ($$4 != O) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new aex("textures/gui/container/creative_inventory/tab_" + O.c()), this.t, this.u, 0, 0, this.c, this.k);
      this.R.a($$0, $$2, $$3, $$1);
      int $$5 = this.t + 175;
      int $$6 = this.u + 18;
      int $$7 = $$6 + 112;
      if (O.e()) {
         aex $$8 = this.I() ? x : y;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.P), 12, 15);
      }

      this.a($$0, O);
      if (O.k() == chl.h.b) {
         fah.a($$0, this.t + 73, this.u + 6, this.t + 105, this.u + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.f.s);
      }
   }

   private int b(chl $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(chl $$0) {
      int $$1 = 0;
      if ($$0.g() == chl.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.k;
      }

      return $$1;
   }

   protected boolean a(chl $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(esf $$0, chl $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.i, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(esf $$0, chl $$1) {
      boolean $$2 = $$1 == O;
      boolean $$3 = $$1.g() == chl.f.a;
      int $$4 = $$1.f();
      int $$5 = this.t + this.b($$1);
      int $$6 = this.u - ($$3 ? 28 : -(this.k - 4));
      aex[] $$7;
      if ($$3) {
         $$7 = $$2 ? A : z;
      } else {
         $$7 = $$2 ? C : B;
      }

      $$0.a($$7[arx.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cjf $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.i, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return O.k() == chl.h.b;
   }

   public static void a(eqv $$0, int $$1, boolean $$2, boolean $$3) {
      fng $$4 = $$0.s;
      eqr $$5 = $$0.aB();
      fni $$6 = $$5.a($$1);
      if ($$2) {
         for (int $$7 = 0; $$7 < cbt.g(); $$7++) {
            cjf $$8 = (cjf)$$6.get($$7);
            cjf $$9 = $$8.a($$4.dL().G()) ? $$8.p() : cjf.b;
            $$4.fR().a($$7, $$9);
            $$0.q.a($$9, 36 + $$7);
         }

         $$4.bR.d();
      } else if ($$3) {
         for (int $$10 = 0; $$10 < cbt.g(); $$10++) {
            $$6.set($$10, $$4.fR().a($$10).p());
         }

         tm $$11 = $$0.m.U[$$1].k();
         tm $$12 = $$0.m.W.k();
         tm $$13 = tm.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aV().c($$13);
         $$5.a();
      }
   }

   static class a extends cgd {
      public a(bgr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cbu $$0) {
         cjf $$1 = this.e();
         return super.a($$0) && !$$1.b() ? $$1.a($$0.dL().G()) && $$1.b("CustomCreativeLock") == null : $$1.b();
      }
   }

   public static class b extends cel {
      public final hp<cjf> k = hp.a();
      private final cel l;

      public b(cbu $$0) {
         super(null, 0);
         this.l = $$0.bR;
         cbt $$1 = $$0.fR();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new ezw.a(ezw.L, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgd($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cbu $$0) {
         return true;
      }

      protected int l() {
         return arx.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return arx.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return arx.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  ezw.L.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  ezw.L.a($$3 + $$2 * 9, cjf.b);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public cjf a(cbu $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cgd $$2 = this.i.get($$1);
            if ($$2 != null && $$2.f()) {
               $$2.d(cjf.b);
            }
         }

         return cjf.b;
      }

      @Override
      public boolean a(cjf $$0, cgd $$1) {
         return $$1.d != ezw.L;
      }

      @Override
      public boolean b(cgd $$0) {
         return $$0.d != ezw.L;
      }

      @Override
      public cjf g() {
         return this.l.g();
      }

      @Override
      public void b(cjf $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cgd {
      final cgd a;

      public c(cgd $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cbu $$0, cjf $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cjf $$0) {
         return this.a.a($$0);
      }

      @Override
      public cjf e() {
         return this.a.e();
      }

      @Override
      public boolean f() {
         return this.a.f();
      }

      @Override
      public void a(cjf $$0, cjf $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void e(cjf $$0) {
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
      public int a_(cjf $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<aex, aex> b() {
         return this.a.b();
      }

      @Override
      public cjf a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean c() {
         return this.a.c();
      }

      @Override
      public boolean a(cbu $$0) {
         return this.a.a($$0);
      }
   }
}
