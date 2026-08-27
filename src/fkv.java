import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fkv<T extends cmw> extends fjx implements fma<T> {
   public static final ajv a = new ajv("textures/gui/container/inventory.png");
   private static final float A = 100.0F;
   private static final int B = 500;
   public static final int b = 100;
   private static final int C = 200;
   protected int c = 176;
   protected int d = 166;
   protected int o;
   protected int p;
   protected int q;
   protected int r;
   protected final T s;
   protected final wi u;
   @Nullable
   protected cos v;
   @Nullable
   private cos D;
   @Nullable
   private cos E;
   @Nullable
   private cos F;
   @Nullable
   private cos G;
   protected int w;
   protected int x;
   private boolean H;
   private crs I = crs.i;
   private int J;
   private int K;
   private long L;
   private crs M = crs.i;
   private long N;
   protected final Set<cos> y = Sets.newHashSet();
   protected boolean z;
   private int O;
   private int P;
   private boolean Q;
   private int R;
   private long S;
   private int T;
   private boolean U;
   private crs V = crs.i;

   public fkv(T $$0, cjz $$1, wi $$2) {
      super($$2);
      this.s = $$0;
      this.u = $$1.O_();
      this.Q = true;
      this.o = 8;
      this.p = 6;
      this.q = 8;
      this.r = this.d - 94;
   }

   @Override
   protected void aM_() {
      this.w = (this.k - this.c) / 2;
      this.x = (this.l - this.d) / 2;
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.w;
      int $$5 = this.x;
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.disableDepthTest();
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.v = null;

      for (int $$6 = 0; $$6 < this.s.i.size(); $$6++) {
         cos $$7 = this.s.i.get($$6);
         if ($$7.d()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.d()) {
            this.v = $$7;
            int $$8 = $$7.f;
            int $$9 = $$7.g;
            if (this.v.e()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      crs $$10 = this.I.d() ? this.s.g() : this.I;
      if (!$$10.d()) {
         int $$11 = 8;
         int $$12 = this.I.d() ? 8 : 16;
         String $$13 = null;
         if (!this.I.d() && this.H) {
            $$10 = $$10.c(axm.f((float)$$10.G() / 2.0F));
         } else if (this.z && this.y.size() > 1) {
            $$10 = $$10.c(this.R);
            if ($$10.d()) {
               $$13 = n.o + "0";
            }
         }

         this.a($$0, $$10, $$1 - $$4 - 8, $$2 - $$5 - $$12, $$13);
      }

      if (!this.M.d()) {
         float $$14 = (float)(ac.b() - this.L) / 100.0F;
         if ($$14 >= 1.0F) {
            $$14 = 1.0F;
            this.M = crs.i;
         }

         int $$15 = this.E.f - this.J;
         int $$16 = this.E.g - this.K;
         int $$17 = this.J + (int)((float)$$15 * $$14);
         int $$18 = this.K + (int)((float)$$16 * $$14);
         this.a($$0, this.M, $$17, $$18, null);
      }

      $$0.c().b();
      RenderSystem.enableDepthTest();
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   public static void a(fdl $$0, int $$1, int $$2, int $$3) {
      $$0.a(gaq.E(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(fdl $$0, int $$1, int $$2) {
      if (this.s.g().d() && this.v != null && this.v.h()) {
         crs $$3 = this.v.g();
         $$0.a(this.m, this.a($$3), $$3.b(), $$1, $$2);
      }
   }

   protected List<wi> a(crs $$0) {
      return a(this.j, $$0);
   }

   private void a(fdl $$0, crs $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.m, $$1, $$2, $$3 - (this.I.d() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(fdl $$0, int $$1, int $$2) {
      $$0.a(this.m, this.i, this.o, this.p, 4210752, false);
      $$0.a(this.m, this.u, this.q, this.r, 4210752, false);
   }

   protected abstract void a(fdl var1, float var2, int var3, int var4);

   protected void a(fdl $$0, cos $$1) {
      int $$2 = $$1.f;
      int $$3 = $$1.g;
      crs $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.D && !this.I.d() && !this.H;
      crs $$7 = this.s.g();
      String $$8 = null;
      if ($$1 == this.D && !this.I.d() && this.H && !$$4.d()) {
         $$4 = $$4.c($$4.G() / 2);
      } else if (this.z && this.y.contains($$1) && !$$7.d()) {
         if (this.y.size() == 1) {
            return;
         }

         if (cmw.a($$1, $$7, true) && this.s.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.i(), $$1.a_($$7));
            int $$10 = $$1.g().d() ? 0 : $$1.g().G();
            int $$11 = cmw.a(this.y, this.O, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.y.remove($$1);
            this.I();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.d() && $$1.d()) {
         Pair<ajv, ajv> $$12 = $$1.c();
         if ($$12 != null) {
            gls $$13 = this.j.a((ajv)$$12.getFirst()).apply((ajv)$$12.getSecond());
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

         $$0.a(this.m, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void I() {
      crs $$0 = this.s.g();
      if (!$$0.d() && this.z) {
         if (this.O == 2) {
            this.R = $$0.i();
         } else {
            this.R = $$0.G();

            for (cos $$1 : this.y) {
               crs $$2 = $$1.g();
               int $$3 = $$2.d() ? 0 : $$2.G();
               int $$4 = Math.min($$0.i(), $$1.a_($$0));
               int $$5 = Math.min(cmw.a(this.y, this.O, $$0) + $$3, $$4);
               this.R -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private cos b(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.s.i.size(); $$2++) {
         cos $$3 = this.s.i.get($$2);
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
         boolean $$3 = this.j.m.J.a($$2) && this.j.q.f();
         cos $$4 = this.b($$0, $$1);
         long $$5 = ac.b();
         this.U = this.G == $$4 && $$5 - this.S < 250L && this.T == $$2;
         this.Q = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.w;
            int $$7 = this.x;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.e;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.j.m.Z().c() && $$8 && this.s.g().d()) {
               this.d();
               return true;
            }

            if ($$9 != -1) {
               if (this.j.m.Z().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.D = $$4;
                     this.I = crs.i;
                     this.H = $$2 == 1;
                  } else {
                     this.D = null;
                  }
               } else if (!this.z) {
                  if (this.s.g().d()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cnf.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (evm.a(fby.Q().aO().i(), 340) || evm.a(fby.Q().aO().i(), 344));
                        cnf $$11 = cnf.a;
                        if ($$10) {
                           this.V = $$4 != null && $$4.h() ? $$4.g().r() : crs.i;
                           $$11 = cnf.b;
                        } else if ($$9 == -999) {
                           $$11 = cnf.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.Q = true;
                  } else {
                     this.z = true;
                     this.P = $$2;
                     this.y.clear();
                     if ($$2 == 0) {
                        this.O = 0;
                     } else if ($$2 == 1) {
                        this.O = 1;
                     } else if ($$3) {
                        this.O = 2;
                     }
                  }
               }
            }
         }

         this.G = $$4;
         this.S = $$5;
         this.T = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.v != null && this.s.g().d()) {
         if (this.j.m.F.a($$0)) {
            this.a(this.v, this.v.e, 40, cnf.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.j.m.U[$$1].a($$0)) {
               this.a(this.v, this.v.e, $$1, cnf.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      cos $$5 = this.b($$0, $$1);
      crs $$6 = this.s.g();
      if (this.D != null && this.j.m.Z().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.I.d()) {
               if ($$5 != this.D && !this.D.g().d()) {
                  this.I = this.D.g().r();
               }
            } else if (this.I.G() > 1 && $$5 != null && cmw.a($$5, this.I, false)) {
               long $$7 = ac.b();
               if (this.F == $$5) {
                  if ($$7 - this.N > 500L) {
                     this.a(this.D, this.D.e, 0, cnf.a);
                     this.a($$5, $$5.e, 1, cnf.a);
                     this.a(this.D, this.D.e, 0, cnf.a);
                     this.N = $$7 + 750L;
                     this.I.g(1);
                  }
               } else {
                  this.F = $$5;
                  this.N = $$7;
               }
            }
         }
      } else if (this.z && $$5 != null && !$$6.d() && ($$6.G() > this.y.size() || this.O == 2) && cmw.a($$5, $$6, true) && $$5.a($$6) && this.s.b($$5)) {
         this.y.add($$5);
         this.I();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      cos $$3 = this.b($$0, $$1);
      int $$4 = this.w;
      int $$5 = this.x;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.e;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.U && $$3 != null && $$2 == 0 && this.s.a(crs.i, $$3)) {
         if (s()) {
            if (!this.V.d()) {
               for (cos $$8 : this.s.i) {
                  if ($$8 != null && $$8.a(this.j.s) && $$8.h() && $$8.d == $$3.d && cmw.a($$8, this.V, true)) {
                     this.a($$8, $$8.e, $$2, cnf.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cnf.g);
         }

         this.U = false;
         this.S = 0L;
      } else {
         if (this.z && this.P != $$2) {
            this.z = false;
            this.y.clear();
            this.Q = true;
            return true;
         }

         if (this.Q) {
            this.Q = false;
            return true;
         }

         if (this.D != null && this.j.m.Z().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.I.d() && $$3 != this.D) {
                  this.I = this.D.g();
               }

               boolean $$9 = cmw.a($$3, this.I, false);
               if ($$7 != -1 && !this.I.d() && $$9) {
                  this.a(this.D, this.D.e, $$2, cnf.a);
                  this.a($$3, $$7, 0, cnf.a);
                  if (this.s.g().d()) {
                     this.M = crs.i;
                  } else {
                     this.a(this.D, this.D.e, $$2, cnf.a);
                     this.J = axm.a($$0 - (double)$$4);
                     this.K = axm.a($$1 - (double)$$5);
                     this.E = this.D;
                     this.M = this.I;
                     this.L = ac.b();
                  }
               } else if (!this.I.d()) {
                  this.J = axm.a($$0 - (double)$$4);
                  this.K = axm.a($$1 - (double)$$5);
                  this.E = this.D;
                  this.M = this.I;
                  this.L = ac.b();
               }

               this.m();
            }
         } else if (this.z && !this.y.isEmpty()) {
            this.a(null, -999, cmw.b(0, this.O), cnf.f);

            for (cos $$10 : this.y) {
               this.a($$10, $$10.e, cmw.b(1, this.O), cnf.f);
            }

            this.a(null, -999, cmw.b(2, this.O), cnf.f);
         } else if (!this.s.g().d()) {
            if (this.j.m.J.a($$2)) {
               this.a($$3, $$7, $$2, cnf.d);
            } else {
               boolean $$11 = $$7 != -999 && (evm.a(fby.Q().aO().i(), 340) || evm.a(fby.Q().aO().i(), 344));
               if ($$11) {
                  this.V = $$3 != null && $$3.h() ? $$3.g().r() : crs.i;
               }

               this.a($$3, $$7, $$2, $$11 ? cnf.b : cnf.a);
            }
         }
      }

      if (this.s.g().d()) {
         this.S = 0L;
      }

      this.z = false;
      return true;
   }

   public void m() {
      this.I = crs.i;
      this.D = null;
   }

   private boolean a(cos $$0, double $$1, double $$2) {
      return this.a($$0.f, $$0.g, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.w;
      int $$7 = this.x;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(cos $$0, int $$1, int $$2, cnf $$3) {
      if ($$0 != null) {
         $$1 = $$0.e;
      }

      this.j.q.a(this.s.j, $$1, $$2, $$3, this.j.s);
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.j.q.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.j.m.E.a($$0, $$1)) {
         this.d();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.v != null && this.v.h()) {
            if (this.j.m.J.a($$0, $$1)) {
               this.a(this.v, this.v.e, 0, cnf.d);
            } else if (this.j.m.G.a($$0, $$1)) {
               this.a(this.v, this.v.e, r() ? 1 : 0, cnf.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.s.g().d() && this.v != null) {
         if (this.j.m.F.a($$0, $$1)) {
            this.a(this.v, this.v.e, 40, cnf.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.j.m.U[$$2].a($$0, $$1)) {
               this.a(this.v, this.v.e, $$2, cnf.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void j() {
      if (this.j.s != null) {
         this.s.b(this.j.s);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.j.s.bA() && !this.j.s.dH()) {
         this.C();
      } else {
         this.j.s.r();
      }
   }

   protected void C() {
   }

   @Override
   public T D() {
      return this.s;
   }

   @Override
   public void d() {
      this.j.s.r();
      super.d();
   }
}
