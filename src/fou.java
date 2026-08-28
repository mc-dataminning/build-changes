import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fou extends fnx {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final fou.a q = new fou.a(List.of());
   public static final akq r = akq.b("textures/gui/book.png");
   protected static final int s = 114;
   protected static final int u = 128;
   protected static final int v = 192;
   protected static final int w = 192;
   private fou.a x;
   private int y;
   private List<axz> z = Collections.emptyList();
   private int A = -1;
   private wy B = wx.a;
   private fpv C;
   private fpv D;
   private final boolean E;

   public fou(fou.a $$0) {
      this($$0, true);
   }

   public fou() {
      this(q, false);
   }

   private fou(fou.a $$0, boolean $$1) {
      super(fga.a);
      this.x = $$0;
      this.E = $$1;
   }

   public void a(fou.a $$0) {
      this.x = $$0;
      this.y = ayn.a(this.y, 0, $$0.a());
      this.K();
      this.A = -1;
   }

   public boolean a(int $$0) {
      int $$1 = ayn.a($$0, 0, this.x.a() - 1);
      if ($$1 != this.y) {
         this.y = $$1;
         this.K();
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
   protected void aP_() {
      this.m();
      this.D();
   }

   protected void m() {
      this.c(fig.a(wx.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 200, 20).a());
   }

   protected void D() {
      int $$0 = (this.m - 192) / 2;
      int $$1 = 2;
      this.C = this.c(new fpv($$0 + 116, 159, true, $$0x -> this.G(), this.E));
      this.D = this.c(new fpv($$0 + 43, 159, false, $$0x -> this.F(), this.E));
      this.K();
   }

   private int E() {
      return this.x.a();
   }

   protected void F() {
      if (this.y > 0) {
         this.y--;
      }

      this.K();
   }

   protected void G() {
      if (this.y < this.E() - 1) {
         this.y++;
      }

      this.K();
   }

   private void K() {
      this.C.k = this.y < this.E() - 1;
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
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 192) / 2;
      int $$5 = 2;
      if (this.A != this.y) {
         xd $$6 = this.x.a(this.y);
         this.z = this.o.c($$6, 114);
         this.B = wy.a("book.pageIndicator", this.y + 1, Math.max(this.E(), 1));
      }

      this.A = this.y;
      int $$7 = this.o.a(this.B);
      $$0.a(this.o, this.B, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.z.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         axz $$10 = this.z.get($$9);
         $$0.a(this.o, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xv $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.o, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(r, (this.m - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         xv $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(xv $$0) {
      ww $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == ww.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == ww.a.c) {
            this.J();
         }

         return $$4;
      }
   }

   protected void J() {
      this.l.a(null);
   }

   @Nullable
   public xv b(double $$0, double $$1) {
      if (this.z.isEmpty()) {
         return null;
      } else {
         int $$2 = ayn.a($$0 - (double)((this.m - 192) / 2) - 36.0);
         int $$3 = ayn.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.z.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.z.size()) {
                  axz $$6 = this.z.get($$5);
                  return this.l.h.b().a($$6, $$2);
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

   public static record a(List<wy> a) {
      public int a() {
         return this.a.size();
      }

      public xd a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xd.b;
      }

      @Nullable
      public static fou.a a(cuo $$0) {
         boolean $$1 = fgi.Q().aQ();
         cxz $$2 = $$0.a(kq.J);
         if ($$2 != null) {
            return new fou.a($$2.a($$1));
         } else {
            cxy $$3 = $$0.a(kq.I);
            return $$3 != null ? new fou.a($$3.a($$1).map(wy::b).toList()) : null;
         }
      }

      public List<wy> b() {
         return this.a;
      }
   }
}
