import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fne extends flz {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final fne.a d = new fne.a(List.of());
   public static final akn r = new akn("textures/gui/book.png");
   protected static final int s = 114;
   protected static final int u = 128;
   protected static final int v = 192;
   protected static final int w = 192;
   private fne.a x;
   private int y;
   private List<axr> z = Collections.emptyList();
   private int A = -1;
   private wx B = ww.a;
   private fof C;
   private fof D;
   private final boolean E;

   public fne(fne.a $$0) {
      this($$0, true);
   }

   public fne() {
      this(d, false);
   }

   private fne(fne.a $$0, boolean $$1) {
      super(fdt.a);
      this.x = $$0;
      this.E = $$1;
   }

   public void a(fne.a $$0) {
      this.x = $$0;
      this.y = ayf.a(this.y, 0, $$0.a());
      this.J();
      this.A = -1;
   }

   public boolean a(int $$0) {
      int $$1 = ayf.a($$0, 0, this.x.a() - 1);
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
   protected void aN_() {
      this.m();
      this.C();
   }

   protected void m() {
      this.c(fga.a(ww.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 200, 20).a());
   }

   protected void C() {
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.C = this.c(new fof($$0 + 116, 159, true, $$0x -> this.F(), this.E));
      this.D = this.c(new fof($$0 + 43, 159, false, $$0x -> this.E(), this.E));
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
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.A != this.y) {
         xc $$6 = this.x.a(this.y);
         this.z = this.p.c($$6, 114);
         this.B = wx.a("book.pageIndicator", this.y + 1, Math.max(this.D(), 1));
      }

      this.A = this.y;
      int $$7 = this.p.a(this.B);
      $$0.a(this.p, this.B, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.z.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         axr $$10 = this.z.get($$9);
         $$0.a(this.p, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xu $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.p, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(r, (this.n - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         xu $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(xu $$0) {
      wv $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == wv.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == wv.a.c) {
            this.I();
         }

         return $$4;
      }
   }

   protected void I() {
      this.m.a(null);
   }

   @Nullable
   public xu b(double $$0, double $$1) {
      if (this.z.isEmpty()) {
         return null;
      } else {
         int $$2 = ayf.a($$0 - (double)((this.n - 192) / 2) - 36.0);
         int $$3 = ayf.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.z.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.z.size()) {
                  axr $$6 = this.z.get($$5);
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

   public static record a(List<wx> a) {
      public int a() {
         return this.a.size();
      }

      public xc a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xc.b;
      }

      @Nullable
      public static fne.a a(ctq $$0) {
         boolean $$1 = feb.Q().aS();
         cwz $$2 = $$0.a(kb.I);
         if ($$2 != null) {
            return new fne.a($$2.a($$1));
         } else {
            cwy $$3 = $$0.a(kb.H);
            return $$3 != null ? new fne.a($$3.a($$1).map(wx::b).toList()) : null;
         }
      }

      public List<wx> b() {
         return this.a;
      }
   }
}
