import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fse<T extends crs> extends frp implements ftj<T> {
   public static final all a = all.b("textures/gui/container/inventory.png");
   private static final all G = all.b("container/slot_highlight_back");
   private static final all H = all.b("container/slot_highlight_front");
   protected static final int b = 256;
   protected static final int c = 256;
   private static final float I = 100.0F;
   private static final int J = 500;
   public static final int d = 100;
   private static final int K = 200;
   protected int s = 176;
   protected int u = 166;
   protected int v;
   protected int w;
   protected int x;
   protected int y;
   private final List<fll> L;
   protected final T z;
   protected final xl A;
   @Nullable
   protected ctp B;
   @Nullable
   private ctp M;
   @Nullable
   private ctp N;
   @Nullable
   private ctp O;
   @Nullable
   private ctp P;
   protected int C;
   protected int D;
   private boolean Q;
   private cwf R = cwf.k;
   private int S;
   private int T;
   private long U;
   private cwf V = cwf.k;
   private long W;
   protected final Set<ctp> E = Sets.newHashSet();
   protected boolean F;
   private int X;
   private int Y;
   private boolean Z;
   private int aa;
   private long ab;
   private int ac;
   private boolean ad;
   private cwf ae = cwf.k;

   public fse(T $$0, coq $$1, xl $$2) {
      super($$2);
      this.z = $$0;
      this.A = $$1.S_();
      this.Z = true;
      this.v = 8;
      this.w = 6;
      this.x = 8;
      this.y = this.u - 94;
      this.L = new ArrayList<>();
   }

   @Override
   protected void aS_() {
      this.C = (this.n - this.s) / 2;
      this.D = (this.o - this.u) / 2;
      this.L.clear();
      this.a(new flf(this.m));
   }

   protected void a(fll $$0) {
      this.L.add($$0);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      ctp $$6 = this.B;
      this.B = this.b((double)$$1, (double)$$2);
      this.c($$0);

      for (ctp $$7 : this.z.k) {
         if ($$7.d()) {
            this.a($$0, $$7);
         }
      }

      this.d($$0);
      if ($$6 != null && $$6 != this.B) {
         this.a($$6);
      }

      this.b($$0, $$1, $$2);
      cwf $$8 = this.R.f() ? this.z.g() : this.R;
      if (!$$8.f()) {
         int $$9 = 8;
         int $$10 = this.R.f() ? 8 : 16;
         String $$11 = null;
         if (!this.R.f() && this.Q) {
            $$8 = $$8.c(azn.f((float)$$8.L() / 2.0F));
         } else if (this.F && this.E.size() > 1) {
            $$8 = $$8.c(this.aa);
            if ($$8.f()) {
               $$11 = n.o + "0";
            }
         }

         this.a($$0, $$8, $$1 - $$4 - 8, $$2 - $$5 - $$10, $$11);
      }

      if (!this.V.f()) {
         float $$12 = (float)(ae.c() - this.U) / 100.0F;
         if ($$12 >= 1.0F) {
            $$12 = 1.0F;
            this.V = cwf.k;
         }

         int $$13 = this.N.e - this.S;
         int $$14 = this.N.f - this.T;
         int $$15 = this.S + (int)((float)$$13 * $$12);
         int $$16 = this.T + (int)((float)$$14 * $$12);
         this.a($$0, this.V, $$15, $$16, null);
      }

      $$0.c().b();
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.B != null && this.B.h()) {
         for (fll $$4 : this.L) {
            if ($$4.a(this.B) && $$4.a($$2, $$3, this.B.d, this.B.g())) {
               return true;
            }
         }
      }

      return false;
   }

   private void c(flj $$0) {
      if (this.B != null && this.B.e()) {
         $$0.a(gjh::B, G, this.B.e - 4, this.B.f - 4, 24, 24);
      }
   }

   private void d(flj $$0) {
      if (this.B != null && this.B.e()) {
         $$0.a(gjh::z, H, this.B.e - 4, this.B.f - 4, 24, 24);
      }
   }

   protected void a(flj $$0, int $$1, int $$2) {
      if (this.B != null && this.B.h()) {
         cwf $$3 = this.B.g();
         if (this.z.g().f() || this.b($$3)) {
            $$0.a(this.p, this.a($$3), $$3.b(), $$1, $$2, $$3.a(ku.G));
         }
      }
   }

   private boolean b(cwf $$0) {
      return $$0.b().map(fty::a).map(fty::a).orElse(false);
   }

   protected List<xl> a(cwf $$0) {
      return a(this.m, $$0);
   }

   private void a(flj $$0, cwf $$1, int $$2, int $$3, @Nullable String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.p, $$1, $$2, $$3 - (this.R.f() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(flj $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
      $$0.a(this.p, this.A, this.x, this.y, 4210752, false);
   }

   protected abstract void a(flj var1, float var2, int var3, int var4);

   protected void a(flj $$0, ctp $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      cwf $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.M && !this.R.f() && !this.Q;
      cwf $$7 = this.z.g();
      String $$8 = null;
      if ($$1 == this.M && !this.R.f() && this.Q && !$$4.f()) {
         $$4 = $$4.c($$4.L() / 2);
      } else if (this.F && this.E.contains($$1) && !$$7.f()) {
         if (this.E.size() == 1) {
            return;
         }

         if (crs.a($$1, $$7, true) && this.z.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.k(), $$1.a_($$7));
            int $$10 = $$1.g().f() ? 0 : $$1.g().L();
            int $$11 = crs.a(this.E, this.X, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.E.remove($$1);
            this.J();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.f() && $$1.d()) {
         Pair<all, all> $$12 = $$1.b();
         if ($$12 != null) {
            gyt $$13 = this.m.a((all)$$12.getFirst()).apply((all)$$12.getSecond());
            $$0.a(gjh::B, $$13, $$2, $$3, 16, 16);
            $$6 = true;
         }
      }

      if (!$$6) {
         if ($$5) {
            $$0.a($$2, $$3, $$2 + 16, $$3 + 16, -2130706433);
         }

         int $$14 = $$1.e + $$1.f * this.s;
         if ($$1.f()) {
            $$0.b($$4, $$2, $$3, $$14);
         } else {
            $$0.a($$4, $$2, $$3, $$14);
         }

         $$0.a(this.p, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void J() {
      cwf $$0 = this.z.g();
      if (!$$0.f() && this.F) {
         if (this.X == 2) {
            this.aa = $$0.k();
         } else {
            this.aa = $$0.L();

            for (ctp $$1 : this.E) {
               cwf $$2 = $$1.g();
               int $$3 = $$2.f() ? 0 : $$2.L();
               int $$4 = Math.min($$0.k(), $$1.a_($$0));
               int $$5 = Math.min(crs.a(this.E, this.X, $$0) + $$3, $$4);
               this.aa -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private ctp b(double $$0, double $$1) {
      for (ctp $$2 : this.z.k) {
         if ($$2.d() && this.a($$2, $$0, $$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         boolean $$3 = this.m.n.H.a($$2) && this.m.r.f();
         ctp $$4 = this.b($$0, $$1);
         long $$5 = ae.c();
         this.ad = this.P == $$4 && $$5 - this.ab < 250L && this.ac == $$2;
         this.Z = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.C;
            int $$7 = this.D;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.d;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.m.n.ab().c() && $$8 && this.z.g().f()) {
               this.aP_();
               return true;
            }

            if ($$9 != -1) {
               if (this.m.n.ab().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.M = $$4;
                     this.R = cwf.k;
                     this.Q = $$2 == 1;
                  } else {
                     this.M = null;
                  }
               } else if (!this.F) {
                  if (this.z.g().f()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, csd.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (fdf.a(fjx.Q().aO().h(), 340) || fdf.a(fjx.Q().aO().h(), 344));
                        csd $$11 = csd.a;
                        if ($$10) {
                           this.ae = $$4 != null && $$4.h() ? $$4.g().v() : cwf.k;
                           $$11 = csd.b;
                        } else if ($$9 == -999) {
                           $$11 = csd.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.Z = true;
                  } else {
                     this.F = true;
                     this.Y = $$2;
                     this.E.clear();
                     if ($$2 == 0) {
                        this.X = 0;
                     } else if ($$2 == 1) {
                        this.X = 1;
                     } else if ($$3) {
                        this.X = 2;
                     }
                  }
               }
            }
         }

         this.P = $$4;
         this.ab = $$5;
         this.ac = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.B != null && this.z.g().f()) {
         if (this.m.n.D.a($$0)) {
            this.a(this.B, this.B.d, 40, csd.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.m.n.S[$$1].a($$0)) {
               this.a(this.B, this.B.d, $$1, csd.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      ctp $$5 = this.b($$0, $$1);
      cwf $$6 = this.z.g();
      if (this.M != null && this.m.n.ab().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.R.f()) {
               if ($$5 != this.M && !this.M.g().f()) {
                  this.R = this.M.g().v();
               }
            } else if (this.R.L() > 1 && $$5 != null && crs.a($$5, this.R, false)) {
               long $$7 = ae.c();
               if (this.O == $$5) {
                  if ($$7 - this.W > 500L) {
                     this.a(this.M, this.M.d, 0, csd.a);
                     this.a($$5, $$5.d, 1, csd.a);
                     this.a(this.M, this.M.d, 0, csd.a);
                     this.W = $$7 + 750L;
                     this.R.h(1);
                  }
               } else {
                  this.O = $$5;
                  this.W = $$7;
               }
            }
         }
      } else if (this.F && $$5 != null && !$$6.f() && ($$6.L() > this.E.size() || this.X == 2) && crs.a($$5, $$6, true) && $$5.a($$6) && this.z.b($$5)) {
         this.E.add($$5);
         this.J();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      ctp $$3 = this.b($$0, $$1);
      int $$4 = this.C;
      int $$5 = this.D;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.d;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.ad && $$3 != null && $$2 == 0 && this.z.a(cwf.k, $$3)) {
         if (t()) {
            if (!this.ae.f()) {
               for (ctp $$8 : this.z.k) {
                  if ($$8 != null && $$8.a(this.m.t) && $$8.h() && $$8.c == $$3.c && crs.a($$8, this.ae, true)) {
                     this.a($$8, $$8.d, $$2, csd.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, csd.g);
         }

         this.ad = false;
         this.ab = 0L;
      } else {
         if (this.F && this.Y != $$2) {
            this.F = false;
            this.E.clear();
            this.Z = true;
            return true;
         }

         if (this.Z) {
            this.Z = false;
            return true;
         }

         if (this.M != null && this.m.n.ab().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.R.f() && $$3 != this.M) {
                  this.R = this.M.g();
               }

               boolean $$9 = crs.a($$3, this.R, false);
               if ($$7 != -1 && !this.R.f() && $$9) {
                  this.a(this.M, this.M.d, $$2, csd.a);
                  this.a($$3, $$7, 0, csd.a);
                  if (this.z.g().f()) {
                     this.V = cwf.k;
                  } else {
                     this.a(this.M, this.M.d, $$2, csd.a);
                     this.S = azn.a($$0 - (double)$$4);
                     this.T = azn.a($$1 - (double)$$5);
                     this.N = this.M;
                     this.V = this.R;
                     this.U = ae.c();
                  }
               } else if (!this.R.f()) {
                  this.S = azn.a($$0 - (double)$$4);
                  this.T = azn.a($$1 - (double)$$5);
                  this.N = this.M;
                  this.V = this.R;
                  this.U = ae.c();
               }

               this.m();
            }
         } else if (this.F && !this.E.isEmpty()) {
            this.a(null, -999, crs.c(0, this.X), csd.f);

            for (ctp $$10 : this.E) {
               this.a($$10, $$10.d, crs.c(1, this.X), csd.f);
            }

            this.a(null, -999, crs.c(2, this.X), csd.f);
         } else if (!this.z.g().f()) {
            if (this.m.n.H.a($$2)) {
               this.a($$3, $$7, $$2, csd.d);
            } else {
               boolean $$11 = $$7 != -999 && (fdf.a(fjx.Q().aO().h(), 340) || fdf.a(fjx.Q().aO().h(), 344));
               if ($$11) {
                  this.ae = $$3 != null && $$3.h() ? $$3.g().v() : cwf.k;
               }

               this.a($$3, $$7, $$2, $$11 ? csd.b : csd.a);
            }
         }
      }

      if (this.z.g().f()) {
         this.ab = 0L;
      }

      this.F = false;
      return true;
   }

   public void m() {
      this.R = cwf.k;
      this.M = null;
   }

   private boolean a(ctp $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.C;
      int $$7 = this.D;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   private void a(ctp $$0) {
      if ($$0.h()) {
         for (fll $$1 : this.L) {
            if ($$1.a($$0)) {
               $$1.b($$0);
            }
         }
      }
   }

   protected void a(ctp $$0, int $$1, int $$2, csd $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.a($$0, $$3);
      this.m.r.a(this.z.l, $$1, $$2, $$3, this.m.t);
   }

   void a(@Nullable ctp $$0, csd $$1) {
      if ($$0 != null && $$0.h()) {
         for (fll $$2 : this.L) {
            if ($$2.a($$0)) {
               $$2.a($$0, $$1);
            }
         }
      }
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.m.r.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.m.n.C.a($$0, $$1)) {
         this.aP_();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.B != null && this.B.h()) {
            if (this.m.n.H.a($$0, $$1)) {
               this.a(this.B, this.B.d, 0, csd.d);
            } else if (this.m.n.E.a($$0, $$1)) {
               this.a(this.B, this.B.d, s() ? 1 : 0, csd.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.z.g().f() && this.B != null) {
         if (this.m.n.D.a($$0, $$1)) {
            this.a(this.B, this.B.d, 40, csd.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.m.n.S[$$2].a($$0, $$1)) {
               this.a(this.B, this.B.d, $$2, csd.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void j() {
      if (this.m.t != null) {
         this.z.a(this.m.t);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.m.t.bN() && !this.m.t.dT()) {
         this.D();
      } else {
         this.m.t.s();
      }
   }

   protected void D() {
   }

   @Override
   public T E() {
      return this.z;
   }

   @Override
   public void aP_() {
      this.m.t.s();
      if (this.B != null) {
         this.a(this.B);
      }

      super.aP_();
   }
}
