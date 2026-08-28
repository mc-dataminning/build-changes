import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fqw<T extends cqz> extends fqh implements fsb<T> {
   public static final ale a = ale.b("textures/gui/container/inventory.png");
   protected static final int b = 256;
   protected static final int c = 256;
   private static final float G = 100.0F;
   private static final int H = 500;
   public static final int d = 100;
   private static final int I = 200;
   protected int s = 176;
   protected int u = 166;
   protected int v;
   protected int w;
   protected int x;
   protected int y;
   private final List<fkd> J;
   protected final T z;
   protected final xe A;
   @Nullable
   protected csw B;
   @Nullable
   private csw K;
   @Nullable
   private csw L;
   @Nullable
   private csw M;
   @Nullable
   private csw N;
   protected int C;
   protected int D;
   private boolean O;
   private cvs P = cvs.k;
   private int Q;
   private int R;
   private long S;
   private cvs T = cvs.k;
   private long U;
   protected final Set<csw> E = Sets.newHashSet();
   protected boolean F;
   private int V;
   private int W;
   private boolean X;
   private int Y;
   private long Z;
   private int aa;
   private boolean ab;
   private cvs ac = cvs.k;

   public fqw(T $$0, cnw $$1, xe $$2) {
      super($$2);
      this.z = $$0;
      this.A = $$1.R_();
      this.X = true;
      this.v = 8;
      this.w = 6;
      this.x = 8;
      this.y = this.u - 94;
      this.J = new ArrayList<>();
   }

   @Override
   protected void aS_() {
      this.C = (this.n - this.s) / 2;
      this.D = (this.o - this.u) / 2;
      this.J.clear();
      this.a(new fjx(this.m));
   }

   protected void a(fkd $$0) {
      this.J.add($$0);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      csw $$6 = this.B;
      this.B = null;

      for (csw $$7 : this.z.k) {
         if ($$7.d()) {
            this.a($$0, $$7);
            if (this.a($$7, (double)$$1, (double)$$2)) {
               this.B = $$7;
               if (this.B.e()) {
                  a($$0, $$7.e, $$7.f, 0);
               }
            }
         }
      }

      if ($$6 != null && $$6 != this.B) {
         this.a($$6);
      }

      this.b($$0, $$1, $$2);
      cvs $$8 = this.P.f() ? this.z.g() : this.P;
      if (!$$8.f()) {
         int $$9 = 8;
         int $$10 = this.P.f() ? 8 : 16;
         String $$11 = null;
         if (!this.P.f() && this.O) {
            $$8 = $$8.c(azf.f((float)$$8.K() / 2.0F));
         } else if (this.F && this.E.size() > 1) {
            $$8 = $$8.c(this.Y);
            if ($$8.f()) {
               $$11 = n.o + "0";
            }
         }

         this.a($$0, $$8, $$1 - $$4 - 8, $$2 - $$5 - $$10, $$11);
      }

      if (!this.T.f()) {
         float $$12 = (float)(ad.c() - this.S) / 100.0F;
         if ($$12 >= 1.0F) {
            $$12 = 1.0F;
            this.T = cvs.k;
         }

         int $$13 = this.L.e - this.Q;
         int $$14 = this.L.f - this.R;
         int $$15 = this.Q + (int)((float)$$13 * $$12);
         int $$16 = this.R + (int)((float)$$14 * $$12);
         this.a($$0, this.T, $$15, $$16, null);
      }

      $$0.c().b();
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.B != null && this.B.h()) {
         for (fkd $$4 : this.J) {
            if ($$4.a(this.B) && $$4.a($$2, $$3, this.B.d, this.B.g())) {
               return true;
            }
         }
      }

      return false;
   }

   public static void a(fkb $$0, int $$1, int $$2, int $$3) {
      $$0.a(ghv.G(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(fkb $$0, int $$1, int $$2) {
      if (this.B != null && this.B.h()) {
         cvs $$3 = this.B.g();
         if (this.z.g().f() || this.b($$3)) {
            $$0.a(this.p, this.a($$3), $$3.b(), $$1, $$2);
         }
      }
   }

   private boolean b(cvs $$0) {
      return $$0.b().map(fsq::a).map(fsq::a).orElse(false);
   }

   protected List<xe> a(cvs $$0) {
      return a(this.m, $$0);
   }

   private void a(fkb $$0, cvs $$1, int $$2, int $$3, @Nullable String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.p, $$1, $$2, $$3 - (this.P.f() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(fkb $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
      $$0.a(this.p, this.A, this.x, this.y, 4210752, false);
   }

   protected abstract void a(fkb var1, float var2, int var3, int var4);

   protected void a(fkb $$0, csw $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      cvs $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.K && !this.P.f() && !this.O;
      cvs $$7 = this.z.g();
      String $$8 = null;
      if ($$1 == this.K && !this.P.f() && this.O && !$$4.f()) {
         $$4 = $$4.c($$4.K() / 2);
      } else if (this.F && this.E.contains($$1) && !$$7.f()) {
         if (this.E.size() == 1) {
            return;
         }

         if (cqz.a($$1, $$7, true) && this.z.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.k(), $$1.a_($$7));
            int $$10 = $$1.g().f() ? 0 : $$1.g().K();
            int $$11 = cqz.a(this.E, this.V, $$7) + $$10;
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
         Pair<ale, ale> $$12 = $$1.b();
         if ($$12 != null) {
            gxg $$13 = this.m.a((ale)$$12.getFirst()).apply((ale)$$12.getSecond());
            $$0.a(ghv::B, $$13, $$2, $$3, 16, 16);
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
      cvs $$0 = this.z.g();
      if (!$$0.f() && this.F) {
         if (this.V == 2) {
            this.Y = $$0.k();
         } else {
            this.Y = $$0.K();

            for (csw $$1 : this.E) {
               cvs $$2 = $$1.g();
               int $$3 = $$2.f() ? 0 : $$2.K();
               int $$4 = Math.min($$0.k(), $$1.a_($$0));
               int $$5 = Math.min(cqz.a(this.E, this.V, $$0) + $$3, $$4);
               this.Y -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private csw b(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.z.k.size(); $$2++) {
         csw $$3 = this.z.k.get($$2);
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
         boolean $$3 = this.m.n.H.a($$2) && this.m.r.f();
         csw $$4 = this.b($$0, $$1);
         long $$5 = ad.c();
         this.ab = this.N == $$4 && $$5 - this.Z < 250L && this.aa == $$2;
         this.X = false;
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
               this.d();
               return true;
            }

            if ($$9 != -1) {
               if (this.m.n.ab().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.K = $$4;
                     this.P = cvs.k;
                     this.O = $$2 == 1;
                  } else {
                     this.K = null;
                  }
               } else if (!this.F) {
                  if (this.z.g().f()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, crk.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (fcd.a(fip.Q().aP().i(), 340) || fcd.a(fip.Q().aP().i(), 344));
                        crk $$11 = crk.a;
                        if ($$10) {
                           this.ac = $$4 != null && $$4.h() ? $$4.g().u() : cvs.k;
                           $$11 = crk.b;
                        } else if ($$9 == -999) {
                           $$11 = crk.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.X = true;
                  } else {
                     this.F = true;
                     this.W = $$2;
                     this.E.clear();
                     if ($$2 == 0) {
                        this.V = 0;
                     } else if ($$2 == 1) {
                        this.V = 1;
                     } else if ($$3) {
                        this.V = 2;
                     }
                  }
               }
            }
         }

         this.N = $$4;
         this.Z = $$5;
         this.aa = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.B != null && this.z.g().f()) {
         if (this.m.n.D.a($$0)) {
            this.a(this.B, this.B.d, 40, crk.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.m.n.S[$$1].a($$0)) {
               this.a(this.B, this.B.d, $$1, crk.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      csw $$5 = this.b($$0, $$1);
      cvs $$6 = this.z.g();
      if (this.K != null && this.m.n.ab().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.P.f()) {
               if ($$5 != this.K && !this.K.g().f()) {
                  this.P = this.K.g().u();
               }
            } else if (this.P.K() > 1 && $$5 != null && cqz.a($$5, this.P, false)) {
               long $$7 = ad.c();
               if (this.M == $$5) {
                  if ($$7 - this.U > 500L) {
                     this.a(this.K, this.K.d, 0, crk.a);
                     this.a($$5, $$5.d, 1, crk.a);
                     this.a(this.K, this.K.d, 0, crk.a);
                     this.U = $$7 + 750L;
                     this.P.h(1);
                  }
               } else {
                  this.M = $$5;
                  this.U = $$7;
               }
            }
         }
      } else if (this.F && $$5 != null && !$$6.f() && ($$6.K() > this.E.size() || this.V == 2) && cqz.a($$5, $$6, true) && $$5.a($$6) && this.z.b($$5)) {
         this.E.add($$5);
         this.J();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      csw $$3 = this.b($$0, $$1);
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

      if (this.ab && $$3 != null && $$2 == 0 && this.z.a(cvs.k, $$3)) {
         if (t()) {
            if (!this.ac.f()) {
               for (csw $$8 : this.z.k) {
                  if ($$8 != null && $$8.a(this.m.t) && $$8.h() && $$8.c == $$3.c && cqz.a($$8, this.ac, true)) {
                     this.a($$8, $$8.d, $$2, crk.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, crk.g);
         }

         this.ab = false;
         this.Z = 0L;
      } else {
         if (this.F && this.W != $$2) {
            this.F = false;
            this.E.clear();
            this.X = true;
            return true;
         }

         if (this.X) {
            this.X = false;
            return true;
         }

         if (this.K != null && this.m.n.ab().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.P.f() && $$3 != this.K) {
                  this.P = this.K.g();
               }

               boolean $$9 = cqz.a($$3, this.P, false);
               if ($$7 != -1 && !this.P.f() && $$9) {
                  this.a(this.K, this.K.d, $$2, crk.a);
                  this.a($$3, $$7, 0, crk.a);
                  if (this.z.g().f()) {
                     this.T = cvs.k;
                  } else {
                     this.a(this.K, this.K.d, $$2, crk.a);
                     this.Q = azf.a($$0 - (double)$$4);
                     this.R = azf.a($$1 - (double)$$5);
                     this.L = this.K;
                     this.T = this.P;
                     this.S = ad.c();
                  }
               } else if (!this.P.f()) {
                  this.Q = azf.a($$0 - (double)$$4);
                  this.R = azf.a($$1 - (double)$$5);
                  this.L = this.K;
                  this.T = this.P;
                  this.S = ad.c();
               }

               this.m();
            }
         } else if (this.F && !this.E.isEmpty()) {
            this.a(null, -999, cqz.c(0, this.V), crk.f);

            for (csw $$10 : this.E) {
               this.a($$10, $$10.d, cqz.c(1, this.V), crk.f);
            }

            this.a(null, -999, cqz.c(2, this.V), crk.f);
         } else if (!this.z.g().f()) {
            if (this.m.n.H.a($$2)) {
               this.a($$3, $$7, $$2, crk.d);
            } else {
               boolean $$11 = $$7 != -999 && (fcd.a(fip.Q().aP().i(), 340) || fcd.a(fip.Q().aP().i(), 344));
               if ($$11) {
                  this.ac = $$3 != null && $$3.h() ? $$3.g().u() : cvs.k;
               }

               this.a($$3, $$7, $$2, $$11 ? crk.b : crk.a);
            }
         }
      }

      if (this.z.g().f()) {
         this.Z = 0L;
      }

      this.F = false;
      return true;
   }

   public void m() {
      this.P = cvs.k;
      this.K = null;
   }

   private boolean a(csw $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.C;
      int $$7 = this.D;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   private void a(csw $$0) {
      if ($$0.h()) {
         for (fkd $$1 : this.J) {
            if ($$1.a($$0)) {
               $$1.b($$0);
            }
         }
      }
   }

   protected void a(csw $$0, int $$1, int $$2, crk $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.m.r.a(this.z.l, $$1, $$2, $$3, this.m.t);
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.m.r.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.m.n.C.a($$0, $$1)) {
         this.d();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.B != null && this.B.h()) {
            if (this.m.n.H.a($$0, $$1)) {
               this.a(this.B, this.B.d, 0, crk.d);
            } else if (this.m.n.E.a($$0, $$1)) {
               this.a(this.B, this.B.d, s() ? 1 : 0, crk.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.z.g().f() && this.B != null) {
         if (this.m.n.D.a($$0, $$1)) {
            this.a(this.B, this.B.d, 40, crk.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.m.n.S[$$2].a($$0, $$1)) {
               this.a(this.B, this.B.d, $$2, crk.c);
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
      if (this.m.t.bI() && !this.m.t.dN()) {
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
   public void d() {
      this.m.t.s();
      if (this.B != null) {
         this.a(this.B);
      }

      super.d();
   }
}
