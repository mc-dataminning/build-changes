import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class flr<T extends cnh> extends fkt implements fmw<T> {
   public static final akf a = new akf("textures/gui/container/inventory.png");
   private static final float D = 100.0F;
   private static final int E = 500;
   public static final int b = 100;
   private static final int F = 200;
   protected int c = 176;
   protected int d = 166;
   protected int r;
   protected int s;
   protected int u;
   protected int v;
   protected final T w;
   protected final ws x;
   @Nullable
   protected cpd y;
   @Nullable
   private cpd G;
   @Nullable
   private cpd H;
   @Nullable
   private cpd I;
   @Nullable
   private cpd J;
   protected int z;
   protected int A;
   private boolean K;
   private csd L = csd.i;
   private int M;
   private int N;
   private long O;
   private csd P = csd.i;
   private long Q;
   protected final Set<cpd> B = Sets.newHashSet();
   protected boolean C;
   private int R;
   private int S;
   private boolean T;
   private int U;
   private long V;
   private int W;
   private boolean X;
   private csd Y = csd.i;

   public flr(T $$0, ckk $$1, ws $$2) {
      super($$2);
      this.w = $$0;
      this.x = $$1.O_();
      this.T = true;
      this.r = 8;
      this.s = 6;
      this.u = 8;
      this.v = this.d - 94;
   }

   @Override
   protected void aM_() {
      this.z = (this.n - this.c) / 2;
      this.A = (this.o - this.d) / 2;
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.disableDepthTest();
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.y = null;

      for (int $$6 = 0; $$6 < this.w.i.size(); $$6++) {
         cpd $$7 = this.w.i.get($$6);
         if ($$7.d()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.d()) {
            this.y = $$7;
            int $$8 = $$7.f;
            int $$9 = $$7.g;
            if (this.y.e()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      csd $$10 = this.L.d() ? this.w.g() : this.L;
      if (!$$10.d()) {
         int $$11 = 8;
         int $$12 = this.L.d() ? 8 : 16;
         String $$13 = null;
         if (!this.L.d() && this.K) {
            $$10 = $$10.c(axw.f((float)$$10.G() / 2.0F));
         } else if (this.C && this.B.size() > 1) {
            $$10 = $$10.c(this.U);
            if ($$10.d()) {
               $$13 = n.o + "0";
            }
         }

         this.a($$0, $$10, $$1 - $$4 - 8, $$2 - $$5 - $$12, $$13);
      }

      if (!this.P.d()) {
         float $$14 = (float)(ac.b() - this.O) / 100.0F;
         if ($$14 >= 1.0F) {
            $$14 = 1.0F;
            this.P = csd.i;
         }

         int $$15 = this.H.f - this.M;
         int $$16 = this.H.g - this.N;
         int $$17 = this.M + (int)((float)$$15 * $$14);
         int $$18 = this.N + (int)((float)$$16 * $$14);
         this.a($$0, this.P, $$17, $$18, null);
      }

      $$0.c().b();
      RenderSystem.enableDepthTest();
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   public static void a(feh $$0, int $$1, int $$2, int $$3) {
      $$0.a(gbm.E(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(feh $$0, int $$1, int $$2) {
      if (this.w.g().d() && this.y != null && this.y.h()) {
         csd $$3 = this.y.g();
         $$0.a(this.p, this.a($$3), $$3.b(), $$1, $$2);
      }
   }

   protected List<ws> a(csd $$0) {
      return a(this.m, $$0);
   }

   private void a(feh $$0, csd $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.p, $$1, $$2, $$3 - (this.L.d() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(feh $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.r, this.s, 4210752, false);
      $$0.a(this.p, this.x, this.u, this.v, 4210752, false);
   }

   protected abstract void a(feh var1, float var2, int var3, int var4);

   protected void a(feh $$0, cpd $$1) {
      int $$2 = $$1.f;
      int $$3 = $$1.g;
      csd $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.G && !this.L.d() && !this.K;
      csd $$7 = this.w.g();
      String $$8 = null;
      if ($$1 == this.G && !this.L.d() && this.K && !$$4.d()) {
         $$4 = $$4.c($$4.G() / 2);
      } else if (this.C && this.B.contains($$1) && !$$7.d()) {
         if (this.B.size() == 1) {
            return;
         }

         if (cnh.a($$1, $$7, true) && this.w.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.i(), $$1.a_($$7));
            int $$10 = $$1.g().d() ? 0 : $$1.g().G();
            int $$11 = cnh.a(this.B, this.R, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.B.remove($$1);
            this.I();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.d() && $$1.d()) {
         Pair<akf, akf> $$12 = $$1.c();
         if ($$12 != null) {
            gmo $$13 = this.m.a((akf)$$12.getFirst()).apply((akf)$$12.getSecond());
            $$0.a($$2, $$3, 0, 16, 16, $$13);
            $$6 = true;
         }
      }

      if (!$$6) {
         if ($$5) {
            $$0.a($$2, $$3, $$2 + 16, $$3 + 16, -2130706433);
         }

         int $$14 = $$1.f + $$1.g * this.c;
         if ($$1.f()) {
            $$0.b($$4, $$2, $$3, $$14);
         } else {
            $$0.a($$4, $$2, $$3, $$14);
         }

         $$0.a(this.p, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void I() {
      csd $$0 = this.w.g();
      if (!$$0.d() && this.C) {
         if (this.R == 2) {
            this.U = $$0.i();
         } else {
            this.U = $$0.G();

            for (cpd $$1 : this.B) {
               csd $$2 = $$1.g();
               int $$3 = $$2.d() ? 0 : $$2.G();
               int $$4 = Math.min($$0.i(), $$1.a_($$0));
               int $$5 = Math.min(cnh.a(this.B, this.R, $$0) + $$3, $$4);
               this.U -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private cpd b(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.w.i.size(); $$2++) {
         cpd $$3 = this.w.i.get($$2);
         if (this.a($$3, $$0, $$1) && $$3.d()) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         boolean $$3 = this.m.m.J.a($$2) && this.m.q.f();
         cpd $$4 = this.b($$0, $$1);
         long $$5 = ac.b();
         this.X = this.J == $$4 && $$5 - this.V < 250L && this.W == $$2;
         this.T = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.z;
            int $$7 = this.A;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.e;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.m.m.Z().c() && $$8 && this.w.g().d()) {
               this.d();
               return true;
            }

            if ($$9 != -1) {
               if (this.m.m.Z().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.G = $$4;
                     this.L = csd.i;
                     this.K = $$2 == 1;
                  } else {
                     this.G = null;
                  }
               } else if (!this.C) {
                  if (this.w.g().d()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cnq.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (ewi.a(fcu.Q().aO().i(), 340) || ewi.a(fcu.Q().aO().i(), 344));
                        cnq $$11 = cnq.a;
                        if ($$10) {
                           this.Y = $$4 != null && $$4.h() ? $$4.g().r() : csd.i;
                           $$11 = cnq.b;
                        } else if ($$9 == -999) {
                           $$11 = cnq.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.T = true;
                  } else {
                     this.C = true;
                     this.S = $$2;
                     this.B.clear();
                     if ($$2 == 0) {
                        this.R = 0;
                     } else if ($$2 == 1) {
                        this.R = 1;
                     } else if ($$3) {
                        this.R = 2;
                     }
                  }
               }
            }
         }

         this.J = $$4;
         this.V = $$5;
         this.W = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.y != null && this.w.g().d()) {
         if (this.m.m.F.a($$0)) {
            this.a(this.y, this.y.e, 40, cnq.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.m.m.U[$$1].a($$0)) {
               this.a(this.y, this.y.e, $$1, cnq.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      cpd $$5 = this.b($$0, $$1);
      csd $$6 = this.w.g();
      if (this.G != null && this.m.m.Z().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.L.d()) {
               if ($$5 != this.G && !this.G.g().d()) {
                  this.L = this.G.g().r();
               }
            } else if (this.L.G() > 1 && $$5 != null && cnh.a($$5, this.L, false)) {
               long $$7 = ac.b();
               if (this.I == $$5) {
                  if ($$7 - this.Q > 500L) {
                     this.a(this.G, this.G.e, 0, cnq.a);
                     this.a($$5, $$5.e, 1, cnq.a);
                     this.a(this.G, this.G.e, 0, cnq.a);
                     this.Q = $$7 + 750L;
                     this.L.g(1);
                  }
               } else {
                  this.I = $$5;
                  this.Q = $$7;
               }
            }
         }
      } else if (this.C && $$5 != null && !$$6.d() && ($$6.G() > this.B.size() || this.R == 2) && cnh.a($$5, $$6, true) && $$5.a($$6) && this.w.b($$5)) {
         this.B.add($$5);
         this.I();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      cpd $$3 = this.b($$0, $$1);
      int $$4 = this.z;
      int $$5 = this.A;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.e;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.X && $$3 != null && $$2 == 0 && this.w.a(csd.i, $$3)) {
         if (s()) {
            if (!this.Y.d()) {
               for (cpd $$8 : this.w.i) {
                  if ($$8 != null && $$8.a(this.m.s) && $$8.h() && $$8.d == $$3.d && cnh.a($$8, this.Y, true)) {
                     this.a($$8, $$8.e, $$2, cnq.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cnq.g);
         }

         this.X = false;
         this.V = 0L;
      } else {
         if (this.C && this.S != $$2) {
            this.C = false;
            this.B.clear();
            this.T = true;
            return true;
         }

         if (this.T) {
            this.T = false;
            return true;
         }

         if (this.G != null && this.m.m.Z().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.L.d() && $$3 != this.G) {
                  this.L = this.G.g();
               }

               boolean $$9 = cnh.a($$3, this.L, false);
               if ($$7 != -1 && !this.L.d() && $$9) {
                  this.a(this.G, this.G.e, $$2, cnq.a);
                  this.a($$3, $$7, 0, cnq.a);
                  if (this.w.g().d()) {
                     this.P = csd.i;
                  } else {
                     this.a(this.G, this.G.e, $$2, cnq.a);
                     this.M = axw.a($$0 - (double)$$4);
                     this.N = axw.a($$1 - (double)$$5);
                     this.H = this.G;
                     this.P = this.L;
                     this.O = ac.b();
                  }
               } else if (!this.L.d()) {
                  this.M = axw.a($$0 - (double)$$4);
                  this.N = axw.a($$1 - (double)$$5);
                  this.H = this.G;
                  this.P = this.L;
                  this.O = ac.b();
               }

               this.m();
            }
         } else if (this.C && !this.B.isEmpty()) {
            this.a(null, -999, cnh.b(0, this.R), cnq.f);

            for (cpd $$10 : this.B) {
               this.a($$10, $$10.e, cnh.b(1, this.R), cnq.f);
            }

            this.a(null, -999, cnh.b(2, this.R), cnq.f);
         } else if (!this.w.g().d()) {
            if (this.m.m.J.a($$2)) {
               this.a($$3, $$7, $$2, cnq.d);
            } else {
               boolean $$11 = $$7 != -999 && (ewi.a(fcu.Q().aO().i(), 340) || ewi.a(fcu.Q().aO().i(), 344));
               if ($$11) {
                  this.Y = $$3 != null && $$3.h() ? $$3.g().r() : csd.i;
               }

               this.a($$3, $$7, $$2, $$11 ? cnq.b : cnq.a);
            }
         }
      }

      if (this.w.g().d()) {
         this.V = 0L;
      }

      this.C = false;
      return true;
   }

   public void m() {
      this.L = csd.i;
      this.G = null;
   }

   private boolean a(cpd $$0, double $$1, double $$2) {
      return this.a($$0.f, $$0.g, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.z;
      int $$7 = this.A;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(cpd $$0, int $$1, int $$2, cnq $$3) {
      if ($$0 != null) {
         $$1 = $$0.e;
      }

      this.m.q.a(this.w.j, $$1, $$2, $$3, this.m.s);
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.m.q.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.m.m.E.a($$0, $$1)) {
         this.d();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.y != null && this.y.h()) {
            if (this.m.m.J.a($$0, $$1)) {
               this.a(this.y, this.y.e, 0, cnq.d);
            } else if (this.m.m.G.a($$0, $$1)) {
               this.a(this.y, this.y.e, r() ? 1 : 0, cnq.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.w.g().d() && this.y != null) {
         if (this.m.m.F.a($$0, $$1)) {
            this.a(this.y, this.y.e, 40, cnq.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.m.m.U[$$2].a($$0, $$1)) {
               this.a(this.y, this.y.e, $$2, cnq.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void j() {
      if (this.m.s != null) {
         this.w.b(this.m.s);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.m.s.bB() && !this.m.s.dI()) {
         this.C();
      } else {
         this.m.s.r();
      }
   }

   protected void C() {
   }

   @Override
   public T D() {
      return this.w;
   }

   @Override
   public void d() {
      this.m.s.r();
      super.d();
   }
}
