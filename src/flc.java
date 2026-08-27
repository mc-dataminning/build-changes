import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class flc extends fjx {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final flc.a d = new flc.a(List.of());
   public static final ajv o = new ajv("textures/gui/book.png");
   protected static final int p = 114;
   protected static final int q = 128;
   protected static final int r = 192;
   protected static final int s = 192;
   private flc.a u;
   private int v;
   private List<awy> w = Collections.emptyList();
   private int x = -1;
   private wi y = wh.a;
   private fmd z;
   private fmd A;
   private final boolean B;

   public flc(flc.a $$0) {
      this($$0, true);
   }

   public flc() {
      this(d, false);
   }

   private flc(flc.a $$0, boolean $$1) {
      super(fbq.a);
      this.u = $$0;
      this.B = $$1;
   }

   public void a(flc.a $$0) {
      this.u = $$0;
      this.v = axm.a(this.v, 0, $$0.a());
      this.J();
      this.x = -1;
   }

   public boolean a(int $$0) {
      int $$1 = axm.a($$0, 0, this.u.a() - 1);
      if ($$1 != this.v) {
         this.v = $$1;
         this.J();
         this.x = -1;
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
      this.c(fdy.a(wh.d, $$0 -> this.d()).a(this.k / 2 - 100, 196, 200, 20).a());
   }

   protected void C() {
      int $$0 = (this.k - 192) / 2;
      int $$1 = 2;
      this.z = this.c(new fmd($$0 + 116, 159, true, $$0x -> this.F(), this.B));
      this.A = this.c(new fmd($$0 + 43, 159, false, $$0x -> this.E(), this.B));
      this.J();
   }

   private int D() {
      return this.u.a();
   }

   protected void E() {
      if (this.v > 0) {
         this.v--;
      }

      this.J();
   }

   protected void F() {
      if (this.v < this.D() - 1) {
         this.v++;
      }

      this.J();
   }

   private void J() {
      this.z.k = this.v < this.D() - 1;
      this.A.k = this.v > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.A.b();
               return true;
            case 267:
               this.z.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.k - 192) / 2;
      int $$5 = 2;
      if (this.x != this.v) {
         wn $$6 = this.u.a(this.v);
         this.w = this.m.c($$6, 114);
         this.y = wi.a("book.pageIndicator", this.v + 1, Math.max(this.D(), 1));
      }

      this.x = this.v;
      int $$7 = this.m.a(this.y);
      $$0.a(this.m, this.y, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.w.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         awy $$10 = this.w.get($$9);
         $$0.a(this.m, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xf $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.m, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(o, (this.k - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         xf $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(xf $$0) {
      wg $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == wg.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == wg.a.c) {
            this.I();
         }

         return $$4;
      }
   }

   protected void I() {
      this.j.a(null);
   }

   @Nullable
   public xf b(double $$0, double $$1) {
      if (this.w.isEmpty()) {
         return null;
      } else {
         int $$2 = axm.a($$0 - (double)((this.k - 192) / 2) - 36.0);
         int $$3 = axm.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.w.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.w.size()) {
                  awy $$6 = this.w.get($$5);
                  return this.j.h.b().a($$6, $$2);
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

   public static record a(List<wi> a) {
      public int a() {
         return this.a.size();
      }

      public wn a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : wn.b;
      }

      @Nullable
      public static flc.a a(crs $$0) {
         boolean $$1 = fby.Q().aS();
         cuv $$2 = $$0.a(jr.A);
         if ($$2 != null) {
            return new flc.a($$2.a($$1));
         } else {
            cuu $$3 = $$0.a(jr.z);
            return $$3 != null ? new flc.a($$3.a($$1).map(wi::b).toList()) : null;
         }
      }

      public List<wi> b() {
         return this.a;
      }
   }
}
