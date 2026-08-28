import com.mojang.logging.LogUtils;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.joml.Vector2i;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;

public class fqr {
   private static final Logger a = LogUtils.getLogger();
   private final fqq b;
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
   private final bas m = new bas();
   private final bas n = new bas();
   private double o;
   private double p;
   private final fqz q;
   private double r = Double.MIN_VALUE;
   private boolean s;

   public fqr(fqq $$0) {
      this.b = $$0;
      this.q = new fqz();
   }

   private void a(long $$0, int $$1, int $$2, int $$3) {
      fki $$4 = this.b.aO();
      if ($$0 == $$4.h()) {
         this.b.aP().d();
         if (this.b.z != null) {
            this.b.a(fqn.b);
         }

         boolean $$5 = $$2 == 1;
         if (fqq.a && $$1 == 0) {
            if ($$5) {
               if (($$3 & 2) == 2) {
                  $$1 = 1;
                  this.h++;
               }
            } else if (this.h > 0) {
               $$1 = 1;
               this.h--;
            }
         }

         int $$6 = $$1;
         if ($$5) {
            if (this.b.n.ac().c() && this.k++ > 0) {
               return;
            }

            this.i = $$1;
            this.l = fib.b();
         } else if (this.i != -1) {
            if (this.b.n.ac().c() && --this.k > 0) {
               return;
            }

            this.i = -1;
         }

         if (this.b.aM() == null) {
            if (this.b.z == null) {
               if (!this.s && $$5) {
                  this.i();
               }
            } else {
               double $$7 = this.a($$4);
               double $$8 = this.b($$4);
               fzq $$9 = this.b.z;
               if ($$5) {
                  $$9.w();

                  try {
                     if ($$9.a($$7, $$8, $$6)) {
                        return;
                     }
                  } catch (Throwable var18) {
                     p $$11 = p.a(var18, "mouseClicked event handler");
                     $$9.a($$11);
                     q $$12 = $$11.a("Mouse");
                     this.a($$12, $$4);
                     $$12.a("Button", $$1);
                     throw new aa($$11);
                  }
               } else {
                  try {
                     if ($$9.b($$7, $$8, $$6)) {
                        return;
                     }
                  } catch (Throwable var17) {
                     p $$14 = p.a(var17, "mouseReleased event handler");
                     $$9.a($$14);
                     q $$15 = $$14.a("Mouse");
                     this.a($$15, $$4);
                     $$15.a("Button", $$1);
                     throw new aa($$14);
                  }
               }
            }
         }

         if (this.b.z == null && this.b.aM() == null) {
            if ($$1 == 0) {
               this.c = $$5;
            } else if ($$1 == 2) {
               this.d = $$5;
            } else if ($$1 == 1) {
               this.e = $$5;
            }

            fqo.a(fka.b.c.a($$1), $$5);
            if ($$5) {
               if (this.b.t.ak() && $$1 == 2) {
                  this.b.m.g().b();
               } else {
                  fqo.a(fka.b.c.a($$1));
               }
            }
         }
      }
   }

   public void a(q $$0, fki $$1) {
      $$0.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%f, %f). Absolute: (%f, %f)", a($$1, this.f), b($$1, this.g), this.f, this.g));
      $$0.a(
         "Screen size",
         () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f", $$1.o(), $$1.p(), $$1.k(), $$1.l(), $$1.s())
      );
   }

   private void a(long $$0, double $$1, double $$2) {
      if ($$0 == fqq.Q().aO().h()) {
         this.b.aP().d();
         boolean $$3 = this.b.n.V().c();
         double $$4 = this.b.n.H().c();
         double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
         double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
         if (this.b.aM() == null) {
            if (this.b.z != null) {
               double $$7 = this.a(this.b.aO());
               double $$8 = this.b(this.b.aO());
               this.b.z.a($$7, $$8, $$5, $$6);
               this.b.z.w();
            } else if (this.b.t != null) {
               Vector2i $$9 = this.q.a($$5, $$6);
               if ($$9.x == 0 && $$9.y == 0) {
                  return;
               }

               int $$10 = $$9.y == 0 ? -$$9.x : $$9.y;
               if (this.b.t.ak()) {
                  if (this.b.m.g().a()) {
                     this.b.m.g().b(-$$10);
                  } else {
                     float $$11 = azz.a(this.b.t.gk().a() + (float)$$9.y * 0.005F, 0.0F, 0.2F);
                     this.b.t.gk().a($$11);
                  }
               } else {
                  csh $$12 = this.b.t.gj();
                  $$12.c(fqz.a((double)$$10, $$12.f(), csh.h()));
               }
            }
         }
      }
   }

   private void a(long $$0, List<Path> $$1, int $$2) {
      this.b.aP().d();
      if (this.b.z != null) {
         this.b.z.a($$1);
      }

      if ($$2 > 0) {
         fwh.a(this.b, $$2);
      }
   }

   public void a(long $$0) {
      fka.a(
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
      if ($$0 == fqq.Q().aO().h()) {
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
      double $$0 = fib.b();
      double $$1 = $$0 - this.r;
      this.r = $$0;
      if (this.b.aC()) {
         fzq $$2 = this.b.z;
         boolean $$3 = this.o != 0.0 || this.p != 0.0;
         if ($$3) {
            this.b.aP().d();
         }

         if ($$2 != null && this.b.aM() == null && $$3) {
            fki $$4 = this.b.aO();
            double $$5 = this.a($$4);
            double $$6 = this.b($$4);

            try {
               $$2.f($$5, $$6);
            } catch (Throwable var20) {
               p $$8 = p.a(var20, "mouseMoved event handler");
               $$2.a($$8);
               q $$9 = $$8.a("Mouse");
               this.a($$9, $$4);
               throw new aa($$8);
            }

            if (this.i != -1 && this.l > 0.0) {
               double $$10 = a($$4, this.o);
               double $$11 = b($$4, this.p);

               try {
                  $$2.a($$5, $$6, this.i, $$10, $$11);
               } catch (Throwable var19) {
                  p $$13 = p.a(var19, "mouseDragged event handler");
                  $$2.a($$13);
                  q $$14 = $$13.a("Mouse");
                  this.a($$14, $$4);
                  throw new aa($$13);
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

   public static double a(fki $$0, double $$1) {
      return $$1 * (double)$$0.o() / (double)$$0.m();
   }

   public double a(fki $$0) {
      return a($$0, this.f);
   }

   public static double b(fki $$0, double $$1) {
      return $$1 * (double)$$0.p() / (double)$$0.n();
   }

   public double b(fki $$0) {
      return b($$0, this.g);
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
      } else if (this.b.n.aE().a() && this.b.t.gI()) {
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
            if (!fqq.a) {
               fqo.a();
            }

            this.s = true;
            this.f = (double)(this.b.aO().m() / 2);
            this.g = (double)(this.b.aO().n() / 2);
            fka.a(this.b.aO().h(), 212995, this.f, this.g);
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
         fka.a(this.b.aO().h(), 212993, this.f, this.g);
      }
   }

   public void k() {
      this.j = true;
   }

   public void a(fti $$0, ftk $$1) {
      fki $$2 = this.b.aO();
      double $$3 = this.a($$2);
      double $$4 = this.b($$2) - 8.0;
      String $$5 = String.format(Locale.ROOT, "%.0f,%.0f", $$3, $$4);
      $$1.b($$0, $$5, (int)$$3, (int)$$4, -1);
   }
}
