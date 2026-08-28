import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxj extends bwv {
   protected static final akn<Integer> a = akr.a(bxj.class, akp.b);
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private static final short g = 5;
   private static final short h = 0;
   private static final short i = 0;
   private static final int j = 1;
   private int k = 0;
   private int l = 5;
   private int m = 1;
   @Nullable
   private crz n;
   private final bxr o = new bxr(this);

   public bxj(djz $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bxe.W, $$0);
      this.a_($$1, $$2, $$3);
      if (!this.dV().C) {
         this.w((float)(this.ae.j() * 360.0));
         this.n((this.ae.j() * 0.2F - 0.1F) * 2.0, this.ae.j() * 0.2 * 2.0, (this.ae.j() * 0.2F - 0.1F) * 2.0);
      }

      this.c($$4);
   }

   public bxj(bxe<? extends bxj> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.a;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(a, 0);
   }

   @Override
   protected double bc() {
      return 0.03;
   }

   @Override
   public void h() {
      this.o.e();
      if (this.ak && this.dV().C) {
         this.ak = false;
      } else {
         super.h();
         boolean $$0 = !this.dV().b(this.cR());
         if (this.a(axl.a)) {
            this.n();
         } else if (!$$0) {
            this.be();
         }

         if (this.dV().b_(this.dv()).a(axl.b)) {
            this.n((double)((this.ae.i() - this.ae.i()) * 0.2F), 0.2F, (double)((this.ae.i() - this.ae.i()) * 0.2F));
         }

         if (this.af % 20 == 1) {
            this.m();
         }

         this.j();
         if (this.n == null && !this.dV().C && $$0) {
            this.l(this.dA(), (this.cR().b + this.cR().e) / 2.0, this.dG());
            this.ar = true;
         }

         double $$1 = this.dy().e;
         this.a(bya.a, this.dy());
         this.aI();
         float $$2 = 0.98F;
         if (this.aH()) {
            $$2 = this.dV().a_(this.aP()).b().g() * 0.98F;
         }

         this.i(this.dy().c((double)$$2));
         if (this.R && $$1 < -this.bd()) {
            this.i(new ffs(this.dy().d, -$$1 * 0.4, this.dy().f));
         }

         this.k++;
         if (this.k >= 6000) {
            this.aq();
         }
      }
   }

   private void j() {
      if (this.n == null || this.n.g(this) > 64.0) {
         crz $$0 = this.dV().a(this, 8.0);
         if ($$0 != null && !$$0.Z_() && !$$0.eH()) {
            this.n = $$0;
         } else {
            this.n = null;
         }
      }

      if (this.n != null) {
         ffs $$1 = new ffs(this.n.dA() - this.dA(), this.n.dC() + (double)this.n.cS() / 2.0 - this.dC(), this.n.dG() - this.dG());
         double $$2 = $$1.h();
         double $$3 = 1.0 - Math.sqrt($$2) / 8.0;
         this.i(this.dy().e($$1.d().c($$3 * $$3 * 0.1)));
      }
   }

   @Override
   public iw aP() {
      return this.f(0.999999F);
   }

   private void m() {
      if (this.dV() instanceof aru) {
         for (bxj $$1 : this.dV().a(efs.a(bxj.class), this.cR().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(aru $$0, ffs $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bxj($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(aru $$0, ffs $$1, int $$2) {
      ffn $$3 = ffn.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.G_().a(40);
      List<bxj> $$5 = $$0.a(efs.a(bxj.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bxj $$6 = $$5.get(0);
         $$6.m++;
         $$6.k = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bxj $$0) {
      return $$0 != this && a($$0, this.ao(), this.f());
   }

   private static boolean a(bxj $$0, int $$1, int $$2) {
      return !$$0.dQ() && ($$0.ao() - $$1) % 40 == 0 && $$0.f() == $$2;
   }

   private void b(bxj $$0) {
      this.m = this.m + $$0.m;
      this.k = Math.min(this.k, $$0.k);
      $$0.aq();
   }

   private void n() {
      ffs $$0 = this.dy();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bq() {
   }

   @Override
   public final boolean b(bvk $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else {
         this.bB();
         this.l = (int)((float)this.l - $$2);
         if (this.l <= 0) {
            this.aq();
         }

         return true;
      }
   }

   @Override
   public void b(ua $$0) {
      $$0.a("Health", (short)this.l);
      $$0.a("Age", (short)this.k);
      $$0.a("Value", (short)this.f());
      $$0.a("Count", this.m);
   }

   @Override
   public void a(ua $$0) {
      this.l = $$0.b("Health", (short)5);
      this.k = $$0.b("Age", (short)0);
      this.c($$0.b("Value", (short)0));
      this.m = $$0.<Integer>a("Count", ayy.m).orElse(1);
   }

   @Override
   public void a_(crz $$0) {
      if ($$0 instanceof arv $$1) {
         if ($$0.bX == 0) {
            $$0.bX = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.f());
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.m--;
            if (this.m == 0) {
               this.aq();
            }
         }
      }
   }

   private int a(arv $$0, int $$1) {
      Optional<dgm> $$2 = dgp.a(dgo.z, $$0, daa::n);
      if ($$2.isPresent()) {
         daa $$3 = $$2.get().a();
         int $$4 = dgp.c($$0.y(), $$3, $$1);
         int $$5 = Math.min($$4, $$3.o());
         $$3.b($$3.o() - $$5);
         if ($$5 > 0) {
            int $$6 = $$1 - $$5 * $$1 / $$4;
            if ($$6 > 0) {
               return this.a($$0, $$6);
            }
         }

         return 0;
      } else {
         return $$1;
      }
   }

   public int f() {
      return this.al.a(a);
   }

   private void c(int $$0) {
      this.al.a(a, $$0);
   }

   public int g() {
      int $$0 = this.f();
      if ($$0 >= 2477) {
         return 10;
      } else if ($$0 >= 1237) {
         return 9;
      } else if ($$0 >= 617) {
         return 8;
      } else if ($$0 >= 307) {
         return 7;
      } else if ($$0 >= 149) {
         return 6;
      } else if ($$0 >= 73) {
         return 5;
      } else if ($$0 >= 37) {
         return 4;
      } else if ($$0 >= 17) {
         return 3;
      } else if ($$0 >= 7) {
         return 2;
      } else {
         return $$0 >= 3 ? 1 : 0;
      }
   }

   public static int b(int $$0) {
      if ($$0 >= 2477) {
         return 2477;
      } else if ($$0 >= 1237) {
         return 1237;
      } else if ($$0 >= 617) {
         return 617;
      } else if ($$0 >= 307) {
         return 307;
      } else if ($$0 >= 149) {
         return 149;
      } else if ($$0 >= 73) {
         return 73;
      } else if ($$0 >= 37) {
         return 37;
      } else if ($$0 >= 17) {
         return 17;
      } else if ($$0 >= 7) {
         return 7;
      } else {
         return $$0 >= 3 ? 3 : 1;
      }
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public aws dm() {
      return aws.i;
   }

   @Override
   public bxr R_() {
      return this.o;
   }
}
