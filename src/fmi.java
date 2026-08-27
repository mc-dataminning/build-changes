import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fmi extends fld {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final fmi.a d = new fmi.a(List.of());
   public static final akh r = new akh("textures/gui/book.png");
   protected static final int s = 114;
   protected static final int u = 128;
   protected static final int v = 192;
   protected static final int w = 192;
   private fmi.a x;
   private int y;
   private List<axl> z = Collections.emptyList();
   private int A = -1;
   private wu B = wt.a;
   private fnj C;
   private fnj D;
   private final boolean E;

   public fmi(fmi.a $$0) {
      this($$0, true);
   }

   public fmi() {
      this(d, false);
   }

   private fmi(fmi.a $$0, boolean $$1) {
      super(fcw.a);
      this.x = $$0;
      this.E = $$1;
   }

   public void a(fmi.a $$0) {
      this.x = $$0;
      this.y = axz.a(this.y, 0, $$0.a());
      this.J();
      this.A = -1;
   }

   public boolean a(int $$0) {
      int $$1 = axz.a($$0, 0, this.x.a() - 1);
      if ($$1 != this.y) {
         this.y = $$1;
         this.J();
         this.A = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void aM_() {
      this.m();
      this.C();
   }

   protected void m() {
      this.c(ffe.a(wt.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 200, 20).a());
   }

   protected void C() {
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.C = this.c(new fnj($$0 + 116, 159, true, $$0x -> this.F(), this.E));
      this.D = this.c(new fnj($$0 + 43, 159, false, $$0x -> this.E(), this.E));
      this.J();
   }

   private int D() {
      return this.x.a();
   }

   protected void E() {
      if (this.y > 0) {
         this.y--;
      }

      this.J();
   }

   protected void F() {
      if (this.y < this.D() - 1) {
         this.y++;
      }

      this.J();
   }

   private void J() {
      this.C.k = this.y < this.D() - 1;
      this.D.k = this.y > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.D.b();
               return true;
            case 267:
               this.C.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.A != this.y) {
         wz $$6 = this.x.a(this.y);
         this.z = this.p.c($$6, 114);
         this.B = wu.a("book.pageIndicator", this.y + 1, Math.max(this.D(), 1));
      }

      this.A = this.y;
      int $$7 = this.p.a(this.B);
      $$0.a(this.p, this.B, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.z.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         axl $$10 = this.z.get($$9);
         $$0.a(this.p, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xr $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.p, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(r, (this.n - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         xr $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(xr $$0) {
      ws $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == ws.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == ws.a.c) {
            this.I();
         }

         return $$4;
      }
   }

   protected void I() {
      this.m.a(null);
   }

   @Nullable
   public xr b(double $$0, double $$1) {
      if (this.z.isEmpty()) {
         return null;
      } else {
         int $$2 = axz.a($$0 - (double)((this.n - 192) / 2) - 36.0);
         int $$3 = axz.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.z.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.z.size()) {
                  axl $$6 = this.z.get($$5);
                  return this.m.h.b().a($$6, $$2);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public static record a(List<wu> a) {
      public int a() {
         return this.a.size();
      }

      public wz a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : wz.b;
      }

      @Nullable
      public static fmi.a a(csz $$0) {
         boolean $$1 = fde.Q().aT();
         cwg $$2 = $$0.a(ka.H);
         if ($$2 != null) {
            return new fmi.a($$2.a($$1));
         } else {
            cwf $$3 = $$0.a(ka.G);
            return $$3 != null ? new fmi.a($$3.a($$1).map(wu::b).toList()) : null;
         }
      }

      public List<wu> b() {
         return this.a;
      }
   }
}
