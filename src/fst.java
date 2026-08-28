import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fst extends frw {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   private static final int y = 256;
   private static final int z = 256;
   public static final fst.a d = new fst.a(List.of());
   public static final alj s = alj.b("textures/gui/book.png");
   protected static final int u = 114;
   protected static final int v = 128;
   protected static final int w = 192;
   protected static final int x = 192;
   private fst.a A;
   private int B;
   private List<ayy> C = Collections.emptyList();
   private int D = -1;
   private xj E = xi.a;
   private ftu F;
   private ftu G;
   private final boolean H;

   public fst(fst.a $$0) {
      this($$0, true);
   }

   public fst() {
      this(d, false);
   }

   private fst(fst.a $$0, boolean $$1) {
      super(fjv.a);
      this.A = $$0;
      this.H = $$1;
   }

   public void a(fst.a $$0) {
      this.A = $$0;
      this.B = azm.a(this.B, 0, $$0.a());
      this.M();
      this.D = -1;
   }

   public boolean a(int $$0) {
      int $$1 = azm.a($$0, 0, this.A.a() - 1);
      if ($$1 != this.B) {
         this.B = $$1;
         this.M();
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
   protected void aR_() {
      this.m();
      this.F();
   }

   protected void m() {
      this.c(fmd.a(xi.d, $$0 -> this.aO_()).a(this.n / 2 - 100, 196, 200, 20).a());
   }

   protected void F() {
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.F = this.c(new ftu($$0 + 116, 159, true, $$0x -> this.K(), this.H));
      this.G = this.c(new ftu($$0 + 43, 159, false, $$0x -> this.J(), this.H));
      this.M();
   }

   private int G() {
      return this.A.a();
   }

   protected void J() {
      if (this.B > 0) {
         this.B--;
      }

      this.M();
   }

   protected void K() {
      if (this.B < this.G() - 1) {
         this.B++;
      }

      this.M();
   }

   private void M() {
      this.F.k = this.B < this.G() - 1;
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
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.D != this.B) {
         xo $$6 = this.A.a(this.B);
         this.C = this.p.c($$6, 114);
         this.E = xj.a("book.pageIndicator", this.B + 1, Math.max(this.G(), 1));
      }

      this.D = this.B;
      int $$7 = this.p.a(this.E);
      $$0.a(this.p, this.E, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.C.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         ayy $$10 = this.C.get($$9);
         $$0.a(this.p, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      yg $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.p, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(gjq::B, s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         yg $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(yg $$0) {
      xh $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == xh.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == xh.a.c) {
            this.L();
         }

         return $$4;
      }
   }

   protected void L() {
      this.m.a(null);
   }

   @Nullable
   public yg b(double $$0, double $$1) {
      if (this.C.isEmpty()) {
         return null;
      } else {
         int $$2 = azm.a($$0 - (double)((this.n - 192) / 2) - 36.0);
         int $$3 = azm.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.C.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.C.size()) {
                  ayy $$6 = this.C.get($$5);
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

   public static record a(List<xj> a) {
      public int a() {
         return this.a.size();
      }

      public xo a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xo.b;
      }

      @Nullable
      public static fst.a a(cwm $$0) {
         boolean $$1 = fke.Q().aU();
         czu $$2 = $$0.a(ku.T);
         if ($$2 != null) {
            return new fst.a($$2.a($$1));
         } else {
            czt $$3 = $$0.a(ku.S);
            return $$3 != null ? new fst.a($$3.a($$1).map(xj::b).toList()) : null;
         }
      }

      public List<xj> b() {
         return this.a;
      }
   }
}
