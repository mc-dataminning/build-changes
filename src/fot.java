import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fot<T extends cpu> extends fod implements fpy<T> {
   public static final akr a = akr.b("textures/gui/container/inventory.png");
   private static final float E = 100.0F;
   private static final int F = 500;
   public static final int b = 100;
   private static final int G = 200;
   protected int c = 176;
   protected int r = 166;
   protected int s;
   protected int u;
   protected int v;
   protected int w;
   protected final T x;
   protected final wz y;
   @Nullable
   protected crq z;
   @Nullable
   private crq H;
   @Nullable
   private crq I;
   @Nullable
   private crq J;
   @Nullable
   private crq K;
   protected int A;
   protected int B;
   private boolean L;
   private cuq M = cuq.l;
   private int N;
   private int O;
   private long P;
   private cuq Q = cuq.l;
   private long R;
   protected final Set<crq> C = Sets.newHashSet();
   protected boolean D;
   private int S;
   private int T;
   private boolean U;
   private int V;
   private long W;
   private int X;
   private boolean Y;
   private cuq Z = cuq.l;

   public fot(T $$0, cmw $$1, wz $$2) {
      super($$2);
      this.x = $$0;
      this.y = $$1.S_();
      this.U = true;
      this.s = 8;
      this.u = 6;
      this.v = 8;
      this.w = this.r - 94;
   }

   @Override
   protected void aT_() {
      this.A = (this.m - this.c) / 2;
      this.B = (this.n - this.r) / 2;
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.disableDepthTest();
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      this.z = null;

      for (int $$6 = 0; $$6 < this.x.i.size(); $$6++) {
         crq $$7 = this.x.i.get($$6);
         if ($$7.d()) {
            this.a($$0, $$7);
         }

         if (this.a($$7, (double)$$1, (double)$$2) && $$7.d()) {
            this.z = $$7;
            int $$8 = $$7.e;
            int $$9 = $$7.f;
            if (this.z.e()) {
               a($$0, $$8, $$9, 0);
            }
         }
      }

      this.b($$0, $$1, $$2);
      cuq $$10 = this.M.e() ? this.x.g() : this.M;
      if (!$$10.e()) {
         int $$11 = 8;
         int $$12 = this.M.e() ? 8 : 16;
         String $$13 = null;
         if (!this.M.e() && this.L) {
            $$10 = $$10.c(ayo.f((float)$$10.H() / 2.0F));
         } else if (this.D && this.C.size() > 1) {
            $$10 = $$10.c(this.V);
            if ($$10.e()) {
               $$13 = n.o + "0";
            }
         }

         this.a($$0, $$10, $$1 - $$4 - 8, $$2 - $$5 - $$12, $$13);
      }

      if (!this.Q.e()) {
         float $$14 = (float)(ad.c() - this.P) / 100.0F;
         if ($$14 >= 1.0F) {
            $$14 = 1.0F;
            this.Q = cuq.l;
         }

         int $$15 = this.I.e - this.N;
         int $$16 = this.I.f - this.O;
         int $$17 = this.N + (int)((float)$$15 * $$14);
         int $$18 = this.O + (int)((float)$$16 * $$14);
         this.a($$0, this.Q, $$17, $$18, null);
      }

      $$0.c().b();
      RenderSystem.enableDepthTest();
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   public static void a(fhz $$0, int $$1, int $$2, int $$3) {
      $$0.a(gfh.F(), $$1, $$2, $$1 + 16, $$2 + 16, -2130706433, -2130706433, $$3);
   }

   protected void a(fhz $$0, int $$1, int $$2) {
      if (this.x.g().e() && this.z != null && this.z.h()) {
         cuq $$3 = this.z.g();
         $$0.a(this.o, this.a($$3), $$3.b(), $$1, $$2);
      }
   }

   protected List<wz> a(cuq $$0) {
      return a(this.l, $$0);
   }

   private void a(fhz $$0, cuq $$1, int $$2, int $$3, String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.o, $$1, $$2, $$3 - (this.M.e() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(fhz $$0, int $$1, int $$2) {
      $$0.a(this.o, this.k, this.s, this.u, 4210752, false);
      $$0.a(this.o, this.y, this.v, this.w, 4210752, false);
   }

   protected abstract void a(fhz var1, float var2, int var3, int var4);

   protected void a(fhz $$0, crq $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      cuq $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.H && !this.M.e() && !this.L;
      cuq $$7 = this.x.g();
      String $$8 = null;
      if ($$1 == this.H && !this.M.e() && this.L && !$$4.e()) {
         $$4 = $$4.c($$4.H() / 2);
      } else if (this.D && this.C.contains($$1) && !$$7.e()) {
         if (this.C.size() == 1) {
            return;
         }

         if (cpu.a($$1, $$7, true) && this.x.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.j(), $$1.a_($$7));
            int $$10 = $$1.g().e() ? 0 : $$1.g().H();
            int $$11 = cpu.a(this.C, this.S, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.C.remove($$1);
            this.G();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.e() && $$1.d()) {
         Pair<akr, akr> $$12 = $$1.b();
         if ($$12 != null) {
            gql $$13 = this.l.a((akr)$$12.getFirst()).apply((akr)$$12.getSecond());
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

   private void G() {
      cuq $$0 = this.x.g();
      if (!$$0.e() && this.D) {
         if (this.S == 2) {
            this.V = $$0.j();
         } else {
            this.V = $$0.H();

            for (crq $$1 : this.C) {
               cuq $$2 = $$1.g();
               int $$3 = $$2.e() ? 0 : $$2.H();
               int $$4 = Math.min($$0.j(), $$1.a_($$0));
               int $$5 = Math.min(cpu.a(this.C, this.S, $$0) + $$3, $$4);
               this.V -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private crq b(double $$0, double $$1) {
      for (int $$2 = 0; $$2 < this.x.i.size(); $$2++) {
         crq $$3 = this.x.i.get($$2);
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
         crq $$4 = this.b($$0, $$1);
         long $$5 = ad.c();
         this.Y = this.K == $$4 && $$5 - this.W < 250L && this.X == $$2;
         this.U = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.A;
            int $$7 = this.B;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.d;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.l.m.Z().c() && $$8 && this.x.g().e()) {
               this.d();
               return true;
            }

            if ($$9 != -1) {
               if (this.l.m.Z().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.H = $$4;
                     this.M = cuq.l;
                     this.L = $$2 == 1;
                  } else {
                     this.H = null;
                  }
               } else if (!this.D) {
                  if (this.x.g().e()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cqe.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (fae.a(fgo.Q().aM().j(), 340) || fae.a(fgo.Q().aM().j(), 344));
                        cqe $$11 = cqe.a;
                        if ($$10) {
                           this.Z = $$4 != null && $$4.h() ? $$4.g().s() : cuq.l;
                           $$11 = cqe.b;
                        } else if ($$9 == -999) {
                           $$11 = cqe.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.U = true;
                  } else {
                     this.D = true;
                     this.T = $$2;
                     this.C.clear();
                     if ($$2 == 0) {
                        this.S = 0;
                     } else if ($$2 == 1) {
                        this.S = 1;
                     } else if ($$3) {
                        this.S = 2;
                     }
                  }
               }
            }
         }

         this.K = $$4;
         this.W = $$5;
         this.X = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.z != null && this.x.g().e()) {
         if (this.l.m.E.a($$0)) {
            this.a(this.z, this.z.d, 40, cqe.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.l.m.T[$$1].a($$0)) {
               this.a(this.z, this.z.d, $$1, cqe.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.r);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      crq $$5 = this.b($$0, $$1);
      cuq $$6 = this.x.g();
      if (this.H != null && this.l.m.Z().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.M.e()) {
               if ($$5 != this.H && !this.H.g().e()) {
                  this.M = this.H.g().s();
               }
            } else if (this.M.H() > 1 && $$5 != null && cpu.a($$5, this.M, false)) {
               long $$7 = ad.c();
               if (this.J == $$5) {
                  if ($$7 - this.R > 500L) {
                     this.a(this.H, this.H.d, 0, cqe.a);
                     this.a($$5, $$5.d, 1, cqe.a);
                     this.a(this.H, this.H.d, 0, cqe.a);
                     this.R = $$7 + 750L;
                     this.M.h(1);
                  }
               } else {
                  this.J = $$5;
                  this.R = $$7;
               }
            }
         }
      } else if (this.D && $$5 != null && !$$6.e() && ($$6.H() > this.C.size() || this.S == 2) && cpu.a($$5, $$6, true) && $$5.a($$6) && this.x.b($$5)) {
         this.C.add($$5);
         this.G();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      crq $$3 = this.b($$0, $$1);
      int $$4 = this.A;
      int $$5 = this.B;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.d;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.Y && $$3 != null && $$2 == 0 && this.x.a(cuq.l, $$3)) {
         if (s()) {
            if (!this.Z.e()) {
               for (crq $$8 : this.x.i) {
                  if ($$8 != null && $$8.a(this.l.s) && $$8.h() && $$8.c == $$3.c && cpu.a($$8, this.Z, true)) {
                     this.a($$8, $$8.d, $$2, cqe.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cqe.g);
         }

         this.Y = false;
         this.W = 0L;
      } else {
         if (this.D && this.T != $$2) {
            this.D = false;
            this.C.clear();
            this.U = true;
            return true;
         }

         if (this.U) {
            this.U = false;
            return true;
         }

         if (this.H != null && this.l.m.Z().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.M.e() && $$3 != this.H) {
                  this.M = this.H.g();
               }

               boolean $$9 = cpu.a($$3, this.M, false);
               if ($$7 != -1 && !this.M.e() && $$9) {
                  this.a(this.H, this.H.d, $$2, cqe.a);
                  this.a($$3, $$7, 0, cqe.a);
                  if (this.x.g().e()) {
                     this.Q = cuq.l;
                  } else {
                     this.a(this.H, this.H.d, $$2, cqe.a);
                     this.N = ayo.a($$0 - (double)$$4);
                     this.O = ayo.a($$1 - (double)$$5);
                     this.I = this.H;
                     this.Q = this.M;
                     this.P = ad.c();
                  }
               } else if (!this.M.e()) {
                  this.N = ayo.a($$0 - (double)$$4);
                  this.O = ayo.a($$1 - (double)$$5);
                  this.I = this.H;
                  this.Q = this.M;
                  this.P = ad.c();
               }

               this.m();
            }
         } else if (this.D && !this.C.isEmpty()) {
            this.a(null, -999, cpu.b(0, this.S), cqe.f);

            for (crq $$10 : this.C) {
               this.a($$10, $$10.d, cpu.b(1, this.S), cqe.f);
            }

            this.a(null, -999, cpu.b(2, this.S), cqe.f);
         } else if (!this.x.g().e()) {
            if (this.l.m.I.a($$2)) {
               this.a($$3, $$7, $$2, cqe.d);
            } else {
               boolean $$11 = $$7 != -999 && (fae.a(fgo.Q().aM().j(), 340) || fae.a(fgo.Q().aM().j(), 344));
               if ($$11) {
                  this.Z = $$3 != null && $$3.h() ? $$3.g().s() : cuq.l;
               }

               this.a($$3, $$7, $$2, $$11 ? cqe.b : cqe.a);
            }
         }
      }

      if (this.x.g().e()) {
         this.W = 0L;
      }

      this.D = false;
      return true;
   }

   public void m() {
      this.M = cuq.l;
      this.H = null;
   }

   private boolean a(crq $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.A;
      int $$7 = this.B;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   protected void a(crq $$0, int $$1, int $$2, cqe $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.l.q.a(this.x.j, $$1, $$2, $$3, this.l.s);
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
         if (this.z != null && this.z.h()) {
            if (this.l.m.I.a($$0, $$1)) {
               this.a(this.z, this.z.d, 0, cqe.d);
            } else if (this.l.m.F.a($$0, $$1)) {
               this.a(this.z, this.z.d, r() ? 1 : 0, cqe.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.x.g().e() && this.z != null) {
         if (this.l.m.E.a($$0, $$1)) {
            this.a(this.z, this.z.d, 40, cqe.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.l.m.T[$$2].a($$0, $$1)) {
               this.a(this.z, this.z.d, $$2, cqe.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void j() {
      if (this.l.s != null) {
         this.x.a(this.l.s);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.l.s.bE() && !this.l.s.dJ()) {
         this.C();
      } else {
         this.l.s.s();
      }
   }

   protected void C() {
   }

   @Override
   public T D() {
      return this.x;
   }

   @Override
   public void d() {
      this.l.s.s();
      super.d();
   }
}
