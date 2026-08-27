import java.util.Collection;
import javax.annotation.Nullable;

public class cfm extends cga implements bqb {
   private static final aim<Integer> b = aiq.a(cfm.class, aio.b);
   private static final aim<Boolean> c = aiq.a(cfm.class, aio.k);
   private static final aim<Boolean> d = aiq.a(cfm.class, aio.k);
   private int e;
   private int bX;
   private int bY = 30;
   private int bZ = 3;
   private int ca;

   public cfm(bpd<? extends cfm> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwg(this));
      this.bR.a(2, new bxt(this));
      this.bR.a(3, new bvt<>(this, cbs.class, 6.0F, 1.0, 1.2));
      this.bR.a(3, new bvt<>(this, cbh.class, 6.0F, 1.0, 1.2));
      this.bR.a(4, new bww(this, 1.0, false));
      this.bR.a(5, new bxz(this, 0.8));
      this.bR.a(6, new bwu(this, ciu.class, 8.0F));
      this.bR.a(6, new bxh(this));
      this.bS.a(1, new byf<>(this, ciu.class, true));
      this.bS.a(2, new bye(this));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.r, 0.25);
   }

   @Override
   public int cu() {
      return this.p() == null ? this.u(0.0F) : this.u(this.ex() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bnw $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bX += (int)($$0 * 1.5F);
      if (this.bX > this.bY - 5) {
         this.bX = this.bY - 5;
      }

      return $$3;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.an.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bY);
      $$0.a("ExplosionRadius", (byte)this.bZ);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.an.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bY = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bZ = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gn();
      }
   }

   @Override
   public void l() {
      if (this.bA()) {
         this.e = this.bX;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.s();
         if ($$0 > 0 && this.bX == 0) {
            this.a(aty.ge, 1.0F, 0.5F);
            this.b(drp.I);
         }

         this.bX += $$0;
         if (this.bX < 0) {
            this.bX = 0;
         }

         if (this.bX >= this.bY) {
            this.bX = this.bY;
            this.gq();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bpp $$0) {
      if (!($$0 instanceof cdc)) {
         super.h($$0);
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.gd;
   }

   @Override
   protected atx n_() {
      return aty.gc;
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      box $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cfm $$4 && $$4.go()) {
         $$4.gp();
         this.a(cqp.un);
      }
   }

   @Override
   public boolean C(box $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.a(c);
   }

   public float G(float $$0) {
      return aww.i($$0, (float)this.e, (float)this.bX) / (float)(this.bY - 2);
   }

   public int s() {
      return this.an.a(b);
   }

   public void b(int $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a(apf $$0, bpo $$1) {
      super.a($$0, $$1);
      this.an.a(c, true);
   }

   @Override
   protected bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(auv.aF)) {
         atx $$3 = $$2.a(cqp.tW) ? aty.iD : aty.iS;
         this.dM().a($$0, this.dr(), this.dt(), this.dx(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dM().B) {
            this.gn();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bnd.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gq() {
      if (!this.dM().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bd = true;
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.bZ * $$0, cxb.a.c);
         this.am();
         this.gr();
      }
   }

   private void gr() {
      Collection<bok> $$0 = this.eu();
      if (!$$0.isEmpty()) {
         bou $$1 = new bou(this.dM(), this.dr(), this.dt(), this.dx());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.k() / 2);
         $$1.c(-$$1.g() / (float)$$1.k());

         for (bok $$2 : $$0) {
            $$1.a(new bok($$2));
         }

         this.dM().b($$1);
      }
   }

   public boolean y() {
      return this.an.a(d);
   }

   public void gn() {
      this.an.a(d, true);
   }

   public boolean go() {
      return this.a() && this.ca < 1;
   }

   public void gp() {
      this.ca++;
   }
}
