import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class eyx<T extends cee> extends exz implements fab<T> {
   public static final aer a = new aer("textures/gui/container/inventory.png");
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
   protected final tf q;
   @Nullable
   protected cfw s;
   @Nullable
   private cfw A;
   @Nullable
   private cfw B;
   @Nullable
   private cfw C;
   @Nullable
   private cfw D;
   protected int t;
   protected int u;
   private boolean E;
   private ciy F = ciy.b;
   private int G;
   private int H;
   private long I;
   private ciy J = ciy.b;
   private long K;
   protected final Set<cfw> v = Sets.newHashSet();
   protected boolean w;
   private int L;
   private int M;
   private boolean N;
   private int O;
   private long P;
   private int Q;
   private boolean R;
   private ciy S = ciy.b;

   public eyx(T $$0, cbm $$1, tf $$2) {
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
   protected void aE_() {
      this.t = (this.g - this.c) / 2;
      this.u = (this.h - this.k) / 2;
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.disableDepthTest();
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.s = null;

      for (int $$6 = 0; $$6 < this.p.i.size(); $$6++) {
         cfw $$7 = this.p.i.get($$6);
         if ($$7.c()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.c()) {
            this.s = $$7;
            int $$8 = $$7.f;
            int $$9 = $$7.g;
            if (this.s.h()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      ciy $$10 = this.F.b() ? this.p.g() : this.F;
      if (!$$10.b()) {
         int $$11 = 8;
         int $$12 = this.F.b() ? 8 : 16;
         String $$13 = null;
         if (!this.F.b() && this.E) {
            $$10 = $$10.c(arp.f((float)$$10.L() / 2.0F));
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
            this.J = ciy.b;
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
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      this.a($$0, $$3, $$1, $$2);
   }

   public static void a(erw $$0, int $$1, int $$2, int $$3) {
      $$0.a(fnt.D(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(erw $$0, int $$1, int $$2) {
      if (this.p.g().b() && this.s != null && this.s.f()) {
         ciy $$3 = this.s.e();
         $$0.a(this.i, this.a($$3), $$3.a(), $$1, $$2);
      }
   }

   protected List<tf> a(ciy $$0) {
      return a(this.f, $$0);
   }

   private void a(erw $$0, ciy $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.i, $$1, $$2, $$3 - (this.F.b() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(erw $$0, int $$1, int $$2) {
      $$0.a(this.i, this.e, this.l, this.m, 4210752, false);
      $$0.a(this.i, this.q, this.n, this.o, 4210752, false);
   }

   protected abstract void a(erw var1, float var2, int var3, int var4);

   private void a(erw $$0, cfw $$1) {
      int $$2 = $$1.f;
      int $$3 = $$1.g;
      ciy $$4 = $$1.e();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.A && !this.F.b() && !this.E;
      ciy $$7 = this.p.g();
      String $$8 = null;
      if ($$1 == this.A && !this.F.b() && this.E && !$$4.b()) {
         $$4 = $$4.c($$4.L() / 2);
      } else if (this.w && this.v.contains($$1) && !$$7.b()) {
         if (this.v.size() == 1) {
            return;
         }

         if (cee.a($$1, $$7, true) && this.p.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.g(), $$1.a_($$7));
            int $$10 = $$1.e().b() ? 0 : $$1.e().L();
            int $$11 = cee.a(this.v, this.L, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.v.remove($$1);
            this.F();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.b() && $$1.c()) {
         Pair<aer, aer> $$12 = $$1.b();
         if ($$12 != null) {
            fyl $$13 = this.f.a((aer)$$12.getFirst()).apply((aer)$$12.getSecond());
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
      ciy $$0 = this.p.g();
      if (!$$0.b() && this.w) {
         if (this.L == 2) {
            this.O = $$0.g();
         } else {
            this.O = $$0.L();

            for (cfw $$1 : this.v) {
               ciy $$2 = $$1.e();
               int $$3 = $$2.b() ? 0 : $$2.L();
               int $$4 = Math.min($$0.g(), $$1.a_($$0));
               int $$5 = Math.min(cee.a(this.v, this.L, $$0) + $$3, $$4);
               this.O -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private cfw a(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.p.i.size(); $$2++) {
         cfw $$3 = this.p.i.get($$2);
         if (this.a($$3, $$0, $$1) && $$3.c()) {
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
         boolean $$3 = this.f.m.J.a($$2) && this.f.t.g();
         cfw $$4 = this.a($$0, $$1);
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

            if (this.f.m.U().c() && $$8 && this.p.g().b()) {
               this.au_();
               return true;
            }

            if ($$9 != -1) {
               if (this.f.m.U().c()) {
                  if ($$4 != null && $$4.f()) {
                     this.A = $$4;
                     this.F = ciy.b;
                     this.E = $$2 == 1;
                  } else {
                     this.A = null;
                  }
               } else if (!this.w) {
                  if (this.p.g().b()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cen.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (ekb.a(eqm.O().aN().i(), 340) || ekb.a(eqm.O().aN().i(), 344));
                        cen $$11 = cen.a;
                        if ($$10) {
                           this.S = $$4 != null && $$4.f() ? $$4.e().p() : ciy.b;
                           $$11 = cen.b;
                        } else if ($$9 == -999) {
                           $$11 = cen.e;
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
      if (this.s != null && this.p.g().b()) {
         if (this.f.m.F.a($$0)) {
            this.a(this.s, this.s.e, 40, cen.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.f.m.U[$$1].a($$0)) {
               this.a(this.s, this.s.e, $$1, cen.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      cfw $$5 = this.a($$0, $$1);
      ciy $$6 = this.p.g();
      if (this.A != null && this.f.m.U().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.F.b()) {
               if ($$5 != this.A && !this.A.e().b()) {
                  this.F = this.A.e().p();
               }
            } else if (this.F.L() > 1 && $$5 != null && cee.a($$5, this.F, false)) {
               long $$7 = ac.b();
               if (this.C == $$5) {
                  if ($$7 - this.K > 500L) {
                     this.a(this.A, this.A.e, 0, cen.a);
                     this.a($$5, $$5.e, 1, cen.a);
                     this.a(this.A, this.A.e, 0, cen.a);
                     this.K = $$7 + 750L;
                     this.F.h(1);
                  }
               } else {
                  this.C = $$5;
                  this.K = $$7;
               }
            }
         }
      } else if (this.w && $$5 != null && !$$6.b() && ($$6.L() > this.v.size() || this.L == 2) && cee.a($$5, $$6, true) && $$5.a($$6) && this.p.b($$5)) {
         this.v.add($$5);
         this.F();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      cfw $$3 = this.a($$0, $$1);
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

      if (this.R && $$3 != null && $$2 == 0 && this.p.a(ciy.b, $$3)) {
         if (q()) {
            if (!this.S.b()) {
               for (cfw $$8 : this.p.i) {
                  if ($$8 != null && $$8.a(this.f.v) && $$8.f() && $$8.d == $$3.d && cee.a($$8, this.S, true)) {
                     this.a($$8, $$8.e, $$2, cen.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cen.g);
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

         if (this.A != null && this.f.m.U().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.F.b() && $$3 != this.A) {
                  this.F = this.A.e();
               }

               boolean $$9 = cee.a($$3, this.F, false);
               if ($$7 != -1 && !this.F.b() && $$9) {
                  this.a(this.A, this.A.e, $$2, cen.a);
                  this.a($$3, $$7, 0, cen.a);
                  if (this.p.g().b()) {
                     this.J = ciy.b;
                  } else {
                     this.a(this.A, this.A.e, $$2, cen.a);
                     this.G = arp.a($$0 - (double)$$4);
                     this.H = arp.a($$1 - (double)$$5);
                     this.B = this.A;
                     this.J = this.F;
                     this.I = ac.b();
                  }
               } else if (!this.F.b()) {
                  this.G = arp.a($$0 - (double)$$4);
                  this.H = arp.a($$1 - (double)$$5);
                  this.B = this.A;
                  this.J = this.F;
                  this.I = ac.b();
               }

               this.l();
            }
         } else if (this.w && !this.v.isEmpty()) {
            this.a(null, -999, cee.b(0, this.L), cen.f);

            for (cfw $$10 : this.v) {
               this.a($$10, $$10.e, cee.b(1, this.L), cen.f);
            }

            this.a(null, -999, cee.b(2, this.L), cen.f);
         } else if (!this.p.g().b()) {
            if (this.f.m.J.a($$2)) {
               this.a($$3, $$7, $$2, cen.d);
            } else {
               boolean $$11 = $$7 != -999 && (ekb.a(eqm.O().aN().i(), 340) || ekb.a(eqm.O().aN().i(), 344));
               if ($$11) {
                  this.S = $$3 != null && $$3.f() ? $$3.e().p() : ciy.b;
               }

               this.a($$3, $$7, $$2, $$11 ? cen.b : cen.a);
            }
         }
      }

      if (this.p.g().b()) {
         this.P = 0L;
      }

      this.w = false;
      return true;
   }

   public void l() {
      this.F = ciy.b;
      this.A = null;
   }

   private boolean a(cfw $$0, double $$1, double $$2) {
      return this.a($$0.f, $$0.g, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.t;
      int $$7 = this.u;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(cfw $$0, int $$1, int $$2, cen $$3) {
      if ($$0 != null) {
         $$1 = $$0.e;
      }

      this.f.t.a(this.p.j, $$1, $$2, $$3, this.f.v);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.f.m.E.a($$0, $$1)) {
         this.au_();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.s != null && this.s.f()) {
            if (this.f.m.J.a($$0, $$1)) {
               this.a(this.s, this.s.e, 0, cen.d);
            } else if (this.f.m.G.a($$0, $$1)) {
               this.a(this.s, this.s.e, p() ? 1 : 0, cen.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.p.g().b() && this.s != null) {
         if (this.f.m.F.a($$0, $$1)) {
            this.a(this.s, this.s.e, 40, cen.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.f.m.U[$$2].a($$0, $$1)) {
               this.a(this.s, this.s.e, $$2, cen.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void h() {
      if (this.f.v != null) {
         this.p.b(this.f.v);
      }
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public final void c() {
      super.c();
      if (this.f.v.bv() && !this.f.v.dF()) {
         this.B();
      } else {
         this.f.v.q();
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
   public void au_() {
      this.f.v.q();
      super.au_();
   }
}
