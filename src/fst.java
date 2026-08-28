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

public class fst extends fsw<fst.b> {
   private static final all G = all.b("container/creative_inventory/scroller");
   private static final all H = all.b("container/creative_inventory/scroller_disabled");
   private static final all[] I = new all[]{
      all.b("container/creative_inventory/tab_top_unselected_1"),
      all.b("container/creative_inventory/tab_top_unselected_2"),
      all.b("container/creative_inventory/tab_top_unselected_3"),
      all.b("container/creative_inventory/tab_top_unselected_4"),
      all.b("container/creative_inventory/tab_top_unselected_5"),
      all.b("container/creative_inventory/tab_top_unselected_6"),
      all.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final all[] J = new all[]{
      all.b("container/creative_inventory/tab_top_selected_1"),
      all.b("container/creative_inventory/tab_top_selected_2"),
      all.b("container/creative_inventory/tab_top_selected_3"),
      all.b("container/creative_inventory/tab_top_selected_4"),
      all.b("container/creative_inventory/tab_top_selected_5"),
      all.b("container/creative_inventory/tab_top_selected_6"),
      all.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final all[] K = new all[]{
      all.b("container/creative_inventory/tab_bottom_unselected_1"),
      all.b("container/creative_inventory/tab_bottom_unselected_2"),
      all.b("container/creative_inventory/tab_bottom_unselected_3"),
      all.b("container/creative_inventory/tab_bottom_unselected_4"),
      all.b("container/creative_inventory/tab_bottom_unselected_5"),
      all.b("container/creative_inventory/tab_bottom_unselected_6"),
      all.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final all[] L = new all[]{
      all.b("container/creative_inventory/tab_bottom_selected_1"),
      all.b("container/creative_inventory/tab_bottom_selected_2"),
      all.b("container/creative_inventory/tab_bottom_selected_3"),
      all.b("container/creative_inventory/tab_bottom_selected_4"),
      all.b("container/creative_inventory/tab_bottom_selected_5"),
      all.b("container/creative_inventory/tab_bottom_selected_6"),
      all.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int M = 5;
   private static final int N = 9;
   private static final int O = 26;
   private static final int P = 32;
   private static final int Q = 12;
   private static final int R = 15;
   static final bso S = new bso(45);
   private static final xl T = xl.c("inventory.binSlot");
   private static final int U = 16777215;
   private static cuu V = cuv.b();
   private float W;
   private boolean X;
   private fmf Y;
   @Nullable
   private List<ctp> Z;
   @Nullable
   private ctp aa;
   private fss ab;
   private boolean ac;
   private boolean ad;
   private final Set<axt<cwb>> ae = new HashSet<>();
   private final boolean af;

   public fst(ght $$0, crj $$1, boolean $$2) {
      super(new fst.b($$0), $$0.gl(), xk.a);
      $$0.cd = this.z;
      this.u = 136;
      this.s = 195;
      this.af = $$2;
      this.a($$0.j.D(), $$1, this.a($$0), $$0.dY().H_());
   }

   private boolean a(cor $$0) {
      return $$0.gJ() && this.af;
   }

   private void a(crj $$0, boolean $$1, js.a $$2) {
      gcz $$3 = this.m.L();
      if (this.a($$3 != null ? $$3.D() : null, $$0, $$1, $$2)) {
         for (cuu $$4 : cuv.d()) {
            Collection<cwf> $$5 = $$4.l();
            if ($$4 == V) {
               if ($$4.k() == cuu.h.a && $$5.isEmpty()) {
                  this.a(cuv.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable gdp $$0, crj $$1, boolean $$2, js.a $$3) {
      if (!cuv.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<cwf> $$4 = List.copyOf(cuv.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<cwf> $$0) {
      int $$1 = this.z.a(this.W);
      this.z.m.clear();
      if (V.k() == cuu.h.d) {
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
            this.a(this.m.t.j.y(), this.a(this.m.t), this.m.t.dY().H_());
         }

         if (!this.m.r.f()) {
            this.m.a(new fte(this.m.t));
         }
      }
   }

   @Override
   protected void a(@Nullable ctp $$0, int $$1, int $$2, csd $$3) {
      if (this.a($$0)) {
         this.Y.c(false);
         this.Y.i(0);
      }

      boolean $$4 = $$3 == csd.b;
      $$3 = $$1 == -999 && $$3 == csd.a ? csd.e : $$3;
      if ($$3 != csd.e || this.m.t.go()) {
         this.a($$0, $$3);
         if ($$0 == null && V.k() != cuu.h.b && $$3 != csd.f) {
            if (!this.z.g().f() && this.ad) {
               if (!this.m.t.go()) {
                  return;
               }

               if ($$2 == 0) {
                  this.m.t.a(this.z.g(), true);
                  this.m.r.a(this.z.g());
                  this.z.b(cwf.k);
               }

               if ($$2 == 1) {
                  cwf $$17 = this.z.g().a(1);
                  this.m.t.a($$17, true);
                  this.m.r.a($$17);
               }
            }
         } else {
            if ($$0 != null && !$$0.a(this.m.t)) {
               return;
            }

            if ($$0 == this.aa && $$4) {
               for (int $$5 = 0; $$5 < this.m.t.cc.c().size(); $$5++) {
                  this.m.t.cc.b($$5).f(cwf.k);
                  this.m.r.a(cwf.k, $$5);
               }
            } else if (V.k() == cuu.h.b) {
               if ($$0 == this.aa) {
                  this.z.b(cwf.k);
               } else if ($$3 == csd.e && $$0 != null && $$0.h()) {
                  cwf $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().k());
                  cwf $$7 = $$0.g();
                  this.m.t.a($$6, true);
                  this.m.r.a($$6);
                  this.m.r.a($$7, ((fst.c)$$0).a.d);
               } else if ($$3 == csd.e && $$1 == -999 && !this.z.g().f()) {
                  this.m.t.a(this.z.g(), true);
                  this.m.r.a(this.z.g());
                  this.z.b(cwf.k);
               } else {
                  this.m.t.cc.a($$0 == null ? $$1 : ((fst.c)$$0).a.d, $$2, $$3, this.m.t);
                  this.m.t.cc.d();
               }
            } else if ($$3 != csd.f && $$0.c == S) {
               cwf $$8 = this.z.g();
               cwf $$9 = $$0.g();
               if ($$3 == csd.c) {
                  if (!$$9.f()) {
                     this.m.t.gl().a($$2, $$9.c($$9.k()));
                     this.m.t.cc.d();
                  }

                  return;
               }

               if ($$3 == csd.d) {
                  if (this.z.g().f() && $$0.h()) {
                     cwf $$10 = $$0.g();
                     this.z.b($$10.c($$10.k()));
                  }

                  return;
               }

               if ($$3 == csd.e) {
                  if (!$$9.f()) {
                     cwf $$11 = $$9.c($$2 == 0 ? 1 : $$9.k());
                     this.m.t.a($$11, true);
                     this.m.r.a($$11);
                  }

                  return;
               }

               if (!$$8.f() && !$$9.f() && cwf.c($$8, $$9)) {
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
                  this.z.b(cwf.k);
               } else if (!this.z.g().f()) {
                  this.z.g().h(1);
               }
            } else if (this.z != null) {
               cwf $$13 = $$0 == null ? cwf.k : this.z.b($$0.d).g();
               this.z.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.m.t);
               if (crs.d($$2) == 2) {
                  for (int $$14 = 0; $$14 < 9; $$14++) {
                     this.m.r.a(this.z.b(45 + $$14).g(), 36 + $$14);
                  }
               } else if ($$0 != null && coq.d($$0.i()) && V.k() != cuu.h.b) {
                  if ($$3 == csd.e && !$$13.f() && !this.z.g().f()) {
                     int $$15 = $$2 == 0 ? 1 : $$13.L();
                     cwf $$16 = $$13.c($$15);
                     $$13.h($$15);
                     this.m.t.a($$16, true);
                     this.m.r.a($$16);
                  }

                  this.m.t.cc.d();
               }
            }
         }
      }
   }

   private boolean a(@Nullable ctp $$0) {
      return $$0 != null && $$0.c == S;
   }

   @Override
   protected void aS_() {
      if (this.m.r.f()) {
         super.aS_();
         this.Y = new fmf(this.p, this.C + 82, this.D + 6, 80, 9, xl.c("itemGroup.search"));
         this.Y.f(50);
         this.Y.d(false);
         this.Y.g(false);
         this.Y.g(16777215);
         this.d(this.Y);
         cuu $$0 = V;
         V = cuv.b();
         this.a($$0);
         this.m.t.cc.b(this.ab);
         this.ab = new fss(this.m);
         this.m.t.cc.a(this.ab);
         if (!V.i()) {
            this.a(cuv.b());
         }
      } else {
         this.m.a(new fte(this.m.t));
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2) {
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
      if (this.m.t != null && this.m.t.gl() != null) {
         this.m.t.cc.b(this.ab);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.ac) {
         return false;
      } else if (V.k() != cuu.h.d) {
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
      if (V.k() != cuu.h.d) {
         if (this.m.n.I.a($$0, $$1)) {
            this.ac = true;
            this.a(cuv.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.B) || this.B.h();
         boolean $$4 = fdf.a($$0, $$1).e().isPresent();
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
               return this.Y.aM_() && this.Y.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
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
         gcz $$1 = this.m.L();
         if ($$1 != null) {
            gdp $$2 = $$1.D();
            hda<cwf> $$3;
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
      Predicate<all> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lz.g.l().map(ju.c::h).filter($$1x -> $$2.test($$1x.b())).forEach(this.ae::add);
   }

   @Override
   protected void b(flj $$0, int $$1, int $$2) {
      if (V.d()) {
         $$0.a(this.p, V.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.C;
         double $$4 = $$1 - (double)this.D;

         for (cuu $$5 : cuv.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (V.k() != cuu.h.b && this.b($$0, $$1)) {
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

         for (cuu $$5 : cuv.c()) {
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

   private void a(cuu $$0) {
      cuu $$1 = V;
      V = $$0;
      this.E.clear();
      this.z.m.clear();
      this.m();
      if (V.k() == cuu.h.c) {
         fjs $$2 = this.m.aD();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            ghv $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cwf $$6 = new cwf(cwj.qP);
                     $$6.b(ku.t, bat.a);
                     xl $$7 = this.m.n.S[$$3].k();
                     xl $$8 = this.m.n.T.k();
                     $$6.b(ku.h, xl.a("inventory.hotbarInfo", $$8, $$7));
                     this.z.m.add($$6);
                  } else {
                     this.z.m.add(cwf.k);
                  }
               }
            } else {
               this.z.m.addAll($$4.a(this.m.s.H_()));
            }
         }
      } else if (V.k() == cuu.h.a) {
         this.z.m.addAll(V.l());
      }

      if (V.k() == cuu.h.b) {
         crs $$9 = this.m.t.cc;
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

            ctp $$26 = new fst.c($$9.k.get($$10), $$10, $$14, $$15);
            this.z.k.add($$26);
         }

         this.aa = new ctp(S, 0, 173, 112);
         this.z.k.add(this.aa);
      } else if ($$1.k() == cuu.h.b) {
         this.z.k.clear();
         this.z.k.addAll(this.Z);
         this.Z = null;
      }

      if (V.k() == cuu.h.d) {
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
         this.W = azn.a(this.W, 0.0F, 1.0F);
         this.z.b(this.W);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (cuu $$4 : cuv.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.aa != null && V.k() == cuu.h.b && this.a(this.aa.e, this.aa.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, T, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<xl> a(cwf $$0) {
      boolean $$1 = this.B != null && this.B instanceof fst.a;
      boolean $$2 = V.k() == cuu.h.a;
      boolean $$3 = V.k() == cuu.h.d;
      cxx.a $$4 = this.m.n.m ? cxx.a.b : cxx.a.a;
      cxx $$5 = $$1 ? $$4.c() : $$4;
      List<xl> $$6 = $$0.a(cwb.b.a(this.m.s), this.m.t, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<xl> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ae.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, xl.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (cuu $$9 : cuv.c()) {
            if ($$9.k() != cuu.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(flj $$0, float $$1, int $$2, int $$3) {
      for (cuu $$4 : cuv.c()) {
         if ($$4 != V) {
            this.a($$0, $$4);
         }
      }

      $$0.a(gjh::B, V.c(), this.C, this.D, 0.0F, 0.0F, this.s, this.u, 256, 256);
      this.Y.a($$0, $$2, $$3, $$1);
      int $$5 = this.C + 175;
      int $$6 = this.D + 18;
      int $$7 = $$6 + 112;
      if (V.e()) {
         all $$8 = this.K() ? G : H;
         $$0.a(gjh::B, $$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.W), 12, 15);
      }

      this.a($$0, V);
      if (V.k() == cuu.h.b) {
         fte.a($$0, this.C + 73, this.D + 6, this.C + 105, this.D + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.t);
      }
   }

   private int b(cuu $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.s - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(cuu $$0) {
      int $$1 = 0;
      if ($$0.g() == cuu.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.u;
      }

      return $$1;
   }

   protected boolean a(cuu $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(flj $$0, cuu $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(flj $$0, cuu $$1) {
      boolean $$2 = $$1 == V;
      boolean $$3 = $$1.g() == cuu.f.a;
      int $$4 = $$1.f();
      int $$5 = this.C + this.b($$1);
      int $$6 = this.D - ($$3 ? 28 : -(this.u - 4));
      all[] $$7;
      if ($$3) {
         $$7 = $$2 ? J : I;
      } else {
         $$7 = $$2 ? L : K;
      }

      $$0.a(gjh::B, $$7[azn.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cwf $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return V.k() == cuu.h.b;
   }

   public static void a(fjx $$0, int $$1, boolean $$2, boolean $$3) {
      ght $$4 = $$0.t;
      ke $$5 = $$4.dY().H_();
      fjs $$6 = $$0.aD();
      ghv $$7 = $$6.a($$1);
      if ($$2) {
         List<cwf> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < coq.g(); $$9++) {
            cwf $$10 = $$8.get($$9);
            $$4.gl().a($$9, $$10);
            $$0.r.a($$10, 36 + $$9);
         }

         $$4.cc.d();
      } else if ($$3) {
         $$7.a($$4.gl(), $$5);
         xl $$11 = $$0.n.S[$$1].k();
         xl $$12 = $$0.n.U.k();
         xl $$13 = xl.a("inventory.hotbarSaved", $$12, $$11);
         $$0.m.a($$13, false);
         $$0.aZ().c($$13);
         $$6.a();
      }
   }

   static class a extends ctp {
      public a(bsa $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cor $$0) {
         cwf $$1 = this.g();
         return super.a($$0) && !$$1.f() ? $$1.a($$0.dY().J()) && !$$1.b(ku.t) : $$1.f();
      }
   }

   public static class b extends crs {
      public final jz<cwf> m = jz.a();
      private final crs n;

      public b(cor $$0) {
         super(null, 0);
         this.n = $$0.cc;
         coq $$1 = $$0.gl();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fst.a(fst.S, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         this.a($$1, 9, 112);
         this.b(0.0F);
      }

      @Override
      public boolean b(cor $$0) {
         return true;
      }

      protected int l() {
         return azn.e(this.m.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return azn.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return azn.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.m.size()) {
                  fst.S.a($$3 + $$2 * 9, this.m.get($$4));
               } else {
                  fst.S.a($$3 + $$2 * 9, cwf.k);
               }
            }
         }
      }

      public boolean m() {
         return this.m.size() > 45;
      }

      @Override
      public cwf b(cor $$0, int $$1) {
         if ($$1 >= this.k.size() - 9 && $$1 < this.k.size()) {
            ctp $$2 = this.k.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cwf.k);
            }
         }

         return cwf.k;
      }

      @Override
      public boolean a(cwf $$0, ctp $$1) {
         return $$1.c != fst.S;
      }

      @Override
      public boolean b(ctp $$0) {
         return $$0.c != fst.S;
      }

      @Override
      public cwf g() {
         return this.n.g();
      }

      @Override
      public void b(cwf $$0) {
         this.n.b($$0);
      }
   }

   static class c extends ctp {
      final ctp a;

      public c(ctp $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cor $$0, cwf $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cwf $$0) {
         return this.a.a($$0);
      }

      @Override
      public cwf g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cwf $$0, cwf $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cwf $$0) {
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
      public int a_(cwf $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<all, all> b() {
         return this.a.b();
      }

      @Override
      public cwf a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cor $$0) {
         return this.a.a($$0);
      }
   }
}
