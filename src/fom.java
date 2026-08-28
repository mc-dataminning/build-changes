import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fom<T extends cps> extends fnx implements fps<T> {
   public static final akq a = akq.b("textures/gui/container/inventory.png");
   private static final float D = 100.0F;
   private static final int E = 500;
   public static final int b = 100;
   private static final int F = 200;
   protected int c = 176;
   protected int q = 166;
   protected int r;
   protected int s;
   protected int u;
   protected int v;
   protected final T w;
   protected final wy x;
   @Nullable
   protected cro y;
   @Nullable
   private cro G;
   @Nullable
   private cro H;
   @Nullable
   private cro I;
   @Nullable
   private cro J;
   protected int z;
   protected int A;
   private boolean K;
   private cuo L = cuo.l;
   private int M;
   private int N;
   private long O;
   private cuo P = cuo.l;
   private long Q;
   protected final Set<cro> B = Sets.newHashSet();
   protected boolean C;
   private int R;
   private int S;
   private boolean T;
   private int U;
   private long V;
   private int W;
   private boolean X;
   private cuo Y = cuo.l;

   public fom(T $$0, cmu $$1, wy $$2) {
      super($$2);
      this.w = $$0;
      this.x = $$1.O_();
      this.T = true;
      this.r = 8;
      this.s = 6;
      this.u = 8;
      this.v = this.q - 94;
   }

   @Override
   protected void aP_() {
      this.z = (this.m - this.c) / 2;
      this.A = (this.n - this.q) / 2;
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.disableDepthTest();
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.y = null;

      for (int $$6 = 0; $$6 < this.w.i.size(); $$6++) {
         cro $$7 = this.w.i.get($$6);
         if ($$7.d()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.d()) {
            this.y = $$7;
            int $$8 = $$7.e;
            int $$9 = $$7.f;
            if (this.y.e()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      cuo $$10 = this.L.e() ? this.w.g() : this.L;
      if (!$$10.e()) {
         int $$11 = 8;
         int $$12 = this.L.e() ? 8 : 16;
         String $$13 = null;
         if (!this.L.e() && this.K) {
            $$10 = $$10.c(ayn.f((float)$$10.H() / 2.0F));
         } else if (this.C && this.B.size() > 1) {
            $$10 = $$10.c(this.U);
            if ($$10.e()) {
               $$13 = n.o + "0";
            }
         }

         this.a($$0, $$10, $$1 - $$4 - 8, $$2 - $$5 - $$12, $$13);
      }

      if (!this.P.e()) {
         float $$14 = (float)(ad.c() - this.O) / 100.0F;
         if ($$14 >= 1.0F) {
            $$14 = 1.0F;
            this.P = cuo.l;
         }

         int $$15 = this.H.e - this.M;
         int $$16 = this.H.f - this.N;
         int $$17 = this.M + (int)((float)$$15 * $$14);
         int $$18 = this.N + (int)((float)$$16 * $$14);
         this.a($$0, this.P, $$17, $$18, null);
      }

      $$0.c().b();
      RenderSystem.enableDepthTest();
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   public static void a(fht $$0, int $$1, int $$2, int $$3) {
      $$0.a(gfb.C(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(fht $$0, int $$1, int $$2) {
      if (this.w.g().e() && this.y != null && this.y.h()) {
         cuo $$3 = this.y.g();
         $$0.a(this.o, this.a($$3), $$3.b(), $$1, $$2);
      }
   }

   protected List<wy> a(cuo $$0) {
      return a(this.l, $$0);
   }

   private void a(fht $$0, cuo $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.o, $$1, $$2, $$3 - (this.L.e() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(fht $$0, int $$1, int $$2) {
      $$0.a(this.o, this.k, this.r, this.s, 4210752, false);
      $$0.a(this.o, this.x, this.u, this.v, 4210752, false);
   }

   protected abstract void a(fht var1, float var2, int var3, int var4);

   protected void a(fht $$0, cro $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      cuo $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.G && !this.L.e() && !this.K;
      cuo $$7 = this.w.g();
      String $$8 = null;
      if ($$1 == this.G && !this.L.e() && this.K && !$$4.e()) {
         $$4 = $$4.c($$4.H() / 2);
      } else if (this.C && this.B.contains($$1) && !$$7.e()) {
         if (this.B.size() == 1) {
            return;
         }

         if (cps.a($$1, $$7, true) && this.w.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.j(), $$1.a_($$7));
            int $$10 = $$1.g().e() ? 0 : $$1.g().H();
            int $$11 = cps.a(this.B, this.R, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.B.remove($$1);
            this.J();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.e() && $$1.d()) {
         Pair<akq, akq> $$12 = $$1.b();
         if ($$12 != null) {
            gqf $$13 = this.l.a((akq)$$12.getFirst()).apply((akq)$$12.getSecond());
            $$0.a($$2, $$3, 0, 16, 16, $$13);
            $$6 = true;
         }
      }

      if (!$$6) {
         if ($$5) {
            $$0.a($$2, $$3, $$2 + 16, $$3 + 16, -2130706433);
         }

         int $$14 = $$1.e + $$1.f * this.c;
         if ($$1.f()) {
            $$0.b($$4, $$2, $$3, $$14);
         } else {
            $$0.a($$4, $$2, $$3, $$14);
         }

         $$0.a(this.o, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void J() {
      cuo $$0 = this.w.g();
      if (!$$0.e() && this.C) {
         if (this.R == 2) {
            this.U = $$0.j();
         } else {
            this.U = $$0.H();

            for (cro $$1 : this.B) {
               cuo $$2 = $$1.g();
               int $$3 = $$2.e() ? 0 : $$2.H();
               int $$4 = Math.min($$0.j(), $$1.a_($$0));
               int $$5 = Math.min(cps.a(this.B, this.R, $$0) + $$3, $$4);
               this.U -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private cro b(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.w.i.size(); $$2++) {
         cro $$3 = this.w.i.get($$2);
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
         boolean $$3 = this.l.m.I.a($$2) && this.l.q.f();
         cro $$4 = this.b($$0, $$1);
         long $$5 = ad.c();
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
               $$9 = $$4.d;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.l.m.Z().c() && $$8 && this.w.g().e()) {
               this.d();
               return true;
            }

            if ($$9 != -1) {
               if (this.l.m.Z().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.G = $$4;
                     this.L = cuo.l;
                     this.K = $$2 == 1;
                  } else {
                     this.G = null;
                  }
               } else if (!this.C) {
                  if (this.w.g().e()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cqc.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (ezy.a(fgi.Q().aM().j(), 340) || ezy.a(fgi.Q().aM().j(), 344));
                        cqc $$11 = cqc.a;
                        if ($$10) {
                           this.Y = $$4 != null && $$4.h() ? $$4.g().s() : cuo.l;
                           $$11 = cqc.b;
                        } else if ($$9 == -999) {
                           $$11 = cqc.e;
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
      if (this.y != null && this.w.g().e()) {
         if (this.l.m.E.a($$0)) {
            this.a(this.y, this.y.d, 40, cqc.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.l.m.T[$$1].a($$0)) {
               this.a(this.y, this.y.d, $$1, cqc.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.q);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      cro $$5 = this.b($$0, $$1);
      cuo $$6 = this.w.g();
      if (this.G != null && this.l.m.Z().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.L.e()) {
               if ($$5 != this.G && !this.G.g().e()) {
                  this.L = this.G.g().s();
               }
            } else if (this.L.H() > 1 && $$5 != null && cps.a($$5, this.L, false)) {
               long $$7 = ad.c();
               if (this.I == $$5) {
                  if ($$7 - this.Q > 500L) {
                     this.a(this.G, this.G.d, 0, cqc.a);
                     this.a($$5, $$5.d, 1, cqc.a);
                     this.a(this.G, this.G.d, 0, cqc.a);
                     this.Q = $$7 + 750L;
                     this.L.h(1);
                  }
               } else {
                  this.I = $$5;
                  this.Q = $$7;
               }
            }
         }
      } else if (this.C && $$5 != null && !$$6.e() && ($$6.H() > this.B.size() || this.R == 2) && cps.a($$5, $$6, true) && $$5.a($$6) && this.w.b($$5)) {
         this.B.add($$5);
         this.J();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      cro $$3 = this.b($$0, $$1);
      int $$4 = this.z;
      int $$5 = this.A;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.d;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.X && $$3 != null && $$2 == 0 && this.w.a(cuo.l, $$3)) {
         if (s()) {
            if (!this.Y.e()) {
               for (cro $$8 : this.w.i) {
                  if ($$8 != null && $$8.a(this.l.s) && $$8.h() && $$8.c == $$3.c && cps.a($$8, this.Y, true)) {
                     this.a($$8, $$8.d, $$2, cqc.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cqc.g);
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

         if (this.G != null && this.l.m.Z().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.L.e() && $$3 != this.G) {
                  this.L = this.G.g();
               }

               boolean $$9 = cps.a($$3, this.L, false);
               if ($$7 != -1 && !this.L.e() && $$9) {
                  this.a(this.G, this.G.d, $$2, cqc.a);
                  this.a($$3, $$7, 0, cqc.a);
                  if (this.w.g().e()) {
                     this.P = cuo.l;
                  } else {
                     this.a(this.G, this.G.d, $$2, cqc.a);
                     this.M = ayn.a($$0 - (double)$$4);
                     this.N = ayn.a($$1 - (double)$$5);
                     this.H = this.G;
                     this.P = this.L;
                     this.O = ad.c();
                  }
               } else if (!this.L.e()) {
                  this.M = ayn.a($$0 - (double)$$4);
                  this.N = ayn.a($$1 - (double)$$5);
                  this.H = this.G;
                  this.P = this.L;
                  this.O = ad.c();
               }

               this.m();
            }
         } else if (this.C && !this.B.isEmpty()) {
            this.a(null, -999, cps.b(0, this.R), cqc.f);

            for (cro $$10 : this.B) {
               this.a($$10, $$10.d, cps.b(1, this.R), cqc.f);
            }

            this.a(null, -999, cps.b(2, this.R), cqc.f);
         } else if (!this.w.g().e()) {
            if (this.l.m.I.a($$2)) {
               this.a($$3, $$7, $$2, cqc.d);
            } else {
               boolean $$11 = $$7 != -999 && (ezy.a(fgi.Q().aM().j(), 340) || ezy.a(fgi.Q().aM().j(), 344));
               if ($$11) {
                  this.Y = $$3 != null && $$3.h() ? $$3.g().s() : cuo.l;
               }

               this.a($$3, $$7, $$2, $$11 ? cqc.b : cqc.a);
            }
         }
      }

      if (this.w.g().e()) {
         this.V = 0L;
      }

      this.C = false;
      return true;
   }

   public void m() {
      this.L = cuo.l;
      this.G = null;
   }

   private boolean a(cro $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.z;
      int $$7 = this.A;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(cro $$0, int $$1, int $$2, cqc $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.l.q.a(this.w.j, $$1, $$2, $$3, this.l.s);
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.l.q.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.l.m.D.a($$0, $$1)) {
         this.d();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.y != null && this.y.h()) {
            if (this.l.m.I.a($$0, $$1)) {
               this.a(this.y, this.y.d, 0, cqc.d);
            } else if (this.l.m.F.a($$0, $$1)) {
               this.a(this.y, this.y.d, r() ? 1 : 0, cqc.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.w.g().e() && this.y != null) {
         if (this.l.m.E.a($$0, $$1)) {
            this.a(this.y, this.y.d, 40, cqc.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.l.m.T[$$2].a($$0, $$1)) {
               this.a(this.y, this.y.d, $$2, cqc.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void j() {
      if (this.l.s != null) {
         this.w.a(this.l.s);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.l.s.bE() && !this.l.s.dL()) {
         this.D();
      } else {
         this.l.s.s();
      }
   }

   protected void D() {
   }

   @Override
   public T E() {
      return this.w;
   }

   @Override
   public void d() {
      this.l.s.s();
      super.d();
   }
}
