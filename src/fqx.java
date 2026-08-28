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

public class fqx extends fra<fqx.b> {
   private static final alb G = alb.b("container/creative_inventory/scroller");
   private static final alb H = alb.b("container/creative_inventory/scroller_disabled");
   private static final alb[] I = new alb[]{
      alb.b("container/creative_inventory/tab_top_unselected_1"),
      alb.b("container/creative_inventory/tab_top_unselected_2"),
      alb.b("container/creative_inventory/tab_top_unselected_3"),
      alb.b("container/creative_inventory/tab_top_unselected_4"),
      alb.b("container/creative_inventory/tab_top_unselected_5"),
      alb.b("container/creative_inventory/tab_top_unselected_6"),
      alb.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final alb[] J = new alb[]{
      alb.b("container/creative_inventory/tab_top_selected_1"),
      alb.b("container/creative_inventory/tab_top_selected_2"),
      alb.b("container/creative_inventory/tab_top_selected_3"),
      alb.b("container/creative_inventory/tab_top_selected_4"),
      alb.b("container/creative_inventory/tab_top_selected_5"),
      alb.b("container/creative_inventory/tab_top_selected_6"),
      alb.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final alb[] K = new alb[]{
      alb.b("container/creative_inventory/tab_bottom_unselected_1"),
      alb.b("container/creative_inventory/tab_bottom_unselected_2"),
      alb.b("container/creative_inventory/tab_bottom_unselected_3"),
      alb.b("container/creative_inventory/tab_bottom_unselected_4"),
      alb.b("container/creative_inventory/tab_bottom_unselected_5"),
      alb.b("container/creative_inventory/tab_bottom_unselected_6"),
      alb.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final alb[] L = new alb[]{
      alb.b("container/creative_inventory/tab_bottom_selected_1"),
      alb.b("container/creative_inventory/tab_bottom_selected_2"),
      alb.b("container/creative_inventory/tab_bottom_selected_3"),
      alb.b("container/creative_inventory/tab_bottom_selected_4"),
      alb.b("container/creative_inventory/tab_bottom_selected_5"),
      alb.b("container/creative_inventory/tab_bottom_selected_6"),
      alb.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int M = 5;
   private static final int N = 9;
   private static final int O = 26;
   private static final int P = 32;
   private static final int Q = 12;
   private static final int R = 15;
   static final brr S = new brr(45);
   private static final xd T = xd.c("inventory.binSlot");
   private static final int U = 16777215;
   private static ctw V = ctx.b();
   private float W;
   private boolean X;
   private fkj Y;
   @Nullable
   private List<csn> Z;
   @Nullable
   private csn aa;
   private fqw ab;
   private boolean ac;
   private boolean ad;
   private final Set<axi<cvg>> ae = new HashSet<>();
   private final boolean af;

   public fqx(gfs $$0, cqh $$1, boolean $$2) {
      super(new fqx.b($$0), $$0.gc(), xc.a);
      $$0.ca = this.z;
      this.u = 136;
      this.s = 195;
      this.af = $$2;
      this.a($$0.cx.D(), $$1, this.a($$0), $$0.dS().F_());
   }

   private boolean a(cnp $$0) {
      return $$0.gz() && this.af;
   }

   private void a(cqh $$0, boolean $$1, jp.a $$2) {
      gay $$3 = this.m.L();
      if (this.a($$3 != null ? $$3.D() : null, $$0, $$1, $$2)) {
         for (ctw $$4 : ctx.d()) {
            Collection<cvl> $$5 = $$4.l();
            if ($$4 == V) {
               if ($$4.k() == ctw.h.a && $$5.isEmpty()) {
                  this.a(ctx.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable gbo $$0, cqh $$1, boolean $$2, jp.a $$3) {
      if (!ctx.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<cvl> $$4 = List.copyOf(ctx.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<cvl> $$0) {
      int $$1 = this.z.a(this.W);
      this.z.m.clear();
      if (V.k() == ctw.h.d) {
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
            this.a(this.m.t.cx.y(), this.a(this.m.t), this.m.t.dS().F_());
         }

         if (!this.m.r.f()) {
            this.m.a(new fri(this.m.t));
         }
      }
   }

   @Override
   protected void a(@Nullable csn $$0, int $$1, int $$2, crb $$3) {
      if (this.a($$0)) {
         this.Y.c(false);
         this.Y.i(0);
      }

      boolean $$4 = $$3 == crb.b;
      $$3 = $$1 == -999 && $$3 == crb.a ? crb.e : $$3;
      if ($$0 == null && V.k() != ctw.h.b && $$3 != crb.f) {
         if (!this.z.g().f() && this.ad) {
            if ($$2 == 0) {
               this.m.t.a(this.z.g(), true);
               this.m.r.a(this.z.g());
               this.z.b(cvl.k);
            }

            if ($$2 == 1) {
               cvl $$18 = this.z.g().a(1);
               this.m.t.a($$18, true);
               this.m.r.a($$18);
            }
         }
      } else {
         if ($$0 != null && !$$0.a(this.m.t)) {
            return;
         }

         if ($$0 == this.aa && $$4) {
            for (int $$5 = 0; $$5 < this.m.t.bZ.c().size(); $$5++) {
               this.m.r.a(cvl.k, $$5);
            }
         } else if (V.k() == ctw.h.b) {
            if ($$0 == this.aa) {
               this.z.b(cvl.k);
            } else if ($$3 == crb.e && $$0 != null && $$0.h()) {
               cvl $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().k());
               cvl $$7 = $$0.g();
               this.m.t.a($$6, true);
               this.m.r.a($$6);
               this.m.r.a($$7, ((fqx.c)$$0).a.d);
            } else if ($$3 == crb.e && !this.z.g().f()) {
               this.m.t.a(this.z.g(), true);
               this.m.r.a(this.z.g());
               this.z.b(cvl.k);
            } else {
               this.m.t.bZ.a($$0 == null ? $$1 : ((fqx.c)$$0).a.d, $$2, $$3, this.m.t);
               this.m.t.bZ.d();
            }
         } else if ($$3 != crb.f && $$0.c == S) {
            cvl $$8 = this.z.g();
            cvl $$9 = $$0.g();
            if ($$3 == crb.c) {
               if (!$$9.f()) {
                  this.m.t.gc().a($$2, $$9.c($$9.k()));
                  this.m.t.bZ.d();
               }

               return;
            }

            if ($$3 == crb.d) {
               if (this.z.g().f() && $$0.h()) {
                  cvl $$10 = $$0.g();
                  this.z.b($$10.c($$10.k()));
               }

               return;
            }

            if ($$3 == crb.e) {
               if (!$$9.f()) {
                  cvl $$11 = $$9.c($$2 == 0 ? 1 : $$9.k());
                  this.m.t.a($$11, true);
                  this.m.r.a($$11);
               }

               return;
            }

            if (!$$8.f() && !$$9.f() && cvl.c($$8, $$9)) {
               if ($$2 == 0) {
                  if ($$4) {
                     $$8.e($$8.k());
                  } else if ($$8.J() < $$8.k()) {
                     $$8.g(1);
                  }
               } else {
                  $$8.h(1);
               }
            } else if (!$$9.f() && $$8.f()) {
               int $$12 = $$4 ? $$9.k() : $$9.J();
               this.z.b($$9.c($$12));
            } else if ($$2 == 0) {
               this.z.b(cvl.k);
            } else if (!this.z.g().f()) {
               this.z.g().h(1);
            }
         } else if (this.z != null) {
            cvl $$13 = $$0 == null ? cvl.k : this.z.b($$0.d).g();
            this.z.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.m.t);
            if (cqq.d($$2) == 2) {
               for (int $$14 = 0; $$14 < 9; $$14++) {
                  this.m.r.a(this.z.b(45 + $$14).g(), 36 + $$14);
               }
            } else if ($$0 != null) {
               cvl $$15 = this.z.b($$0.d).g();
               this.m.r.a($$15, $$0.d - this.z.k.size() + 9 + 36);
               int $$16 = 45 + $$2;
               if ($$3 == crb.c) {
                  this.m.r.a($$13, $$16 - this.z.k.size() + 9 + 36);
               } else if ($$3 == crb.e && !$$13.f()) {
                  cvl $$17 = $$13.c($$2 == 0 ? 1 : $$13.k());
                  this.m.t.a($$17, true);
                  this.m.r.a($$17);
               }

               this.m.t.bZ.d();
            }
         }
      }
   }

   private boolean a(@Nullable csn $$0) {
      return $$0 != null && $$0.c == S;
   }

   @Override
   protected void aT_() {
      if (this.m.r.f()) {
         super.aT_();
         this.Y = new fkj(this.p, this.C + 82, this.D + 6, 80, 9, xd.c("itemGroup.search"));
         this.Y.f(50);
         this.Y.d(false);
         this.Y.g(false);
         this.Y.g(16777215);
         this.d(this.Y);
         ctw $$0 = V;
         V = ctx.b();
         this.a($$0);
         this.m.t.bZ.b(this.ab);
         this.ab = new fqw(this.m);
         this.m.t.bZ.a(this.ab);
         if (!V.i()) {
            this.a(ctx.b());
         }
      } else {
         this.m.a(new fri(this.m.t));
      }
   }

   @Override
   public void a(fib $$0, int $$1, int $$2) {
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
      if (this.m.t != null && this.m.t.gc() != null) {
         this.m.t.bZ.b(this.ab);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.ac) {
         return false;
      } else if (V.k() != ctw.h.d) {
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
      if (V.k() != ctw.h.d) {
         if (this.m.n.I.a($$0, $$1)) {
            this.ac = true;
            this.a(ctx.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else if (super.a($$0, $$1)) {
         this.ac = true;
         return true;
      } else {
         boolean $$3 = !this.a(this.B) || this.B.h();
         boolean $$4 = fbk.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.b($$0, $$1)) {
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
               return this.Y.aO_() && this.Y.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
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
         gay $$1 = this.m.L();
         if ($$1 != null) {
            gbo $$2 = $$1.D();
            hao<cvl> $$3;
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
      Predicate<alb> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      lu.g.j().map(jr.c::h).filter($$1x -> $$2.test($$1x.b())).forEach(this.ae::add);
   }

   @Override
   protected void b(fjn $$0, int $$1, int $$2) {
      if (V.d()) {
         $$0.a(this.p, V.a(), 8, 6, 4210752, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - (double)this.C;
         double $$4 = $$1 - (double)this.D;

         for (ctw $$5 : ctx.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (V.k() != ctw.h.b && this.b($$0, $$1)) {
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

         for (ctw $$5 : ctx.c()) {
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

   private void a(ctw $$0) {
      ctw $$1 = V;
      V = $$0;
      this.E.clear();
      this.z.m.clear();
      this.m();
      if (V.k() == ctw.h.c) {
         fhw $$2 = this.m.aC();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gfu $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     cvl $$6 = new cvl(cvo.qP);
                     $$6.b(kr.s, bah.a);
                     xd $$7 = this.m.n.S[$$3].k();
                     xd $$8 = this.m.n.T.k();
                     $$6.b(kr.h, xd.a("inventory.hotbarInfo", $$8, $$7));
                     this.z.m.add($$6);
                  } else {
                     this.z.m.add(cvl.k);
                  }
               }
            } else {
               this.z.m.addAll($$4.a(this.m.s.F_()));
            }
         }
      } else if (V.k() == ctw.h.a) {
         this.z.m.addAll(V.l());
      }

      if (V.k() == ctw.h.b) {
         cqq $$9 = this.m.t.bZ;
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

            csn $$26 = new fqx.c($$9.k.get($$10), $$10, $$14, $$15);
            this.z.k.add($$26);
         }

         this.aa = new csn(S, 0, 173, 112);
         this.z.k.add(this.aa);
      } else if ($$1.k() == ctw.h.b) {
         this.z.k.clear();
         this.z.k.addAll(this.Z);
         this.Z = null;
      }

      if (V.k() == ctw.h.d) {
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
         this.W = azc.a(this.W, 0.0F, 1.0F);
         this.z.b(this.W);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ctw $$4 : ctx.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.aa != null && V.k() == ctw.h.b && this.a(this.aa.e, this.aa.f, 16, 16, (double)$$1, (double)$$2)) {
         $$0.a(this.p, T, $$1, $$2);
      }

      this.a($$0, $$1, $$2);
   }

   @Override
   public List<xd> a(cvl $$0) {
      boolean $$1 = this.B != null && this.B instanceof fqx.a;
      boolean $$2 = V.k() == ctw.h.a;
      boolean $$3 = V.k() == ctw.h.d;
      cxf.a $$4 = this.m.n.m ? cxf.a.b : cxf.a.a;
      cxf $$5 = $$1 ? $$4.c() : $$4;
      List<xd> $$6 = $$0.a(cvg.b.a(this.m.s), this.m.t, $$5);
      if ($$2 && $$1) {
         return $$6;
      } else {
         List<xd> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ae.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, xd.b("#" + $$2x.b()).a(n.f));
               }
            });
         }

         int $$8 = 1;

         for (ctw $$9 : ctx.c()) {
            if ($$9.k() != ctw.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(n.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fjn $$0, float $$1, int $$2, int $$3) {
      for (ctw $$4 : ctx.c()) {
         if ($$4 != V) {
            this.a($$0, $$4);
         }
      }

      $$0.a(ghe::C, V.c(), this.C, this.D, 0.0F, 0.0F, this.s, this.u, 256, 256);
      this.Y.a($$0, $$2, $$3, $$1);
      int $$5 = this.C + 175;
      int $$6 = this.D + 18;
      int $$7 = $$6 + 112;
      if (V.e()) {
         alb $$8 = this.K() ? G : H;
         $$0.a(ghe::C, $$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.W), 12, 15);
      }

      this.a($$0, V);
      if (V.k() == ctw.h.b) {
         fri.a($$0, this.C + 73, this.D + 6, this.C + 105, this.D + 49, 20, 0.0625F, (float)$$2, (float)$$3, this.m.t);
      }
   }

   private int b(ctw $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.s - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(ctw $$0) {
      int $$1 = 0;
      if ($$0.g() == ctw.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.u;
      }

      return $$1;
   }

   protected boolean a(ctw $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
   }

   protected boolean a(fjn $$0, ctw $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, (double)$$2, (double)$$3)) {
         $$0.a(this.p, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fjn $$0, ctw $$1) {
      boolean $$2 = $$1 == V;
      boolean $$3 = $$1.g() == ctw.f.a;
      int $$4 = $$1.f();
      int $$5 = this.C + this.b($$1);
      int $$6 = this.D - ($$3 ? 28 : -(this.u - 4));
      alb[] $$7;
      if ($$3) {
         $$7 = $$2 ? J : I;
      } else {
         $$7 = $$2 ? L : K;
      }

      $$0.a(ghe::C, $$7[azc.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$5 += 5;
      $$6 += 8 + ($$3 ? 1 : -1);
      cvl $$9 = $$1.b();
      $$0.a($$9, $$5, $$6);
      $$0.a(this.p, $$9, $$5, $$6);
      $$0.c().b();
   }

   public boolean F() {
      return V.k() == ctw.h.b;
   }

   public static void a(fib $$0, int $$1, boolean $$2, boolean $$3) {
      gfs $$4 = $$0.t;
      kb $$5 = $$4.dS().F_();
      fhw $$6 = $$0.aC();
      gfu $$7 = $$6.a($$1);
      if ($$2) {
         List<cvl> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cno.g(); $$9++) {
            cvl $$10 = $$8.get($$9);
            $$4.gc().a($$9, $$10);
            $$0.r.a($$10, 36 + $$9);
         }

         $$4.bZ.d();
      } else if ($$3) {
         $$7.a($$4.gc(), $$5);
         xd $$11 = $$0.n.S[$$1].k();
         xd $$12 = $$0.n.U.k();
         xd $$13 = xd.a("inventory.hotbarSaved", $$12, $$11);
         $$0.m.a($$13, false);
         $$0.aY().c($$13);
         $$6.a();
      }
   }

   static class a extends csn {
      public a(brd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cnp $$0) {
         cvl $$1 = this.g();
         return super.a($$0) && !$$1.f() ? $$1.a($$0.dS().J()) && !$$1.b(kr.s) : $$1.f();
      }
   }

   public static class b extends cqq {
      public final jw<cvl> m = jw.a();
      private final cqq n;

      public b(cnp $$0) {
         super(null, 0);
         this.n = $$0.bZ;
         cno $$1 = $$0.gc();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new fqx.a(fqx.S, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         this.a($$1, 9, 112);
         this.b(0.0F);
      }

      @Override
      public boolean b(cnp $$0) {
         return true;
      }

      protected int l() {
         return azc.e(this.m.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
      }

      protected float e(int $$0) {
         return azc.a((float)$$0 / (float)this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return azc.a($$0 - (float)($$1 / (double)this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.m.size()) {
                  fqx.S.a($$3 + $$2 * 9, this.m.get($$4));
               } else {
                  fqx.S.a($$3 + $$2 * 9, cvl.k);
               }
            }
         }
      }

      public boolean m() {
         return this.m.size() > 45;
      }

      @Override
      public cvl b(cnp $$0, int $$1) {
         if ($$1 >= this.k.size() - 9 && $$1 < this.k.size()) {
            csn $$2 = this.k.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(cvl.k);
            }
         }

         return cvl.k;
      }

      @Override
      public boolean a(cvl $$0, csn $$1) {
         return $$1.c != fqx.S;
      }

      @Override
      public boolean b(csn $$0) {
         return $$0.c != fqx.S;
      }

      @Override
      public cvl g() {
         return this.n.g();
      }

      @Override
      public void b(cvl $$0) {
         this.n.b($$0);
      }
   }

   static class c extends csn {
      final csn a;

      public c(csn $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cnp $$0, cvl $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(cvl $$0) {
         return this.a.a($$0);
      }

      @Override
      public cvl g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(cvl $$0, cvl $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(cvl $$0) {
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
      public int a_(cvl $$0) {
         return this.a.a_($$0);
      }

      @Nullable
      @Override
      public Pair<alb, alb> b() {
         return this.a.b();
      }

      @Override
      public cvl a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean d() {
         return this.a.d();
      }

      @Override
      public boolean a(cnp $$0) {
         return this.a.a($$0);
      }
   }
}
