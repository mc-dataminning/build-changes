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

public class fpc extends fpf<fpc.b> {
   private static final akq D = akq.b("container/creative_inventory/scroller");
   private static final akq E = akq.b("container/creative_inventory/scroller_disabled");
   private static final akq[] F = new akq[]{
      akq.b("container/creative_inventory/tab_top_unselected_1"),
      akq.b("container/creative_inventory/tab_top_unselected_2"),
      akq.b("container/creative_inventory/tab_top_unselected_3"),
      akq.b("container/creative_inventory/tab_top_unselected_4"),
      akq.b("container/creative_inventory/tab_top_unselected_5"),
      akq.b("container/creative_inventory/tab_top_unselected_6"),
      akq.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final akq[] G = new akq[]{
      akq.b("container/creative_inventory/tab_top_selected_1"),
      akq.b("container/creative_inventory/tab_top_selected_2"),
      akq.b("container/creative_inventory/tab_top_selected_3"),
      akq.b("container/creative_inventory/tab_top_selected_4"),
      akq.b("container/creative_inventory/tab_top_selected_5"),
      akq.b("container/creative_inventory/tab_top_selected_6"),
      akq.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final akq[] H = new akq[]{
      akq.b("container/creative_inventory/tab_bottom_unselected_1"),
      akq.b("container/creative_inventory/tab_bottom_unselected_2"),
      akq.b("container/creative_inventory/tab_bottom_unselected_3"),
      akq.b("container/creative_inventory/tab_bottom_unselected_4"),
      akq.b("container/creative_inventory/tab_bottom_unselected_5"),
      akq.b("container/creative_inventory/tab_bottom_unselected_6"),
      akq.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final akq[] I = new akq[]{
      akq.b("container/creative_inventory/tab_bottom_selected_1"),
      akq.b("container/creative_inventory/tab_bottom_selected_2"),
      akq.b("container/creative_inventory/tab_bottom_selected_3"),
      akq.b("container/creative_inventory/tab_bottom_selected_4"),
      akq.b("container/creative_inventory/tab_bottom_selected_5"),
      akq.b("container/creative_inventory/tab_bottom_selected_6"),
      akq.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int J = 5;
   private static final int K = 9;
   private static final int L = 26;
   private static final int M = 32;
   private static final int N = 12;
   private static final int O = 15;
   static final bqz P = new bqz(45);
   private static final wy Q = wy.c("inventory.binSlot");
   private static final int R = 16777215;
   private static csy S = csz.b();
   private float T;
   private boolean U;
   private fip V;
   @Nullable
   private List<cro> W;
   @Nullable
   private cro X;
   private fpb Y;
   private boolean Z;
   private boolean aa;
   private final Set<awt<cuj>> ab = new HashSet<>();
   private final boolean ac;

   public fpc(gdv $$0, cpj $$1, boolean $$2) {
      super(new fpc.b($$0), $$0.fZ(), wx.a);
      $$0.cd = this.w;
      this.q = 136;
      this.c = 195;
      this.ac = $$2;
      this.a($$0.h.B(), $$1, this.a($$0), $$0.dQ().H_());
   }

   private boolean a(cmv $$0) {
      return $$0.gw() && this.ac;
   }

   private void a(cpj $$0, boolean $$1, jo.a $$2) {
      fza $$3 = this.l.L();
      if (this.a($$3 != null ? $$3.B() : null, $$0, $$1, $$2)) {
         for (csy $$4 : csz.d()) {
            Collection<cuo> $$5 = $$4.l();
            if ($$4 == S) {
               if ($$4.k() == csy.h.a && $$5.isEmpty()) {
                  this.a(csz.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable fzq $$0, cpj $$1, boolean $$2, jo.a $$3) {
      if (!csz.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<cuo> $$4 = List.copyOf(csz.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<cuo> $$0) {
      int $$1 = this.w.a(this.T);
      this.w.k.clear();
      if (S.k() == csy.h.d) {
         this.G();
      } else {
         this.w.k.addAll($$0);
      }

      this.T = this.w.e($$1);
      this.w.b(this.T);
   }

   @Override
   public void D() {
      super.D();
      if (this.l != null) {
         if (this.l.s != null) {
            this.a(this.l.s.h.x(), this.a(this.l.s), this.l.s.dQ().H_());
         }

         if (!this.l.q.f()) {
            this.l.a(new fpn(this.l.s));
         }
      }
   }

   @Override
   protected void a(@Nullable cro $$0, int $$1, int $$2, cqc $$3) {
      if (this.a($$0)) {
         this.V.c(false);
         this.V.i(0);
      }

      boolean $$4 = $$3 == cqc.b;
      $$3 = $$1 == -999 && $$3 == cqc.a ? cqc.e : $$3;
      if ($$0 == null && S.k() != csy.h.b && $$3 != cqc.f) {
         if (!this.w.g().e() && this.aa) {
            if ($$2 == 0) {
               this.l.s.a(this.w.g(), true);
               this.l.q.a(this.w.g());
               this.w.b(cuo.l);
            }

            if ($$2 == 1) {
               cuo $$18 = this.w.g().a(1);
               this.l.s.a($$18, true);
               this.l.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.l.s)) {
            return;
         }

         if ($$0 == this.X && $$4) {
            for (int $$5 = 0; $$5 < this.l.s.cc.c().size(); $$5++) {
               this.l.q.a(cuo.l, $$5);
            }
         } else if (S.k() == csy.h.b) {
            if ($$0 == this.X) {
               this.w.b(cuo.l);
            } else if ($$3 == cqc.e && $$0 != null && $$0.h()) {
               cuo $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().j());
               cuo $$7 = $$0.g();
               this.l.s.a($$6, true);
               this.l.q.a($$6);
               this.l.q.a($$7, ((fpc.c)$$0).a.d);
            } else if ($$3 == cqc.e && !this.w.g().e()) {
               this.l.s.a(this.w.g(), true);
               this.l.q.a(this.w.g());
               this.w.b(cuo.l);
            } else {
               this.l.s.cc.a($$0 == null ? $$1 : ((fpc.c)$$0).a.d, $$2, $$3, this.l.s);
               this.l.s.cc.d();
            }
         } else if ($$3 != cqc.f && $$0.c == P) {
            cuo $$8 = this.w.g();
            cuo $$9 = $$0.g();
            if ($$3 == cqc.c) {
               if (!$$9.e()) {
                  this.l.s.fZ().a($$2, $$9.c($$9.j()));
                  this.l.s.cc.d();
               }

               return;
            }

            if ($$3 == cqc.d) {
               if (this.w.g().e() && $$0.h()) {
                  cuo $$10 = $$0.g();
                  this.w.b($$10.c($$10.j()));
               }

               return;
            }

            if ($$3 == cqc.e) {
               if (!$$9.e()) {
                  cuo $$11 = $$9.c($$2 == 0 ? 1 : $$9.j());
                  this.l.s.a($$11, true);
                  this.l.q.a($$11);
               }

               return;
            }

            if (!$$8.e() && !$$9.e() && cuo.c($$8, $$9)) {
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
               this.w.b(cuo.l);
            } else if (!this.w.g().e()) {
               this.w.g().h(1);
            }
         } else if (this.w != null) {
            cuo $$13 = $$0 == null ? cuo.l : this.w.b($$0.d).g();
            this.w.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.l.s);
            if (cps.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.l.q.a(this.w.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cuo $$15 = this.w.b($$0.d).g();
               this.l.q.a($$15, $$0.d - this.w.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cqc.c) {
                  this.l.q.a($$13, $$16 - this.w.i.size() + 9 + 36);
               } else if ($$3 == cqc.e && !$$13.e()) {
                  cuo $$17 = $$13.c($$2 == 0 ? 1 : $$13.j());
                  this.l.s.a($$17, true);
                  this.l.q.a($$17);
               }

               this.l.s.cc.d();
            }
         }
      }
   }

   private boolean a(@Nullable cro $$0) {
      return $$0 != null && $$0.c == P;
   }

   @Override
   protected void aP_() {
      if (this.l.q.f()) {
         super.aP_();
         this.V = new fip(this.o, this.z + 82, this.A + 6, 80, 9, wy.c("itemGroup.search"));
         this.V.f(50);
         this.V.d(false);
         this.V.g(false);
         this.V.g(16777215);
         this.d(this.V);
         csy $$0 = S;
         S = csz.b();
         this.a($$0);
         this.l.s.cc.b(this.Y);
         this.Y = new fpb(this.l);
         this.l.s.cc.a(this.Y);
         if (!S.i()) {
            this.a(csz.b());
         }
      } else {
         this.l.a(new fpn(this.l.s));
      }
   }

   @Override
   public void a(fgi $$0, int $$1, int $$2) {
      int $$3 = this.w.a(this.T);
      String $$4 = this.V.a();
      this.b($$0, $$1, $$2);
      this.V.a($$4);
      if (!this.V.a().isEmpty()) {
         this.G();
      }

      this.T = this.w.e($$3);
      this.w.b(this.T);
   }

   @Override
   public void j() {
      super.j();
      if (this.l.s != null && this.l.s.fZ() != null) {
         this.l.s.cc.b(this.Y);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.Z) {
         return false;
      } else if (S.k() != csy.h.d) {
         return false;
      } else {
         String $$2 = this.V.a();
         if (this.V.a($$0, $$1)) {
            if (!Objects.equals($$2, this.V.a())) {
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
      this.Z = false;
      if (S.k() != csy.h.d) {
         if (this.l.m.J.a($$0, $$1)) {
            this.Z = true;
            this.a(csz.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.y) || this.y.h();
         boolean $$4 = ezy.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.Z = true;
            return true;
         } else {
            String $$5 = this.V.a();
            if (this.V.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.V.a())) {
                  this.G();
               }

               return true;
            } else {
               return this.V.aK_() && this.V.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.Z = false;
      return super.c($$0, $$1, $$2);
   }

   private void G() {
      this.w.k.clear();
      this.ab.clear();
      String $$0 = this.V.a();
      if ($$0.isEmpty()) {
         this.w.k.addAll(S.l());
      } else {
         fza $$1 = this.l.L();
         if ($$1 != null) {
            fzq $$2 = $$1.B();
            gud<cuo> $$3;
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

      this.T = 0.0F;
      this.w.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<akq> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lt.g.k().filter($$1x -> $$2.test($$1x.b())).forEach(this.ab::add);
   }

   @Override
   protected void b(fht $$0, int $$1, int $$2) {
      if (S.d()) {
         $$0.a(this.o, S.a(), 8, 6, 4210752, false);
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

         if (S.k() != csy.h.b && this.b($$0, $$1)) {
            this.U = this.K();
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
         this.U = false;

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
      return S.e() && this.w.m();
   }

   private void a(csy $$0) {
      csy $$1 = S;
      S = $$0;
      this.B.clear();
      this.w.k.clear();
      this.m();
      if (S.k() == csy.h.c) {
         fge $$2 = this.l.aB();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gdx $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cuo $$6 = new cuo(cur.qO);
                     $$6.b(kq.s, azr.a);
                     wy $$7 = this.l.m.T[$$3].k();
                     wy $$8 = this.l.m.U.k();
                     $$6.b(kq.h, wy.a("inventory.hotbarInfo", $$8, $$7));
                     this.w.k.add($$6);
                  } else {
                     this.w.k.add(cuo.l);
                  }
               }
            } else {
               this.w.k.addAll($$4.a(this.l.r.H_()));
            }
         }
      } else if (S.k() == csy.h.a) {
         this.w.k.addAll(S.l());
      }

      if (S.k() == csy.h.b) {
         cps $$9 = this.l.s.cc;
         if (this.W == null) {
            this.W = ImmutableList.copyOf(this.w.i);
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

            cro $$26 = new fpc.c($$9.i.get($$10), $$10, $$14, $$15);
            this.w.i.add($$26);
         }

         this.X = new cro(P, 0, 173, 112);
         this.w.i.add(this.X);
      } else if ($$1.k() == csy.h.b) {
         this.w.i.clear();
         this.w.i.addAll(this.W);
         this.W = null;
      }

      if (S.k() == csy.h.d) {
         this.V.g(true);
         this.V.f(false);
         this.V.a(true);
         if ($$1 != $$0) {
            this.V.a("");
         }

         this.G();
      } else {
         this.V.g(false);
         this.V.f(true);
         this.V.a(false);
         this.V.a("");
      }

      this.T = 0.0F;
      this.w.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.K()) {
         return false;
      } else {
         this.T = this.w.a(this.T, $$3);
         this.w.b(this.T);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.q);
      this.aa = $$5 && !this.a(S, $$0, $$1);
      return this.aa;
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
      if (this.U) {
         int $$5 = this.A + 18;
         int $$6 = $$5 + 112;
         this.T = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.T = ayn.a(this.T, 0.0F, 1.0F);
         this.w.b(this.T);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (csy $$4 : csz.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.X != null && S.k() == csy.h.b && this.a(this.X.e, this.X.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.o, Q, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<wy> a(cuo $$0) {
      boolean $$1 = this.y != null && this.y instanceof fpc.a;
      boolean $$2 = S.k() == csy.h.a;
      boolean $$3 = S.k() == csy.h.d;
      cwk.a $$4 = this.l.m.m ? cwk.a.b : cwk.a.a;
      cwk $$5 = $$1 ? $$4.c() : $$4;
      List<wy> $$6 = $$0.a(cuj.b.a(this.l.r), this.l.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<wy> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ab.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, wy.b("#" + $$2x.b()).a(n.f));
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
   protected void a(fht $$0, float $$1, int $$2, int $$3) {
      for (csy $$4 : csz.c()) {
         if ($$4 != S) {
            this.a($$0, $$4);
         }
      }

      $$0.a(S.c(), this.z, this.A, 0, 0, this.c, this.q);
      this.V.a($$0, $$2, $$3, $$1);
      int $$5 = this.z + 175;
      int $$6 = this.A + 18;
      int $$7 = $$6 + 112;
      if (S.e()) {
         akq $$8 = this.K() ? D : E;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.T), 12, 15);
      }

      this.a($$0, S);
      if (S.k() == csy.h.b) {
         fpn.a($$0, this.z + 73, this.A + 6, this.z + 105, this.A + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.l.s);
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
         $$1 += this.q;
      }

      return $$1;
   }

   protected boolean a(csy $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fht $$0, csy $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.o, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fht $$0, csy $$1) {
      boolean $$2 = $$1 == S;
      boolean $$3 = $$1.g() == csy.f.a;
      int $$4 = $$1.f();
      int $$5 = this.z + this.b($$1);
      int $$6 = this.A - ($$3 ? 28 : -(this.q - 4));
      akq[] $$7;
      if ($$3) {
         $$7 = $$2 ? G : F;
      } else {
         $$7 = $$2 ? I : H;
      }

      $$0.a($$7[ayn.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cuo $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.o, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return S.k() == csy.h.b;
   }

   public static void a(fgi $$0, int $$1, boolean $$2, boolean $$3) {
      gdv $$4 = $$0.s;
      ka $$5 = $$4.dQ().H_();
      fge $$6 = $$0.aB();
      gdx $$7 = $$6.a($$1);
      if ($$2) {
         List<cuo> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cmu.g(); $$9++) {
            cuo $$10 = $$8.get($$9);
            $$4.fZ().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.cc.d();
      } else if ($$3) {
         $$7.a($$4.fZ(), $$5);
         wy $$11 = $$0.m.T[$$1].k();
         wy $$12 = $$0.m.V.k();
         wy $$13 = wy.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aV().c($$13);
         $$6.a();
      }
   }

   static class a extends cro {
      public a(bqj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmv $$0) {
         cuo $$1 = this.g();
         return super.a($$0) && !$$1.e() ? $$1.a($$0.dQ().J()) && !$$1.b(kq.s) : $$1.e();
      }
   }

   public static class b extends cps {
      public final jv<cuo> k = jv.a();
      private final cps l;

      public b(cmv $$0) {
         super(null, 0);
         this.l = $$0.cc;
         cmu $$1 = $$0.fZ();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fpc.a(fpc.P, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cro($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean b(cmv $$0) {
         return true;
      }

      protected int l() {
         return ayn.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return ayn.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return ayn.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fpc.P.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fpc.P.a($$3 + $$2 * 9, cuo.l);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public cuo b(cmv $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            cro $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cuo.l);
            }
         }

         return cuo.l;
      }

      @Override
      public boolean a(cuo $$0, cro $$1) {
         return $$1.c != fpc.P;
      }

      @Override
      public boolean b(cro $$0) {
         return $$0.c != fpc.P;
      }

      @Override
      public cuo g() {
         return this.l.g();
      }

      @Override
      public void b(cuo $$0) {
         this.l.b($$0);
      }
   }

   static class c extends cro {
      final cro a;

      public c(cro $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cmv $$0, cuo $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cuo $$0) {
         return this.a.a($$0);
      }

      @Override
      public cuo g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cuo $$0, cuo $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cuo $$0) {
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
      public int a_(cuo $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<akq, akq> b() {
         return this.a.b();
      }

      @Override
      public cuo a(int $$0) {
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
