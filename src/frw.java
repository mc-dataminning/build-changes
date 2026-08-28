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

public class frw extends frz<frw.b> {
   private static final alh G = alh.b("container/creative_inventory/scroller");
   private static final alh H = alh.b("container/creative_inventory/scroller_disabled");
   private static final alh[] I = new alh[]{
      alh.b("container/creative_inventory/tab_top_unselected_1"),
      alh.b("container/creative_inventory/tab_top_unselected_2"),
      alh.b("container/creative_inventory/tab_top_unselected_3"),
      alh.b("container/creative_inventory/tab_top_unselected_4"),
      alh.b("container/creative_inventory/tab_top_unselected_5"),
      alh.b("container/creative_inventory/tab_top_unselected_6"),
      alh.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final alh[] J = new alh[]{
      alh.b("container/creative_inventory/tab_top_selected_1"),
      alh.b("container/creative_inventory/tab_top_selected_2"),
      alh.b("container/creative_inventory/tab_top_selected_3"),
      alh.b("container/creative_inventory/tab_top_selected_4"),
      alh.b("container/creative_inventory/tab_top_selected_5"),
      alh.b("container/creative_inventory/tab_top_selected_6"),
      alh.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final alh[] K = new alh[]{
      alh.b("container/creative_inventory/tab_bottom_unselected_1"),
      alh.b("container/creative_inventory/tab_bottom_unselected_2"),
      alh.b("container/creative_inventory/tab_bottom_unselected_3"),
      alh.b("container/creative_inventory/tab_bottom_unselected_4"),
      alh.b("container/creative_inventory/tab_bottom_unselected_5"),
      alh.b("container/creative_inventory/tab_bottom_unselected_6"),
      alh.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final alh[] L = new alh[]{
      alh.b("container/creative_inventory/tab_bottom_selected_1"),
      alh.b("container/creative_inventory/tab_bottom_selected_2"),
      alh.b("container/creative_inventory/tab_bottom_selected_3"),
      alh.b("container/creative_inventory/tab_bottom_selected_4"),
      alh.b("container/creative_inventory/tab_bottom_selected_5"),
      alh.b("container/creative_inventory/tab_bottom_selected_6"),
      alh.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int M = 5;
   private static final int N = 9;
   private static final int O = 26;
   private static final int P = 32;
   private static final int Q = 12;
   private static final int R = 15;
   static final bsf S = new bsf(45);
   private static final xh T = xh.c("inventory.binSlot");
   private static final int U = 16777215;
   private static cum V = cun.b();
   private float W;
   private boolean X;
   private fli Y;
   @Nullable
   private List<ctg> Z;
   @Nullable
   private ctg aa;
   private frv ab;
   private boolean ac;
   private boolean ad;
   private final Set<axp<cvt>> ae = new HashSet<>();
   private final boolean af;

   public frw(ggs $$0, cra $$1, boolean $$2) {
      super(new frw.b($$0), $$0.gk(), xg.a);
      $$0.ca = this.z;
      this.u = 136;
      this.s = 195;
      this.af = $$2;
      this.a($$0.cw.D(), $$1, this.a($$0), $$0.dX().H_());
   }

   private boolean a(coh $$0) {
      return $$0.gH() && this.af;
   }

   private void a(cra $$0, boolean $$1, jr.a $$2) {
      gby $$3 = this.m.L();
      if (this.a($$3 != null ? $$3.D() : null, $$0, $$1, $$2)) {
         for (cum $$4 : cun.d()) {
            Collection<cvx> $$5 = $$4.l();
            if ($$4 == V) {
               if ($$4.k() == cum.h.a && $$5.isEmpty()) {
                  this.a(cun.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable gco $$0, cra $$1, boolean $$2, jr.a $$3) {
      if (!cun.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<cvx> $$4 = List.copyOf(cun.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<cvx> $$0) {
      int $$1 = this.z.a(this.W);
      this.z.m.clear();
      if (V.k() == cum.h.d) {
         this.G();
      } else {
         this.z.m.addAll($$0);
      }

      this.W = this.z.e($$1);
      this.z.b(this.W);
   }

   @Override
   public void D() {
      super.D();
      if (this.m != null) {
         if (this.m.t != null) {
            this.a(this.m.t.cw.y(), this.a(this.m.t), this.m.t.dX().H_());
         }

         if (!this.m.r.f()) {
            this.m.a(new fsh(this.m.t));
         }
      }
   }

   @Override
   protected void a(@Nullable ctg $$0, int $$1, int $$2, cru $$3) {
      if (this.a($$0)) {
         this.Y.c(false);
         this.Y.i(0);
      }

      boolean $$4 = $$3 == cru.b;
      $$3 = $$1 == -999 && $$3 == cru.a ? cru.e : $$3;
      if ($$0 == null && V.k() != cum.h.b && $$3 != cru.f) {
         if (!this.z.g().f() && this.ad) {
            if ($$2 == 0) {
               this.m.t.a(this.z.g(), true);
               this.m.r.a(this.z.g());
               this.z.b(cvx.k);
            }

            if ($$2 == 1) {
               cvx $$19 = this.z.g().a(1);
               this.m.t.a($$19, true);
               this.m.r.a($$19);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.m.t)) {
            return;
         }

         if ($$0 == this.aa && $$4) {
            for (int $$5 = 0; $$5 < this.m.t.bZ.c().size(); $$5++) {
               this.m.r.a(cvx.k, $$5);
            }
         } else if (V.k() == cum.h.b) {
            if ($$0 == this.aa) {
               this.z.b(cvx.k);
            } else if ($$3 == cru.e && $$0 != null && $$0.h()) {
               cvx $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().k());
               cvx $$7 = $$0.g();
               this.m.t.a($$6, true);
               this.m.r.a($$6);
               this.m.r.a($$7, ((frw.c)$$0).a.d);
            } else if ($$3 == cru.e && !this.z.g().f()) {
               this.m.t.a(this.z.g(), true);
               this.m.r.a(this.z.g());
               this.z.b(cvx.k);
            } else {
               this.m.t.bZ.a($$0 == null ? $$1 : ((frw.c)$$0).a.d, $$2, $$3, this.m.t);
               this.m.t.bZ.d();
            }
         } else if ($$3 != cru.f && $$0.c == S) {
            cvx $$8 = this.z.g();
            cvx $$9 = $$0.g();
            if ($$3 == cru.c) {
               if (!$$9.f()) {
                  this.m.t.gk().a($$2, $$9.c($$9.k()));
                  this.m.t.bZ.d();
               }

               return;
            }

            if ($$3 == cru.d) {
               if (this.z.g().f() && $$0.h()) {
                  cvx $$10 = $$0.g();
                  this.z.b($$10.c($$10.k()));
               }

               return;
            }

            if ($$3 == cru.e) {
               if (!$$9.f()) {
                  cvx $$11 = $$9.c($$2 == 0 ? 1 : $$9.k());
                  this.m.t.a($$11, true);
                  this.m.r.a($$11);
               }

               return;
            }

            if (!$$8.f() && !$$9.f() && cvx.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.e($$8.k());
                  } else if ($$8.L() < $$8.k()) {
                     $$8.g(1);
                  }
               } else {
                  $$8.h(1);
               }
            } else if (!$$9.f() && $$8.f()) {
               int $$12 = $$4 ? $$9.k() : $$9.L();
               this.z.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.z.b(cvx.k);
            } else if (!this.z.g().f()) {
               this.z.g().h(1);
            }
         } else if (this.z != null) {
            cvx $$13 = $$0 == null ? cvx.k : this.z.b($$0.d).g();
            this.z.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.m.t);
            if (crj.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.m.r.a(this.z.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cvx $$15 = this.z.b($$0.d).g();
               int $$16 = 45 + $$2;
               if ($$3 == cru.c) {
                  this.m.r.a($$13, $$16 - this.z.k.size() + 9 + 36);
               } else if ($$3 == cru.e && !$$13.f()) {
                  int $$17 = $$2 == 0 ? 1 : $$13.L();
                  cvx $$18 = $$13.c($$17);
                  $$15.h($$17);
                  this.m.t.a($$18, true);
                  this.m.r.a($$18);
               }

               this.m.r.a($$15, $$0.d - this.z.k.size() + 9 + 36);
               this.m.t.bZ.d();
            }
         }
      }
   }

   private boolean a(@Nullable ctg $$0) {
      return $$0 != null && $$0.c == S;
   }

   @Override
   protected void aS_() {
      if (this.m.r.f()) {
         super.aS_();
         this.Y = new fli(this.p, this.C + 82, this.D + 6, 80, 9, xh.c("itemGroup.search"));
         this.Y.f(50);
         this.Y.d(false);
         this.Y.g(false);
         this.Y.g(16777215);
         this.d(this.Y);
         cum $$0 = V;
         V = cun.b();
         this.a($$0);
         this.m.t.bZ.b(this.ab);
         this.ab = new frv(this.m);
         this.m.t.bZ.a(this.ab);
         if (!V.i()) {
            this.a(cun.b());
         }
      } else {
         this.m.a(new fsh(this.m.t));
      }
   }

   @Override
   public void a(fja $$0, int $$1, int $$2) {
      int $$3 = this.z.a(this.W);
      String $$4 = this.Y.a();
      this.b($$0, $$1, $$2);
      this.Y.a($$4);
      if (!this.Y.a().isEmpty()) {
         this.G();
      }

      this.W = this.z.e($$3);
      this.z.b(this.W);
   }

   @Override
   public void j() {
      super.j();
      if (this.m.t != null && this.m.t.gk() != null) {
         this.m.t.bZ.b(this.ab);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.ac) {
         return false;
      } else if (V.k() != cum.h.d) {
         return false;
      } else {
         String $$2 = this.Y.a();
         if (this.Y.a($$0, $$1)) {
            if (!Objects.equals($$2, this.Y.a())) {
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
      this.ac = false;
      if (V.k() != cum.h.d) {
         if (this.m.n.I.a($$0, $$1)) {
            this.ac = true;
            this.a(cun.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.B) || this.B.h();
         boolean $$4 = fco.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.ac = true;
            return true;
         } else {
            String $$5 = this.Y.a();
            if (this.Y.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.Y.a())) {
                  this.G();
               }

               return true;
            } else {
               return this.Y.aN_() && this.Y.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.ac = false;
      return super.c($$0, $$1, $$2);
   }

   private void G() {
      this.z.m.clear();
      this.ae.clear();
      String $$0 = this.Y.a();
      if ($$0.isEmpty()) {
         this.z.m.addAll(V.l());
      } else {
         gby $$1 = this.m.L();
         if ($$1 != null) {
            gco $$2 = $$1.D();
            hbz<cvx> $$3;
            if ($$0.startsWith("#")) {
               $$0 = $$0.substring(1);
               $$3 = $$2.c();
               this.a($$0);
            } else {
               $$3 = $$2.d();
            }

            this.z.m.addAll($$3.search($$0.toLowerCase(Locale.ROOT)));
         }
      }

      this.W = 0.0F;
      this.z.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<alh> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lx.g.l().map(jt.c::h).filter($$1x -> $$2.test($$1x.b())).forEach(this.ae::add);
   }

   @Override
   protected void b(fkm $$0, int $$1, int $$2) {
      if (V.d()) {
         $$0.a(this.p, V.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.C;
         double $$4 = $$1 - (double)this.D;

         for (cum $$5 : cun.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (V.k() != cum.h.b && this.b($$0, $$1)) {
            this.X = this.K();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.C;
         double $$4 = $$1 - (double)this.D;
         this.X = false;

         for (cum $$5 : cun.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean K() {
      return V.e() && this.z.m();
   }

   private void a(cum $$0) {
      cum $$1 = V;
      V = $$0;
      this.E.clear();
      this.z.m.clear();
      this.m();
      if (V.k() == cum.h.c) {
         fiv $$2 = this.m.aD();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            ggu $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cvx $$6 = new cvx(cwb.qP);
                     $$6.b(kt.t, bao.a);
                     xh $$7 = this.m.n.S[$$3].k();
                     xh $$8 = this.m.n.T.k();
                     $$6.b(kt.h, xh.a("inventory.hotbarInfo", $$8, $$7));
                     this.z.m.add($$6);
                  } else {
                     this.z.m.add(cvx.k);
                  }
               }
            } else {
               this.z.m.addAll($$4.a(this.m.s.H_()));
            }
         }
      } else if (V.k() == cum.h.a) {
         this.z.m.addAll(V.l());
      }

      if (V.k() == cum.h.b) {
         crj $$9 = this.m.t.bZ;
         if (this.Z == null) {
            this.Z = ImmutableList.copyOf(this.z.k);
         }

         this.z.k.clear();

         for (int $$10 = 0; $$10 < $$9.k.size(); $$10++) {
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

            ctg $$26 = new frw.c($$9.k.get($$10), $$10, $$14, $$15);
            this.z.k.add($$26);
         }

         this.aa = new ctg(S, 0, 173, 112);
         this.z.k.add(this.aa);
      } else if ($$1.k() == cum.h.b) {
         this.z.k.clear();
         this.z.k.addAll(this.Z);
         this.Z = null;
      }

      if (V.k() == cum.h.d) {
         this.Y.g(true);
         this.Y.f(false);
         this.Y.a(true);
         if ($$1 != $$0) {
            this.Y.a("");
         }

         this.G();
      } else {
         this.Y.g(false);
         this.Y.f(true);
         this.Y.a(false);
         this.Y.a("");
      }

      this.W = 0.0F;
      this.z.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else if (!this.K()) {
         return false;
      } else {
         this.W = this.z.a(this.W, $$3);
         this.z.b(this.W);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      this.ad = $$5 && !this.a(V, $$0, $$1);
      return this.ad;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.C;
      int $$3 = this.D;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.X) {
         int $$5 = this.D + 18;
         int $$6 = $$5 + 112;
         this.W = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.W = azj.a(this.W, 0.0F, 1.0F);
         this.z.b(this.W);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cum $$4 : cun.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.aa != null && V.k() == cum.h.b && this.a(this.aa.e, this.aa.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, T, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<xh> a(cvx $$0) {
      boolean $$1 = this.B != null && this.B instanceof frw.a;
      boolean $$2 = V.k() == cum.h.a;
      boolean $$3 = V.k() == cum.h.d;
      cxp.a $$4 = this.m.n.m ? cxp.a.b : cxp.a.a;
      cxp $$5 = $$1 ? $$4.c() : $$4;
      List<xh> $$6 = $$0.a(cvt.b.a(this.m.s), this.m.t, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<xh> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ae.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, xh.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cum $$9 : cun.c()) {
            if ($$9.k() != cum.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fkm $$0, float $$1, int $$2, int $$3) {
      for (cum $$4 : cun.c()) {
         if ($$4 != V) {
            this.a($$0, $$4);
         }
      }

      $$0.a(gig::B, V.c(), this.C, this.D, 0.0F, 0.0F, this.s, this.u, 256, 256);
      this.Y.a($$0, $$2, $$3, $$1);
      int $$5 = this.C + 175;
      int $$6 = this.D + 18;
      int $$7 = $$6 + 112;
      if (V.e()) {
         alh $$8 = this.K() ? G : H;
         $$0.a(gig::B, $$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.W), 12, 15);
      }

      this.a($$0, V);
      if (V.k() == cum.h.b) {
         fsh.a($$0, this.C + 73, this.D + 6, this.C + 105, this.D + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.t);
      }
   }

   private int b(cum $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.s - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cum $$0) {
      int $$1 = 0;
      if ($$0.g() == cum.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.u;
      }

      return $$1;
   }

   protected boolean a(cum $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fkm $$0, cum $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fkm $$0, cum $$1) {
      boolean $$2 = $$1 == V;
      boolean $$3 = $$1.g() == cum.f.a;
      int $$4 = $$1.f();
      int $$5 = this.C + this.b($$1);
      int $$6 = this.D - ($$3 ? 28 : -(this.u - 4));
      alh[] $$7;
      if ($$3) {
         $$7 = $$2 ? J : I;
      } else {
         $$7 = $$2 ? L : K;
      }

      $$0.a(gig::B, $$7[azj.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cvx $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return V.k() == cum.h.b;
   }

   public static void a(fja $$0, int $$1, boolean $$2, boolean $$3) {
      ggs $$4 = $$0.t;
      kd $$5 = $$4.dX().H_();
      fiv $$6 = $$0.aD();
      ggu $$7 = $$6.a($$1);
      if ($$2) {
         List<cvx> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cog.g(); $$9++) {
            cvx $$10 = $$8.get($$9);
            $$4.gk().a($$9, $$10);
            $$0.r.a($$10, 36 + $$9);
         }

         $$4.bZ.d();
      } else if ($$3) {
         $$7.a($$4.gk(), $$5);
         xh $$11 = $$0.n.S[$$1].k();
         xh $$12 = $$0.n.U.k();
         xh $$13 = xh.a("inventory.hotbarSaved", $$12, $$11);
         $$0.m.a($$13, false);
         $$0.ba().c($$13);
         $$6.a();
      }
   }

   static class a extends ctg {
      public a(brr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(coh $$0) {
         cvx $$1 = this.g();
         return super.a($$0) && !$$1.f() ? $$1.a($$0.dX().J()) && !$$1.b(kt.t) : $$1.f();
      }
   }

   public static class b extends crj {
      public final jy<cvx> m = jy.a();
      private final crj n;

      public b(coh $$0) {
         super(null, 0);
         this.n = $$0.bZ;
         cog $$1 = $$0.gk();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new frw.a(frw.S, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         this.a($$1, 9, 112);
         this.b(0.0F);
      }

      @Override
      public boolean b(coh $$0) {
         return true;
      }

      protected int l() {
         return azj.e(this.m.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return azj.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return azj.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.m.size()) {
                  frw.S.a($$3 + $$2 * 9, this.m.get($$4));
               } else {
                  frw.S.a($$3 + $$2 * 9, cvx.k);
               }
            }
         }
      }

      public boolean m() {
         return this.m.size() > 45;
      }

      @Override
      public cvx b(coh $$0, int $$1) {
         if ($$1 >= this.k.size() - 9 && $$1 < this.k.size()) {
            ctg $$2 = this.k.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cvx.k);
            }
         }

         return cvx.k;
      }

      @Override
      public boolean a(cvx $$0, ctg $$1) {
         return $$1.c != frw.S;
      }

      @Override
      public boolean b(ctg $$0) {
         return $$0.c != frw.S;
      }

      @Override
      public cvx g() {
         return this.n.g();
      }

      @Override
      public void b(cvx $$0) {
         this.n.b($$0);
      }
   }

   static class c extends ctg {
      final ctg a;

      public c(ctg $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(coh $$0, cvx $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cvx $$0) {
         return this.a.a($$0);
      }

      @Override
      public cvx g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cvx $$0, cvx $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cvx $$0) {
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
      public int a_(cvx $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<alh, alh> b() {
         return this.a.b();
      }

      @Override
      public cvx a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(coh $$0) {
         return this.a.a($$0);
      }
   }
}
