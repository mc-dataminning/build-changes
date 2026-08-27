import java.util.Collection;
import javax.annotation.Nullable;

public class chd extends chr implements brq {
   private static final ajk<Integer> b = ajo.a(chd.class, ajm.b);
   private static final ajk<Boolean> c = ajo.a(chd.class, ajm.k);
   private static final ajk<Boolean> d = ajo.a(chd.class, ajm.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public chd(bqr<? extends chd> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bxv(this));
      this.bS.a(2, new bzi(this));
      this.bS.a(3, new bxi<>(this, cdh.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new bxi<>(this, ccw.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new byl(this, 1.0, false));
      this.bS.a(5, new bzo(this, 0.8));
      this.bS.a(6, new byj(this, ckl.class, 8.0F));
      this.bS.a(6, new byw(this));
      this.bT.a(1, new bzu<>(this, ckl.class, true));
      this.bT.a(2, new bzt(this));
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.r, 0.25);
   }

   @Override
   public int cv() {
      return this.p() == null ? this.u(0.0F) : this.u(this.ey() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bpj $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.ao.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gp();
      }
   }

   @Override
   public void l() {
      if (this.bB()) {
         this.e = this.bY;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.bY == 0) {
            this.a(auz.gf, 1.0F, 0.5F);
            this.a(dur.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gs();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bre $$0) {
      if (!($$0 instanceof cet)) {
         super.h($$0);
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.ge;
   }

   @Override
   protected auy o_() {
      return auz.gd;
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bql $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof chd $$4 && $$4.gq()) {
         $$4.gr();
         this.a(csg.up);
      }
   }

   @Override
   public boolean C(bql $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float G(float $$0) {
      return axw.i($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqe $$0, brd $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(avw.aF)) {
         auy $$3 = $$2.a(csg.tX) ? auz.iF : auz.iU;
         this.dN().a($$0, this.ds(), this.du(), this.dy(), $$3, this.dc(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dN().B) {
            this.gp();
            if (!$$2.k()) {
               $$2.g(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return boq.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (!this.dN().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bf = true;
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.ca * $$0, czu.a.c);
         this.am();
         this.gt();
      }
   }

   private void gt() {
      Collection<bpx> $$0 = this.ev();
      if (!$$0.isEmpty()) {
         bqh $$1 = new bqh(this.dN(), this.ds(), this.du(), this.dy());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.k() / 2);
         $$1.c(-$$1.g() / (float)$$1.k());

         for (bpx $$2 : $$0) {
            $$1.a(new bpx($$2));
         }

         this.dN().b($$1);
      }
   }

   public boolean y() {
      return this.ao.a(d);
   }

   public void gp() {
      this.ao.a(d, true);
   }

   public boolean gq() {
      return this.a() && this.cb < 1;
   }

   public void gr() {
      this.cb++;
   }
}
