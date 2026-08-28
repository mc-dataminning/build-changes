import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjc extends bsp implements buj {
   private static final akg<cuk> d = akk.a(cjc.class, aki.h);
   private static final float e = 0.1F;
   public static final float b = 0.2125F;
   private static final int f = 6000;
   private static final int g = 32767;
   private static final int h = -32768;
   private int i;
   private int j;
   private int k = 5;
   @Nullable
   private UUID l;
   @Nullable
   private bsp m;
   @Nullable
   private UUID n;
   public final float c;

   public cjc(bsv<? extends cjc> $$0, dbt $$1) {
      super($$0, $$1);
      this.c = this.ah.i() * (float) Math.PI * 2.0F;
      this.r(this.ah.i() * 360.0F);
   }

   public cjc(dbt $$0, double $$1, double $$2, double $$3, cuk $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cjc(dbt $$0, double $$1, double $$2, double $$3, cuk $$4, double $$5, double $$6, double $$7) {
      this(bsv.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cjc(cjc $$0) {
      super($$0.ak(), $$0.dP());
      this.a($$0.p().s());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bc() {
      return this.p().a(awu.bb);
   }

   @Nullable
   @Override
   public bsp s() {
      if (this.m != null && !this.m.dK()) {
         return this.m;
      } else if (this.l != null && this.dP() instanceof arb $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bsp $$0) {
      super.w($$0);
      if ($$0 instanceof cjc $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(d, cuk.l);
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.p().e()) {
         this.ao();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.du();
         this.M = this.dw();
         this.N = this.dA();
         evm $$0 = this.ds();
         if (this.be() && this.b(awr.a) > 0.1F) {
            this.D();
         } else if (this.bs() && this.b(awr.b) > 0.1F) {
            this.E();
         } else {
            this.ba();
         }

         if (this.dP().B) {
            this.ag = false;
         } else {
            this.ag = !this.dP().a(this, this.cK().h(1.0E-7));
            if (this.ag) {
               this.m(this.du(), (this.cK().b + this.cK().e) / 2.0, this.dA());
            }
         }

         if (!this.aE() || this.ds().i() > 1.0E-5F || (this.ai + this.al()) % 4 == 0) {
            this.a(btp.a, this.ds());
            float $$1 = 0.98F;
            if (this.aE()) {
               $$1 = this.dP().a_(this.aK()).b().h() * 0.98F;
            }

            this.h(this.ds().d((double)$$1, 0.98, (double)$$1));
            if (this.aE()) {
               evm $$2 = this.ds();
               if ($$2.d < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = ayu.a(this.L) != ayu.a(this.du()) || ayu.a(this.M) != ayu.a(this.dw()) || ayu.a(this.N) != ayu.a(this.dA());
         int $$4 = $$3 ? 2 : 40;
         if (this.ai % $$4 == 0 && !this.dP().B && this.H()) {
            this.G();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.av = this.av | this.bl();
         if (!this.dP().B) {
            double $$5 = this.ds().d($$0).g();
            if ($$5 > 0.01) {
               this.av = true;
            }
         }

         if (!this.dP().B && this.i >= 6000) {
            this.ao();
         }
      }
   }

   @Override
   protected iz aK() {
      return this.d(0.999999F);
   }

   private void D() {
      evm $$0 = this.ds();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      evm $$0 = this.ds();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (cjc $$1 : this.dP().a(cjc.class, this.cK().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dK()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      cuk $$0 = this.p();
      return this.bD() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.I() < $$0.j();
   }

   private void a(cjc $$0) {
      cuk $$1 = this.p();
      cuk $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.I() < $$1.I()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cuk $$0, cuk $$1) {
      return $$1.I() + $$0.I() > $$1.j() ? false : cuk.c($$0, $$1);
   }

   public static cuk a(cuk $$0, cuk $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.j(), $$2) - $$0.I(), $$1.I());
      cuk $$4 = $$0.c($$0.I() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cjc $$0, cuk $$1, cuk $$2) {
      cuk $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cjc $$0, cuk $$1, cjc $$2, cuk $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.e()) {
         $$2.ao();
      }
   }

   @Override
   public boolean bd() {
      return this.p().b(km.v) || super.bd();
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().e() && this.p().a(cun.us) && $$0.a(awn.m)) {
         return false;
      } else if (!this.p().a($$0)) {
         return false;
      } else if (this.dP().B) {
         return true;
      } else {
         this.bv();
         this.k = (int)((float)this.k - $$1);
         this.a(dwq.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.ao();
         }

         return true;
      }
   }

   @Override
   public void b(ur $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.p().e()) {
         $$0.a("Item", this.p().a(this.dR()));
      }
   }

   @Override
   public void a(ur $$0) {
      this.k = $$0.g("Health");
      this.i = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.j = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.n = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.l = $$0.a("Thrower");
         this.m = null;
      }

      if ($$0.b("Item", 10)) {
         ur $$1 = $$0.p("Item");
         this.a(cuk.a(this.dR(), (vo)$$1).orElse(cuk.l));
      } else {
         this.a(cuk.l);
      }

      if (this.p().e()) {
         this.ao();
      }
   }

   @Override
   public void b_(cms $$0) {
      if (!this.dP().B) {
         cuk $$1 = this.p();
         cuf $$2 = $$1.g();
         int $$3 = $$1.I();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cz())) && $$0.gc().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.e()) {
               this.ao();
               $$1.e($$3);
            }

            $$0.a(awg.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xl af() {
      xl $$0 = this.ah();
      return (xl)($$0 != null ? $$0 : xl.c(this.p().t()));
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Nullable
   @Override
   public bsp b(arb $$0) {
      bsp $$1 = super.b($$0);
      if (!this.dP().B && $$1 instanceof cjc) {
         ((cjc)$$1).G();
      }

      return $$1;
   }

   public cuk p() {
      return this.ap().a(d);
   }

   public void a(cuk $$0) {
      this.ap().a(d, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bsp)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bsp $$0) {
      this.l = $$0.cz();
      this.m = $$0;
   }

   public int u() {
      return this.i;
   }

   @Override
   public void v() {
      this.j = 10;
   }

   public void w() {
      this.j = 0;
   }

   public void x() {
      this.j = 32767;
   }

   public void b(int $$0) {
      this.j = $$0;
   }

   public boolean y() {
      return this.j > 0;
   }

   @Override
   public void z() {
      this.i = -32768;
   }

   @Override
   public void A() {
      this.i = -6000;
   }

   public void B() {
      this.x();
      this.i = 5999;
   }

   public float a(float $$0) {
      return ((float)this.u() + $$0) / 20.0F + this.c;
   }

   public cjc C() {
      return new cjc(this);
   }

   @Override
   public avx de() {
      return avx.i;
   }

   @Override
   public float dG() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public buc a_(int $$0) {
      return $$0 == 0 ? buc.a(this::p, this::a) : super.a_($$0);
   }
}
