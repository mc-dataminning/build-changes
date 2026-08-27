import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class evh {
   private final evg a;
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
   private final avf l = new avf();
   private final avf m = new avf();
   private double n;
   private double o;
   private double p;
   private double q;
   private double r = Double.MIN_VALUE;
   private boolean s;

   public evh(evg $$0) {
      this.a = $$0;
   }

   private void a(long $$0, int $$1, int $$2, int $$3) {
      if ($$0 == this.a.aM().i()) {
         if (this.a.y != null) {
            this.a.a(evd.b);
         }

         boolean $$4 = $$2 == 1;
         if (evg.a && $$1 == 0) {
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
            if (this.a.m.W().c() && this.j++ > 0) {
               return;
            }

            this.h = $$5;
            this.k = enq.b();
         } else if (this.h != -1) {
            if (this.a.m.W().c() && --this.j > 0) {
               return;
            }

            this.h = -1;
         }

         boolean[] $$6 = new boolean[]{false};
         if (this.a.aJ() == null) {
            if (this.a.y == null) {
               if (!this.s && $$4) {
                  this.i();
               }
            } else {
               double $$7 = this.e * (double)this.a.aM().o() / (double)this.a.aM().m();
               double $$8 = this.f * (double)this.a.aM().p() / (double)this.a.aM().n();
               fcz $$9 = this.a.y;
               if ($$4) {
                  $$9.w();
                  fcz.a(() -> $$6[0] = $$9.a($$7, $$8, $$5), "mouseClicked event handler", $$9.getClass().getCanonicalName());
               } else {
                  fcz.a(() -> $$6[0] = $$9.b($$7, $$8, $$5), "mouseReleased event handler", $$9.getClass().getCanonicalName());
               }
            }
         }

         if (!$$6[0] && this.a.y == null && this.a.aJ() == null) {
            if ($$5 == 0) {
               this.b = $$4;
            } else if ($$5 == 2) {
               this.c = $$4;
            } else if ($$5 == 1) {
               this.d = $$4;
            }

            eve.a(eou.b.c.a($$5), $$4);
            if ($$4) {
               if (this.a.s.P_() && $$5 == 2) {
                  this.a.l.g().b();
               } else {
                  eve.a(eou.b.c.a($$5));
               }
            }
         }
      }
   }

   private void a(long $$0, double $$1, double $$2) {
      if ($$0 == evg.O().aM().i()) {
         boolean $$3 = this.a.m.P().c();
         double $$4 = this.a.m.D().c();
         double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
         double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
         if (this.a.aJ() == null) {
            if (this.a.y != null) {
               double $$7 = this.e * (double)this.a.aM().o() / (double)this.a.aM().m();
               double $$8 = this.f * (double)this.a.aM().p() / (double)this.a.aM().n();
               this.a.y.a($$7, $$8, $$5, $$6);
               this.a.y.w();
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
               if (this.a.s.P_()) {
                  if (this.a.l.g().a()) {
                     this.a.l.g().b(-$$11);
                  } else {
                     float $$12 = aun.a(this.a.s.fT().a() + (float)$$10 * 0.005F, 0.0F, 0.2F);
                     this.a.s.fT().a($$12);
                  }
               } else {
                  this.a.s.fS().a((double)$$11);
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
      eou.a(
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
      if ($$0 == evg.O().aM().i()) {
         if (this.i) {
            this.e = $$1;
            this.f = $$2;
            this.i = false;
         }

         fcz $$3 = this.a.y;
         if ($$3 != null && this.a.aJ() == null) {
            double $$4 = $$1 * (double)this.a.aM().o() / (double)this.a.aM().m();
            double $$5 = $$2 * (double)this.a.aM().p() / (double)this.a.aM().n();
            fcz.a(() -> $$3.f($$4, $$5), "mouseMoved event handler", $$3.getClass().getCanonicalName());
            if (this.h != -1 && this.k > 0.0) {
               double $$6 = ($$1 - this.e) * (double)this.a.aM().o() / (double)this.a.aM().m();
               double $$7 = ($$2 - this.f) * (double)this.a.aM().p() / (double)this.a.aM().n();
               fcz.a(() -> $$3.a($$4, $$5, this.h, $$6, $$7), "mouseDragged event handler", $$3.getClass().getCanonicalName());
            }

            $$3.v();
         }

         this.a.aG().a("mouse");
         if (this.h() && this.a.aA()) {
            this.n = this.n + ($$1 - this.e);
            this.o = this.o + ($$2 - this.f);
         }

         this.a();
         this.e = $$1;
         this.f = $$2;
         this.a.aG().c();
      }
   }

   public void a() {
      double $$0 = enq.b();
      double $$1 = $$0 - this.r;
      this.r = $$0;
      if (this.h() && this.a.aA()) {
         double $$2 = this.a.m.d().c() * 0.6F + 0.2F;
         double $$3 = $$2 * $$2 * $$2;
         double $$4 = $$3 * 8.0;
         double $$7;
         double $$8;
         if (this.a.m.ab) {
            double $$5 = this.l.a(this.n * $$4, $$1 * $$4);
            double $$6 = this.m.a(this.o * $$4, $$1 * $$4);
            $$7 = $$5;
            $$8 = $$6;
         } else if (this.a.m.ax().a() && this.a.s.gq()) {
            this.l.a();
            this.m.a();
            $$7 = this.n * $$3;
            $$8 = this.o * $$3;
         } else {
            this.l.a();
            this.m.a();
            $$7 = this.n * $$4;
            $$8 = this.o * $$4;
         }

         this.n = 0.0;
         this.o = 0.0;
         int $$13 = 1;
         if (this.a.m.O().c()) {
            $$13 = -1;
         }

         this.a.az().a($$7, $$8);
         if (this.a.s != null) {
            this.a.s.b($$7, $$8 * (double)$$13);
         }
      } else {
         this.n = 0.0;
         this.o = 0.0;
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
      if (this.a.aA()) {
         if (!this.s) {
            if (!evg.a) {
               eve.a();
            }

            this.s = true;
            this.e = (double)(this.a.aM().m() / 2);
            this.f = (double)(this.a.aM().n() / 2);
            eou.a(this.a.aM().i(), 212995, this.e, this.f);
            this.a.a(null);
            this.a.w = 10000;
            this.i = true;
         }
      }
   }

   public void j() {
      if (this.s) {
         this.s = false;
         this.e = (double)(this.a.aM().m() / 2);
         this.f = (double)(this.a.aM().n() / 2);
         eou.a(this.a.aM().i(), 212993, this.e, this.f);
      }
   }

   public void k() {
      this.i = true;
   }
}
