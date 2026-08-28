import com.mojang.logging.LogUtils;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;

public class fgj {
   private static final Logger a = LogUtils.getLogger();
   private final fgi b;
   private boolean c;
   private boolean d;
   private boolean e;
   private double f;
   private double g;
   private int h;
   private int i = -1;
   private boolean j = true;
   private int k;
   private double l;
   private final aze m = new aze();
   private final aze n = new aze();
   private double o;
   private double p;
   private double q;
   private double r;
   private double s = Double.MIN_VALUE;
   private boolean t;

   public fgj(fgi $$0) {
      this.b = $$0;
   }

   private void a(long $$0, int $$1, int $$2, int $$3) {
      if ($$0 == this.b.aM().j()) {
         if (this.b.y != null) {
            this.b.a(fgf.b);
         }

         boolean $$4 = $$2 == 1;
         if (fgi.a && $$1 == 0) {
            if ($$4) {
               if (($$3 & 2) == 2) {
                  $$1 = 1;
                  this.h++;
               }
            } else if (this.h > 0) {
               $$1 = 1;
               this.h--;
            }
         }

         int $$5 = $$1;
         if ($$4) {
            if (this.b.m.Z().c() && this.k++ > 0) {
               return;
            }

            this.i = $$5;
            this.l = eyu.b();
         } else if (this.i != -1) {
            if (this.b.m.Z().c() && --this.k > 0) {
               return;
            }

            this.i = -1;
         }

         boolean[] $$6 = new boolean[]{false};
         if (this.b.aK() == null) {
            if (this.b.y == null) {
               if (!this.t && $$4) {
                  this.i();
               }
            } else {
               double $$7 = this.f * (double)this.b.aM().p() / (double)this.b.aM().n();
               double $$8 = this.g * (double)this.b.aM().q() / (double)this.b.aM().o();
               fnx $$9 = this.b.y;
               if ($$4) {
                  $$9.v();
                  fnx.a(() -> $$6[0] = $$9.a($$7, $$8, $$5), "mouseClicked event handler", $$9.getClass().getCanonicalName());
               } else {
                  fnx.a(() -> $$6[0] = $$9.b($$7, $$8, $$5), "mouseReleased event handler", $$9.getClass().getCanonicalName());
               }
            }
         }

         if (!$$6[0] && this.b.y == null && this.b.aK() == null) {
            if ($$5 == 0) {
               this.c = $$4;
            } else if ($$5 == 2) {
               this.d = $$4;
            } else if ($$5 == 1) {
               this.e = $$4;
            }

            fgg.a(ezy.b.c.a($$5), $$4);
            if ($$4) {
               if (this.b.s.N_() && $$5 == 2) {
                  this.b.l.g().b();
               } else {
                  fgg.a(ezy.b.c.a($$5));
               }
            }
         }
      }
   }

   private void a(long $$0, double $$1, double $$2) {
      if ($$0 == fgi.Q().aM().j()) {
         boolean $$3 = this.b.m.S().c();
         double $$4 = this.b.m.F().c();
         double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
         double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
         if (this.b.aK() == null) {
            if (this.b.y != null) {
               double $$7 = this.f * (double)this.b.aM().p() / (double)this.b.aM().n();
               double $$8 = this.g * (double)this.b.aM().q() / (double)this.b.aM().o();
               this.b.y.a($$7, $$8, $$5, $$6);
               this.b.y.v();
            } else if (this.b.s != null) {
               if (this.q != 0.0 && Math.signum($$5) != Math.signum(this.q)) {
                  this.q = 0.0;
               }

               if (this.r != 0.0 && Math.signum($$6) != Math.signum(this.r)) {
                  this.r = 0.0;
               }

               this.q += $$5;
               this.r += $$6;
               int $$9 = (int)this.q;
               int $$10 = (int)this.r;
               if ($$9 == 0 && $$10 == 0) {
                  return;
               }

               this.q -= (double)$$9;
               this.r -= (double)$$10;
               int $$11 = $$10 == 0 ? -$$9 : $$10;
               if (this.b.s.N_()) {
                  if (this.b.l.g().a()) {
                     this.b.l.g().b(-$$11);
                  } else {
                     float $$12 = ayn.a(this.b.s.ga().a() + (float)$$10 * 0.005F, 0.0F, 0.2F);
                     this.b.s.ga().a($$12);
                  }
               } else {
                  this.b.s.fZ().a((double)$$11);
               }
            }
         }
      }
   }

