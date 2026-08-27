import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class evp<T extends cbf> extends euq implements ewt<T> {
   public static final acq a = new acq("textures/gui/container/inventory.png");
   private static final float w = 100.0F;
   private static final int x = 500;
   public static final int b = 100;
   private static final int y = 200;
   protected int c = 176;
   protected int k = 166;
   protected int l;
   protected int m;
   protected int n;
   protected int o;
   protected final T p;
   protected final sw q;
   @Nullable
   protected ccx r;
   @Nullable
   private ccx z;
   @Nullable
   private ccx A;
   @Nullable
   private ccx C;
   @Nullable
   private ccx D;
   protected int s;
   protected int t;
   private boolean E;
   private cfz F = cfz.b;
   private int G;
   private int H;
   private long I;
   private cfz J = cfz.b;
   private long K;
   protected final Set<ccx> u = Sets.newHashSet();
   protected boolean v;
   private int L;
   private int M;
   private boolean N;
   private int O;
   private long P;
   private int Q;
   private boolean R;
   private cfz S = cfz.b;

   public evp(T $$0, byn $$1, sw $$2) {
      super($$2);
      this.p = $$0;
      this.q = $$1.H_();
      this.N = true;
      this.l = 8;
      this.m = 6;
      this.n = 8;
      this.o = this.k - 94;
   }

   @Override
   protected void b() {
      this.s = (this.g - this.c) / 2;
      this.t = (this.h - this.k) / 2;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.s;
      int $$5 = this.t;
      this.a($$0, $$3, $$1, $$2);
      RenderSystem.disableDepthTest();
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.r = null;

      for (int $$6 = 0; $$6 < this.p.i.size(); $$6++) {
         ccx $$7 = this.p.i.get($$6);
         if ($$7.b()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.b()) {
            this.r = $$7;
            int $$8 = $$7.f;
            int $$9 = $$7.g;
            if (this.r.h()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      cfz $$10 = this.F.b() ? this.p.g() : this.F;
      if (!$$10.b()) {
         int $$11 = 8;
         int $$12 = this.F.b() ? 8 : 16;
         String $$13 = null;
         if (!this.F.b() && this.E) {
            $$10 = $$10.c(apa.f((float)$$10.L() / 2.0F));
         } else if (this.v && this.u.size() > 1) {
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
            this.J = cfz.b;
         }

         int $$15 = this.A.f - this.G;
         int $$16 = this.A.g - this.H;
         int $$17 = this.G + (int)((float)$$15 * $$14);
         int $$18 = this.H + (int)((float)$$16 * $$14);
         this.a($$0, this.J, $$17, $$18, null);
      }

      $$0.c().b();
      RenderSystem.enableDepthTest();
   }

   public static void a(eox $$0, int $$1, int $$2, int $$3) {
      $$0.a(fkf.D(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(eox $$0, int $$1, int $$2) {
      if (this.p.g().b() && this.r != null && this.r.f()) {
         cfz $$3 = this.r.e();
         $$0.a(this.i, this.a($$3), $$3.a(), $$1, $$2);
      }
   }

   protected List<sw> a(cfz $$0) {
      return a(this.f, $$0);
   }

   private void a(eox $$0, cfz $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.i, $$1, $$2, $$3 - (this.F.b() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(eox $$0, int $$1, int $$2) {
      $$0.a(this.i, this.e, this.l, this.m, 4210752, false);
      $$0.a(this.i, this.q, this.n, this.o, 4210752, false);
   }

   protected abstract void a(eox var1, float var2, int var3, int var4);

   private void a(eox $$0, ccx $$1) {
      int $$2 = $$1.f;
      int $$3 = $$1.g;
      cfz $$4 = $$1.e();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.z && !this.F.b() && !this.E;
      cfz $$7 = this.p.g();
      String $$8 = null;
      if ($$1 == this.z && !this.F.b() && this.E && !$$4.b()) {
         $$4 = $$4.c($$4.L() / 2);
      } else if (this.v && this.u.contains($$1) && !$$7.b()) {
         if (this.u.size() == 1) {
            return;
         }

         if (cbf.a($$1, $$7, true) && this.p.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.g(), $$1.a_($$7));
            int $$10 = $$1.e().b() ? 0 : $$1.e().L();
            int $$11 = cbf.a(this.u, this.L, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.u.remove($$1);
            this.F();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.b() && $$1.b()) {
         Pair<acq, acq> $$12 = $$1.c();
         if ($$12 != null) {
            fuv $$13 = this.f.a((acq)$$12.getFirst()).apply((acq)$$12.getSecond());
            $$0.a($$2, $$3, 0, 16, 16, $$13);
            $$6 = true;
         }
      }

      if (!$$6) {
         if ($$5) {
            $$0.a($$2, $$3, $$2 + 16, $$3 + 16, -2130706433);
         }

         $$0.a($$4, $$2, $$3, $$1.f + $$1.g * this.c);
         $$0.a(this.i, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void F() {
      cfz $$0 = this.p.g();
      if (!$$0.b() && this.v) {
         if (this.L == 2) {
            this.O = $$0.g();
         } else {
            this.O = $$0.L();

            for (ccx $$1 : this.u) {
               cfz $$2 = $$1.e();
               int $$3 = $$2.b() ? 0 : $$2.L();
               int $$4 = Math.min($$0.g(), $$1.a_($$0));
               int $$5 = Math.min(cbf.a(this.u, this.L, $$0) + $$3, $$4);
               this.O -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private ccx a(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.p.i.size(); $$2++) {
         ccx $$3 = this.p.i.get($$2);
         if (this.a($$3, $$0, $$1) && $$3.b()) {
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
         boolean $$3 = this.f.m.J.a($$2) && this.f.r.g();
         ccx $$4 = this.a($$0, $$1);
         long $$5 = ac.b();
         this.R = this.D == $$4 && $$5 - this.P < 250L && this.Q == $$2;
         this.N = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.s;
            int $$7 = this.t;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.e;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.f.m.U().c() && $$8 && this.p.g().b()) {
               this.aw_();
               return true;
            }

            if ($$9 != -1) {
               if (this.f.m.U().c()) {
                  if ($$4 != null && $$4.f()) {
                     this.z = $$4;
                     this.F = cfz.b;
                     this.E = $$2 == 1;
                  } else {
                     this.z = null;
                  }
               } else if (!this.v) {
                  if (this.p.g().b()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cbo.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (ehe.a(enn.N().aM().i(), 340) || ehe.a(enn.N().aM().i(), 344));
                        cbo $$11 = cbo.a;
                        if ($$10) {
                           this.S = $$4 != null && $$4.f() ? $$4.e().p() : cfz.b;
                           $$11 = cbo.b;
                        } else if ($$9 == -999) {
                           $$11 = cbo.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.N = true;
                  } else {
                     this.v = true;
                     this.M = $$2;
                     this.u.clear();
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
            this.a(this.r, this.r.e, 40, cbo.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.f.m.U[$$1].a($$0)) {
               this.a(this.r, this.r.e, $$1, cbo.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      ccx $$5 = this.a($$0, $$1);
      cfz $$6 = this.p.g();
      if (this.z != null && this.f.m.U().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.F.b()) {
               if ($$5 != this.z && !this.z.e().b()) {
                  this.F = this.z.e().p();
               }
            } else if (this.F.L() > 1 && $$5 != null && cbf.a($$5, this.F, false)) {
               long $$7 = ac.b();
               if (this.C == $$5) {
                  if ($$7 - this.K > 500L) {
                     this.a(this.z, this.z.e, 0, cbo.a);
                     this.a($$5, $$5.e, 1, cbo.a);
                     this.a(this.z, this.z.e, 0, cbo.a);
                     this.K = $$7 + 750L;
                     this.F.h(1);
                  }
               } else {
                  this.C = $$5;
                  this.K = $$7;
               }
            }
         }
      } else if (this.v && $$5 != null && !$$6.b() && ($$6.L() > this.u.size() || this.L == 2) && cbf.a($$5, $$6, true) && $$5.a($$6) && this.p.b($$5)) {
         this.u.add($$5);
         this.F();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      ccx $$3 = this.a($$0, $$1);
      int $$4 = this.s;
      int $$5 = this.t;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.e;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.R && $$3 != null && $$2 == 0 && this.p.a(cfz.b, $$3)) {
         if (q()) {
            if (!this.S.b()) {
               for (ccx $$8 : this.p.i) {
                  if ($$8 != null && $$8.a(this.f.t) && $$8.f() && $$8.d == $$3.d && cbf.a($$8, this.S, true)) {
                     this.a($$8, $$8.e, $$2, cbo.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cbo.g);
         }

         this.R = false;
         this.P = 0L;
      } else {
         if (this.v && this.M != $$2) {
            this.v = false;
            this.u.clear();
            this.N = true;
            return true;
         }

         if (this.N) {
            this.N = false;
            return true;
         }

         if (this.z != null && this.f.m.U().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.F.b() && $$3 != this.z) {
                  this.F = this.z.e();
               }

               boolean $$9 = cbf.a($$3, this.F, false);
               if ($$7 != -1 && !this.F.b() && $$9) {
                  this.a(this.z, this.z.e, $$2, cbo.a);
                  this.a($$3, $$7, 0, cbo.a);
                  if (this.p.g().b()) {
                     this.J = cfz.b;
                  } else {
                     this.a(this.z, this.z.e, $$2, cbo.a);
                     this.G = apa.a($$0 - (double)$$4);
                     this.H = apa.a($$1 - (double)$$5);
                     this.A = this.z;
                     this.J = this.F;
                     this.I = ac.b();
                  }
               } else if (!this.F.b()) {
                  this.G = apa.a($$0 - (double)$$4);
                  this.H = apa.a($$1 - (double)$$5);
                  this.A = this.z;
                  this.J = this.F;
                  this.I = ac.b();
               }

               this.l();
            }
         } else if (this.v && !this.u.isEmpty()) {
            this.a(null, -999, cbf.b(0, this.L), cbo.f);

            for (ccx $$10 : this.u) {
               this.a($$10, $$10.e, cbf.b(1, this.L), cbo.f);
            }

            this.a(null, -999, cbf.b(2, this.L), cbo.f);
         } else if (!this.p.g().b()) {
            if (this.f.m.J.a($$2)) {
               this.a($$3, $$7, $$2, cbo.d);
            } else {
               boolean $$11 = $$7 != -999 && (ehe.a(enn.N().aM().i(), 340) || ehe.a(enn.N().aM().i(), 344));
               if ($$11) {
                  this.S = $$3 != null && $$3.f() ? $$3.e().p() : cfz.b;
               }

               this.a($$3, $$7, $$2, $$11 ? cbo.b : cbo.a);
            }
         }
      }

      if (this.p.g().b()) {
         this.P = 0L;
      }

      this.v = false;
      return true;
   }

   public void l() {
      this.F = cfz.b;
      this.z = null;
   }

   private boolean a(ccx $$0, double $$1, double $$2) {
      return this.a($$0.f, $$0.g, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.s;
      int $$7 = this.t;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(ccx $$0, int $$1, int $$2, cbo $$3) {
      if ($$0 != null) {
         $$1 = $$0.e;
      }

      this.f.r.a(this.p.j, $$1, $$2, $$3, this.f.t);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.f.m.E.a($$0, $$1)) {
         this.aw_();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.r != null && this.r.f()) {
            if (this.f.m.J.a($$0, $$1)) {
               this.a(this.r, this.r.e, 0, cbo.d);
            } else if (this.f.m.G.a($$0, $$1)) {
               this.a(this.r, this.r.e, p() ? 1 : 0, cbo.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.p.g().b() && this.r != null) {
         if (this.f.m.F.a($$0, $$1)) {
            this.a(this.r, this.r.e, 40, cbo.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.f.m.U[$$2].a($$0, $$1)) {
               this.a(this.r, this.r.e, $$2, cbo.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void ax_() {
      if (this.f.t != null) {
         this.p.b(this.f.t);
      }
   }

   @Override
   public boolean az_() {
      return false;
   }

   @Override
   public final void f() {
      super.f();
      if (this.f.t.bs() && !this.f.t.dD()) {
         this.B();
      } else {
         this.f.t.q();
      }
   }

   @Override
   protected void B() {
   }

   @Override
   public T C() {
      return this.p;
   }

   @Override
   public void aw_() {
      this.f.t.q();
      super.aw_();
   }
}
