import java.util.Collection;
import javax.annotation.Nullable;

public class ckh extends ckv {
   private static final akg<Integer> b = akk.a(ckh.class, aki.b);
   private static final akg<Boolean> c = akk.a(ckh.class, aki.k);
   private static final akg<Boolean> d = akk.a(ckh.class, aki.k);
   private int e;
   private int bZ;
   private int ca = 30;
   private int cb = 3;
   private int cc;

   public ckh(btq<? extends ckh> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(1, new caw(this));
      this.bT.a(2, new ccj(this));
      this.bT.a(3, new caj<>(this, cgj.class, 6.0F, 1.0, 1.2));
      this.bT.a(3, new caj<>(this, cfy.class, 6.0F, 1.0, 1.2));
      this.bT.a(4, new cbm(this, 1.0, false));
      this.bT.a(5, new ccp(this, 0.8));
      this.bT.a(6, new cbk(this, cnp.class, 8.0F));
      this.bT.a(6, new cbx(this));
      this.bU.a(1, new ccv<>(this, cnp.class, true));
      this.bU.a(2, new ccu(this));
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.v, 0.25);
   }

   @Override
   public int cB() {
      return this.m() == null ? this.y(0.0F) : this.y(this.eA() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bZ += (int)($$0 * 1.5F);
      if (this.bZ > this.ca - 5) {
         this.bZ = this.ca - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.am.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.ca);
      $$0.a("ExplosionRadius", (byte)this.cb);
      $$0.a("ignited", this.go());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.am.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.ca = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.cb = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gp();
      }
   }

   @Override
   public void l() {
      if (this.bI()) {
         this.e = this.bZ;
         if (this.go()) {
            this.b(1);
         }

         int $$0 = this.y();
         if ($$0 > 0 && this.bZ == 0) {
            this.a(awd.gl, 1.0F, 0.5F);
            this.a(dyx.I);
         }

         this.bZ += $$0;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.bZ >= this.ca) {
            this.bZ = this.ca;
            this.gs();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable buf $$0) {
      if (!($$0 instanceof chv)) {
         super.h($$0);
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.gk;
   }

   @Override
   protected awc n_() {
      return awd.gj;
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      btj $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof ckh $$4 && $$4.gq()) {
         $$4.gr();
         this.a(cvo.ur);
      }
   }

   @Override
   public boolean E(btj $$0) {
      return true;
   }

   public boolean t() {
      return this.am.a(c);
   }

   public float J(float $$0) {
      return azc.h($$0, (float)this.e, (float)this.bZ) / (float)(this.ca - 2);
   }

   public int y() {
      return this.am.a(b);
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(arg $$0, bue $$1) {
      super.a($$0, $$1);
      this.am.a(c, true);
   }

   @Override
   protected brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(axb.bj)) {
         awc $$3 = $$2.a(cvo.tY) ? awd.iL : awd.ja;
         this.dS().a($$0, this.dx(), this.dz(), this.dD(), $$3, this.di(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dS().B) {
            this.gp();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (!this.dS().B) {
         float $$0 = this.t() ? 2.0F : 1.0F;
         this.bb = true;
         this.dS().a(this, this.dx(), this.dz(), this.dD(), (float)this.cb * $$0, dds.a.c);
         this.gv();
         this.c(btj.c.a);
         this.as();
      }
   }

   private void gv() {
      Collection<bsq> $$0 = this.ex();
      if (!$$0.isEmpty()) {
         bte $$1 = new bte(this.dS(), this.dx(), this.dz(), this.dD());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bsq $$2 : $$0) {
            $$1.a(new bsq($$2));
         }

         this.dS().b($$1);
      }
   }

   public boolean go() {
      return this.am.a(d);
   }

   public void gp() {
      this.am.a(d, true);
   }

   public boolean gq() {
      return this.t() && this.cc < 1;
   }

   public void gr() {
      this.cc++;
   }
}