   private void a(long $$0, List<Path> $$1, int $$2) {
      if (this.b.y != null) {
         this.b.y.a($$1);
      }

      if ($$2 > 0) {
         fko.a(this.b, $$2);
      }
   }

   public void a(long $$0) {
      ezy.a(
         $$0,
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.b($$0x, $$1, $$2)),
         ($$0x, $$1, $$2, $$3) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2)),
         ($$0x, $$1, $$2) -> {
            List<Path> $$3 = new ArrayList<>($$1);
            int $$4 = 0;

            for (int $$5 = 0; $$5 < $$1; $$5++) {
               String $$6 = GLFWDropCallback.getName($$2, $$5);

               try {
                  $$3.add(Paths.get($$6));
               } catch (InvalidPathException var11) {
                  $$4++;
                  a.error("Failed to parse path '{}'", $$6, var11);
               }
            }

            if (!$$3.isEmpty()) {
               int $$8 = $$4;
               this.b.execute(() -> this.a($$0x, $$3, $$8));
            }
         }
      );
   }

   private void b(long $$0, double $$1, double $$2) {
      if ($$0 == fgi.Q().aM().j()) {
         if (this.j) {
            this.f = $$1;
            this.g = $$2;
            this.j = false;
         } else {
            if (this.b.aA()) {
               this.o = this.o + ($$1 - this.f);
               this.p = this.p + ($$2 - this.g);
            }

            this.f = $$1;
            this.g = $$2;
         }
      }
   }

   public void a() {
      double $$0 = eyu.b();
      double $$1 = $$0 - this.s;
      this.s = $$0;
      if (this.b.aA()) {
         fnx $$2 = this.b.y;
         if ($$2 != null && this.b.aK() == null && (this.o != 0.0 || this.p != 0.0)) {
            double $$3 = this.f * (double)this.b.aM().p() / (double)this.b.aM().n();
            double $$4 = this.g * (double)this.b.aM().q() / (double)this.b.aM().o();
            fnx.a(() -> $$2.f($$3, $$4), "mouseMoved event handler", $$2.getClass().getCanonicalName());
            if (this.i != -1 && this.l > 0.0) {
               double $$5 = this.o * (double)this.b.aM().p() / (double)this.b.aM().n();
               double $$6 = this.p * (double)this.b.aM().q() / (double)this.b.aM().o();
               fnx.a(() -> $$2.a($$3, $$4, this.i, $$5, $$6), "mouseDragged event handler", $$2.getClass().getCanonicalName());
            }

            $$2.u();
         }

         if (this.h() && this.b.s != null) {
            this.a($$1);
         }
      }

      this.o = 0.0;
      this.p = 0.0;
   }

   private void a(double $$0) {
      double $$1 = this.b.m.d().c() * 0.6F + 0.2F;
      double $$2 = $$1 * $$1 * $$1;
      double $$3 = $$2 * 8.0;
      double $$6;
      double $$7;
      if (this.b.m.aa) {
         double $$4 = this.m.a(this.o * $$3, $$0 * $$3);
         double $$5 = this.n.a(this.p * $$3, $$0 * $$3);
         $$6 = $$4;
         $$7 = $$5;
      } else if (this.b.m.aA().a() && this.b.s.gx()) {
         this.m.a();
         this.n.a();
         $$6 = this.o * $$2;
         $$7 = this.p * $$2;
      } else {
         this.m.a();
         this.n.a();
         $$6 = this.o * $$3;
         $$7 = this.p * $$3;
      }

      int $$12 = 1;
      if (this.b.m.R().c()) {
         $$12 = -1;
      }

      this.b.ax().a($$6, $$7);
      if (this.b.s != null) {
         this.b.s.b($$6, $$7 * (double)$$12);
      }
   }

   public boolean b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   public void g() {
      this.j = true;
   }

   public boolean h() {
      return this.t;
   }

   public void i() {
      if (this.b.aA()) {
         if (!this.t) {
            if (!fgi.a) {
               fgg.a();
            }

            this.t = true;
            this.f = (double)(this.b.aM().n() / 2);
            this.g = (double)(this.b.aM().o() / 2);
            ezy.a(this.b.aM().j(), 212995, this.f, this.g);
            this.b.a(null);
            this.b.w = 10000;
            this.j = true;
         }
      }
   }

   public void j() {
      if (this.t) {
         this.t = false;
         this.f = (double)(this.b.aM().n() / 2);
         this.g = (double)(this.b.aM().o() / 2);
         ezy.a(this.b.aM().j(), 212993, this.f, this.g);
      }
   }

   public void k() {
      this.j = true;
   }
}
