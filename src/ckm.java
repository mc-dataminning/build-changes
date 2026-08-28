import java.util.Collection;
import javax.annotation.Nullable;

public class ckm extends cla {
   private static final akg<Integer> b = akk.a(ckm.class, aki.b);
   private static final akg<Boolean> c = akk.a(ckm.class, aki.k);
   private static final akg<Boolean> d = akk.a(ckm.class, aki.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public ckm(btv<? extends ckm> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbb(this));
      this.bS.a(2, new cco(this));
      this.bS.a(3, new cao<>(this, cgo.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cao<>(this, cgd.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new cbr(this, 1.0, false));
      this.bS.a(5, new ccu(this, 0.8));
      this.bS.a(6, new cbp(this, cnu.class, 8.0F));
      this.bS.a(6, new ccc(this));
      this.bT.a(1, new cda<>(this, cnu.class, true));
      this.bT.a(2, new ccz(this));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.v, 0.25);
   }

   @Override
   public int cB() {
      return this.m() == null ? this.y(0.0F) : this.y(this.eA() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
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

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.gp());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.am.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gq();
      }
   }

   @Override
   public void l() {
      if (this.bI()) {
         this.e = this.bY;
         if (this.gp()) {
            this.b(1);
         }

         int $$0 = this.y();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awe.gl, 1.0F, 0.5F);
            this.a(dzl.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gt();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable buk $$0) {
      if (!($$0 instanceof cia)) {
         super.h($$0);
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.gk;
   }

   @Override
   protected awd n_() {
      return awe.gj;
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bto $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof ckm $$4 && $$4.gr()) {
         $$4.gs();
         this.a(cvt.ur);
      }
   }

   @Override
   public boolean E(bto $$0) {
      return true;
   }

   public boolean t() {
      return this.am.a(c);
   }

   public float J(float $$0) {
      return azd.h($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int y() {
      return this.am.a(b);
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(arh $$0, buj $$1) {
      super.a($$0, $$1);
      this.am.a(c, true);
   }

   @Override
   protected brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(axc.bj)) {
         awd $$3 = $$2.a(cvt.tY) ? awe.iL : awe.ja;
         this.dS().a($$0, this.dx(), this.dz(), this.dD(), $$3, this.di(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dS().B) {
            this.gq();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gt() {
      if (!this.dS().B) {
         float $$0 = this.t() ? 2.0F : 1.0F;
         this.ba = true;
         this.dS().a(this, this.dx(), this.dz(), this.dD(), (float)this.ca * $$0, deg.a.c);
         this.gw();
         this.c(bto.c.a);
         this.as();
      }
   }

   private void gw() {
      Collection<bsv> $$0 = this.ex();
      if (!$$0.isEmpty()) {
         btj $$1 = new btj(this.dS(), this.dx(), this.dz(), this.dD());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bsv $$2 : $$0) {
            $$1.a(new bsv($$2));
         }

         this.dS().b($$1);
      }
   }

   public boolean gp() {
      return this.am.a(d);
   }

   public void gq() {
      this.am.a(d, true);
   }

   public boolean gr() {
      return this.t() && this.cb < 1;
   }

   public void gs() {
      this.cb++;
   }
}
