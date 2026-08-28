import com.mojang.logging.LogUtils;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.joml.Vector2i;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;

public class fjj {
   private static final Logger a = LogUtils.getLogger();
   private final fji b;
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
   private final bab m = new bab();
   private final bab n = new bab();
   private double o;
   private double p;
   private final fjs q;
   private double r = Double.MIN_VALUE;
   private boolean s;

   public fjj(fji $$0) {
      this.b = $$0;
      this.q = new fjs();
   }

   private void a(long $$0, int $$1, int $$2, int $$3) {
      if ($$0 == this.b.aO().h()) {
         this.b.aP().b();
         if (this.b.z != null) {
            this.b.a(fjf.b);
         }

         boolean $$4 = $$2 == 1;
         if (fji.a && $$1 == 0) {
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
            if (this.b.n.ab().c() && this.k++ > 0) {
               return;
            }

            this.i = $$5;
            this.l = fbm.b();
         } else if (this.i != -1) {
            if (this.b.n.ab().c() && --this.k > 0) {
               return;
            }

            this.i = -1;
         }

         boolean[] $$6 = new boolean[]{false};
         if (this.b.aM() == null) {
            if (this.b.z == null) {
               if (!this.s && $$4) {
                  this.i();
               }
            } else {
               double $$7 = this.f * (double)this.b.aO().o() / (double)this.b.aO().m();
               double $$8 = this.g * (double)this.b.aO().p() / (double)this.b.aO().n();
               fra $$9 = this.b.z;
               if ($$4) {
                  $$9.x();
                  fra.a(() -> $$6[0] = $$9.a($$7, $$8, $$5), "mouseClicked event handler", $$9.getClass().getCanonicalName());
               } else {
                  fra.a(() -> $$6[0] = $$9.b($$7, $$8, $$5), "mouseReleased event handler", $$9.getClass().getCanonicalName());
               }
            }
         }

         if (!$$6[0] && this.b.z == null && this.b.aM() == null) {
            if ($$5 == 0) {
               this.c = $$4;
            } else if ($$5 == 2) {
               this.d = $$4;
            } else if ($$5 == 1) {
               this.e = $$4;
            }

            fjg.a(fcw.b.c.a($$5), $$4);
            if ($$4) {
               if (this.b.t.R_() && $$5 == 2) {
                  this.b.m.g().b();
               } else {
                  fjg.a(fcw.b.c.a($$5));
               }
            }
         }
      }
   }

   private void a(long $$0, double $$1, double $$2) {
      if ($$0 == fji.Q().aO().h()) {
         this.b.aP().b();
         boolean $$3 = this.b.n.U().c();
         double $$4 = this.b.n.G().c();
         double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
         double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
         if (this.b.aM() == null) {
            if (this.b.z != null) {
               double $$7 = this.f * (double)this.b.aO().o() / (double)this.b.aO().m();
               double $$8 = this.g * (double)this.b.aO().p() / (double)this.b.aO().n();
               this.b.z.a($$7, $$8, $$5, $$6);
               this.b.z.x();
            } else if (this.b.t != null) {
               Vector2i $$9 = this.q.a($$5, $$6);
               if ($$9.x == 0 && $$9.y == 0) {
                  return;
               }

               int $$10 = $$9.y == 0 ? -$$9.x : $$9.y;
               if (this.b.t.R_()) {
                  if (this.b.m.g().a()) {
                     this.b.m.g().b(-$$10);
                  } else {
                     float $$11 = azk.a(this.b.t.gl().a() + (float)$$9.y * 0.005F, 0.0F, 0.2F);
                     this.b.t.gl().a($$11);
                  }
               } else {
                  col $$12 = this.b.t.gk();
                  $$12.e(fjs.a((double)$$10, $$12.j, col.g()));
               }
            }
         }
      }
   }

   private void a(long $$0, List<Path> $$1, int $$2) {
      this.b.aP().b();
      if (this.b.z != null) {
         this.b.z.a($$1);
      }

      if ($$2 > 0) {
         fnq.a(this.b, $$2);
      }
   }

   public void a(long $$0) {
      fcw.a(
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
      if ($$0 == fji.Q().aO().h()) {
         if (this.j) {
            this.f = $$1;
            this.g = $$2;
            this.j = false;
         } else {
            if (this.b.aC()) {
               this.o = this.o + ($$1 - this.f);
               this.p = this.p + ($$2 - this.g);
            }

            this.f = $$1;
            this.g = $$2;
         }
      }
   }

   public void a() {
      double $$0 = fbm.b();
      double $$1 = $$0 - this.r;
      this.r = $$0;
      if (this.b.aC()) {
         fra $$2 = this.b.z;
         boolean $$3 = this.o != 0.0 || this.p != 0.0;
         if ($$3) {
            this.b.aP().b();
         }

         if ($$2 != null && this.b.aM() == null && $$3) {
            double $$4 = this.f * (double)this.b.aO().o() / (double)this.b.aO().m();
            double $$5 = this.g * (double)this.b.aO().p() / (double)this.b.aO().n();
            fra.a(() -> $$2.f($$4, $$5), "mouseMoved event handler", $$2.getClass().getCanonicalName());
            if (this.i != -1 && this.l > 0.0) {
               double $$6 = this.o * (double)this.b.aO().o() / (double)this.b.aO().m();
               double $$7 = this.p * (double)this.b.aO().p() / (double)this.b.aO().n();
               fra.a(() -> $$2.a($$4, $$5, this.i, $$6, $$7), "mouseDragged event handler", $$2.getClass().getCanonicalName());
            }

            $$2.v();
         }

         if (this.h() && this.b.t != null) {
            this.a($$1);
         }
      }

      this.o = 0.0;
      this.p = 0.0;
   }

   private void a(double $$0) {
      double $$1 = this.b.n.d().c() * 0.6F + 0.2F;
      double $$2 = $$1 * $$1 * $$1;
      double $$3 = $$2 * 8.0;
      double $$6;
      double $$7;
      if (this.b.n.Z) {
         double $$4 = this.m.a(this.o * $$3, $$0 * $$3);
         double $$5 = this.n.a(this.p * $$3, $$0 * $$3);
         $$6 = $$4;
         $$7 = $$5;
      } else if (this.b.n.aD().a() && this.b.t.gI()) {
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
      if (this.b.n.T().c()) {
         $$12 = -1;
      }

      this.b.aB().a($$6, $$7);
      if (this.b.t != null) {
         this.b.t.b($$6, $$7 * (double)$$12);
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
      return this.s;
   }

   public void i() {
      if (this.b.aC()) {
         if (!this.s) {
            if (!fji.a) {
               fjg.a();
            }

            this.s = true;
            this.f = (double)(this.b.aO().m() / 2);
            this.g = (double)(this.b.aO().n() / 2);
            fcw.a(this.b.aO().h(), 212995, this.f, this.g);
            this.b.a(null);
            this.b.x = 10000;
            this.j = true;
         }
      }
   }

   public void j() {
      if (this.s) {
         this.s = false;
         this.f = (double)(this.b.aO().m() / 2);
         this.g = (double)(this.b.aO().n() / 2);
         fcw.a(this.b.aO().h(), 212993, this.f, this.g);
      }
   }

   public void k() {
      this.j = true;
   }
}
