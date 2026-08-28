import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fnz extends fnd {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final fnz.a q = new fnz.a(List.of());
   public static final akk r = new akk("textures/gui/book.png");
   protected static final int s = 114;
   protected static final int u = 128;
   protected static final int v = 192;
   protected static final int w = 192;
   private fnz.a x;
   private int y;
   private List<axq> z = Collections.emptyList();
   private int A = -1;
   private wu B = wt.a;
   private fpb C;
   private fpb D;
   private final boolean E;

   public fnz(fnz.a $$0) {
      this($$0, true);
   }

   public fnz() {
      this(q, false);
   }

   private fnz(fnz.a $$0, boolean $$1) {
      super(fff.a);
      this.x = $$0;
      this.E = $$1;
   }

   public void a(fnz.a $$0) {
      this.x = $$0;
      this.y = aye.a(this.y, 0, $$0.a());
      this.L();
      this.A = -1;
   }

   public boolean a(int $$0) {
      int $$1 = aye.a($$0, 0, this.x.a() - 1);
      if ($$1 != this.y) {
         this.y = $$1;
         this.L();
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
   protected void aO_() {
      this.m();
      this.E();
   }

   protected void m() {
      this.c(fhm.a(wt.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 200, 20).a());
   }

   protected void E() {
      int $$0 = (this.m - 192) / 2;
      int $$1 = 2;
      this.C = this.c(new fpb($$0 + 116, 159, true, $$0x -> this.J(), this.E));
      this.D = this.c(new fpb($$0 + 43, 159, false, $$0x -> this.G(), this.E));
      this.L();
   }

   private int F() {
      return this.x.a();
   }

   protected void G() {
      if (this.y > 0) {
         this.y--;
      }

      this.L();
   }

   protected void J() {
      if (this.y < this.F() - 1) {
         this.y++;
      }

      this.L();
   }

   private void L() {
      this.C.k = this.y < this.F() - 1;
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 192) / 2;
      int $$5 = 2;
      if (this.A != this.y) {
         wz $$6 = this.x.a(this.y);
         this.z = this.o.c($$6, 114);
         this.B = wu.a("book.pageIndicator", this.y + 1, Math.max(this.F(), 1));
      }

      this.A = this.y;
      int $$7 = this.o.a(this.B);
      $$0.a(this.o, this.B, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.z.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         axq $$10 = this.z.get($$9);
         $$0.a(this.o, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xr $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.o, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(r, (this.m - 192) / 2, 2, 0, 0, 192, 192);
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
            this.K();
         }

         return $$4;
      }
   }

   protected void K() {
      this.l.a(null);
   }

   @Nullable
   public xr b(double $$0, double $$1) {
      if (this.z.isEmpty()) {
         return null;
      } else {
         int $$2 = aye.a($$0 - (double)((this.m - 192) / 2) - 36.0);
         int $$3 = aye.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.z.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.z.size()) {
                  axq $$6 = this.z.get($$5);
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

   public static record a(List<wu> a) {
      public int a() {
         return this.a.size();
      }

      public wz a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : wz.b;
      }

      @Nullable
      public static fnz.a a(cua $$0) {
         boolean $$1 = ffn.Q().aS();
         cxi $$2 = $$0.a(kn.J);
         if ($$2 != null) {
            return new fnz.a($$2.a($$1));
         } else {
            cxh $$3 = $$0.a(kn.I);
            return $$3 != null ? new fnz.a($$3.a($$1).map(wu::b).toList()) : null;
         }
      }

      public List<wu> b() {
         return this.a;
      }
   }
}
