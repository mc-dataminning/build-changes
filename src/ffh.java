import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class ffh {
   private final ffg a;
   private boolean b;
   private boolean c;
   private boolean d;
   private double e;
   private double f;
   private int g;
   private int h = -1;
   private boolean i = true;
   private int j;
   private double k;
   private final azq l = new azq();
   private final azq m = new azq();
   private double n;
   private double o;
   private double p;
   private double q;
   private double r = Double.MIN_VALUE;
   private boolean s;

   public ffh(ffg $$0) {
      this.a = $$0;
   }

   private void a(long $$0, int $$1, int $$2, int $$3) {
      if ($$0 == this.a.aO().i()) {
         if (this.a.y != null) {
            this.a.a(ffd.b);
         }

         boolean $$4 = $$2 == 1;
         if (ffg.a && $$1 == 0) {
            if ($$4) {
               if (($$3 & 2) == 2) {
                  $$1 = 1;
                  this.g++;
               }
            } else if (this.g > 0) {
               $$1 = 1;
               this.g--;
            }
         }

         int $$5 = $$1;
         if ($$4) {
            if (this.a.m.Z().c() && this.j++ > 0) {
               return;
            }

            this.h = $$5;
            this.k = exq.b();
         } else if (this.h != -1) {
            if (this.a.m.Z().c() && --this.j > 0) {
               return;
            }

            this.h = -1;
         }

         boolean[] $$6 = new boolean[]{false};
         if (this.a.aL() == null) {
            if (this.a.y == null) {
               if (!this.s && $$4) {
                  this.i();
               }
            } else {
               double $$7 = this.e * (double)this.a.aO().o() / (double)this.a.aO().m();
               double $$8 = this.f * (double)this.a.aO().p() / (double)this.a.aO().n();
               fne $$9 = this.a.y;
               if ($$4) {
                  $$9.x();
                  fne.a(() -> $$6[0] = $$9.a($$7, $$8, $$5), "mouseClicked event handler", $$9.getClass().getCanonicalName());
               } else {
                  fne.a(() -> $$6[0] = $$9.b($$7, $$8, $$5), "mouseReleased event handler", $$9.getClass().getCanonicalName());
               }
            }
         }

         if (!$$6[0] && this.a.y == null && this.a.aL() == null) {
            if ($$5 == 0) {
               this.b = $$4;
            } else if ($$5 == 2) {
               this.c = $$4;
            } else if ($$5 == 1) {
               this.d = $$4;
            }

            ffe.a(eyu.b.c.a($$5), $$4);
            if ($$4) {
               if (this.a.s.N_() && $$5 == 2) {
                  this.a.l.g().b();
               } else {
                  ffe.a(eyu.b.c.a($$5));
               }
            }
         }
      }
   }

   private void a(long $$0, double $$1, double $$2) {
      if ($$0 == ffg.Q().aO().i()) {
         boolean $$3 = this.a.m.S().c();
         double $$4 = this.a.m.F().c();
         double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
         double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
         if (this.a.aL() == null) {
            if (this.a.y != null) {
               double $$7 = this.e * (double)this.a.aO().o() / (double)this.a.aO().m();
               double $$8 = this.f * (double)this.a.aO().p() / (double)this.a.aO().n();
               this.a.y.a($$7, $$8, $$5, $$6);
               this.a.y.x();
            } else if (this.a.s != null) {
               if (this.p != 0.0 && Math.signum($$5) != Math.signum(this.p)) {
                  this.p = 0.0;
               }

               if (this.q != 0.0 && Math.signum($$6) != Math.signum(this.q)) {
                  this.q = 0.0;
               }

               this.p += $$5;
               this.q += $$6;
               int $$9 = (int)this.p;
               int $$10 = (int)this.q;
               if ($$9 == 0 && $$10 == 0) {
                  return;
               }

               this.p -= (double)$$9;
               this.q -= (double)$$10;
               int $$11 = $$10 == 0 ? -$$9 : $$10;
               if (this.a.s.N_()) {
                  if (this.a.l.g().a()) {
                     this.a.l.g().b(-$$11);
                  } else {
                     float $$12 = ayz.a(this.a.s.gd().a() + (float)$$10 * 0.005F, 0.0F, 0.2F);
                     this.a.s.gd().a($$12);
                  }
               } else {
                  this.a.s.gc().a((double)$$11);
               }
            }
         }
      }
   }

   private void a(long $$0, List<Path> $$1) {
      if (this.a.y != null) {
         this.a.y.a($$1);
      }
   }

   public void a(long $$0) {
      eyu.a(
         $$0,
         ($$0x, $$1, $$2) -> this.a.execute(() -> this.b($$0x, $$1, $$2)),
         ($$0x, $$1, $$2, $$3) -> this.a.execute(() -> this.a($$0x, $$1, $$2, $$3)),
         ($$0x, $$1, $$2) -> this.a.execute(() -> this.a($$0x, $$1, $$2)),
         ($$0x, $$1, $$2) -> {
            Path[] $$3 = new Path[$$1];

            for (int $$4 = 0; $$4 < $$1; $$4++) {
               $$3[$$4] = Paths.get(GLFWDropCallback.getName($$2, $$4));
            }

            this.a.execute(() -> this.a($$0x, Arrays.asList($$3)));
         }
      );
   }

   private void b(long $$0, double $$1, double $$2) {
      if ($$0 == ffg.Q().aO().i()) {
         if (this.i) {
            this.e = $$1;
            this.f = $$2;
            this.i = false;
         } else {
            if (this.a.aB()) {
               this.n = this.n + ($$1 - this.e);
               this.o = this.o + ($$2 - this.f);
            }

            this.e = $$1;
            this.f = $$2;
         }
      }
   }

   public void a() {
      double $$0 = exq.b();
      double $$1 = $$0 - this.r;
      this.r = $$0;
      if (this.a.aB()) {
         fne $$2 = this.a.y;
         if ($$2 != null && this.a.aL() == null && (this.n != 0.0 || this.o != 0.0)) {
            double $$3 = this.e * (double)this.a.aO().o() / (double)this.a.aO().m();
            double $$4 = this.f * (double)this.a.aO().p() / (double)this.a.aO().n();
            fne.a(() -> $$2.f($$3, $$4), "mouseMoved event handler", $$2.getClass().getCanonicalName());
            if (this.h != -1 && this.k > 0.0) {
               double $$5 = this.n * (double)this.a.aO().o() / (double)this.a.aO().m();
               double $$6 = this.o * (double)this.a.aO().p() / (double)this.a.aO().n();
               fne.a(() -> $$2.a($$3, $$4, this.h, $$5, $$6), "mouseDragged event handler", $$2.getClass().getCanonicalName());
            }

            $$2.w();
         }

         if (this.h() && this.a.s != null) {
            this.a($$1);
         }
      }

      this.n = 0.0;
      this.o = 0.0;
   }

   private void a(double $$0) {
      double $$1 = this.a.m.d().c() * 0.6F + 0.2F;
      double $$2 = $$1 * $$1 * $$1;
      double $$3 = $$2 * 8.0;
      double $$6;
      double $$7;
      if (this.a.m.aa) {
         double $$4 = this.l.a(this.n * $$3, $$0 * $$3);
         double $$5 = this.m.a(this.o * $$3, $$0 * $$3);
         $$6 = $$4;
         $$7 = $$5;
      } else if (this.a.m.aA().a() && this.a.s.gA()) {
         this.l.a();
         this.m.a();
         $$6 = this.n * $$2;
         $$7 = this.o * $$2;
      } else {
         this.l.a();
         this.m.a();
         $$6 = this.n * $$3;
         $$7 = this.o * $$3;
      }

      int $$12 = 1;
      if (this.a.m.R().c()) {
         $$12 = -1;
      }

      this.a.aA().a($$6, $$7);
      if (this.a.s != null) {
         this.a.s.b($$6, $$7 * (double)$$12);
      }
   }

   public boolean b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public double e() {
      return this.e;
   }

   public double f() {
      return this.f;
   }

   public void g() {
      this.i = true;
   }

   public boolean h() {
      return this.s;
   }

   public void i() {
      if (this.a.aB()) {
         if (!this.s) {
            if (!ffg.a) {
               ffe.a();
            }

            this.s = true;
            this.e = (double)(this.a.aO().m() / 2);
            this.f = (double)(this.a.aO().n() / 2);
            eyu.a(this.a.aO().i(), 212995, this.e, this.f);
            this.a.a(null);
            this.a.w = 10000;
            this.i = true;
         }
      }
   }

   public void j() {
      if (this.s) {
         this.s = false;
         this.e = (double)(this.a.aO().m() / 2);
         this.f = (double)(this.a.aO().n() / 2);
         eyu.a(this.a.aO().i(), 212993, this.e, this.f);
      }
   }

   public void k() {
      this.i = true;
   }
}
