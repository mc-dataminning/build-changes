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

public class flb extends fle<flb.b> {
   private static final ajt A = new ajt("container/creative_inventory/scroller");
   private static final ajt B = new ajt("container/creative_inventory/scroller_disabled");
   private static final ajt[] C = new ajt[]{
      new ajt("container/creative_inventory/tab_top_unselected_1"),
      new ajt("container/creative_inventory/tab_top_unselected_2"),
      new ajt("container/creative_inventory/tab_top_unselected_3"),
      new ajt("container/creative_inventory/tab_top_unselected_4"),
      new ajt("container/creative_inventory/tab_top_unselected_5"),
      new ajt("container/creative_inventory/tab_top_unselected_6"),
      new ajt("container/creative_inventory/tab_top_unselected_7")
   };
   private static final ajt[] D = new ajt[]{
      new ajt("container/creative_inventory/tab_top_selected_1"),
      new ajt("container/creative_inventory/tab_top_selected_2"),
      new ajt("container/creative_inventory/tab_top_selected_3"),
      new ajt("container/creative_inventory/tab_top_selected_4"),
      new ajt("container/creative_inventory/tab_top_selected_5"),
      new ajt("container/creative_inventory/tab_top_selected_6"),
      new ajt("container/creative_inventory/tab_top_selected_7")
   };
   private static final ajt[] E = new ajt[]{
      new ajt("container/creative_inventory/tab_bottom_unselected_1"),
      new ajt("container/creative_inventory/tab_bottom_unselected_2"),
      new ajt("container/creative_inventory/tab_bottom_unselected_3"),
      new ajt("container/creative_inventory/tab_bottom_unselected_4"),
      new ajt("container/creative_inventory/tab_bottom_unselected_5"),
      new ajt("container/creative_inventory/tab_bottom_unselected_6"),
      new ajt("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final ajt[] F = new ajt[]{
      new ajt("container/creative_inventory/tab_bottom_selected_1"),
      new ajt("container/creative_inventory/tab_bottom_selected_2"),
      new ajt("container/creative_inventory/tab_bottom_selected_3"),
      new ajt("container/creative_inventory/tab_bottom_selected_4"),
      new ajt("container/creative_inventory/tab_bottom_selected_5"),
      new ajt("container/creative_inventory/tab_bottom_selected_6"),
      new ajt("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String G = "textures/gui/container/creative_inventory/tab_";
   private static final int H = 5;
   private static final int I = 9;
   private static final int J = 26;
   private static final int K = 32;
   private static final int L = 12;
   private static final int M = 15;
   static final boj N = new boj(45);
   private static final wg O = wg.c("inventory.binSlot");
   private static final int P = 16777215;
   private static cpu Q = cpv.b();
   private float R;
   private boolean S;
   private fdy T;
   @Nullable
   private List<cok> U;
   @Nullable
   private cok V;
   private fla W;
   private boolean X;
   private boolean Y;
   private final Set<avr<cre>> Z = new HashSet<>();
   private final boolean aa;

   public flb(cjt $$0, cmg $$1, boolean $$2) {
      super(new flb.b($$0), $$0.fZ(), wf.a);
      $$0.bY = this.s;
      this.d = 136;
      this.c = 195;
      this.aa = $$2;
      cpv.a($$1, this.a($$0), $$0.dM().H_());
   }

   private boolean a(cjt $$0) {
      return $$0.gw() && this.aa;
   }

   private void a(cmg $$0, boolean $$1, in.a $$2) {
      if (cpv.a($$0, $$1, $$2)) {
         for (cpu $$3 : cpv.d()) {
            Collection<crj> $$4 = $$3.l();
            if ($$3 == Q) {
               if ($$3.k() == cpu.h.a && $$4.isEmpty()) {
                  this.a(cpv.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<crj> $$0) {
      int $$1 = this.s.a(this.R);
      this.s.k.clear();
      if (Q.k() == cpu.h.d) {
         this.F();
      } else {
         this.s.k.addAll($$0);
      }

      this.R = this.s.e($$1);
      this.s.b(this.R);
   }

   @Override
   public void C() {
      super.C();
      if (this.j != null) {
         if (this.j.s != null) {
            this.a(this.j.s.ct.y(), this.a(this.j.s), this.j.s.dM().H_());
         }

         if (!this.j.q.f()) {
            this.j.a(new flm(this.j.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cok $$0, int $$1, int $$2, cmy $$3) {
      if (this.a($$0)) {
         this.T.c(false);
         this.T.i(0);
      }

      boolean $$4 = $$3 == cmy.b;
      $$3 = $$1 == -999 && $$3 == cmy.a ? cmy.e : $$3;
      if ($$0 == null && Q.k() != cpu.h.b && $$3 != cmy.f) {
         if (!this.s.g().d() && this.Y) {
            if ($$2 == 0) {
               this.j.s.a(this.s.g(), true);
               this.j.q.a(this.s.g());
               this.s.b(crj.i);
            }

            if ($$2 == 1) {
               crj $$18 = this.s.g().a(1);
               this.j.s.a($$18, true);
               this.j.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.j.s)) {
            return;
         }

         if ($$0 == this.V && $$4) {
            for (int $$5 = 0; $$5 < this.j.s.bX.c().size(); $$5++) {
               this.j.q.a(crj.i, $$5);
            }
         } else if (Q.k() == cpu.h.b) {
            if ($$0 == this.V) {
               this.s.b(crj.i);
            } else if ($$3 == cmy.e && $$0 != null && $$0.h()) {
               crj $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().i());
               crj $$7 = $$0.g();
               this.j.s.a($$6, true);
               this.j.q.a($$6);
               this.j.q.a($$7, ((flb.c)$$0).a.e);
            } else if ($$3 == cmy.e && !this.s.g().d()) {
               this.j.s.a(this.s.g(), true);
               this.j.q.a(this.s.g());
               this.s.b(crj.i);
            } else {
               this.j.s.bX.a($$0 == null ? $$1 : ((flb.c)$$0).a.e, $$2, $$3, this.j.s);
               this.j.s.bX.d();
            }
         } else if ($$3 != cmy.f && $$0.d == N) {
            crj $$8 = this.s.g();
            crj $$9 = $$0.g();
            if ($$3 == cmy.c) {
               if (!$$9.d()) {
                  this.j.s.fZ().a($$2, $$9.c($$9.i()));
                  this.j.s.bX.d();
               }

               return;
            }

            if ($$3 == cmy.d) {
               if (this.s.g().d() && $$0.h()) {
                  crj $$10 = $$0.g();
                  this.s.b($$10.c($$10.i()));
               }

               return;
            }

            if ($$3 == cmy.e) {
               if (!$$9.d()) {
                  crj $$11 = $$9.c($$2 == 0 ? 1 : $$9.i());
                  this.j.s.a($$11, true);
                  this.j.q.a($$11);
               }

               return;
            }

            if (!$$8.d() && !$$9.d() && crj.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.e($$8.i());
                  } else if ($$8.G() < $$8.i()) {
                     $$8.f(1);
                  }
               } else {
                  $$8.g(1);
               }
            } else if (!$$9.d() && $$8.d()) {
               int $$12 = $$4 ? $$9.i() : $$9.G();
               this.s.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.s.b(crj.i);
            } else if (!this.s.g().d()) {
               this.s.g().g(1);
            }
         } else if (this.s != null) {
            crj $$13 = $$0 == null ? crj.i : this.s.b($$0.e).g();
            this.s.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.j.s);
            if (cmp.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.j.q.a(this.s.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               crj $$15 = this.s.b($$0.e).g();
               this.j.q.a($$15, $$0.e - this.s.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cmy.c) {
                  this.j.q.a($$13, $$16 - this.s.i.size() + 9 + 36);
               } else if ($$3 == cmy.e && !$$13.d()) {
                  crj $$17 = $$13.c($$2 == 0 ? 1 : $$13.i());
                  this.j.s.a($$17, true);
                  this.j.q.a($$17);
               }

               this.j.s.bX.d();
            }
         }
      }
   }

   private boolean a(@Nullable cok $$0) {
      return $$0 != null && $$0.d == N;
   }

   @Override
   protected void aN_() {
      if (this.j.q.f()) {
         super.aN_();
         this.T = new fdy(this.m, this.w + 82, this.x + 6, 80, 9, wg.c("itemGroup.search"));
         this.T.f(50);
         this.T.d(false);
         this.T.g(false);
         this.T.g(16777215);
         this.d(this.T);
         cpu $$0 = Q;
         Q = cpv.b();
         this.a($$0);
         this.j.s.bX.b(this.W);
         this.W = new fla(this.j);
         this.j.s.bX.a(this.W);
         if (!Q.i()) {
            this.a(cpv.b());
         }
      } else {
         this.j.a(new flm(this.j.s));
      }
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
      int $$3 = this.s.a(this.R);
      String $$4 = this.T.a();
      this.b($$0, $$1, $$2);
      this.T.a($$4);
      if (!this.T.a().isEmpty()) {
         this.F();
      }

      this.R = this.s.e($$3);
      this.s.b(this.R);
   }

   @Override
   public void j() {
      super.j();
      if (this.j.s != null && this.j.s.fZ() != null) {
         this.j.s.bX.b(this.W);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.X) {
         return false;
      } else if (Q.k() != cpu.h.d) {
         return false;
      } else {
         String $$2 = this.T.a();
         if (this.T.a($$0, $$1)) {
            if (!Objects.equals($$2, this.T.a())) {
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
      this.X = false;
      if (Q.k() != cpu.h.d) {
         if (this.j.m.K.a($$0, $$1)) {
            this.X = true;
            this.a(cpv.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.v) || this.v.h();
         boolean $$4 = evd.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.X = true;
            return true;
         } else {
            String $$5 = this.T.a();
            if (this.T.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.T.a())) {
                  this.F();
               }

               return true;
            } else {
               return this.T.aJ_() && this.T.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.X = false;
      return super.c($$0, $$1, $$2);
   }

   private void F() {
      this.s.k.clear();
      this.Z.clear();
      String $$0 = this.T.a();
      if ($$0.isEmpty()) {
         this.s.k.addAll(Q.l());
      } else {
         gpj<crj> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.j.a(gpi.b);
            this.a($$0);
         } else {
            $$1 = this.j.a(gpi.a);
         }

         this.s.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.R = 0.0F;
      this.s.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<ajt> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      kr.h.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.Z::add);
   }

   @Override
   protected void b(fdc $$0, int $$1, int $$2) {
      if (Q.d()) {
         $$0.a(this.m, Q.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.w;
         double $$4 = $$1 - (double)this.x;

         for (cpu $$5 : cpv.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (Q.k() != cpu.h.b && this.b($$0, $$1)) {
            this.S = this.J();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.w;
         double $$4 = $$1 - (double)this.x;
         this.S = false;

         for (cpu $$5 : cpv.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean J() {
      return Q.e() && this.s.m();
   }

   private void a(cpu $$0) {
      cpu $$1 = Q;
      Q = $$0;
      this.y.clear();
      this.s.k.clear();
      this.m();
      if (Q.k() == cpu.h.c) {
         fbl $$2 = this.j.aD();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            fzd $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     crj $$6 = new crj(crm.qN);
                     $$6.b(jp.m, aym.a);
                     wg $$7 = this.j.m.U[$$3].k();
                     wg $$8 = this.j.m.V.k();
                     $$6.b(jp.d, wg.a("inventory.hotbarInfo", $$8, $$7));
                     this.s.k.add($$6);
                  } else {
                     this.s.k.add(crj.i);
                  }
               }
            } else {
               this.s.k.addAll($$4.a(this.j.r.H_()));
            }
         }
      } else if (Q.k() == cpu.h.a) {
         this.s.k.addAll(Q.l());
      }

      if (Q.k() == cpu.h.b) {
         cmp $$9 = this.j.s.bX;
         if (this.U == null) {
            this.U = ImmutableList.copyOf(this.s.i);
         }

         this.s.i.clear();

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

            cok $$26 = new flb.c($$9.i.get($$10), $$10, $$14, $$15);
            this.s.i.add($$26);
         }

         this.V = new cok(N, 0, 173, 112);
         this.s.i.add(this.V);
      } else if ($$1.k() == cpu.h.b) {
         this.s.i.clear();
         this.s.i.addAll(this.U);
         this.U = null;
      }

      if (Q.k() == cpu.h.d) {
         this.T.g(true);
         this.T.f(false);
         this.T.a(true);
         if ($$1 != $$0) {
            this.T.a("");
         }

         this.F();
      } else {
         this.T.g(false);
         this.T.f(true);
         this.T.a(false);
         this.T.a("");
      }

      this.R = 0.0F;
      this.s.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.J()) {
         return false;
      } else {
         this.R = this.s.a(this.R, $$3);
         this.s.b(this.R);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      this.Y = $$5 && !this.a(Q, $$0, $$1);
      return this.Y;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.w;
      int $$3 = this.x;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.S) {
         int $$5 = this.x + 18;
         int $$6 = $$5 + 112;
         this.R = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.R = axk.a(this.R, 0.0F, 1.0F);
         this.s.b(this.R);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cpu $$4 : cpv.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.V != null && Q.k() == cpu.h.b && this.a(this.V.f, this.V.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.m, O, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<wg> a(crj $$0) {
      boolean $$1 = this.v != null && this.v instanceof flb.a;
      boolean $$2 = Q.k() == cpu.h.a;
      boolean $$3 = Q.k() == cpu.h.d;
      csz.a $$4 = this.j.m.m ? csz.a.b : csz.a.a;
      csz $$5 = $$1 ? $$4.c() : $$4;
      List<wg> $$6 = $$0.a(this.j.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<wg> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.Z.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, wg.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cpu $$9 : cpv.c()) {
            if ($$9.k() != cpu.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      for (cpu $$4 : cpv.c()) {
         if ($$4 != Q) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new ajt("textures/gui/container/creative_inventory/tab_" + Q.c()), this.w, this.x, 0, 0, this.c, this.d);
      this.T.a($$0, $$2, $$3, $$1);
      int $$5 = this.w + 175;
      int $$6 = this.x + 18;
      int $$7 = $$6 + 112;
      if (Q.e()) {
         ajt $$8 = this.J() ? A : B;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.R), 12, 15);
      }

      this.a($$0, Q);
      if (Q.k() == cpu.h.b) {
         flm.a($$0, this.w + 73, this.x + 6, this.w + 105, this.x + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.j.s);
      }
   }

   private int b(cpu $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cpu $$0) {
      int $$1 = 0;
      if ($$0.g() == cpu.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.d;
      }

      return $$1;
   }

   protected boolean a(cpu $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fdc $$0, cpu $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.m, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fdc $$0, cpu $$1) {
      boolean $$2 = $$1 == Q;
      boolean $$3 = $$1.g() == cpu.f.a;
      int $$4 = $$1.f();
      int $$5 = this.w + this.b($$1);
      int $$6 = this.x - ($$3 ? 28 : -(this.d - 4));
      ajt[] $$7;
      if ($$3) {
         $$7 = $$2 ? D : C;
      } else {
         $$7 = $$2 ? F : E;
      }

      $$0.a($$7[axk.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      crj $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.m, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean E() {
      return Q.k() == cpu.h.b;
   }

   public static void a(fbp $$0, int $$1, boolean $$2, boolean $$3) {
      fzb $$4 = $$0.s;
      iz $$5 = $$4.dM().H_();
      fbl $$6 = $$0.aD();
      fzd $$7 = $$6.a($$1);
      if ($$2) {
         List<crj> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cjs.g(); $$9++) {
            crj $$10 = $$8.get($$9);
            $$4.fZ().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.bX.d();
      } else if ($$3) {
         $$7.a($$4.fZ(), $$5);
         wg $$11 = $$0.m.U[$$1].k();
         wg $$12 = $$0.m.W.k();
         wg $$13 = wg.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aY().c($$13);
         $$6.a();
      }
   }

   static class a extends cok {
      public a(bnt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjt $$0) {
         crj $$1 = this.g();
         return super.a($$0) && !$$1.d() ? $$1.a($$0.dM().J()) && !$$1.b(jp.m) : $$1.d();
      }
   }

   public static class b extends cmp {
      public final iu<crj> k = iu.a();
      private final cmp l;

      public b(cjt $$0) {
         super(null, 0);
         this.l = $$0.bX;
         cjs $$1 = $$0.fZ();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new flb.a(flb.N, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(cjt $$0) {
         return true;
      }

      protected int l() {
         return axk.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return axk.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return axk.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  flb.N.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  flb.N.a($$3 + $$2 * 9, crj.i);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public crj a(cjt $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cok $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(crj.i);
            }
         }

         return crj.i;
      }

      @Override
      public boolean a(crj $$0, cok $$1) {
         return $$1.d != flb.N;
      }

      @Override
      public boolean b(cok $$0) {
         return $$0.d != flb.N;
      }

      @Override
      public crj g() {
         return this.l.g();
      }

      @Override
      public void b(crj $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cok {
      final cok a;

      public c(cok $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cjt $$0, crj $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(crj $$0) {
         return this.a.a($$0);
      }

      @Override
      public crj g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(crj $$0, crj $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(crj $$0) {
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
      public int a_(crj $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<ajt, ajt> c() {
         return this.a.c();
      }

      @Override
      public crj a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cjt $$0) {
         return this.a.a($$0);
      }
   }
}
