import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cbt extends blu implements bnh {
   private static final agm<cmx> c = agp.a(cbt.class, ago.h);
   private static final int d = 6000;
   private static final int e = 32767;
   private static final int f = -32768;
   private int g;
   private int h;
   private int i = 5;
   @Nullable
   private UUID j;
   @Nullable
   private blu k;
   @Nullable
   private UUID l;
   public final float b;

   public cbt(bly<? extends cbt> $$0, cto $$1) {
      super($$0, $$1);
      this.b = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public cbt(cto $$0, double $$1, double $$2, double $$3, cmx $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cbt(cto $$0, double $$1, double $$2, double $$3, cmx $$4, double $$5, double $$6, double $$7) {
      this(bly.ae, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cbt(cbt $$0) {
      super($$0.ai(), $$0.dM());
      this.a($$0.q().p());
      this.v($$0);
      this.g = $$0.g;
      this.b = $$0.b;
   }

   @Override
   public boolean aX() {
      return this.q().a(aso.aB);
   }

   @Nullable
   @Override
   public blu w() {
      if (this.k != null && !this.k.dH()) {
         return this.k;
      } else if (this.j != null && this.dM() instanceof and $$0) {
         this.k = $$0.a(this.j);
         return this.k;
      } else {
         return null;
      }
   }

   @Override
   public void w(blu $$0) {
      super.w($$0);
      if ($$0 instanceof cbt $$1) {
         this.k = $$1.k;
      }
   }

   @Override
   protected blu.b aW() {
      return blu.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, cmx.f);
   }

   @Override
   public void l() {
      if (this.q().b()) {
         this.am();
      } else {
         super.l();
         if (this.h > 0 && this.h != 32767) {
            this.h--;
         }

         this.K = this.dr();
         this.L = this.dt();
         this.M = this.dx();
         els $$0 = this.dp();
         float $$1 = this.cI() - 0.11111111F;
         if (this.aZ() && this.b(asl.a) > (double)$$1) {
            this.E();
         } else if (this.bn() && this.b(asl.b) > (double)$$1) {
            this.G();
         } else if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.04, 0.0));
         }

         if (this.dM().B) {
            this.af = false;
         } else {
            this.af = !this.dM().a(this, this.cH().h(1.0E-7));
            if (this.af) {
               this.m(this.dr(), (this.cH().b + this.cH().e) / 2.0, this.dx());
            }
         }

         if (!this.aC() || this.dp().i() > 1.0E-5F || (this.ah + this.aj()) % 4 == 0) {
            this.a(bmq.a, this.dp());
            float $$2 = 0.98F;
            if (this.aC()) {
               $$2 = this.dM().a_(this.aI()).b().i() * 0.98F;
            }

            this.g(this.dp().d((double)$$2, 0.98, (double)$$2));
            if (this.aC()) {
               els $$3 = this.dp();
               if ($$3.d < 0.0) {
                  this.g($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = aun.a(this.K) != aun.a(this.dr()) || aun.a(this.L) != aun.a(this.dt()) || aun.a(this.M) != aun.a(this.dx());
         int $$5 = $$4 ? 2 : 40;
         if (this.ah % $$5 == 0 && !this.dM().B && this.I()) {
            this.H();
         }

         if (this.g != -32768) {
            this.g++;
         }

         this.au = this.au | this.bg();
         if (!this.dM().B) {
            double $$6 = this.dp().d($$0).g();
            if ($$6 > 0.01) {
               this.au = true;
            }
         }

         if (!this.dM().B && this.g >= 6000) {
            this.am();
         }
      }
   }

   @Override
   protected hx aI() {
      return this.d(0.999999F);
   }

   private void E() {
      els $$0 = this.dp();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void G() {
      els $$0 = this.dp();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void H() {
      if (this.I()) {
         for (cbt $$1 : this.dM().a(cbt.class, this.cH().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.I())) {
            if ($$1.I()) {
               this.a($$1);
               if (this.dH()) {
                  break;
               }
            }
         }
      }
   }

   private boolean I() {
      cmx $$0 = this.q();
      return this.bx() && this.h != 32767 && this.g != -32768 && this.g < 6000 && $$0.L() < $$0.g();
   }

   private void a(cbt $$0) {
      cmx $$1 = this.q();
      cmx $$2 = $$0.q();
      if (Objects.equals(this.l, $$0.l) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cmx $$0, cmx $$1) {
      if (!$$1.a($$0.d())) {
         return false;
      } else if ($$1.L() + $$0.L() > $$1.g()) {
         return false;
      } else {
         return $$1.u() ^ $$0.u() ? false : !$$1.u() || $$1.v().equals($$0.v());
      }
   }

   public static cmx a(cmx $$0, cmx $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.L(), $$1.L());
      cmx $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cbt $$0, cmx $$1, cmx $$2) {
      cmx $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cbt $$0, cmx $$1, cbt $$2, cmx $$3) {
      a($$0, $$1, $$3);
      $$0.h = Math.max($$0.h, $$2.h);
      $$0.g = Math.min($$0.g, $$2.g);
      if ($$3.b()) {
         $$2.am();
      }
   }

   @Override
   public boolean aY() {
      return this.q().d().w() || super.aY();
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.q().b() && this.q().a(cna.ul) && $$0.a(asi.m)) {
         return false;
      } else if (!this.q().d().a($$0)) {
         return false;
      } else if (this.dM().B) {
         return true;
      } else {
         this.bq();
         this.i = (int)((float)this.i - $$1);
         this.a(dnq.o, $$0.d());
         if (this.i <= 0) {
            this.q().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(sn $$0) {
      $$0.a("Health", (short)this.i);
      $$0.a("Age", (short)this.g);
      $$0.a("PickupDelay", (short)this.h);
      if (this.j != null) {
         $$0.a("Thrower", this.j);
      }

      if (this.l != null) {
         $$0.a("Owner", this.l);
      }

      if (!this.q().b()) {
         $$0.a("Item", this.q().b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
      this.i = $$0.g("Health");
      this.g = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.h = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.l = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.j = $$0.a("Thrower");
         this.k = null;
      }

      sn $$1 = $$0.p("Item");
      this.a(cmx.a($$1));
      if (this.q().b()) {
         this.am();
      }
   }

   @Override
   public void b_(cfh $$0) {
      if (!this.dM().B) {
         cmx $$1 = this.q();
         cms $$2 = $$1.d();
         int $$3 = $$1.L();
         if (this.h == 0 && (this.l == null || this.l.equals($$0.cw())) && $$0.fS().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.am();
               $$1.f($$3);
            }

            $$0.a(asb.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public vf ad() {
      vf $$0 = this.af();
      return (vf)($$0 != null ? $$0 : vf.c(this.q().q()));
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Nullable
   @Override
   public blu b(and $$0) {
      blu $$1 = super.b($$0);
      if (!this.dM().B && $$1 instanceof cbt) {
         ((cbt)$$1).H();
      }

      return $$1;
   }

   public cmx q() {
      return this.an().b(c);
   }

   public void a(cmx $$0) {
      this.an().b(c, $$0);
   }

   @Override
   public void a(agm<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.q().a((blu)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.l = $$0;
   }

   public void a(blu $$0) {
      this.j = $$0.cw();
      this.k = $$0;
   }

   public int s() {
      return this.g;
   }

   public void u() {
      this.h = 10;
   }

   public void x() {
      this.h = 0;
   }

   @Override
   public void y() {
      this.h = 32767;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public boolean z() {
      return this.h > 0;
   }

   public void A() {
      this.g = -32768;
   }

   public void B() {
      this.g = -6000;
   }

   public void C() {
      this.y();
      this.g = 5999;
   }

   public float a(float $$0) {
      return ((float)this.s() + $$0) / 20.0F + this.b;
   }

   public cbt D() {
      return new cbt(this);
   }

   @Override
   public ars db() {
      return ars.i;
   }

   @Override
   public float dD() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
