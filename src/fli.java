import com.mojang.logging.LogUtils;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.joml.Vector2i;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;

public class fli {
   private static final Logger a = LogUtils.getLogger();
   private final flh b;
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
   private final azp m = new azp();
   private final azp n = new azp();
   private double o;
   private double p;
   private final flq q;
   private double r = Double.MIN_VALUE;
   private boolean s;

   public fli(flh $$0) {
      this.b = $$0;
      this.q = new flq();
   }

   private void a(long $$0, int $$1, int $$2, int $$3) {
      if ($$0 == this.b.aO().h()) {
         this.b.aP().b();
         if (this.b.z != null) {
            this.b.a(fle.b);
         }

         boolean $$4 = $$2 == 1;
         if (flh.a && $$1 == 0) {
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
            if (this.b.n.ac().c() && this.k++ > 0) {
               return;
            }

            this.i = $$1;
            this.l = fcx.b();
         } else if (this.i != -1) {
            if (this.b.n.ac().c() && --this.k > 0) {
               return;
            }

            this.i = -1;
         }

         if (this.b.aM() == null) {
            if (this.b.z == null) {
               if (!this.s && $$4) {
                  this.i();
               }
            } else {
               double $$6 = this.f * (double)this.b.aO().o() / (double)this.b.aO().m();
               double $$7 = this.g * (double)this.b.aO().p() / (double)this.b.aO().n();
               fui $$8 = this.b.z;
               if ($$4) {
                  $$8.w();

                  try {
                     if ($$8.a($$6, $$7, $$5)) {
                        return;
                     }
                  } catch (Throwable var17) {
                     o $$10 = o.a(var17, "mouseClicked event handler");
                     $$8.a($$10);
                     p $$11 = $$10.a("Mouse");
                     $$11.a("Scaled X", $$6);
                     $$11.a("Scaled Y", $$7);
                     $$11.a("Button", $$1);
                     throw new z($$10);
                  }
               } else {
                  try {
                     if ($$8.b($$6, $$7, $$5)) {
                        return;
                     }
                  } catch (Throwable var16) {
                     o $$13 = o.a(var16, "mouseReleased event handler");
                     $$8.a($$13);
                     p $$14 = $$13.a("Mouse");
                     $$14.a("Scaled X", $$6);
                     $$14.a("Scaled Y", $$7);
                     $$14.a("Button", $$1);
                     throw new z($$13);
                  }
               }
            }
         }

         if (this.b.z == null && this.b.aM() == null) {
            if ($$1 == 0) {
               this.c = $$4;
            } else if ($$1 == 2) {
               this.d = $$4;
            } else if ($$1 == 1) {
               this.e = $$4;
            }

            flf.a(fen.b.c.a($$1), $$4);
            if ($$4) {
               if (this.b.t.Z_() && $$1 == 2) {
                  this.b.m.g().b();
               } else {
                  flf.a(fen.b.c.a($$1));
               }
            }
         }
      }
   }

   private void a(long $$0, double $$1, double $$2) {
      if ($$0 == flh.Q().aO().h()) {
         this.b.aP().b();
         boolean $$3 = this.b.n.V().c();
         double $$4 = this.b.n.H().c();
         double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
         double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
         if (this.b.aM() == null) {
            if (this.b.z != null) {
               double $$7 = this.f * (double)this.b.aO().o() / (double)this.b.aO().m();
               double $$8 = this.g * (double)this.b.aO().p() / (double)this.b.aO().n();
               this.b.z.a($$7, $$8, $$5, $$6);
               this.b.z.w();
            } else if (this.b.t != null) {
               Vector2i $$9 = this.q.a($$5, $$6);
               if ($$9.x == 0 && $$9.y == 0) {
                  return;
               }

               int $$10 = $$9.y == 0 ? -$$9.x : $$9.y;
               if (this.b.t.Z_()) {
                  if (this.b.m.g().a()) {
                     this.b.m.g().b(-$$10);
                  } else {
                     float $$11 = ayy.a(this.b.t.gj().a() + (float)$$9.y * 0.005F, 0.0F, 0.2F);
                     this.b.t.gj().a($$11);
                  }
               } else {
                  cou $$12 = this.b.t.gi();
                  $$12.e(flq.a((double)$$10, $$12.j, cou.g()));
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
         fqz.a(this.b, $$2);
      }
   }

   public void a(long $$0) {
      fen.a(
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
      if ($$0 == flh.Q().aO().h()) {
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
      double $$0 = fcx.b();
      double $$1 = $$0 - this.r;
      this.r = $$0;
      if (this.b.aC()) {
         fui $$2 = this.b.z;
         boolean $$3 = this.o != 0.0 || this.p != 0.0;
         if ($$3) {
            this.b.aP().b();
         }

         if ($$2 != null && this.b.aM() == null && $$3) {
            double $$4 = this.f * (double)this.b.aO().o() / (double)this.b.aO().m();
            double $$5 = this.g * (double)this.b.aO().p() / (double)this.b.aO().n();

            try {
               $$2.f($$4, $$5);
            } catch (Throwable var19) {
               o $$7 = o.a(var19, "mouseMoved event handler");
               $$2.a($$7);
               p $$8 = $$7.a("Mouse");
               $$8.a("Scaled X", $$4);
               $$8.a("Scaled Y", $$5);
               throw new z($$7);
            }

            if (this.i != -1 && this.l > 0.0) {
               double $$9 = this.o * (double)this.b.aO().o() / (double)this.b.aO().m();
               double $$10 = this.p * (double)this.b.aO().p() / (double)this.b.aO().n();

               try {
                  $$2.a($$4, $$5, this.i, $$9, $$10);
               } catch (Throwable var18) {
                  o $$12 = o.a(var18, "mouseDragged event handler");
                  $$2.a($$12);
                  p $$13 = $$12.a("Mouse");
                  $$13.a("Scaled X", $$4);
                  $$13.a("Scaled Y", $$5);
                  throw new z($$12);
               }
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
      } else if (this.b.n.aE().a() && this.b.t.gH()) {
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
      if (this.b.n.U().c()) {
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
            if (!flh.a) {
               flf.a();
            }

            this.s = true;
            this.f = (double)(this.b.aO().m() / 2);
            this.g = (double)(this.b.aO().n() / 2);
            fen.a(this.b.aO().h(), 212995, this.f, this.g);
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
         fen.a(this.b.aO().h(), 212993, this.f, this.g);
      }
   }

   public void k() {
      this.j = true;
   }
}
