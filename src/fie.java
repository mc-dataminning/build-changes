import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fie<T extends clo> extends fhf implements fjj<T> {
   public static final ajh a = new ajh("textures/gui/container/inventory.png");
   private static final float x = 100.0F;
   private static final int y = 500;
   public static final int b = 100;
   private static final int z = 200;
   protected int c = 176;
   protected int k = 166;
   protected int l;
   protected int m;
   protected int n;
   protected int o;
   protected final T p;
   protected final vu q;
   @Nullable
   protected cnj r;
   @Nullable
   private cnj A;
   @Nullable
   private cnj B;
   @Nullable
   private cnj C;
   @Nullable
   private cnj D;
   protected int t;
   protected int u;
   private boolean E;
   private cqk F = cqk.h;
   private int G;
   private int H;
   private long I;
   private cqk J = cqk.h;
   private long K;
   protected final Set<cnj> v = Sets.newHashSet();
   protected boolean w;
   private int L;
   private int M;
   private boolean N;
   private int O;
   private long P;
   private int Q;
   private boolean R;
   private cqk S = cqk.h;

   public fie(T $$0, cir $$1, vu $$2) {
      super($$2);
      this.p = $$0;
      this.q = $$1.O_();
      this.N = true;
      this.l = 8;
      this.m = 6;
      this.n = 8;
      this.o = this.k - 94;
   }

   @Override
   protected void aO_() {
      this.t = (this.g - this.c) / 2;
      this.u = (this.h - this.k) / 2;
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.disableDepthTest();
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.r = null;

      for (int $$6 = 0; $$6 < this.p.i.size(); $$6++) {
         cnj $$7 = this.p.i.get($$6);
         if ($$7.d()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.d()) {
            this.r = $$7;
            int $$8 = $$7.f;
            int $$9 = $$7.g;
            if (this.r.e()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      cqk $$10 = this.F.b() ? this.p.g() : this.F;
      if (!$$10.b()) {
         int $$11 = 8;
         int $$12 = this.F.b() ? 8 : 16;
         String $$13 = null;
         if (!this.F.b() && this.E) {
            $$10 = $$10.c(aww.f((float)$$10.M() / 2.0F));
         } else if (this.w && this.v.size() > 1) {
            $$10 = $$10.c(this.O);
            if ($$10.b()) {
               $$13 = n.o + "0";
            }
         }

         this.a($$0, $$10, $$1 - $$4 - 8, $$2 - $$5 - $$12, $$13);
      }

      if (!this.J.b()) {
         float $$14 = (float)(ac.b() - this.I) / 100.0F;
         if ($$14 >= 1.0F) {
            $$14 = 1.0F;
            this.J = cqk.h;
         }

         int $$15 = this.B.f - this.G;
         int $$16 = this.B.g - this.H;
         int $$17 = this.G + (int)((float)$$15 * $$14);
         int $$18 = this.H + (int)((float)$$16 * $$14);
         this.a($$0, this.J, $$17, $$18, null);
      }

      $$0.c().b();
      RenderSystem.enableDepthTest();
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      this.a($$0, $$3, $$1, $$2);
   }

   public static void a(fat $$0, int $$1, int $$2, int $$3) {
      $$0.a(fxy.E(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(fat $$0, int $$1, int $$2) {
      if (this.p.g().b() && this.r != null && this.r.h()) {
         cqk $$3 = this.r.g();
         $$0.a(this.i, this.a($$3), $$3.a(), $$1, $$2);
      }
   }

   protected List<vu> a(cqk $$0) {
      return a(this.f, $$0);
   }

   private void a(fat $$0, cqk $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.i, $$1, $$2, $$3 - (this.F.b() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(fat $$0, int $$1, int $$2) {
      $$0.a(this.i, this.e, this.l, this.m, 4210752, false);
      $$0.a(this.i, this.q, this.n, this.o, 4210752, false);
   }

   protected abstract void a(fat var1, float var2, int var3, int var4);

   protected void a(fat $$0, cnj $$1) {
      int $$2 = $$1.f;
      int $$3 = $$1.g;
      cqk $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.A && !this.F.b() && !this.E;
      cqk $$7 = this.p.g();
      String $$8 = null;
      if ($$1 == this.A && !this.F.b() && this.E && !$$4.b()) {
         $$4 = $$4.c($$4.M() / 2);
      } else if (this.w && this.v.contains($$1) && !$$7.b()) {
         if (this.v.size() == 1) {
            return;
         }

         if (clo.a($$1, $$7, true) && this.p.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.g(), $$1.a_($$7));
            int $$10 = $$1.g().b() ? 0 : $$1.g().M();
            int $$11 = clo.a(this.v, this.L, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.v.remove($$1);
            this.K();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.b() && $$1.d()) {
         Pair<ajh, ajh> $$12 = $$1.c();
         if ($$12 != null) {
            giz $$13 = this.f.a((ajh)$$12.getFirst()).apply((ajh)$$12.getSecond());
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

         $$0.a(this.i, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void K() {
      cqk $$0 = this.p.g();
      if (!$$0.b() && this.w) {
         if (this.L == 2) {
            this.O = $$0.g();
         } else {
            this.O = $$0.M();

            for (cnj $$1 : this.v) {
               cqk $$2 = $$1.g();
               int $$3 = $$2.b() ? 0 : $$2.M();
               int $$4 = Math.min($$0.g(), $$1.a_($$0));
               int $$5 = Math.min(clo.a(this.v, this.L, $$0) + $$3, $$4);
               this.O -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private cnj b(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.p.i.size(); $$2++) {
         cnj $$3 = this.p.i.get($$2);
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
         boolean $$3 = this.f.m.J.a($$2) && this.f.q.f();
         cnj $$4 = this.b($$0, $$1);
         long $$5 = ac.b();
         this.R = this.D == $$4 && $$5 - this.P < 250L && this.Q == $$2;
         this.N = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.t;
            int $$7 = this.u;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.e;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.f.m.X().c() && $$8 && this.p.g().b()) {
               this.d();
               return true;
            }

            if ($$9 != -1) {
               if (this.f.m.X().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.A = $$4;
                     this.F = cqk.h;
                     this.E = $$2 == 1;
                  } else {
                     this.A = null;
                  }
               } else if (!this.w) {
                  if (this.p.g().b()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, clx.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (esu.a(ezg.Q().aO().i(), 340) || esu.a(ezg.Q().aO().i(), 344));
                        clx $$11 = clx.a;
                        if ($$10) {
                           this.S = $$4 != null && $$4.h() ? $$4.g().q() : cqk.h;
                           $$11 = clx.b;
                        } else if ($$9 == -999) {
                           $$11 = clx.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.N = true;
                  } else {
                     this.w = true;
                     this.M = $$2;
                     this.v.clear();
                     if ($$2 == 0) {
                        this.L = 0;
                     } else if ($$2 == 1) {
                        this.L = 1;
                     } else if ($$3) {
                        this.L = 2;
                     }
                  }
               }
            }
         }

         this.D = $$4;
         this.P = $$5;
         this.Q = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.r != null && this.p.g().b()) {
         if (this.f.m.F.a($$0)) {
            this.a(this.r, this.r.e, 40, clx.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.f.m.U[$$1].a($$0)) {
               this.a(this.r, this.r.e, $$1, clx.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      cnj $$5 = this.b($$0, $$1);
      cqk $$6 = this.p.g();
      if (this.A != null && this.f.m.X().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.F.b()) {
               if ($$5 != this.A && !this.A.g().b()) {
                  this.F = this.A.g().q();
               }
            } else if (this.F.M() > 1 && $$5 != null && clo.a($$5, this.F, false)) {
               long $$7 = ac.b();
               if (this.C == $$5) {
                  if ($$7 - this.K > 500L) {
                     this.a(this.A, this.A.e, 0, clx.a);
                     this.a($$5, $$5.e, 1, clx.a);
                     this.a(this.A, this.A.e, 0, clx.a);
                     this.K = $$7 + 750L;
                     this.F.h(1);
                  }
               } else {
                  this.C = $$5;
                  this.K = $$7;
               }
            }
         }
      } else if (this.w && $$5 != null && !$$6.b() && ($$6.M() > this.v.size() || this.L == 2) && clo.a($$5, $$6, true) && $$5.a($$6) && this.p.b($$5)) {
         this.v.add($$5);
         this.K();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      cnj $$3 = this.b($$0, $$1);
      int $$4 = this.t;
      int $$5 = this.u;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.e;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.R && $$3 != null && $$2 == 0 && this.p.a(cqk.h, $$3)) {
         if (v()) {
            if (!this.S.b()) {
               for (cnj $$8 : this.p.i) {
                  if ($$8 != null && $$8.a(this.f.s) && $$8.h() && $$8.d == $$3.d && clo.a($$8, this.S, true)) {
                     this.a($$8, $$8.e, $$2, clx.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, clx.g);
         }

         this.R = false;
         this.P = 0L;
      } else {
         if (this.w && this.M != $$2) {
            this.w = false;
            this.v.clear();
            this.N = true;
            return true;
         }

         if (this.N) {
            this.N = false;
            return true;
         }

         if (this.A != null && this.f.m.X().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.F.b() && $$3 != this.A) {
                  this.F = this.A.g();
               }

               boolean $$9 = clo.a($$3, this.F, false);
               if ($$7 != -1 && !this.F.b() && $$9) {
                  this.a(this.A, this.A.e, $$2, clx.a);
                  this.a($$3, $$7, 0, clx.a);
                  if (this.p.g().b()) {
                     this.J = cqk.h;
                  } else {
                     this.a(this.A, this.A.e, $$2, clx.a);
                     this.G = aww.a($$0 - (double)$$4);
                     this.H = aww.a($$1 - (double)$$5);
                     this.B = this.A;
                     this.J = this.F;
                     this.I = ac.b();
                  }
               } else if (!this.F.b()) {
                  this.G = aww.a($$0 - (double)$$4);
                  this.H = aww.a($$1 - (double)$$5);
                  this.B = this.A;
                  this.J = this.F;
                  this.I = ac.b();
               }

               this.o();
            }
         } else if (this.w && !this.v.isEmpty()) {
            this.a(null, -999, clo.b(0, this.L), clx.f);

            for (cnj $$10 : this.v) {
               this.a($$10, $$10.e, clo.b(1, this.L), clx.f);
            }

            this.a(null, -999, clo.b(2, this.L), clx.f);
         } else if (!this.p.g().b()) {
            if (this.f.m.J.a($$2)) {
               this.a($$3, $$7, $$2, clx.d);
            } else {
               boolean $$11 = $$7 != -999 && (esu.a(ezg.Q().aO().i(), 340) || esu.a(ezg.Q().aO().i(), 344));
               if ($$11) {
                  this.S = $$3 != null && $$3.h() ? $$3.g().q() : cqk.h;
               }

               this.a($$3, $$7, $$2, $$11 ? clx.b : clx.a);
            }
         }
      }

      if (this.p.g().b()) {
         this.P = 0L;
      }

      this.w = false;
      return true;
   }

   public void o() {
      this.F = cqk.h;
      this.A = null;
   }

   private boolean a(cnj $$0, double $$1, double $$2) {
      return this.a($$0.f, $$0.g, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.t;
      int $$7 = this.u;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(cnj $$0, int $$1, int $$2, clx $$3) {
      if ($$0 != null) {
         $$1 = $$0.e;
      }

      this.f.q.a(this.p.j, $$1, $$2, $$3, this.f.s);
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.f.q.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.f.m.E.a($$0, $$1)) {
         this.d();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.r != null && this.r.h()) {
            if (this.f.m.J.a($$0, $$1)) {
               this.a(this.r, this.r.e, 0, clx.d);
            } else if (this.f.m.G.a($$0, $$1)) {
               this.a(this.r, this.r.e, t() ? 1 : 0, clx.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.p.g().b() && this.r != null) {
         if (this.f.m.F.a($$0, $$1)) {
            this.a(this.r, this.r.e, 40, clx.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.f.m.U[$$2].a($$0, $$1)) {
               this.a(this.r, this.r.e, $$2, clx.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void k() {
      if (this.f.s != null) {
         this.p.b(this.f.s);
      }
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.f.s.bA() && !this.f.s.dH()) {
         this.E();
      } else {
         this.f.s.r();
      }
   }

   protected void E() {
   }

   @Override
   public T H() {
      return this.p;
   }

   @Override
   public void d() {
      this.f.s.r();
      super.d();
   }
}
