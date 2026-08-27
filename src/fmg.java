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

public class fmg extends fmj<fmg.b> {
   private static final akf D = new akf("container/creative_inventory/scroller");
   private static final akf E = new akf("container/creative_inventory/scroller_disabled");
   private static final akf[] F = new akf[]{
      new akf("container/creative_inventory/tab_top_unselected_1"),
      new akf("container/creative_inventory/tab_top_unselected_2"),
      new akf("container/creative_inventory/tab_top_unselected_3"),
      new akf("container/creative_inventory/tab_top_unselected_4"),
      new akf("container/creative_inventory/tab_top_unselected_5"),
      new akf("container/creative_inventory/tab_top_unselected_6"),
      new akf("container/creative_inventory/tab_top_unselected_7")
   };
   private static final akf[] G = new akf[]{
      new akf("container/creative_inventory/tab_top_selected_1"),
      new akf("container/creative_inventory/tab_top_selected_2"),
      new akf("container/creative_inventory/tab_top_selected_3"),
      new akf("container/creative_inventory/tab_top_selected_4"),
      new akf("container/creative_inventory/tab_top_selected_5"),
      new akf("container/creative_inventory/tab_top_selected_6"),
      new akf("container/creative_inventory/tab_top_selected_7")
   };
   private static final akf[] H = new akf[]{
      new akf("container/creative_inventory/tab_bottom_unselected_1"),
      new akf("container/creative_inventory/tab_bottom_unselected_2"),
      new akf("container/creative_inventory/tab_bottom_unselected_3"),
      new akf("container/creative_inventory/tab_bottom_unselected_4"),
      new akf("container/creative_inventory/tab_bottom_unselected_5"),
      new akf("container/creative_inventory/tab_bottom_unselected_6"),
      new akf("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final akf[] I = new akf[]{
      new akf("container/creative_inventory/tab_bottom_selected_1"),
      new akf("container/creative_inventory/tab_bottom_selected_2"),
      new akf("container/creative_inventory/tab_bottom_selected_3"),
      new akf("container/creative_inventory/tab_bottom_selected_4"),
      new akf("container/creative_inventory/tab_bottom_selected_5"),
      new akf("container/creative_inventory/tab_bottom_selected_6"),
      new akf("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final String J = "textures/gui/container/creative_inventory/tab_";
   private static final int K = 5;
   private static final int L = 9;
   private static final int M = 26;
   private static final int N = 32;
   private static final int O = 12;
   private static final int P = 15;
   static final boz Q = new boz(45);
   private static final ws R = ws.c("inventory.binSlot");
   private static final int S = 16777215;
   private static cqo T = cqp.b();
   private float U;
   private boolean V;
   private ffd W;
   @Nullable
   private List<cpd> X;
   @Nullable
   private cpd Y;
   private fmf Z;
   private boolean aa;
   private boolean ab;
   private final Set<awd<cry>> ac = new HashSet<>();
   private final boolean ad;

   public fmg(ckl $$0, cmy $$1, boolean $$2) {
      super(new fmg.b($$0), $$0.ga(), wr.a);
      $$0.cc = this.w;
      this.d = 136;
      this.c = 195;
      this.ad = $$2;
      cqp.a($$1, this.a($$0), $$0.dN().H_());
   }

   private boolean a(ckl $$0) {
      return $$0.gx() && this.ad;
   }

   private void a(cmy $$0, boolean $$1, ix.a $$2) {
      if (cqp.a($$0, $$1, $$2)) {
         for (cqo $$3 : cqp.d()) {
            Collection<csd> $$4 = $$3.l();
            if ($$3 == T) {
               if ($$3.k() == cqo.h.a && $$4.isEmpty()) {
                  this.a(cqp.b());
               } else {
                  this.a($$4);
               }
            }
         }
      }
   }

   private void a(Collection<csd> $$0) {
      int $$1 = this.w.a(this.U);
      this.w.k.clear();
      if (T.k() == cqo.h.d) {
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
            this.a(this.m.s.h.y(), this.a(this.m.s), this.m.s.dN().H_());
         }

         if (!this.m.q.f()) {
            this.m.a(new fmr(this.m.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cpd $$0, int $$1, int $$2, cnq $$3) {
      if (this.a($$0)) {
         this.W.c(false);
         this.W.i(0);
      }

      boolean $$4 = $$3 == cnq.b;
      $$3 = $$1 == -999 && $$3 == cnq.a ? cnq.e : $$3;
      if ($$0 == null && T.k() != cqo.h.b && $$3 != cnq.f) {
         if (!this.w.g().d() && this.ab) {
            if ($$2 == 0) {
               this.m.s.a(this.w.g(), true);
               this.m.q.a(this.w.g());
               this.w.b(csd.i);
            }

            if ($$2 == 1) {
               csd $$18 = this.w.g().a(1);
               this.m.s.a($$18, true);
               this.m.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.m.s)) {
            return;
         }

         if ($$0 == this.Y && $$4) {
            for (int $$5 = 0; $$5 < this.m.s.cb.c().size(); $$5++) {
               this.m.q.a(csd.i, $$5);
            }
         } else if (T.k() == cqo.h.b) {
            if ($$0 == this.Y) {
               this.w.b(csd.i);
            } else if ($$3 == cnq.e && $$0 != null && $$0.h()) {
               csd $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().i());
               csd $$7 = $$0.g();
               this.m.s.a($$6, true);
               this.m.q.a($$6);
               this.m.q.a($$7, ((fmg.c)$$0).a.e);
            } else if ($$3 == cnq.e && !this.w.g().d()) {
               this.m.s.a(this.w.g(), true);
               this.m.q.a(this.w.g());
               this.w.b(csd.i);
            } else {
               this.m.s.cb.a($$0 == null ? $$1 : ((fmg.c)$$0).a.e, $$2, $$3, this.m.s);
               this.m.s.cb.d();
            }
         } else if ($$3 != cnq.f && $$0.d == Q) {
            csd $$8 = this.w.g();
            csd $$9 = $$0.g();
            if ($$3 == cnq.c) {
               if (!$$9.d()) {
                  this.m.s.ga().a($$2, $$9.c($$9.i()));
                  this.m.s.cb.d();
               }

               return;
            }

            if ($$3 == cnq.d) {
               if (this.w.g().d() && $$0.h()) {
                  csd $$10 = $$0.g();
                  this.w.b($$10.c($$10.i()));
               }

               return;
            }

            if ($$3 == cnq.e) {
               if (!$$9.d()) {
                  csd $$11 = $$9.c($$2 == 0 ? 1 : $$9.i());
                  this.m.s.a($$11, true);
                  this.m.q.a($$11);
               }

               return;
            }

            if (!$$8.d() && !$$9.d() && csd.c($$8, $$9)) {
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
               this.w.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.w.b(csd.i);
            } else if (!this.w.g().d()) {
               this.w.g().g(1);
            }
         } else if (this.w != null) {
            csd $$13 = $$0 == null ? csd.i : this.w.b($$0.e).g();
            this.w.a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.m.s);
            if (cnh.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.m.q.a(this.w.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               csd $$15 = this.w.b($$0.e).g();
               this.m.q.a($$15, $$0.e - this.w.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cnq.c) {
                  this.m.q.a($$13, $$16 - this.w.i.size() + 9 + 36);
               } else if ($$3 == cnq.e && !$$13.d()) {
                  csd $$17 = $$13.c($$2 == 0 ? 1 : $$13.i());
                  this.m.s.a($$17, true);
                  this.m.q.a($$17);
               }

               this.m.s.cb.d();
            }
         }
      }
   }

   private boolean a(@Nullable cpd $$0) {
      return $$0 != null && $$0.d == Q;
   }

   @Override
   protected void aM_() {
      if (this.m.q.f()) {
         super.aM_();
         this.W = new ffd(this.p, this.z + 82, this.A + 6, 80, 9, ws.c("itemGroup.search"));
         this.W.f(50);
         this.W.d(false);
         this.W.g(false);
         this.W.g(16777215);
         this.d(this.W);
         cqo $$0 = T;
         T = cqp.b();
         this.a($$0);
         this.m.s.cb.b(this.Z);
         this.Z = new fmf(this.m);
         this.m.s.cb.a(this.Z);
         if (!T.i()) {
            this.a(cqp.b());
         }
      } else {
         this.m.a(new fmr(this.m.s));
      }
   }

   @Override
   public void a(fcu $$0, int $$1, int $$2) {
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
      if (this.m.s != null && this.m.s.ga() != null) {
         this.m.s.cb.b(this.Z);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.aa) {
         return false;
      } else if (T.k() != cqo.h.d) {
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
      if (T.k() != cqo.h.d) {
         if (this.m.m.K.a($$0, $$1)) {
            this.aa = true;
            this.a(cqp.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.y) || this.y.h();
         boolean $$4 = ewi.a($$0, $$1).e().isPresent();
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

   private void F() {
      this.w.k.clear();
      this.ac.clear();
      String $$0 = this.W.a();
      if ($$0.isEmpty()) {
         this.w.k.addAll(T.l());
      } else {
         gqo<csd> $$1;
         if ($$0.startsWith("#")) {
            $$0 = $$0.substring(1);
            $$1 = this.m.a(gqn.b);
            this.a($$0);
         } else {
            $$1 = this.m.a(gqn.a);
         }

         this.w.k.addAll($$1.search($$0.toLowerCase(Locale.ROOT)));
      }

      this.U = 0.0F;
      this.w.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<akf> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lc.h.j().filter($$1x -> $$2.test($$1x.b())).forEach(this.ac::add);
   }

   @Override
   protected void b(feh $$0, int $$1, int $$2) {
      if (T.d()) {
         $$0.a(this.p, T.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.z;
         double $$4 = $$1 - (double)this.A;

         for (cqo $$5 : cqp.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (T.k() != cqo.h.b && this.b($$0, $$1)) {
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

         for (cqo $$5 : cqp.c()) {
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

   private void a(cqo $$0) {
      cqo $$1 = T;
      T = $$0;
      this.B.clear();
      this.w.k.clear();
      this.m();
      if (T.k() == cqo.h.c) {
         fcq $$2 = this.m.aD();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gai $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     csd $$6 = new csd(csg.qO);
                     $$6.b(jz.m, ayy.a);
                     ws $$7 = this.m.m.U[$$3].k();
                     ws $$8 = this.m.m.V.k();
                     $$6.b(jz.d, ws.a("inventory.hotbarInfo", $$8, $$7));
                     this.w.k.add($$6);
                  } else {
                     this.w.k.add(csd.i);
                  }
               }
            } else {
               this.w.k.addAll($$4.a(this.m.r.H_()));
            }
         }
      } else if (T.k() == cqo.h.a) {
         this.w.k.addAll(T.l());
      }

      if (T.k() == cqo.h.b) {
         cnh $$9 = this.m.s.cb;
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

            cpd $$26 = new fmg.c($$9.i.get($$10), $$10, $$14, $$15);
            this.w.i.add($$26);
         }

         this.Y = new cpd(Q, 0, 173, 112);
         this.w.i.add(this.Y);
      } else if ($$1.k() == cqo.h.b) {
         this.w.i.clear();
         this.w.i.addAll(this.X);
         this.X = null;
      }

      if (T.k() == cqo.h.d) {
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
         this.U = axw.a(this.U, 0.0F, 1.0F);
         this.w.b(this.U);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cqo $$4 : cqp.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.Y != null && T.k() == cqo.h.b && this.a(this.Y.f, this.Y.g, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, R, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<ws> a(csd $$0) {
      boolean $$1 = this.y != null && this.y instanceof fmg.a;
      boolean $$2 = T.k() == cqo.h.a;
      boolean $$3 = T.k() == cqo.h.d;
      ctu.a $$4 = this.m.m.m ? ctu.a.b : ctu.a.a;
      ctu $$5 = $$1 ? $$4.c() : $$4;
      List<ws> $$6 = $$0.a(this.m.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<ws> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ac.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, ws.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cqo $$9 : cqp.c()) {
            if ($$9.k() != cqo.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(feh $$0, float $$1, int $$2, int $$3) {
      for (cqo $$4 : cqp.c()) {
         if ($$4 != T) {
            this.a($$0, $$4);
         }
      }

      $$0.a(new akf("textures/gui/container/creative_inventory/tab_" + T.c()), this.z, this.A, 0, 0, this.c, this.d);
      this.W.a($$0, $$2, $$3, $$1);
      int $$5 = this.z + 175;
      int $$6 = this.A + 18;
      int $$7 = $$6 + 112;
      if (T.e()) {
         akf $$8 = this.J() ? D : E;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.U), 12, 15);
      }

      this.a($$0, T);
      if (T.k() == cqo.h.b) {
         fmr.a($$0, this.z + 73, this.A + 6, this.z + 105, this.A + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.s);
      }
   }

   private int b(cqo $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cqo $$0) {
      int $$1 = 0;
      if ($$0.g() == cqo.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.d;
      }

      return $$1;
   }

   protected boolean a(cqo $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(feh $$0, cqo $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(feh $$0, cqo $$1) {
      boolean $$2 = $$1 == T;
      boolean $$3 = $$1.g() == cqo.f.a;
      int $$4 = $$1.f();
      int $$5 = this.z + this.b($$1);
      int $$6 = this.A - ($$3 ? 28 : -(this.d - 4));
      akf[] $$7;
      if ($$3) {
         $$7 = $$2 ? G : F;
      } else {
         $$7 = $$2 ? I : H;
      }

      $$0.a($$7[axw.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      csd $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean E() {
      return T.k() == cqo.h.b;
   }

   public static void a(fcu $$0, int $$1, boolean $$2, boolean $$3) {
      gag $$4 = $$0.s;
      jj $$5 = $$4.dN().H_();
      fcq $$6 = $$0.aD();
      gai $$7 = $$6.a($$1);
      if ($$2) {
         List<csd> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < ckk.g(); $$9++) {
            csd $$10 = $$8.get($$9);
            $$4.ga().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.cb.d();
      } else if ($$3) {
         $$7.a($$4.ga(), $$5);
         ws $$11 = $$0.m.U[$$1].k();
         ws $$12 = $$0.m.W.k();
         ws $$13 = ws.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aY().c($$13);
         $$6.a();
      }
   }

   static class a extends cpd {
      public a(boj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ckl $$0) {
         csd $$1 = this.g();
         return super.a($$0) && !$$1.d() ? $$1.a($$0.dN().J()) && !$$1.b(jz.m) : $$1.d();
      }
   }

   public static class b extends cnh {
      public final je<csd> k = je.a();
      private final cnh l;

      public b(ckl $$0) {
         super(null, 0);
         this.l = $$0.cb;
         ckk $$1 = $$0.ga();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fmg.a(fmg.Q, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpd($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean a(ckl $$0) {
         return true;
      }

      protected int l() {
         return axw.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return axw.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return axw.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fmg.Q.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fmg.Q.a($$3 + $$2 * 9, csd.i);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public csd a(ckl $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cpd $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(csd.i);
            }
         }

         return csd.i;
      }

      @Override
      public boolean a(csd $$0, cpd $$1) {
         return $$1.d != fmg.Q;
      }

      @Override
      public boolean b(cpd $$0) {
         return $$0.d != fmg.Q;
      }

      @Override
      public csd g() {
         return this.l.g();
      }

      @Override
      public void b(csd $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cpd {
      final cpd a;

      public c(cpd $$0, int $$1, int $$2, int $$3) {
         super($$0.d, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(ckl $$0, csd $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(csd $$0) {
         return this.a.a($$0);
      }

      @Override
      public csd g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(csd $$0, csd $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(csd $$0) {
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
      public int a_(csd $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<akf, akf> c() {
         return this.a.c();
      }

      @Override
      public csd a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(ckl $$0) {
         return this.a.a($$0);
      }
   }
}
