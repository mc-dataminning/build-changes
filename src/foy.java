import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class foy extends fob {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final foy.a r = new foy.a(List.of());
   public static final akr s = akr.b("textures/gui/book.png");
   protected static final int u = 114;
   protected static final int v = 128;
   protected static final int w = 192;
   protected static final int x = 192;
   private foy.a y;
   private int z;
   private List<aya> A = Collections.emptyList();
   private int B = -1;
   private wz C = wy.a;
   private fpz D;
   private fpz E;
   private final boolean F;

   public foy(foy.a $$0) {
      this($$0, true);
   }

   public foy() {
      this(r, false);
   }

   private foy(foy.a $$0, boolean $$1) {
      super(fge.a);
      this.y = $$0;
      this.F = $$1;
   }

   public void a(foy.a $$0) {
      this.y = $$0;
      this.z = ayo.a(this.z, 0, $$0.a());
      this.J();
      this.B = -1;
   }

   public boolean a(int $$0) {
      int $$1 = ayo.a($$0, 0, this.y.a() - 1);
      if ($$1 != this.z) {
         this.z = $$1;
         this.J();
         this.B = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void aT_() {
      this.m();
      this.C();
   }

   protected void m() {
      this.c(fik.a(wy.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 200, 20).a());
   }

   protected void C() {
      int $$0 = (this.m - 192) / 2;
      int $$1 = 2;
      this.D = this.c(new fpz($$0 + 116, 159, true, $$0x -> this.F(), this.F));
      this.E = this.c(new fpz($$0 + 43, 159, false, $$0x -> this.E(), this.F));
      this.J();
   }

   private int D() {
      return this.y.a();
   }

   protected void E() {
      if (this.z > 0) {
         this.z--;
      }

      this.J();
   }

   protected void F() {
      if (this.z < this.D() - 1) {
         this.z++;
      }

      this.J();
   }

   private void J() {
      this.D.k = this.z < this.D() - 1;
      this.E.k = this.z > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.E.b();
               return true;
            case 267:
               this.D.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 192) / 2;
      int $$5 = 2;
      if (this.B != this.z) {
         xe $$6 = this.y.a(this.z);
         this.A = this.o.c($$6, 114);
         this.C = wz.a("book.pageIndicator", this.z + 1, Math.max(this.D(), 1));
      }

      this.B = this.z;
      int $$7 = this.o.a(this.C);
      $$0.a(this.o, this.C, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.A.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         aya $$10 = this.A.get($$9);
         $$0.a(this.o, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xw $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.o, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(s, (this.m - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         xw $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(xw $$0) {
      wx $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == wx.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == wx.a.c) {
            this.G();
         }

         return $$4;
      }
   }

   protected void G() {
      this.l.a(null);
   }

   @Nullable
   public xw b(double $$0, double $$1) {
      if (this.A.isEmpty()) {
         return null;
      } else {
         int $$2 = ayo.a($$0 - (double)((this.m - 192) / 2) - 36.0);
         int $$3 = ayo.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.A.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.A.size()) {
                  aya $$6 = this.A.get($$5);
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

   public static record a(List<wz> a) {
      public int a() {
         return this.a.size();
      }

      public xe a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xe.b;
      }

      @Nullable
      public static foy.a a(cuq $$0) {
         boolean $$1 = fgm.Q().aQ();
         cyb $$2 = $$0.a(kq.J);
         if ($$2 != null) {
            return new foy.a($$2.a($$1));
         } else {
            cya $$3 = $$0.a(kq.I);
            return $$3 != null ? new foy.a($$3.a($$1).map(wz::b).toList()) : null;
         }
      }

      public List<wz> b() {
         return this.a;
      }
   }
}
