import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cks extends ckr {
   private static final ako<cwf> f = aks.a(cks.class, akq.h);
   private static final ako<Integer> g = aks.a(cks.class, akq.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cks(bup<? extends cks> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cks(dff $$0, jh $$1, jm $$2) {
      this(bup.ai, $$0, $$1, $$2);
   }

   public cks(bup<? extends cks> $$0, dff $$1, jh $$2, jm $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(f, cwf.k);
      $$0.a(g, 0);
   }

   @Override
   protected void a(jm $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.d.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.P = this.dQ();
      this.O = this.dO();
      this.m();
   }

   @Override
   protected ezm a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      ezr $$3 = ezr.b($$0).a($$1, -0.46875);
      jm.a $$4 = $$1.o();
      double $$5 = $$4 == jm.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jm.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jm.a.c ? 0.0625 : 0.75;
      return ezm.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean o() {
      if (this.l) {
         return true;
      } else if (!this.dY().g(this)) {
         return false;
      } else {
         dvo $$0 = this.dY().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dkl.n($$0) ? this.dY().a(this, this.cT(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(bvi $$0, ezr $$1) {
      if (!this.l) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.l) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void au() {
      this.d(this.C());
      super.au();
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.l) {
         return !$$0.a(axf.d) && !$$0.h() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(axf.l) && !this.C().f()) {
         if (!this.dY().C) {
            this.b($$0.d(), false);
            this.a(eak.c, $$0.d());
            this.a(this.t(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public awn t() {
      return awo.ny;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cM();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bui $$0) {
      this.a(this.v(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(eak.c, $$0);
   }

   public awn v() {
      return awo.nw;
   }

   @Override
   public void B() {
      this.a(this.w(), 1.0F, 1.0F);
   }

   public awn w() {
      return awo.nx;
   }

   private void b(@Nullable bui $$0, boolean $$1) {
      if (!this.l) {
         cwf $$2 = this.C();
         this.c(cwf.k);
         if (!this.dY().ac().b(dfb.i)) {
            if ($$0 == null) {
               this.d($$2);
            }
         } else {
            if ($$0 instanceof cor $$3 && $$3.fY()) {
               this.d($$2);
               return;
            }

            if ($$1) {
               this.b(this.z());
            }

            if (!$$2.f()) {
               $$2 = $$2.v();
               this.d($$2);
               if (this.af.i() < this.k) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void d(cwf $$0) {
      etg $$1 = this.a($$0);
      if ($$1 != null) {
         eti $$2 = cws.a($$1, this.dY());
         if ($$2 != null) {
            $$2.a(this.b, this.as());
         }
      }

      $$0.a(null);
   }

   public cwf C() {
      return this.aw().a(f);
   }

   @Nullable
   public etg a(cwf $$0) {
      return $$0.a(ku.L);
   }

   public boolean D() {
      return this.C().b(ku.L);
   }

   public void c(cwf $$0) {
      this.a($$0, true);
   }

   public void a(cwf $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.aw().a(f, $$0);
      if (!$$0.f()) {
         this.a(this.x(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dY().c(this.b, dil.a);
      }
   }

   public awn x() {
      return awo.nv;
   }

   @Override
   public bvw a_(int $$0) {
      return $$0 == 0 ? bvw.a(this::C, this::c) : super.a_($$0);
   }

   @Override
   public void a(ako<?> $$0) {
      if ($$0.equals(f)) {
         this.e(this.C());
      }
   }

   private void e(cwf $$0) {
      if (!$$0.f() && $$0.H() != this) {
         $$0.a(this);
      }

      this.m();
   }

   public int E() {
      return this.aw().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.aw().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dY().c(this.b, dil.a);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (!this.C().f()) {
         $$0.a("Item", this.C().a(this.ea()));
         $$0.a("ItemRotation", (byte)this.E());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cr());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      cwf $$2;
      if ($$0.b("Item", 10)) {
         un $$1 = $$0.p("Item");
         $$2 = cwf.a(this.ea(), (vk)$$1).orElse(cwf.k);
      } else {
         $$2 = cwf.k;
      }

      cwf $$4 = this.C();
      if (!$$4.f() && !cwf.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(jm.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      boolean $$3 = !this.C().f();
      boolean $$4 = !$$2.f();
      if (this.l) {
         return bsh.e;
      } else if (!$$0.dY().C) {
         if (!$$3) {
            if ($$4 && !this.dT()) {
               eti $$5 = cws.b($$2, this.dY());
               if ($$5 != null && $$5.a(256)) {
                  return bsh.d;
               } else {
                  this.c($$2);
                  this.a(eak.c, $$0);
                  $$2.a(1, $$0);
                  return bsh.a;
               }
            } else {
               return bsh.e;
            }
         } else {
            this.a(this.y(), 1.0F, 1.0F);
            this.b(this.E() + 1);
            this.a(eak.c, $$0);
            return bsh.a;
         }
      } else {
         return (bsh)(!$$3 && !$$4 ? bsh.e : bsh.a);
      }
   }

   public awn y() {
      return awo.nz;
   }

   public int F() {
      return this.C().f() ? 0 : this.E() % 8 + 1;
   }

   @Override
   public zs<ach> a(arp $$0) {
      return new aci(this, this.d.d(), this.q());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cwf dL() {
      cwf $$0 = this.C();
      return $$0.f() ? this.z() : $$0.v();
   }

   protected cwf z() {
      return new cwf(cwj.uu);
   }

   @Override
   public float dP() {
      jm $$0 = this.cQ();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azn.b(180 + $$0.e() * 90 + this.E() * 45 + $$1);
   }
}
