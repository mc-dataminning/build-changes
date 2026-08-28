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

public class fpi extends fpl<fpi.b> {
   private static final akr E = akr.b("container/creative_inventory/scroller");
   private static final akr F = akr.b("container/creative_inventory/scroller_disabled");
   private static final akr[] G = new akr[]{
      akr.b("container/creative_inventory/tab_top_unselected_1"),
      akr.b("container/creative_inventory/tab_top_unselected_2"),
      akr.b("container/creative_inventory/tab_top_unselected_3"),
      akr.b("container/creative_inventory/tab_top_unselected_4"),
      akr.b("container/creative_inventory/tab_top_unselected_5"),
      akr.b("container/creative_inventory/tab_top_unselected_6"),
      akr.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final akr[] H = new akr[]{
      akr.b("container/creative_inventory/tab_top_selected_1"),
      akr.b("container/creative_inventory/tab_top_selected_2"),
      akr.b("container/creative_inventory/tab_top_selected_3"),
      akr.b("container/creative_inventory/tab_top_selected_4"),
      akr.b("container/creative_inventory/tab_top_selected_5"),
      akr.b("container/creative_inventory/tab_top_selected_6"),
      akr.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final akr[] I = new akr[]{
      akr.b("container/creative_inventory/tab_bottom_unselected_1"),
      akr.b("container/creative_inventory/tab_bottom_unselected_2"),
      akr.b("container/creative_inventory/tab_bottom_unselected_3"),
      akr.b("container/creative_inventory/tab_bottom_unselected_4"),
      akr.b("container/creative_inventory/tab_bottom_unselected_5"),
      akr.b("container/creative_inventory/tab_bottom_unselected_6"),
      akr.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final akr[] J = new akr[]{
      akr.b("container/creative_inventory/tab_bottom_selected_1"),
      akr.b("container/creative_inventory/tab_bottom_selected_2"),
      akr.b("container/creative_inventory/tab_bottom_selected_3"),
      akr.b("container/creative_inventory/tab_bottom_selected_4"),
      akr.b("container/creative_inventory/tab_bottom_selected_5"),
      akr.b("container/creative_inventory/tab_bottom_selected_6"),
      akr.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int K = 5;
   private static final int L = 9;
   private static final int M = 26;
   private static final int N = 32;
   private static final int O = 12;
   private static final int P = 15;
   static final bra Q = new bra(45);
   private static final wz R = wz.c("inventory.binSlot");
   private static final int S = 16777215;
   private static cta T = ctb.b();
   private float U;
   private boolean V;
   private fiv W;
   @Nullable
   private List<crq> X;
   @Nullable
   private crq Y;
   private fph Z;
   private boolean aa;
   private boolean ab;
   private final Set<awu<cul>> ac = new HashSet<>();
   private final boolean ad;

   public fpi(geb $$0, cpl $$1, boolean $$2) {
      super(new fpi.b($$0), $$0.fY(), wy.a);
      $$0.cd = this.x;
      this.r = 136;
      this.c = 195;
      this.ad = $$2;
      this.a($$0.h.B(), $$1, this.a($$0), $$0.dO().H_());
   }

   private boolean a(cmx $$0) {
      return $$0.gv() && this.ad;
   }

   private void a(cpl $$0, boolean $$1, jo.a $$2) {
      fzg $$3 = this.l.L();
      if (this.a($$3 != null ? $$3.B() : null, $$0, $$1, $$2)) {
         for (cta $$4 : ctb.d()) {
            Collection<cuq> $$5 = $$4.l();
            if ($$4 == T) {
               if ($$4.k() == cta.h.a && $$5.isEmpty()) {
                  this.a(ctb.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable fzw $$0, cpl $$1, boolean $$2, jo.a $$3) {
      if (!ctb.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<cuq> $$4 = List.copyOf(ctb.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<cuq> $$0) {
      int $$1 = this.x.a(this.U);
      this.x.k.clear();
      if (T.k() == cta.h.d) {
         this.F();
      } else {
         this.x.k.addAll($$0);
      }

      this.U = this.x.e($$1);
      this.x.b(this.U);
   }

   @Override
   public void C() {
      super.C();
      if (this.l != null) {
         if (this.l.s != null) {
            this.a(this.l.s.h.x(), this.a(this.l.s), this.l.s.dO().H_());
         }

         if (!this.l.q.f()) {
            this.l.a(new fpt(this.l.s));
         }
      }
   }

   @Override
   protected void a(@Nullable crq $$0, int $$1, int $$2, cqe $$3) {
      if (this.a($$0)) {
         this.W.c(false);
         this.W.i(0);
      }

      boolean $$4 = $$3 == cqe.b;
      $$3 = $$1 == -999 && $$3 == cqe.a ? cqe.e : $$3;
      if ($$0 == null && T.k() != cta.h.b && $$3 != cqe.f) {
         if (!this.x.g().e() && this.ab) {
            if ($$2 == 0) {
               this.l.s.a(this.x.g(), true);
               this.l.q.a(this.x.g());
               this.x.b(cuq.l);
            }

            if ($$2 == 1) {
               cuq $$18 = this.x.g().a(1);
               this.l.s.a($$18, true);
               this.l.q.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.l.s)) {
            return;
         }

         if ($$0 == this.Y && $$4) {
            for (int $$5 = 0; $$5 < this.l.s.cc.c().size(); $$5++) {
               this.l.q.a(cuq.l, $$5);
            }
         } else if (T.k() == cta.h.b) {
            if ($$0 == this.Y) {
               this.x.b(cuq.l);
            } else if ($$3 == cqe.e && $$0 != null && $$0.h()) {
               cuq $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().j());
               cuq $$7 = $$0.g();
               this.l.s.a($$6, true);
               this.l.q.a($$6);
               this.l.q.a($$7, ((fpi.c)$$0).a.d);
            } else if ($$3 == cqe.e && !this.x.g().e()) {
               this.l.s.a(this.x.g(), true);
               this.l.q.a(this.x.g());
               this.x.b(cuq.l);
            } else {
               this.l.s.cc.a($$0 == null ? $$1 : ((fpi.c)$$0).a.d, $$2, $$3, this.l.s);
               this.l.s.cc.d();
            }
         } else if ($$3 != cqe.f && $$0.c == Q) {
            cuq $$8 = this.x.g();
            cuq $$9 = $$0.g();
            if ($$3 == cqe.c) {
               if (!$$9.e()) {
                  this.l.s.fY().a($$2, $$9.c($$9.j()));
                  this.l.s.cc.d();
               }

               return;
            }

            if ($$3 == cqe.d) {
               if (this.x.g().e() && $$0.h()) {
                  cuq $$10 = $$0.g();
                  this.x.b($$10.c($$10.j()));
               }

               return;
            }

            if ($$3 == cqe.e) {
               if (!$$9.e()) {
                  cuq $$11 = $$9.c($$2 == 0 ? 1 : $$9.j());
                  this.l.s.a($$11, true);
                  this.l.q.a($$11);
               }

               return;
            }

            if (!$$8.e() && !$$9.e() && cuq.c($$8, $$9)) {
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
               this.x.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.x.b(cuq.l);
            } else if (!this.x.g().e()) {
               this.x.g().h(1);
            }
         } else if (this.x != null) {
            cuq $$13 = $$0 == null ? cuq.l : this.x.b($$0.d).g();
            this.x.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.l.s);
            if (cpu.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.l.q.a(this.x.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cuq $$15 = this.x.b($$0.d).g();
               this.l.q.a($$15, $$0.d - this.x.i.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == cqe.c) {
                  this.l.q.a($$13, $$16 - this.x.i.size() + 9 + 36);
               } else if ($$3 == cqe.e && !$$13.e()) {
                  cuq $$17 = $$13.c($$2 == 0 ? 1 : $$13.j());
                  this.l.s.a($$17, true);
                  this.l.q.a($$17);
               }

               this.l.s.cc.d();
            }
         }
      }
   }

   private boolean a(@Nullable crq $$0) {
      return $$0 != null && $$0.c == Q;
   }

   @Override
   protected void aT_() {
      if (this.l.q.f()) {
         super.aT_();
         this.W = new fiv(this.o, this.A + 82, this.B + 6, 80, 9, wz.c("itemGroup.search"));
         this.W.f(50);
         this.W.d(false);
         this.W.g(false);
         this.W.g(16777215);
         this.d(this.W);
         cta $$0 = T;
         T = ctb.b();
         this.a($$0);
         this.l.s.cc.b(this.Z);
         this.Z = new fph(this.l);
         this.l.s.cc.a(this.Z);
         if (!T.i()) {
            this.a(ctb.b());
         }
      } else {
         this.l.a(new fpt(this.l.s));
      }
   }

   @Override
   public void a(fgo $$0, int $$1, int $$2) {
      int $$3 = this.x.a(this.U);
      String $$4 = this.W.a();
      this.b($$0, $$1, $$2);
      this.W.a($$4);
      if (!this.W.a().isEmpty()) {
         this.F();
      }

      this.U = this.x.e($$3);
      this.x.b(this.U);
   }

   @Override
   public void j() {
      super.j();
      if (this.l.s != null && this.l.s.fY() != null) {
         this.l.s.cc.b(this.Z);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.aa) {
         return false;
      } else if (T.k() != cta.h.d) {
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
      if (T.k() != cta.h.d) {
         if (this.l.m.J.a($$0, $$1)) {
            this.aa = true;
            this.a(ctb.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.z) || this.z.h();
         boolean $$4 = fae.a($$0, $$1).e().isPresent();
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
               return this.W.aO_() && this.W.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
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
      this.x.k.clear();
      this.ac.clear();
      String $$0 = this.W.a();
      if ($$0.isEmpty()) {
         this.x.k.addAll(T.l());
      } else {
         fzg $$1 = this.l.L();
         if ($$1 != null) {
            fzw $$2 = $$1.B();
            guk<cuq> $$3;
            if ($$0.startsWith("#")) {
               $$0 = $$0.substring(1);
               $$3 = $$2.c();
               this.a($$0);
            } else {
               $$3 = $$2.d();
            }

            this.x.k.addAll($$3.search($$0.toLowerCase(Locale.ROOT)));
         }
      }

      this.U = 0.0F;
      this.x.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<akr> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lt.g.k().filter($$1x -> $$2.test($$1x.b())).forEach(this.ac::add);
   }

   @Override
   protected void b(fhz $$0, int $$1, int $$2) {
      if (T.d()) {
         $$0.a(this.o, T.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.A;
         double $$4 = $$1 - (double)this.B;

         for (cta $$5 : ctb.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (T.k() != cta.h.b && this.b($$0, $$1)) {
            this.V = this.J();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.A;
         double $$4 = $$1 - (double)this.B;
         this.V = false;

         for (cta $$5 : ctb.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean J() {
      return T.e() && this.x.m();
   }

   private void a(cta $$0) {
      cta $$1 = T;
      T = $$0;
      this.C.clear();
      this.x.k.clear();
      this.m();
      if (T.k() == cta.h.c) {
         fgk $$2 = this.l.aB();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            ged $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cuq $$6 = new cuq(cut.qO);
                     $$6.b(kq.s, azs.a);
                     wz $$7 = this.l.m.T[$$3].k();
                     wz $$8 = this.l.m.U.k();
                     $$6.b(kq.h, wz.a("inventory.hotbarInfo", $$8, $$7));
                     this.x.k.add($$6);
                  } else {
                     this.x.k.add(cuq.l);
                  }
               }
            } else {
               this.x.k.addAll($$4.a(this.l.r.H_()));
            }
         }
      } else if (T.k() == cta.h.a) {
         this.x.k.addAll(T.l());
      }

      if (T.k() == cta.h.b) {
         cpu $$9 = this.l.s.cc;
         if (this.X == null) {
            this.X = ImmutableList.copyOf(this.x.i);
         }

         this.x.i.clear();

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

            crq $$26 = new fpi.c($$9.i.get($$10), $$10, $$14, $$15);
            this.x.i.add($$26);
         }

         this.Y = new crq(Q, 0, 173, 112);
         this.x.i.add(this.Y);
      } else if ($$1.k() == cta.h.b) {
         this.x.i.clear();
         this.x.i.addAll(this.X);
         this.X = null;
      }

      if (T.k() == cta.h.d) {
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
      this.x.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.J()) {
         return false;
      } else {
         this.U = this.x.a(this.U, $$3);
         this.x.b(this.U);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.r);
      this.ab = $$5 && !this.a(T, $$0, $$1);
      return this.ab;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.A;
      int $$3 = this.B;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.V) {
         int $$5 = this.B + 18;
         int $$6 = $$5 + 112;
         this.U = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.U = ayo.a(this.U, 0.0F, 1.0F);
         this.x.b(this.U);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cta $$4 : ctb.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.Y != null && T.k() == cta.h.b && this.a(this.Y.e, this.Y.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.o, R, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<wz> a(cuq $$0) {
      boolean $$1 = this.z != null && this.z instanceof fpi.a;
      boolean $$2 = T.k() == cta.h.a;
      boolean $$3 = T.k() == cta.h.d;
      cwm.a $$4 = this.l.m.m ? cwm.a.b : cwm.a.a;
      cwm $$5 = $$1 ? $$4.c() : $$4;
      List<wz> $$6 = $$0.a(cul.b.a(this.l.r), this.l.s, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<wz> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ac.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, wz.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cta $$9 : ctb.c()) {
            if ($$9.k() != cta.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      for (cta $$4 : ctb.c()) {
         if ($$4 != T) {
            this.a($$0, $$4);
         }
      }

      $$0.a(T.c(), this.A, this.B, 0, 0, this.c, this.r);
      this.W.a($$0, $$2, $$3, $$1);
      int $$5 = this.A + 175;
      int $$6 = this.B + 18;
      int $$7 = $$6 + 112;
      if (T.e()) {
         akr $$8 = this.J() ? E : F;
         $$0.a($$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.U), 12, 15);
      }

      this.a($$0, T);
      if (T.k() == cta.h.b) {
         fpt.a($$0, this.A + 73, this.B + 6, this.A + 105, this.B + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.l.s);
      }
   }

   private int b(cta $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.c - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cta $$0) {
      int $$1 = 0;
      if ($$0.g() == cta.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.r;
      }

      return $$1;
   }

   protected boolean a(cta $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fhz $$0, cta $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.o, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fhz $$0, cta $$1) {
      boolean $$2 = $$1 == T;
      boolean $$3 = $$1.g() == cta.f.a;
      int $$4 = $$1.f();
      int $$5 = this.A + this.b($$1);
      int $$6 = this.B - ($$3 ? 28 : -(this.r - 4));
      akr[] $$7;
      if ($$3) {
         $$7 = $$2 ? H : G;
      } else {
         $$7 = $$2 ? J : I;
      }

      $$0.a($$7[ayo.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cuq $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.o, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean E() {
      return T.k() == cta.h.b;
   }

   public static void a(fgo $$0, int $$1, boolean $$2, boolean $$3) {
      geb $$4 = $$0.s;
      ka $$5 = $$4.dO().H_();
      fgk $$6 = $$0.aB();
      ged $$7 = $$6.a($$1);
      if ($$2) {
         List<cuq> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cmw.g(); $$9++) {
            cuq $$10 = $$8.get($$9);
            $$4.fY().a($$9, $$10);
            $$0.q.a($$10, 36 + $$9);
         }

         $$4.cc.d();
      } else if ($$3) {
         $$7.a($$4.fY(), $$5);
         wz $$11 = $$0.m.T[$$1].k();
         wz $$12 = $$0.m.V.k();
         wz $$13 = wz.a("inventory.hotbarSaved", $$12, $$11);
         $$0.l.a($$13, false);
         $$0.aV().c($$13);
         $$6.a();
      }
   }

   static class a extends crq {
      public a(bqk $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmx $$0) {
         cuq $$1 = this.g();
         return super.a($$0) && !$$1.e() ? $$1.a($$0.dO().J()) && !$$1.b(kq.s) : $$1.e();
      }
   }

   public static class b extends cpu {
      public final jv<cuq> k = jv.a();
      private final cpu l;

      public b(cmx $$0) {
         super(null, 0);
         this.l = $$0.cc;
         cmw $$1 = $$0.fY();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fpi.a(fpi.Q, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crq($$1, $$4, 9 + $$4 * 18, 112));
         }

         this.b(0.0F);
      }

      @Override
      public boolean b(cmx $$0) {
         return true;
      }

      protected int l() {
         return ayo.e(this.k.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return ayo.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return ayo.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.k.size()) {
                  fpi.Q.a($$3 + $$2 * 9, this.k.get($$4));
               } else {
                  fpi.Q.a($$3 + $$2 * 9, cuq.l);
               }
            }
         }
      }

      public boolean m() {
         return this.k.size() > 45;
      }

      @Override
      public cuq b(cmx $$0, int $$1) {
         if ($$1 >= this.i.size() - 9 && $$1 < this.i.size()) {
            crq $$2 = this.i.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cuq.l);
            }
         }

         return cuq.l;
      }

      @Override
      public boolean a(cuq $$0, crq $$1) {
         return $$1.c != fpi.Q;
      }

      @Override
      public boolean b(crq $$0) {
         return $$0.c != fpi.Q;
      }

      @Override
      public cuq g() {
         return this.l.g();
      }

      @Override
      public void b(cuq $$0) {
         this.l.b($$0);
      }
   }

   static class c extends crq {
      final crq a;

      public c(crq $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cmx $$0, cuq $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cuq $$0) {
         return this.a.a($$0);
      }

      @Override
      public cuq g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cuq $$0, cuq $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cuq $$0) {
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
      public int a_(cuq $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<akr, akr> b() {
         return this.a.b();
      }

      @Override
      public cuq a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cmx $$0) {
         return this.a.a($$0);
      }
   }
}
