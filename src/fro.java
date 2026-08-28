import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fro extends fqs {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   private static final int y = 256;
   private static final int z = 256;
   public static final fro.a d = new fro.a(List.of());
   public static final alh s = alh.b("textures/gui/book.png");
   protected static final int u = 114;
   protected static final int v = 128;
   protected static final int w = 192;
   protected static final int x = 192;
   private fro.a A;
   private int B;
   private List<ayv> C = Collections.emptyList();
   private int D = -1;
   private xh E = xg.a;
   private fsp F;
   private fsp G;
   private final boolean H;

   public fro(fro.a $$0) {
      this($$0, true);
   }

   public fro() {
      this(d, false);
   }

   private fro(fro.a $$0, boolean $$1) {
      super(fir.a);
      this.A = $$0;
      this.H = $$1;
   }

   public void a(fro.a $$0) {
      this.A = $$0;
      this.B = azj.a(this.B, 0, $$0.a());
      this.K();
      this.D = -1;
   }

   public boolean a(int $$0) {
      int $$1 = azj.a($$0, 0, this.A.a() - 1);
      if ($$1 != this.B) {
         this.B = $$1;
         this.K();
         this.D = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void aS_() {
      this.m();
      this.D();
   }

   protected void m() {
      this.c(fkz.a(xg.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 200, 20).a());
   }

   protected void D() {
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.F = this.c(new fsp($$0 + 116, 159, true, $$0x -> this.G(), this.H));
      this.G = this.c(new fsp($$0 + 43, 159, false, $$0x -> this.F(), this.H));
      this.K();
   }

   private int E() {
      return this.A.a();
   }

   protected void F() {
      if (this.B > 0) {
         this.B--;
      }

      this.K();
   }

   protected void G() {
      if (this.B < this.E() - 1) {
         this.B++;
      }

      this.K();
   }

   private void K() {
      this.F.k = this.B < this.E() - 1;
      this.G.k = this.B > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.G.b();
               return true;
            case 267:
               this.F.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.D != this.B) {
         xm $$6 = this.A.a(this.B);
         this.C = this.p.c($$6, 114);
         this.E = xh.a("book.pageIndicator", this.B + 1, Math.max(this.E(), 1));
      }

      this.D = this.B;
      int $$7 = this.p.a(this.E);
      $$0.a(this.p, this.E, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.C.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         ayv $$10 = this.C.get($$9);
         $$0.a(this.p, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      ye $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.p, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(gig::B, s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         ye $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(ye $$0) {
      xf $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == xf.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == xf.a.c) {
            this.J();
         }

         return $$4;
      }
   }

   protected void J() {
      this.m.a(null);
   }

   @Nullable
   public ye b(double $$0, double $$1) {
      if (this.C.isEmpty()) {
         return null;
      } else {
         int $$2 = azj.a($$0 - (double)((this.n - 192) / 2) - 36.0);
         int $$3 = azj.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.C.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.C.size()) {
                  ayv $$6 = this.C.get($$5);
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

   public static record a(List<xh> a) {
      public int a() {
         return this.a.size();
      }

      public xm a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xm.b;
      }

      @Nullable
      public static fro.a a(cvx $$0) {
         boolean $$1 = fja.Q().aV();
         czd $$2 = $$0.a(kt.S);
         if ($$2 != null) {
            return new fro.a($$2.a($$1));
         } else {
            czc $$3 = $$0.a(kt.R);
            return $$3 != null ? new fro.a($$3.a($$1).map(xh::b).toList()) : null;
         }
      }

      public List<xh> b() {
         return this.a;
      }
   }
}
